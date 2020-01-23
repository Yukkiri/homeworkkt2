package hw2.view

open class TextView(
    val text: String
): View() {
    override fun click(){
        println(text)
    }
}