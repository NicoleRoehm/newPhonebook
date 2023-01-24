package com.example.phone_book.data

import com.example.phone_book.R
import com.example.phone_book.data.model.Contacts

class Datasource {

    fun getContactList (): MutableList<Contacts>{
        return mutableListOf(

            Contacts( "Babsi", "015372372"),
            Contacts( "Johann", "015672371"),
            Contacts( "Mozart", "015372546"),
            Contacts( "Beethoven", "015397872"),
            Contacts( "Wiwaldi", "015372453"),
            Contacts( "Ducky", "015454379"),
            Contacts( "Goethe", "017564370"),
            Contacts( "Tic", "018545453"),
            Contacts( "Tac", "014492377"),
            Contacts( "To", "015653292")
        )
    }
}