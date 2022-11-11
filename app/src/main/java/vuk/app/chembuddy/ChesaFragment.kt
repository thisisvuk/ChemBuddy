package vuk.app.chembuddy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment


class ChesaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chesa, container, false)

        val magazineCard = view.findViewById<CardView>(R.id.magazine_card)
        val instagramCard = view.findViewById<CardView>(R.id.instagram_card)
        val linkedinCard = view.findViewById<CardView>(R.id.linkedin_card)
        val galleryCard = view.findViewById<CardView>(R.id.gallery_card)
        val locationCard = view.findViewById<CardView>(R.id.location_card)

        magazineCard.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19lwWEcWz8aEFpJj3lP1VXJ28lFW4zUSX/view?usp=sharing"))
            startActivity(browserIntent) }

        instagramCard.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/chesa_vitpune/"))
            startActivity(browserIntent) }

        linkedinCard.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/chemical-engineering-students-association-chesa/"))
            startActivity(browserIntent) }

        galleryCard.setOnClickListener { }

        locationCard.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Vishwakarma+Institute+of+Technology/@18.463627,73.866015,17z/data=!4m5!3m4!1s0x3bc2ea950f616219:0x321bdae2cea9f064!8m2!3d18.4636219!4d73.8682037"))
            startActivity(browserIntent) }

        return view
    }

}