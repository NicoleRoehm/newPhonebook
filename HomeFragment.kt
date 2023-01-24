package com.example.phone_book.ui

import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.phone_book.adapter.PhoneAdapter
import com.example.phone_book.data.Datasource
import com.example.phone_book.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    private lateinit var binding:FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val datasource = Datasource()
        val phoneList = datasource.getContactList()
        //Todo bei Fragmenten(nicht "this" benutzen sondern"requireContext()")
        binding.homeRecyclerview.adapter = PhoneAdapter(requireContext(),phoneList)



    }
}