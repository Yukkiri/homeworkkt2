package hw2.view

class ViewGroup ():View(){
    private var view: View? = null
    fun addView(view: View){
        this.view = view
    }
}