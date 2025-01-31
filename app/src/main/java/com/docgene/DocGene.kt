package com.docgene

import android.app.Application
import com.docgene.utilities.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DocGene: Application() {
    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "App has been launched")
    }

    companion object{
        const val TAG = "DocGene"
    }
}