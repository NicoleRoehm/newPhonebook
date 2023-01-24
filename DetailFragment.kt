package com.example.phone_book.ui

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.phone_book.R
import com.example.phone_book.data.model.Contacts
import com.example.phone_book.databinding.FragmentDetailBinding

class DetailFragment: Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Todo Code

        val phone = requireArguments().getParcelable<Contacts>("contact",)

        binding.detailContactNameText.text = phone?.name
        binding.detailContactNumberText.text = phone?.number


        binding.detailPhoneImage.setOnClickListener{
            Toast.makeText(
                context,
                "${phone?.name} wird angerufen",
                Toast.LENGTH_LONG
            )
                .show()
        }




    }


}