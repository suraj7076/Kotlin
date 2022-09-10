package classesObjects.resturents

fun main(){
    val res1 = Restaurants("A", 3.2, 1)
    val res2 = Restaurants("B", 4.2, 21)
    val res3 = Restaurants("C", 2.2, 13)
    val res4 = Restaurants("D", 1.2, 11)
    val res5 = Restaurants("E", 5.0, 14)

    //Suppose there are 1000 objects, so how you can print?
    //ans: using list of restaurant

    var restaurants = mutableListOf(res1, res2, res3)
    restaurants.add(res4)
    restaurants.add(res5)

    for (eachRestaurant in restaurants){
        println(eachRestaurant)
    }
}