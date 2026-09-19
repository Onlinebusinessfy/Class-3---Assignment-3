package com.samuel.session3

fun main(){
    println("===List Example===")
    val fruits = listOf("Apple", "Banana", "Orange", "Banana", "Pear")

    println(fruits)
    println("First Fruit: ${fruits[0]}")
    println("Third Fruit: ${fruits[2]}")

    println("===Set Example===")
    val subjects = setOf("Django", "Kotlin", "Databases", "Jetpack Compose", "Kotlin")
    println(subjects)

    val colors = setOf("Red", "Orange", "Yellow", "Yellow", "Green", "Blue", "Blue")
    println("Colors: $colors")
    println("Size: ${colors.size}")

    println("===CHALLENGE 1===")
    val hobbies = setOf("Soccer", "Soccer", "Videogames", "Shopping", "Driving", "Learning", "Watching sports", "Videogames")
    println(hobbies)
    println("Size: ${hobbies.size}")
    // Set is useful here because it only counts the unique hobbies that I practice and shows which are them without repeating the duplicates

    println("===Map Examples===")
    val student = mapOf(
        "name" to "Samuel",
        "school" to "SDGKU",
        "program" to "MDI2"
    )

    println(student)
    println("Name: ${student["name"]}")
    println("Program: ${student["program"]}")

    println("===CHALLENGE 2===")

    val countries = mapOf(
        "France" to "Paris",
        "Spain" to "Madrid",
        "United States" to "Washington D.C",
        "Mexico" to "Mexico City"
    )

    println(countries)
    println("Capital of Mexico: ${countries["Mexico"]}")

    for (country in countries){
        println(country)
    }

    println("===CHALLENGE 3===")

    val mobileApps = listOf("WhatsApp", "Instagram", "Gmail", "BBVA App", "Tik Tok")
    val favoriteMovies = setOf("Tron", "Jumanji", "Batman", "Jumanji", "John Wick", "Avengers", "Spiderman", "Avengers")
    val personalInformation = mapOf(
        "name" to "Samuel Dominguez",
        "age" to "21",
        "city" to "Tijuana",
        "program" to "MDI2"
    )

    println("Favorite mobile Apps: $mobileApps")
    println("Favorite Movies: $favoriteMovies")
    println("Personal Information: $personalInformation")

    println("===IMMUTABLE LIST===")
    val cars = listOf("Honda", "Kia", "BMW", "Chevrolet", "Toyota", "Ford")

    println(cars)
    println("First Car: ${cars[0]}")
    println("Third Car: ${cars[2]}")

    println("===CHALLENGE 4===")
    val videogames = listOf("Valorant", "Fortnite", "Rocket League", "FIFA", "Mario Bros")
    for (videogame in videogames){
        println(videogame)
    }
    println("The first videogame is: ${videogames[0]}")
    println("The last videogame is: ${videogames[4]}")

    println("===MUTABLE LIST===")
    println("===Original List===")
    val vegetables = mutableListOf("Carrot", "Tomato", "Broccoli", "Cucumber", "Celery")
    println(vegetables)
    //Add a value
    println("===Add Value===")
    vegetables.add("Corn")
    println(vegetables)
    //Remove a value
    println("===Remove Value===")
    vegetables.remove("Broccoli")
    println(vegetables)
    //Update a value
    println("===Update Value===")
    vegetables[4] = "Onion"
    println(vegetables)

    println("===CHALLENGE 5===")
    println("===Original===")
    val favoriteFoods = mutableListOf("Tacos", "Pizza", "Octopus")
    println(favoriteFoods)

    println("===Add===")
    favoriteFoods.add("Chicken")
    println(favoriteFoods)

    println("===Remove===")
    favoriteFoods.remove("Octopus")
    println(favoriteFoods)

    println("===Update===")
    favoriteFoods[1] = "Tortas ahogadas"
    println(favoriteFoods)

    println("===FUNCTION===")
    sayHello()
    sayHello()
    sayHello()

    greetUser("Claudia")
    greetUser("Samuel")
    greetUser("Reggie")

    val result = addNumbers(18, 9)
    println(result)

    println("===Challenge 6===")
    favoriteMovie()
    val multiplication = multiplyNumbers(10, 4, 7)
    println("Multiplication of 3 numbers: $multiplication")
}

// BASIC FUNCTION SYNTAX
fun sayHello(){
    print("Hello from a function")
}

// FUNCTION WITH PARAMETERS
fun greetUser(name: String){
    println("Hello, $name")
}

//FUNCTION WITH RETURN VALUE
fun addNumbers(number1:Int, number2:Int): Int{
    return number1 + number2
}

fun favoriteMovie(){
    println("My favorite movie is Tron")
}

fun multiplyNumbers(number1:Int, number2:Int, number3:Int): Int{
    return number1 * number2 * number3
}