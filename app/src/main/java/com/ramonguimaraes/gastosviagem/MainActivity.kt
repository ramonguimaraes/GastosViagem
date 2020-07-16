package com.ramonguimaraes.gastosviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener {

            val distancia: Double = edtDistancia.text.toString().toDouble()
            val preco: Double = edtValorDoCombustivel.text.toString().toDouble()
            val autonomia: Double = edtAutonomiaDoVeiculo.text.toString().toDouble()

            val resultado = calcularGastos(distancia, preco, autonomia)
            txtResultado.text = "R$ ".plus(String.format("%.2f", resultado))
        }

    }

    fun calcularGastos(distancia: Double, preco: Double, autonomia: Double): Double {
        return (distancia / autonomia) * preco
    }
}