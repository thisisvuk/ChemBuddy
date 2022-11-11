package vuk.app.chembuddy

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    var name = ""
    var lastname = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = intent.getStringExtra("name").toString()
        lastname = intent.getStringExtra("lastname").toString()

        print("************************************************************$name$lastname")

        val fHome: Fragment = HomeFragment()
        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
        fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out)
            .replace(R.id.fragment_section, fHome).addToBackStack(null)
        fragmentTransaction.commit()

        findViewById<CardView>(R.id.home_menu).setOnClickListener { activeFragment("h") }

        findViewById<CardView>(R.id.event_menu).setOnClickListener { activeFragment("e") }

        findViewById<CardView>(R.id.alumni_menu).setOnClickListener { activeFragment("a") }

        findViewById<CardView>(R.id.team_menu).setOnClickListener { activeFragment("t") }

        findViewById<CardView>(R.id.galley_menu).setOnClickListener { activeFragment("g") }
    }

    private fun activeFragment(s: String) {

        val homeIcon: ImageView = findViewById(R.id.home_icon)
        val eventIcon: ImageView = findViewById(R.id.event_icon)
        val alumniIcon: ImageView = findViewById(R.id.alumni_icon)
        val teamIcon: ImageView = findViewById(R.id.team_icon)
        val galleryIcon: ImageView = findViewById(R.id.galley_icon)

        val homeCard: CardView = findViewById(R.id.home_menu)
        val eventCard: CardView = findViewById(R.id.event_menu)
        val alumniCard: CardView = findViewById(R.id.alumni_menu)
        val teamCard: CardView = findViewById(R.id.team_menu)
        val galleryCard: CardView = findViewById(R.id.galley_menu)

        val fHome: Fragment = HomeFragment()
        val fEvent: Fragment = EventFragment()
        val fAlumni: Fragment = AlumniFragment()
        val fTeam: Fragment = TeamFragment()
        val fGallery: Fragment = GalleryFragment()
        val fAbout: Fragment = ChesaFragment()

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()

        when (s) {
            "h" -> {
                homeIcon.setColorFilter(resources.getColor(R.color.white))
                eventIcon.setColorFilter(resources.getColor(R.color.grey))
                alumniIcon.setColorFilter(resources.getColor(R.color.grey))
                teamIcon.setColorFilter(resources.getColor(R.color.grey))
                galleryIcon.setColorFilter(resources.getColor(R.color.grey))

                homeCard.setCardBackgroundColor(resources.getColor(R.color.blue))
                eventCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                alumniCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                teamCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                galleryCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))

                homeCard.cardElevation = 8F
                eventCard.cardElevation = 0F
                alumniCard.cardElevation = 0F
                teamCard.cardElevation = 0F
                galleryCard.cardElevation = 0F

                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out).replace(R.id.fragment_section, fHome)
                fragmentTransaction.commit()
            }
            "e" -> {
                homeIcon.setColorFilter(resources.getColor(R.color.grey))
                eventIcon.setColorFilter(resources.getColor(R.color.white))
                alumniIcon.setColorFilter(resources.getColor(R.color.grey))
                teamIcon.setColorFilter(resources.getColor(R.color.grey))
                galleryIcon.setColorFilter(resources.getColor(R.color.grey))

                homeCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                eventCard.setCardBackgroundColor(resources.getColor(R.color.blue))
                alumniCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                teamCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                galleryCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))

                homeCard.cardElevation = 0F
                eventCard.cardElevation = 8F
                alumniCard.cardElevation = 0F
                teamCard.cardElevation = 0F
                galleryCard.cardElevation = 0F

                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out).replace(R.id.fragment_section, fEvent)
                fragmentTransaction.commit()
            }
            "a" -> {
                homeIcon.setColorFilter(resources.getColor(R.color.grey))
                eventIcon.setColorFilter(resources.getColor(R.color.grey))
                alumniIcon.setColorFilter(resources.getColor(R.color.white))
                teamIcon.setColorFilter(resources.getColor(R.color.grey))
                galleryIcon.setColorFilter(resources.getColor(R.color.grey))

                homeCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                eventCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                alumniCard.setCardBackgroundColor(resources.getColor(R.color.blue))
                teamCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                galleryCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))

                homeCard.cardElevation = 0F
                eventCard.cardElevation = 0F
                alumniCard.cardElevation = 8F
                teamCard.cardElevation = 0F
                galleryCard.cardElevation = 0F

                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out).replace(R.id.fragment_section, fAlumni)
                fragmentTransaction.commit()
            }
            "t" -> {
                homeIcon.setColorFilter(resources.getColor(R.color.grey))
                eventIcon.setColorFilter(resources.getColor(R.color.grey))
                alumniIcon.setColorFilter(resources.getColor(R.color.grey))
                teamIcon.setColorFilter(resources.getColor(R.color.white))
                galleryIcon.setColorFilter(resources.getColor(R.color.grey))

                homeCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                eventCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                alumniCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                teamCard.setCardBackgroundColor(resources.getColor(R.color.blue))
                galleryCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))

                homeCard.cardElevation = 0F
                eventCard.cardElevation = 0F
                alumniCard.cardElevation = 0F
                teamCard.cardElevation = 8F
                galleryCard.cardElevation = 0F

                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out).replace(R.id.fragment_section, fTeam)
                fragmentTransaction.commit()
            }
            "g" -> {
                homeIcon.setColorFilter(resources.getColor(R.color.grey))
                eventIcon.setColorFilter(resources.getColor(R.color.grey))
                alumniIcon.setColorFilter(resources.getColor(R.color.grey))
                teamIcon.setColorFilter(resources.getColor(R.color.grey))
                galleryIcon.setColorFilter(resources.getColor(R.color.white))

                homeCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                eventCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                alumniCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                teamCard.setCardBackgroundColor(resources.getColor(R.color.bgBlack))
                galleryCard.setCardBackgroundColor(resources.getColor(R.color.blue))

                homeCard.cardElevation = 0F
                eventCard.cardElevation = 0F
                alumniCard.cardElevation = 0F
                teamCard.cardElevation = 0F
                galleryCard.cardElevation = 8F

                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.fade_out).replace(R.id.fragment_section, fAbout)
                fragmentTransaction.commit()
            }
        }

    }
}