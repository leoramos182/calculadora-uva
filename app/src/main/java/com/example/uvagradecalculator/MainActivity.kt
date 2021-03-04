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
        var mediaA1 : Double? = 0.0
        btCalcular.setOnClickListener {
            //NOTAS DE FORUM E TRABALHOS
            var notaForum : Double? = forum.text.toString().toDoubleOrNull()
            var notaAva1 : Double? = ava1.text.toString().toDoubleOrNull()
            var notaAva2 : Double? = ava2.text.toString().toDoubleOrNull()
            var notaAva3 : Double? = ava3.text.toString().toDoubleOrNull()
            //CONDICIONAIS
            if(notaForum != null){
                when{
                    notaForum > 5 -> notaForum = 0.0
                    notaForum == 4.0 -> notaForum = 0.0
                }
            }
            if(notaAva1 != null){
                when{
                    notaAva1 > 5.0 -> notaAva1 = 0.0
                    notaAva1 == 4.0 -> notaAva1 = 0.0
                }
            }
            if(notaAva2 != null){
                when{
                    notaAva2 == 4.0 -> notaAva2 = 0.0
                    notaAva2 > 10 -> notaAva2 = 0.0
                }
            }
            if(notaAva3 != null){
                when{
                    notaAva3 == 4.0 -> notaAva3 = 0.0
                    notaAva3 > 10 -> notaAva3 = 0.0
                }
            }
            if (notaForum != null && notaAva1 != null) {
                if (notaForum <= 5 && notaAva1 <= 5) {
                   mediaA1 = (notaForum + notaAva1)
                }
            }

                //MEDIAS DAS NOTAS


            textResult.text = "TESTE 1: $notaForum\nTESTE 2: $notaAva1\nTESTE 3: $notaAva2\nTESTE 4: $notaAva3"+
                    "\nMEDIA A1: $mediaA1"

        }
    }
}