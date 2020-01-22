package hw2

import hw2.view.TextView
import hw2.view.ViewGroup
import hw2.widget.Button

fun main(){
    //не очень поняла, что должна addView делать
    val main = ViewGroup()
    val textView = TextView("Meow!")
    main.addView(textView)

    val content = ViewGroup()
    val button = Button("Woof!")
    content.addView(button)


    textView.click()
    textView.text = "Purr~"
    println(textView.text)
    textView.click()
    button.click()
    button.text = "Grrr~"
    println(button.text)
    button.click()
}