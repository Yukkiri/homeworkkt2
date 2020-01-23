package hw3.model

import java.util.*

class Post(
    val publisherId: String?, //при репостах
    val repostingDate: Date?, //и это
    val authorId: String,
    val postDate: Date,
    val isPinned: Boolean,
    val postText: String?, //потому что текста может и не быть?
    val like: Like,
    val repost: Repost,
    val comments: Comments,
    val view: Views,
    val friendsOnly: Boolean,
    val geo: Geo?,
    val authorSign: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isAd: Boolean,
    val isFavorite: Boolean
){}