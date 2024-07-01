package com.test.config

import com.alibaba.fastjson2.JSONObject
import com.riteny.util.exception.core.api.CommonApiExceptionHandler
import com.riteny.util.exception.core.exception.CommonExceptionStatus
import org.springframework.stereotype.Service
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Service
class TestApiCommonExceptionHandler : CommonApiExceptionHandler<TestApiCommonException, JSONObject> {
    override fun handler(
        e: TestApiCommonException,
        request: HttpServletRequest,
        response: HttpServletResponse
    ): JSONObject {

        val jsonObject = JSONObject()
        with(jsonObject) {
            put("resultCode", CommonExceptionStatus.STATUS_ERROR)
            put("resultMsg", e.message)
            put("data", e.javaClass.typeName + ":" + e.errorMsg)
        }

        return jsonObject
    }
}