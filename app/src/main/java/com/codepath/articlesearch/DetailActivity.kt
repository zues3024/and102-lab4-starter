package com.codepath.articlesearch

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var releaseDateTextView: TextView
    private lateinit var overviewTextView: TextView
    private lateinit var voteAvgTextView: TextView
    private lateinit var voteCountTextView: TextView
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        releaseDateTextView = findViewById(R.id.mediaDescription)
        overviewTextView = findViewById(R.id.mediaAbstract)
        voteAvgTextView = findViewById(R.id.mediaVoteAverage)
        voteCountTextView = findViewById(R.id.mediaVoteCount)


        // TODO: Get the extra from the Intent
        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as Article
        val radius = 90
        val requestOptions = RequestOptions().transform(RoundedCorners(radius))

        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = article.title
        releaseDateTextView.text = "Release Date: " + article.releaseDate
        voteAvgTextView.text = "Vote Average: ${article.voteAvg.toString()}"
        voteCountTextView.text = "Total Votes: ${article.voteCount}"
        overviewTextView.text = article.overview

        // TODO: Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + article.multimedia)
            .apply(requestOptions)
            .into(mediaImageView)
    }
}