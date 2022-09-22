package com.catnip.mypassword.presentation.ui.createappkey

import androidx.lifecycle.ViewModel
import com.catnip.mypassword.data.repository.LocalRepository

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class CreateAppKeyViewModel(private val repository: LocalRepository) : ViewModel() {
    fun setAppKey(newAppKey: String){
        repository.setAppKey(newAppKey)
    }
}