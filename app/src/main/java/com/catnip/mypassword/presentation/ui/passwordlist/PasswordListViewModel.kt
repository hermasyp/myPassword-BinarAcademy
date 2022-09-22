package com.catnip.mypassword.presentation.ui.passwordlist

import androidx.lifecycle.ViewModel
import com.catnip.mypassword.data.repository.LocalRepository

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class PasswordListViewModel(private val repository: LocalRepository) : ViewModel() {

    fun checkIfAppKeyIsExist(): Boolean {
        return repository.checkIfAppKeyIsExist()
    }

}