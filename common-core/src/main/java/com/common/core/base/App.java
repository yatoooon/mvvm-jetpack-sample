package com.common.core.base;

import androidx.annotation.NonNull;

import com.common.core.di.component.AppComponent;

/**
 * ================================================
 * 框架要求框架中的每个 {@link android.app.Application} 都需要实现此类, 以满足规范
 * ================================================
 */
public interface App {
    @NonNull
    AppComponent getAppComponent();
}
