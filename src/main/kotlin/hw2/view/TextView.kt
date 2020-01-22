package hw2.view

open class TextView(
    var text: String
): View() {
    override fun click(){
        println(text)
    }
}