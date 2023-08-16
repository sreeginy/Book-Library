package com.sreeginy.booklibrary.Fragments.List

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sreeginy.booklibrary.Data.UserViewModel
import com.sreeginy.booklibrary.R

class ListFragment : Fragment() {

    public lateinit var floatingActionButton: FloatingActionButton
    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)


        floatingActionButton = view.findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }
//
//
//        val adapter = ListAdapter()
//        val recyclerView = view.recyclerview
//        recyclerView.adapter = adapter
//        recyclerView.LayoutManager = LinerLayoutManager(requireContext())
//
//        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
//        mUserViewModel.readAllData.observe(this, Observer {
//            adapter.setData()
//        })


        
        return view
    }

}