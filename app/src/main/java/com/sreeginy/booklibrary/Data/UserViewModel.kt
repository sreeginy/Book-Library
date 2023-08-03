package com.sreeginy.booklibrary.Data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class UserViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<User>>

    
}