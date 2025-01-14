package com.riteny.controller

import com.riteny.config.TestApiCommonException
import com.riteny.config.TestViewCommonApiException
import com.riteny.util.exception.core.api.CommonApiExceptionHandlerAgent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestRestController @Autowired constructor(private val commonApiExceptionHandlerAgent: CommonApiExceptionHandlerAgent) {

    @GetMapping("/1")
    private fun test1(): String {
        throw TestApiCommonException("1", "test.index", "en_us")
    }

    @GetMapping("/2")
    private fun test2(): String {
        throw TestViewCommonApiException("1", "test.index2", "en_us")
    }
}