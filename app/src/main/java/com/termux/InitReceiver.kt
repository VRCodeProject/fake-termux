package com.termux

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.io.File

class InitReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        File(context.filesDir.absolutePath,"init").createNewFile()
    }
}