package com.reactnativeandroidspecialpermission

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.os.Environment
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

class OpenSettingsModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "OpenSettings"
    }

    @ReactMethod
    fun openSettings(action: String, packageName: String) {
        val intent = Intent(action)
        val uri = Uri.fromParts("package", packageName, null)
        intent.data = uri
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        reactApplicationContext.startActivity(intent)
    }

    @ReactMethod
    fun hasManageAllFilesAccess(callback: Callback) {
        val hasPermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Environment.isExternalStorageManager()
        } else {
            val directory = reactApplicationContext.getExternalFilesDir(null)
            directory?.canWrite() ?: false
        }
        callback.invoke(hasPermission)
    }
}
