package hw1.model

public class Profile (
    val id: Int,
    val login: String,
    private val name: String,
    private val surname: String,
    val status: String,
    val avatarPath: String
) {
    val fullname: String
        get() = name + surname
}