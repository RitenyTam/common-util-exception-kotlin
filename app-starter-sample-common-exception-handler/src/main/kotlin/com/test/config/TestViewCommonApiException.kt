package com.test.config

import com.riteny.util.exception.core.exception.CommonViewException

class TestViewCommonApiException(errorCode: String, errorMsg: String, langType: String) : CommonViewException(
    errorCode, errorMsg, langType
)
