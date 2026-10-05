class Menu {
    fun menu() : Int{
        var opcion : Int  = 0
        println("===== CALCULADORA BÁSCIA =====")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Calcular resto")
        println("6. Salir")
        println("Selecciona una opción: ")
        var valido = false
        while (!valido) {
            opcion = depurarNums()
            if (opcion !in 1..6) {
                println("Ingresa un número del menú.")
                valido = false
            }else{
                valido = true
            }
        }
        return opcion
    }

    fun calculadora(opcion : Int) : Boolean{
        var fin = false
        when (opcion) {
            1 -> {
                println("Ingresa el  primer número a sumar")
                val num1 : Double = depurarNums().toDouble()
                println("Ingresa el segundo número a sumar")
                val num2 : Double = depurarNums().toDouble()
                val suma = num1 + num2
                println("La suma da: $suma")
            }
            2 -> {
                println("Ingresa el  primer número a restar")
                val num1 : Double = depurarNums().toDouble()
                println("Ingresa el  segundo número a restar")
                val num2 : Double = depurarNums().toDouble()
                val resta = num1 - num2
                println("La resta da: $resta")
            }
            3 ->{
                println("Ingresa el  primer número a multiplicar")
                val num1 : Double = depurarNums().toDouble()
                println("Ingresa el  segundo número a multiplicar")
                val num2 : Double = depurarNums().toDouble()
                val multiplicar = num1 * num2
                println("La multiplicación da: $multiplicar")
            }
            4 -> {
                println("Ingresa el  primer número a dividir")
                val num1 : Double = depurarNums().toDouble()
                println("Ingresa el  segundo número a dividir")
                var num2 : Double = 0.0
                var valido = false
                while (!valido) {
                    num2= depurarNums().toDouble()
                    if (num2 == 0.0){
                        println("No se puede dividir entre 0 .Ingresa otra vez el número")
                        valido = false
                    }else{
                        valido = true
                    }
                }
                val division = num1 / num2
                println("La división da: $division")
            }
            5 -> {
                println("Ingresa el  primer número para calcular el resto")
                val num1 : Double = depurarNums().toDouble()
                println("Ingresa el  segundo número para calcular el resto")
                var num2 : Double = 0.0
                var valido = false
                while (!valido) {
                    num2= depurarNums().toDouble()
                    if (num2 == 0.0){
                        println("No se puede dividir entre 0 .Ingresa otra vez el número")
                        valido = false
                    }else{
                        valido = true
                    }
                }
                val resto = num1 % num2
                println("El resto da: $resto")
            }
            6 -> {
                println("Finalizando programa")
                fin = true
            }
        }
        return fin
    }

    fun depurarNums() : Int{
        var num : Int = 0
        var valido = false
        while (!valido){
            try{
                num = readln().toInt()
                valido = true
            }catch(e: NumberFormatException){
                println("Tienes que ingresar un número. Ingresalo de nuevo")
                valido = false
            }
        }
        return num
    }
}