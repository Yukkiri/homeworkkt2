package hw1

import hw1.model.Profile

fun main(){
    val alexey = Profile(1, "Alex", "Алексей", "Лапшин", "online", "/image/img.jpg")
    println(alexey.fullname())
}