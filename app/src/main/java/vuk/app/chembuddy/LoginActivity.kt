package vuk.app.chembuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.cardview.widget.CardView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email: EditText = findViewById(R.id.email)
        val password: EditText = findViewById(R.id.password)

        email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                //checkFields(email.text.toString(), password.text.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })

        password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                //checkFields(email.text.toString(), password.text.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })

        findViewById<CardView>(R.id.continue_btn).setOnClickListener {
            if (checkFields(email.text.toString(), password.text.toString())) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name", email.text.toString())
                intent.putExtra("lastname", password.text.toString())
                startActivity(intent)
            }
        }
    }

    private fun checkFields(email: String, password: String): Boolean {
        val continueBtn: CardView = findViewById(R.id.continue_btn)
        return email != "" && password != ""
    }
}