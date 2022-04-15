package com.example.recycleviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.capten,
                nameSuperhero = "Captain America",
                descriptionSuperhero = "Captain America is a superhero appearing in American comic books published by Marvel Comics. " +
                        "Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 from Timely Comics, " +
                        "a predecessor of Marvel Comics."
            ),

            Superhero(
                R.drawable.iron,
                nameSuperhero = "Iron Man",
                descriptionSuperhero = "Iron Man is a superhero appearing in American comic books published by Marvel Comics. " +
                        "The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, " +
                        "and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), " +
                        "and received his own title in Iron Man #1 (May 1968). Also in 1963, the character founded the Avengers alongside Thor, Ant-Man, Wasp and the Hulk."
            ),

            Superhero(
                R.drawable.widow,
                nameSuperhero = "Black Widow",
                descriptionSuperhero = "Natasha Romanoff, a former KGB spy, is shocked to find out that her ex handler, " +
                        "General Dreykov, is still alive. While evading capture by Taskmaster, she is forced to confront her dark past."
            ),

            Superhero(
                R.drawable.hawkeye,
                nameSuperhero = "Hawk Eye",
                descriptionSuperhero = "Hawkeye is an American television miniseries created by Jonathan Igla for the streaming service Disney+, " +
                        "based on Marvel Comics featuring the characters Clint Barton / Hawkeye and Kate Bishop / Hawkeye. " +
                        "It is the fifth television series in the Marvel Cinematic Universe (MCU) produced by Marvel Studios, " +
                        "sharing continuity with the films of the franchise and taking place after the events of the film Avengers: Endgame (2019). " +
                        "Igla served as head writer with Rhys Thomas leading the directing team."
            ),

            Superhero(
                R.drawable.scarlet,
                nameSuperhero = "Scarlet Witch",
                descriptionSuperhero = "The Scarlet Witch is a fictional character appearing in American comic books published by Marvel Comics. " +
                        "The character was created by writer Stan Lee and artist Jack Kirby. " +
                        "Her first appearance was in The X-Men #4 in the Silver Age of Comic Books."
            ),

            Superhero(
                R.drawable.quicksilver,
                nameSuperhero = "Quick Silver",
                descriptionSuperhero = "Quicksilver is a fictional character appearing in American comic books published by Marvel Comics. " +
                        "The character first appeared in the comic book The Uncanny X-Men #4 and was created by Stan Lee and Jack Kirby."
            ),

            Superhero(
                R.drawable.doctor,
                nameSuperhero = "Doctor Strange",
                descriptionSuperhero = "Dr Stephen Strange casts a forbidden spell that opens a portal to the multiverse. " +
                        "However, a threat emerges that may be too big for his team to handle."
            ),

            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descriptionSuperhero = "The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. " +
                        "Created by writer Stan Lee and artist Jack Kirby, " +
                        "the character first appeared in the debut issue of The Incredible Hulk."
            ),

            Superhero(
                R.drawable.spider,
                nameSuperhero = "Spider Man",
                descriptionSuperhero = "Spider-Man is a superhero appearing in American comic books published by Marvel Comics. " +
                        "Created by writer-editor Stan Lee and artist Steve Ditko, " +
                        "he first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books."
            ),

            Superhero(
                R.drawable.moon,
                nameSuperhero = "Moon Knight",
                descriptionSuperhero = "Steven Grant and mercenary Marc Spector investigate the mysteries of the Egyptian gods from inside the same body."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}