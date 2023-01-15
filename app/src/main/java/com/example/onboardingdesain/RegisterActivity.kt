package com.example.onboardingdesain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.onboardingdesain.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth


class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRegisterBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnMasuk.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            val email = binding.addemailregis.text.toString()
            val password = binding.addpasswordregis.text.toString()

            if (email.isEmpty()) {
                binding.addemailregis.error = "Email Harus Diisi"
                binding.addemailregis.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.addemailregis.error = "Email Tidak Valid"
                binding.addemailregis.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.addpasswordregis.error = "Password Harus Diisi"
                binding.addpasswordregis.requestFocus()
                return@setOnClickListener
            }

            if (password.length < 6) {
                binding.addpasswordregis.error = "Password Minimal 6 Karakter"
                binding.addpasswordregis.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email,password)

        }

    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "${it.exception?.message}",Toast.LENGTH_SHORT).show()
                }
            }
    }
}

