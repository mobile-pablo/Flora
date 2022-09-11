package com.mobile_pablo.flora.di

import android.app.Application
import com.mobile_pablo.core.di.coreModule
import com.mobile_pablo.domain.di.domainModule
import com.mobile_pablo.networking.di.networkingModule
import com.mobile_pablo.storage.di.storageModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class FloraApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FloraApplication)
            androidLogger()
            modules(
                listOf(
                    floraModule,
                    coreModule,
                    domainModule,
                    storageModule,
                    networkingModule
                )
            )
        }
    }
}