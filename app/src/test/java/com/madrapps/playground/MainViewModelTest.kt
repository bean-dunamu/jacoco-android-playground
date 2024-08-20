package com.madrapps.playground

import org.junit.Assert
import org.junit.Test

class MainViewModelTest {

    private val viewModel = MainViewModel()

    @Test
    fun testValidate() {
        val actual = viewModel.validate("admin")
        Assert.assertTrue(actual)
    }

    @Test
    fun testVerifyAccess() {
        val actual = viewModel.verifyAccess("user")
        Assert.assertFalse(actual)
    }
}