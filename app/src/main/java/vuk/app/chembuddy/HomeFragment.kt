package vuk.app.chembuddy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import java.util.*


class HomeFragment : Fragment() {
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val hour: Int = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
        val title1: TextView = view.findViewById(R.id.homeTitle1)

        val profilePic: ImageView = view.findViewById(R.id.profile_pic)
        val line: CardView = view.findViewById(R.id.line)
        var name = activity?.intent?.getStringExtra("name").toString()
        val lastname = activity?.intent?.getStringExtra("lastname").toString()

        if (name == "null"){
            name = ""
        }

        when (hour) {
            in 6..11 -> {
                title1.text = "good morning,\n" + name.lowercase()
            }
            in 12..16 -> {
                title1.text = "good afternoon,\n" + name.lowercase()
            }
            in 17..24 -> {
                title1.text = "good evening,\n"  + name.lowercase()
            }
            else -> {
                title1.text = "hello,\n" + name.lowercase()
            }
        }


        profilePic.setOnClickListener {
            val intent: Intent = Intent(activity, ProfileActivity::class.java)
            val options = activity?.let { it1 ->
                val p1: Pair<View, String> = Pair(profilePic, "profile_pic_anim")
                val p2: Pair<View, String> = Pair(line, "line_anim")

                ActivityOptionsCompat.makeSceneTransitionAnimation(it1, p1, p2)
            }
            intent.putExtra("name", name)
            intent.putExtra("lastname", lastname)
            startActivity(intent, options?.toBundle()) }
        activity?.overridePendingTransition(R.anim.slide_in1, R.anim.slide_out)



        // Inflate the layout for this fragment
        return view
    }

}