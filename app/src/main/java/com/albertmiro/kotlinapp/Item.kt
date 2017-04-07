package com.albertmiro.kotlinapp

fun getItems() : List<Item> {
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/nature/$it/") }
}

data class Item(val id : Long, val title: String, val url: String)