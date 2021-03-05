package com.example.uvagradecalculator

import android.graphics.Color.GREEN
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var statusFinal : String = ""
        val btCalcular = calcular
        val textResult = resultado
        var mediaA1 : Double? = 0.0
        var mediaA2 : Double? = 0.0
        var mediaFinal : Double? = 0.0
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
            if (notaAva2 != null && notaAva3 != null) {
                if(notaAva2 > 4) mediaA2 = notaAva2
                if(notaAva2 <= 4 && notaAva3 > 4){
                    mediaA2 = notaAva3
                }
            }
            mediaFinal = (mediaA1!! + mediaA2!!) / 2
            if(mediaFinal!! >= 6.0){
                statusFinal = "Aprovado"
                textResult.setText(
                    "\nMEDIA A1: $mediaA1"+
                    "\nMEDIA A2: $mediaA2"+
                    "\nMEDIA FINAL: $mediaFinal"+
                    "\nStatus: $statusFinal")
                textResult.setTextColor(GREEN)
            }else{
                statusFinal = "Reprovado"
                textResult.setText("" +
                        "\nMEDIA A1: $mediaA1\"+\n" +
                        "\nMEDIA A2: $mediaA2\"+\n" +
                        "\nMEDIA FINAL: $mediaFinal\"+\n" +
                        "\nStatus: $statusFinal\"")
                textResult.setTextColor(RED)
            }


            textResult.text =
                    "\nMEDIA A1: $mediaA1"+
                    "\nMEDIA A2: $mediaA2"+
                    "\nMEDIA FINAL: $mediaFinal"+
                    "\nStatus: $statusFinal"

        }
    }
}