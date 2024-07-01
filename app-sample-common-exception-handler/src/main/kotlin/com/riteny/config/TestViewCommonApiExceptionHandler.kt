package com.riteny.config

import com.riteny.util.exception.core.view.CommonViewExceptionHandler
import org.springframework.stereotype.Service
import java.io.IOException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Service
class TestViewCommonApiExceptionHandler : CommonViewExceptionHandler<TestViewCommonApiException> {

    override fun handler(e: TestViewCommonApiException, request: HttpServletRequest, response: HttpServletResponse) {
        try {
            response.writer.write("Jump to the other page .")
        } catch (ex: IOException) {
            throw RuntimeException(ex)
        }
    }
}
