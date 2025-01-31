package com.docgene.utilities.logging

import android.util.Log
import com.docgene.utilities.BuildConfig

object AppLogger {
    private const val TAG = "DocGene AppLogger"
    fun d(tag:String = TAG, message: String){
        if(BuildConfig.DEBUG){
            Log.d(tag, message)
        }

    }

    fun e(tag:String = TAG, message: String){
        if(BuildConfig.DEBUG){
            Log.e(tag, message)
        }
    }
}