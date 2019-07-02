package com.example.alexandre.boaviagem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val edUsuario = findViewById<EditText>(R.id.usuarioInput)
            val edSenha = findViewById<EditText>(R.id.senhaInput)
            if ("admin".equals(edUsuario.text.trim().toString()) && "123".equals(edSenha.text.trim().toString())) {
                val i = Intent(this@MainActivity, HomeActivity::class.java)
                AlertDialog.Builder(this@MainActivity)
                startActivity(i)
            } else {
                AlertDialog.Builder(this@MainActivity)
                    .setTitle("Login Inválido")
                    .setMessage("Usuário/Senha Inválidos")
                    .setPositiveButton("Ok", {dialog, i -> dialog.dismiss()})
                    .show()
            }
        }
    }
}


