var desayunoList: List<String> = emptyList()
var comidaList: List<String> = emptyList()
var cenaList: List<String> = emptyList()

fun main(args: Array<String>){
    showMenu()
}
fun showMenu(){
    do {
        val menu = """
        ::Bienvenido a Recipes Maker::
        
        Seleccione la opcion deseada
        1.- Comidas
        2.- Mis Recetas
        3.- Salir de la aplicacion
    """.trimIndent()

        println(menu)
        val option = readLine()

        when (option){
            "1" -> showFood()
            "2" -> misRecetas()
            "3" -> { println("Finalizando programa"); break }
            else -> println("Ingrese un dato valido")
        }
    }while(true)
}

fun showFood(){
    do {
        val food = """
        ::Bienvenido a Recipes Maker::
        
        Seleccione la comida deseada
        1.- Desayunos
        2.- Comida
        3.- Cena
        4.- Regresar al menu principal
    """.trimIndent()

        println(food)

        val opcion = readLine()

        when (opcion){
            "1" -> desayuno()
            "2" -> comida()
            "3" -> cena()
            "4" ->  showMenu()
            else -> println("Ingrese un dato valido")
        }
    }while(true)
}

fun desayuno(){
    do {
        var menuDesayuno = """
            Bienvenido a la seccion de desayunos
     Tengo estas recetas para el desayuno perfecto para ti
            1.- Huevos revueltos con jamon
            2.- Hot cakes
            3.- Enfrijoladas 
            0.- Salir del menu
            """.trimMargin()

        println(menuDesayuno)
        val desayuno = readLine()

        when(desayuno){
            "1" -> {println("Se ha guardado con exito la receta de huevo revueltos con jamon \n")
                desayunoList += "Huevos Revueltos con jamon"}
            "2" -> {
                println("Se ha guardado con exito la receta de Hotcakes \n")
                desayunoList += "Hot cakes" }

            "3" -> {println("Se ha guardado con exito la receta de Enfrijoladas \n ")
                desayunoList += "Enfrijoladas"}

            "0" -> showFood()

            else -> println("No has añadido una opcion correcta")
        }

    }while (true)
}
fun comida(){
    do {
        var menuComida = """
                Bienvenido a la seccion de desayunos
        Tengo estas recetas para la comida perfecta para ti
            1.- Milanesas empanizadas
            2.- Enchiladas suizas
            3.- Pollo enchilado con papas a la francesa
            0.- Salir del menu
            """.trimMargin()
        println(menuComida)

        val comida = readLine()

        when(comida){
            "1" -> {println("Se ha guardado con exito la receta de milanesa empanizada \n")
                comidaList += "Milanesa empanizada"}
            "2" -> {
                println("Se ha guardado con exito la receta de Enchiladas suizas \n")
                comidaList += "Enchiladas suizas"}

            "3" -> {println("Se ha guardado con exito la receta de Pollo enchilado \n")
                comidaList += "Pollo enchilado"}

            "0" -> showFood()

            else -> println("No has añadido una opcion correcta \n")
        }

    }while (true)

}

fun cena(){
    do {
        var menuCena =  """
            Bienvenido a la seccion de desayunos
        Tengo estas recetas para la cena perfecta para ti
            1.- Hamburguesas
            2.- Picaditas 
            3.- Tacos de Pollo
            0.- Salir del menu
            """.trimMargin()
        println(menuCena)

        val cena = readLine()

        when(cena){
            "1" -> {println("Se ha guardado con exito la receta de Hamburguesas\n")
                cenaList += "Hamburguesa" }
            "2" -> {
                println("Se ha guardado con exito la receta de Picaditas\n")
                cenaList += "Picaditas" }

            "3" -> {println("Se ha guardado con exito la receta de Tacos de Pollo\n")
                cenaList += "Tacos de Pollo"}

            "0" -> showFood()

            else -> println("No has añadido una opcion correcta")
        }

    }while (true)

}

fun misRecetas(){
    var menu = """
        Tus recetas
    Desayuno:
        $desayunoList
    Comida:
        $comidaList
    Cena: 
        $cenaList
   
    """.trimIndent()

    println(menu)
}