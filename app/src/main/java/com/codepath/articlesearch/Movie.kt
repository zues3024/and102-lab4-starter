package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val response: List<Article>?
)

//@Keep
//@Serializable
//data class BaseResponse(
//    @SerialName("docs")
//    val docs: List<Article>?
//)
//
@Keep
@Serializable
data class Article(
    @SerialName("title")
    val title: String?,
//    @SerialName("byline")
//    val byline: Byline?,
    @SerialName("overview")
    val overview: String?,
    @SerialName("poster_path")
    val multimedia: String?,
    @SerialName("vote_average")
    val voteAvg: Double?,
    @SerialName("release_date")
    val releaseDate: String?,
    @SerialName("vote_count")
    val voteCount: String?
) : java.io.Serializable
//
//@Keep
//@Serializable
//data class HeadLine(
//    @SerialName("main")
//    val main: String
//) : java.io.Serializable
//
//@Keep
//@Serializable
//data class Byline(
//    @SerialName("original")
//    val original: String? = null
//) : java.io.Serializable
//
@Keep
@Serializable
data class MultiMedia(
    @SerialName("url")
    val url: String?
) : java.io.Serializable
