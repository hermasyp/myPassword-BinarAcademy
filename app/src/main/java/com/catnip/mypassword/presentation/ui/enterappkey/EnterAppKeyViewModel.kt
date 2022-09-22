package com.catnip.mypassword.presentation.ui.enterappkey

import androidx.lifecycle.ViewModel
import com.catnip.mypassword.data.repository.LocalRepository

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class EnterAppKeyViewModel(private val repository: LocalRepository) : ViewModel() {
    fun checkIsAppKeyCorrect(appKey: String): Boolean {
        return repository.checkIsAppKeyCorrect(appKey)
    }
}