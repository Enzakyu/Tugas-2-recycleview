package com.example.tugas2recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

// Pastikan "Movie" adalah nama data class yang sudah kamu buat
class MovieAdapter(private val movieList: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    // ViewHolder: Menghubungkan variabel dengan ID di item_movie.xml

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // R.layout.item_movie harus sesuai dengan nama file XML di folder layout
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.tvTitle.text = movie.title
        holder.tvYear.text = movie.year
        holder.tvGenre.text = movie.genre

        // Memasukkan gambar dari URL ke ImageView
        com.bumptech.glide.Glide.with(holder.itemView.context)
            .load(movie.photoUrl)
            .placeholder(android.R.color.darker_gray) // Gambar sementara saat loading
            .error(android.R.color.holo_red_light)    // Gambar jika URL rusak
            .into(holder.imgMoviePhoto)
    }

    // Pastikan ViewHolder-nya sudah menangkap img_movie_photo
    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        val tvYear: TextView = itemView.findViewById(R.id.tv_year)
        val tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        val imgMoviePhoto: ImageView = itemView.findViewById(R.id.img_movie_photo)
    }

    override fun getItemCount(): Int = movieList.size
}