package com.example.a01_kotlin_

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        viewCompat()
        val TAG = ":::TAG"

        var NoConstante = "hola"
        val Constante = "hola"
        var n = 2
        Log.d(TAG, "My number is $n")

        // COLOCAMOS LA INTERROGSCIÓN POR SI LA VARIABL ES NULL
        val nullString : String? = null

        //Esto es una forma de condicionamiento en una sola linea, esto lo que hace es que salga por consola cuando la varibal no es NULL

        nullString?.let { Log.d(TAG, nullString) }


        //Esta es la fomra más "tradcional" de hacer lo que está arriba
        if(nullString != null){ Log.d(TAG, nullString) }

        val name = "FEo"
        val age = 12

        funciones(name,age)

        // PARA CREAR UNA INSTANCIA D UNA CLASE PODEMOS USAR LAS VARIBLES TIPO VAR O VAL

        val Diego = Persona()
        Log.d(TAG, "Hola me llamo:${Diego.presentacion()}")

            // COSAS A PRACTIAR: DATA CLASS; es como una coleccion en donde almacenas informacion de "objeto" sin ser en si un objeto.

    }
    class Persona(){
        private val nombre = "Diego"

        fun presentacion(): String = nombre

    }

private fun funciones(name: String, age: Int){

    Log.d(":::FUNCION","EL NOMBRE ES $name" )
    Log.d(":::FUNCION",age.toString() )
    Log.d(":::FUNCION","La suma de 5 + 5 es: ${suma(5.0,5.0)}")



}
    // ESTA ES UNA FORMA DE HACERLO EN UNA SOLA LINEA, LA OTRA FORMA ES LA TRADICIONAL CON LLAVES Y EL RETURN
    private fun suma(n1: Double, n2: Double): Double = n1+n2



private fun tiposDEDatos(){
    //cadenas de textos
    var string: String = "cadena"
    var number: Int = 10
    val numbre: Long = 100


}
    private fun operadores(){
        val value = 5
        val value2 =2

        val suma = value + value2
    }

   private fun viewCompat(){
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}