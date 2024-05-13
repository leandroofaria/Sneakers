package com.example.sneakers

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        val valor = findViewById<TextView>(R.id.valor)
        val descricao = findViewById<TextView>(R.id.descricao)

        nome.text = "Cachorrooo"
        valor.text = "Valor"
        descricao.text = "DeSCRICAO"

        
    }

}
