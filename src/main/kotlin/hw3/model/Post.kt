package hw3.model

import java.util.*

class Post(
    val publisherId: String?, //при репостах
    val repostingDate: Date?, //и это
    val authorId: String,
    val postDate: Date,
    val isPinned: Boolean,
    var postText: String?, //потому что текста может и не быть?
    var like: Like,
    var repost: Repost,
    var comments: Comments,
    var view: Views,
    val friendsOnly: Boolean,
    val geo: Geo?,
    val authorSign: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isAd: Boolean,
    var isFavorite: Boolean
){}