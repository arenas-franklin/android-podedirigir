package br.com.arenasfranklin.PodeDirigir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.getStringExtra("nome")

        txvNome.text = "seja bem vindo(a) ao inferno $nome"

        var listaIdade = arrayListOf<Int>()

        for(idade in 1..100){
            listaIdade.add(idade)
        }

        var idadeAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,listaIdade)
        spnIdades.adapter = idadeAdapter



        btnVerificar.setOnClickListener {
            var idadeSelecionada = spnIdades.selectedItem  as Int
            if (idadeSelecionada >= 18){

                txvResoltado.text = "olha só vc já pode dirigir"

             }else{
                txvResoltado.text = "vc não pode dirigir jovem"
            }
        }
    }
}
