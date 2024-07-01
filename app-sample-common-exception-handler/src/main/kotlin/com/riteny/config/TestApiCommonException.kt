package com.riteny.config

import com.riteny.util.exception.core.exception.CommonApiException

class TestApiCommonException(errorCode: String, errorMsg: String, langType: String) :
    CommonApiException(errorCode, errorMsg, langType) {
}