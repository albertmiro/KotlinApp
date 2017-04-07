package com.albertmiro.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_bckp.*

class MainActivity_bckp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bckp)

        //Kotlin examples of how to do different things
        btnShow.setOnClickListener { toast(editText.text) }

        val items = listOf(Item(1,"Title1","url1"), Item(2,"title2","url2"))

////        val sorted = items.sortedBy { it.title }
////        val sorted = items.sortedBy { item -> item.title }
        val sorted = items.sortedBy(Item::title)
        val result: List<String> = items
                .sortedBy(Item::title)
                .filter{ it.url.isNotEmpty() }
                .map(Item::title)


//        val empty = emptyList<Item>()
//        val item = Item("title","url")
//        val (title, _ )  = item
//        val (title, url)  = item
//        val item = Item()
//        item.title = "Title"
//        val title = item.title
    }
}
