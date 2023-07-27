package com.alexis.ec03_ay.model

data class Character(
    val name: String,
    val status: String,
    val species: String,
    val gender: String
)
fun getData(): List<Character>{
    return listOf(
        Character("Rick Sanchez","Alive","Human","Male"),
        Character("Morty Smith","Alive","Human","Male"),
        Character("Summer Smith","Alive","Human","Female")
    )
}
