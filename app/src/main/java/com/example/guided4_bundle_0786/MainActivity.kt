package com.example.guided4_bundle_0786

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var nim : EditText
    private lateinit var fakultas : EditText
    private lateinit var prodi : EditText
    private lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.etNama)
        nim = findViewById(R.id.etNIM)
        fakultas = findViewById(R.id.etFakultas)
        prodi = findViewById(R.id.etProgramStudi)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener{
            val intent = Intent(this, NextActivity::class.java)
            val mBundle = Bundle()

            mBundle.putString("nama", nama.text.toString())
            mBundle.putString("nim", nim.text.toString())
            mBundle.putString("fakultas", fakultas.text.toString())
            mBundle.putString("prodi", prodi.text.toString())

            intent.putExtra("register", mBundle)
            startActivity(intent)
        }

    }
}