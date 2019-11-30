package mz.co.brain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun eq(x:String){
        val y:List<String> = x.split("x+")
        val a = y[0].toInt()
        val b = y[1].toInt()
        val c = y[2].toInt()
        println("Introduziu a Equacao:${a}x+${b}x+${c}=0")
        if(a!=0){
            val delta:Int
            println("Δ=b2-4ac")
            delta = ((b*b)-(4*a*c))
            println("Δ=${b}*${b}-4*${a}*${c}")
            if(delta==0){
                val x1= (-b+ sqrt(delta.toDouble()))/2*a
                println("Δ=${delta} e igual a zero tera raizes iguais x1 e igual a x2=${x1}")
            }else if(delta>0){
                val x1= (-b+ sqrt(delta.toDouble()))/2*a
                //println("x1={-b}+")
                val x2= (-b- sqrt(delta.toDouble()))/2*a
                println("x1=${x1}")
                println("x2=${x2}")
                println("Δ=${delta} e maior que zero tera raizes distintas")
            }else{
                println("Nao tem raizes porque o Δ=${delta} e menor que zero, nao tem raizes em R")
            }
        }
    }
}
