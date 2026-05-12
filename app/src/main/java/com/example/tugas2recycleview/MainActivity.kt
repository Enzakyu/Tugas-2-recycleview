package com.example.tugas2recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMovies = findViewById<RecyclerView>(R.id.rv_movies)

        // Data dummy
        val movieList = listOf(
            Movie("Inception", "2010", "Sci-Fi", "https://upload.wikimedia.org/wikipedia/id/b/bc/Interstellar_film_poster.jpg"),
            Movie("The Dark Knight", "2008", "Action", "https://upload.wikimedia.org/wikipedia/en/1/1c/The_Dark_Knight_%282008_film%29.jpg"),
            Movie("The Matrix", "1999", "Action", "https://upload.wikimedia.org/wikipedia/en/d/db/The_Matrix.png"),
            Movie("Avatar", "2009", "Sci-Fi", "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg"),
            Movie("The Godfather", "1972", "Crime", "https://upload.wikimedia.org/wikipedia/en/1/1c/Godfather_ver1.jpg"),
            Movie("Pulp Fiction", "1994", "Crime", "https://upload.wikimedia.org/wikipedia/en/3/3b/Pulp_Fiction_%281994%29_poster.jpg"),
            Movie("Forrest Gump", "1994", "Drama", "https://upload.wikimedia.org/wikipedia/en/6/67/Forrest_Gump_poster.jpg"),
            Movie("Parasite", "2019", "Thriller", "https://upload.wikimedia.org/wikipedia/en/5/53/Parasite_%282019_film%29.png"),
            Movie("The Avengers", "2012", "Action", "https://upload.wikimedia.org/wikipedia/en/8/8a/The_Avengers_%282012_film%29_poster.jpg"),
            Movie("Spirited Away", "2001", "Animation", "https://upload.wikimedia.org/wikipedia/en/d/db/Spirited_Away_Japanese_poster.png")
        )



        // Set layout manager dan adapter
        rvMovies.layoutManager = LinearLayoutManager(this)
        rvMovies.adapter = MovieAdapter(movieList)
    }
}