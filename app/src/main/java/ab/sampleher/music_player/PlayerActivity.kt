package ab.sampleher.music_player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class PlayerActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        var intent=intent
        val position=intent.getIntExtra("imageview",0)

        imageView=findViewById(R.id.bannerDisplay)
        imageView.setImageResource(position)

    }
}





