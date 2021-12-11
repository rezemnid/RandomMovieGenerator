package com.example.randommoviegenerator

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomButton:Button=findViewById(R.id.random_button)
        val moviePoster:ImageView=findViewById(R.id.poster)
        val movieName:TextView=findViewById(R.id.movie_name)
        val pageBG:ImageView=findViewById(R.id.page_bg)
        val movieGenre:TextView=findViewById(R.id.movie_genre)


        randomButton.setOnClickListener{

            var randomNumber=(1..6).random()

            when(randomNumber){
                1->{
                    pageBG.setImageResource(R.drawable.img_1)
                    movieName.text="Central Intelligence"
                    moviePoster.setImageResource(R.drawable.img_1)
                    movieGenre.text="Comedy"


                }
                2->{
                    pageBG.setImageResource(R.drawable.img_2)
                    movieName.text="Scott Pilgrim vs The World"
                    moviePoster.setImageResource(R.drawable.img_2)
                    movieGenre.text="Adventure"
                }
                3->{
                    pageBG.setImageResource(R.drawable.img_3)
                    movieName.text="The Mitchells vs The Machines"
                    moviePoster.setImageResource(R.drawable.img_3)
                    movieGenre.text="Animation"
                }
                4->{
                    pageBG.setImageResource(R.drawable.img_4)
                    movieName.text="Zodiac"
                    moviePoster.setImageResource(R.drawable.img_4)
                    movieGenre.text="Comedy"

                }
                5->{
                    pageBG.setImageResource(R.drawable.img_5)
                    movieName.text="Howl's Moving Castle"
                    moviePoster.setImageResource(R.drawable.img_5)
                    movieGenre.text="Anime"
                }
                else->{
                    pageBG.setImageResource(R.drawable.img_6)
                    movieName.text="The Associate"
                    moviePoster.setImageResource(R.drawable.img_6)
                    movieGenre.text="Drama"
                }


            }


        }













    }
}