package vuk.app.chembuddy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import java.util.*

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileBack = findViewById<ImageView>(R.id.profile_back)
        val line = findViewById<CardView>(R.id.line)
        val name = findViewById<TextView>(R.id.name)
        val email = findViewById<TextView>(R.id.email)
        val profilePic = findViewById<ImageView>(R.id.profile_pic)


        val sname = intent?.getStringExtra("name").toString()
        val slastname = intent?.getStringExtra("lastname").toString()


        name.text = sname.capitalize(Locale.getDefault()) +" "+ slastname.capitalize(Locale.getDefault())

        email.text = sname.lowercase(Locale.getDefault()) +"."+ slastname.lowercase(Locale.getDefault()) + "19@vit.edu"

        profileBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            val p1: Pair<View, String> = Pair(profileBack, "profile_pic_anim")
            val p2: Pair<View, String> = Pair(line, "line_anim")

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1, p2)

            startActivity(intent, options.toBundle())
        }


    }
}