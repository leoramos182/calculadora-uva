package com.example.uvagradecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val textResult = resultado
        btCalcular.setOnClickListener {
            var notaForum : Double = forum.text.toString().toDouble()
            var notaAva1 : Double = ava1.text.toString().toDouble()
            var notaAva2 : Double = ava2.text.toString().toDouble()
            var notaAva3 : Double = ava3.text.toString().toDouble()

            textResult.text = "TESTE 1: $notaForum\nTESTE 2: $notaAva1\nTESTE 3: $notaAva2\nTESTE 4: $notaAva3"
        }
    }
}