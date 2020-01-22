package hw1.model

public class Profile (
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    var status: String,
    var avatarPath: String
) {
    fun fullname(): String {
        return "$name $surname"
    }
}