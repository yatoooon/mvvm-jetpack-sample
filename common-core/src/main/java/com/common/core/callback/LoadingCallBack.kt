package com.common.core.callback

import android.content.Context
import android.view.View
import com.common.core.R
import com.kingja.loadsir.callback.Callback

class LoadingCallBack : Callback() {

    override fun onCreateView(): Int = R.layout.core_layout_loading

    override fun onReloadEvent(context: Context?, view: View?): Boolean {
        return true
    }
    
}