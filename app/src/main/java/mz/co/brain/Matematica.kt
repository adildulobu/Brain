package mz.co.brain

class Matematica{
    fun equacao(eqc:String){

        //println("f(x)= $eqc=0")

        val numero:List<String> = eqc.split("x")
        // val numero1:List<String> =eqc.split("")


        val a:Int = numero[0].toInt()
        val b:Int = numero[1].toInt()
        val c:Int = numero[2].toInt()

        println()
        if(a!=0) {

            //REVER ESSA PARTE... NAO ESTA A FINCIONAR MUITO BEM.
            if ((a > 0) || (b > 0) || (c > 0))
                println("${a}X² +${b}X +$c =0")
            else if ((a < 0) || (b < 0) || (c < 0))
                println("${a}X² ${b}X $c =0")
            //println("f(x): ${a}X*X+${b}X+${c}=0")

            println("-------------DELTA------------")
            val delta1: Double = ((b * b) - (4 * a * c)).toDouble()
            println("∆ = b² - 4*a*c")
            println("∆ = ($b²)-(4*$a*$c)")
            println("∆ = $delta1")

            if (delta1 > 0) {
                println("A EQUACAO TEM DUAS RAIZES REAIS E DISTINTAS, DELTA = $delta1")
                println("------------VALORES DE X1 E X2-----------------")
                println("X1/2 = -b ± √∆/(2*a)")
                println("x1 = (-${b} + √${delta1})/ (2 * $a)")
                println("x2 = (-${b} - √${delta1})/ (2 * $a)")
                val x1: Double = (-b + (Math.pow(delta1,0.5))) / (2 * a)
                val x2: Double = (-b - (Math.pow(delta1,0.5))) / (2 * a)

                println("\nVALORES DE X1 E X2 SAO:\nX1 = $x1\nX2 = $x2")

            } else if (delta1 == 0.0) {
                println("A EQUACAO POSSUI APENAS UMA RAIZ REAL, DELTA = $delta1 ")
                println("------------VALORES DE X1 E X2-----------------")
                println("X1/2 = -b ± √∆/(2*a)")
                println("x1 = (-${b} + √${delta1})/ (2 * $a)")
                println("x2 = (-${b} - √${delta1})/ (2 * $a)")
                val x1: Double = (-b + (Math.pow(delta1,0.5))) / (2 * a)
                val x2: Double = (-b - (Math.pow(delta1,0.5))) / (2 * a)

                println("\nVALORES DE X1 E X2 SAO:\nX1 = $x1\nX2 = $x2")

            } else {
                println("EQUACAO NAO POSSUI RAIZES REAIS, DELTA = $delta1")

            }
        }
        else{
            println("NAO E' EQUACAO QUADRATICA, QUANDO a=O A EQUACAO TRANSFORMA-SE EM EQUACAO LINEAR")
            println("${b}X+$c=0")

            if(b<0){
                println("O GRAFICO DA DESTA EQUADAO E' DECRESCENTE")
            }
            else{
                println("O GRAFICO DA DESTA EQUADAO E' CRESCENTE")
            }

        }
        println()
    }
    fun forca(m:Double, a:Double): Double {

        val f = m*a
        return f

    }
}

fun main(args: Array<String>){
    val eqc = Matematica()
    var opcao: String

    do{

        print("INTRODUZA A EQUACAO: ")
        val num:String = readLine().toString()

        eqc.equacao(num)

        println("DESEJA CONTINUAR\n[S]-SIM\n[N]-NAO:")
        opcao = readLine().toString()

    }while(!opcao.equals("n"))


}