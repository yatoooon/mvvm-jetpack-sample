package com.common.core.base.mvvm

import com.common.core.integration.AppManager
import com.common.core.utils.ArmsUtil

/**
 * desc：Repository基类
 * author：panyy
 * date：2021/04/22
 */
abstract class BaseRepository {

    inline fun <reified T> apiService(): T =
            ArmsUtil.obtainAppComponentFromContext(AppManager.getAppManager().application).repositoryManager().obtainRetrofitService(T::class.java)

}