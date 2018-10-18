package com.example.chhayrithhy.modelexamcode.feature

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

class MyService2 : Service() {


    lateinit var player: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
        return null!!
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startedId: Int): Int{
        super.onStartCommand(intent, flags, startedId)

        Toast.makeText(this, "started the service", Toast.LENGTH_LONG).show()
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player.isLooping = true
        player.start()
        return START_STICKY
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "service stopped", Toast.LENGTH_LONG).show()
        return player.stop()
    }
}
