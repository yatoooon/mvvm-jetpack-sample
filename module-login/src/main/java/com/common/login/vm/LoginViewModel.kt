package com.common.login.vm

import androidx.lifecycle.liveData
import com.common.core.base.mvvm.BaseViewModel
import com.common.core.utils.showLoadingState
import com.common.login.repository.LoginRepository
import com.common.res.config.AppConfig

class LoginViewModel(private val repository: LoginRepository) : BaseViewModel() {

    fun userLogin(username: String, password: String) = liveData {
        showLoadingState(loadState, "正在登录")
        var result = repository.userLogin(username, password, loadState)
        if (result != null) {
            AppConfig.login = true
            emit(result)
        }
    }

}