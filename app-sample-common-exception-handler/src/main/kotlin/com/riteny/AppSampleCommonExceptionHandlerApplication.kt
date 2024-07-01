package com.riteny

import com.riteny.util.exception.config.CommonExceptionProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(CommonExceptionProperties::class)
class AppSampleCommonExceptionHandlerApplication

fun main(args: Array<String>) {
    runApplication<AppSampleCommonExceptionHandlerApplication>(*args)
}
