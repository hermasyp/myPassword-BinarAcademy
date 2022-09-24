package com.catnip.mypassword.presentation.ui.passwordlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.catnip.mypassword.data.local.database.entity.PasswordEntity
import com.catnip.mypassword.data.repository.LocalRepository
import com.catnip.mypassword.wrapper.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class PasswordListViewModel(private val repository: LocalRepository) : ViewModel() {

    val passwordListResult = MutableLiveData<Resource<List<PasswordEntity>>>()

    val deleteResult = MutableLiveData<Resource<Number>>()

    fun checkIfAppKeyIsExist(): Boolean {
        return repository.checkIfAppKeyIsExist()
    }

    fun getPasswordList() {
        viewModelScope.launch {
            passwordListResult.postValue(Resource.Loading())
            delay(1000)
            passwordListResult.postValue(repository.getPasswordList())
        }
    }

    fun deletePassword(item: PasswordEntity) {
        viewModelScope.launch {
            deleteResult.postValue(Resource.Loading())
            delay(1000)
            deleteResult.postValue(repository.deletePassword(item))
        }
    }


}