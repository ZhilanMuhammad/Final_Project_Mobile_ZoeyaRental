package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.onboardingdesain.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnRegis.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val email = binding.addemaillogin.text.toString()
            val password = binding.addpasswordlogin.text.toString()

            if (email.isEmpty()) {
                binding.addemaillogin.error = "Email Harus Diisi"
                binding.addemaillogin.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.addpasswordlogin.error = "Email Tidak Valid"
                binding.addpasswordlogin.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.addpasswordlogin.error = "Password Harus Diisi"
                binding.addpasswordlogin.requestFocus()
                return@setOnClickListener
            }
            LoginFirebase(email,password)
        }
    }

    private fun LoginFirebase(email: String, password: String) {
       auth.signInWithEmailAndPassword(email, password)
           .addOnCompleteListener(this){
               if (it.isSuccessful){
                   Toast.makeText(this, "Selamat Datang $email", Toast.LENGTH_SHORT).show()
                   val intent = Intent(this,DashboardActivity::class.java)
                   startActivity(intent)
               }else{
                   Toast.makeText(this, "${it.exception?.message}",Toast.LENGTH_SHORT).show()
               }
           }
       }
    }



