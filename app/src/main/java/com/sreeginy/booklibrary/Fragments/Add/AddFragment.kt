package com.sreeginy.booklibrary.Fragments.Add

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.sreeginy.booklibrary.Data.UserViewModel
import com.sreeginy.booklibrary.R

class addFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        view.add_btn.setOnClickListener {
            insertDataToDatabase()
        }
        return view
    }

    private fun insertDataToDatabase() {

        val firstName = addFirstName_et.text.toString()
        val lastName = addLastName_et.text.toString()
        val age = addAge_et.text

        if(inputCheck(firstName, lastName, age)) {
            val user = User(0, firastName, lastName, Integer.parseInt(age.toString()))
            mUserViewModel.addUser(user)
            Toast.make.Text(this,"Sucessfully added!", Toat.LENGTH_LONG)
        }
    }

    private fun inputCheck(firstName: String, lastName: String, age:Editable): Boolean {
        return !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(lastName) && age.isEmpty())
    }
}