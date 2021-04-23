package com.common.login.repository

import androidx.lifecycle.MutableLiveData
import com.common.core.base.mvvm.BaseRepository
import com.common.core.base.net.apiCallWithState
import com.common.core.base.state.State
import com.common.login.api.LoginService

class LoginRepository : BaseRepository() {

    suspend fun userLogin(
            username: String?,
            password: String?,
            loadState: MutableLiveData<State>? = null) =
            apiCallWithState({
                apiService<LoginService>().userLogin(username, password)
            }, loadState)
}