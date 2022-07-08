package com.devstart.extensions

import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.hideError() {
    this.error = null
    this.isErrorEnabled = false
}

fun TextInputLayout.showError(error: String) {
    this.error = error
    this.isErrorEnabled = true
}