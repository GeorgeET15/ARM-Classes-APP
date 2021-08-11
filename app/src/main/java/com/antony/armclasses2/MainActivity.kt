package com.antony.armclasses2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent = Intent(this, ZoomMeeting::class.java)
            startActivity(intent)

        }

    }
    fun open(view: View?) {
        val browserIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.youtube.com/channel/UCn3LhDJaWyExNbt8z-sGmfg")
        )
        startActivity(browserIntent)
    }

    fun getUrlFromIntent(view: View) {}


}
