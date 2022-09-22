package com.catnip.mypassword.data.repository

import com.catnip.mypassword.data.local.preference.UserPreferenceDataSource

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
interface LocalRepository {
    fun checkIfAppKeyIsExist(): Boolean
    fun checkIsAppKeyCorrect(appKey: String): Boolean
    fun setAppKey(newAppKey: String)
}

class LocalRepositoryImpl(
    private val dataSource: UserPreferenceDataSource
) : LocalRepository {

    override fun checkIfAppKeyIsExist(): Boolean {
        return dataSource.getUserAppKey().isNullOrEmpty().not()
    }

    override fun checkIsAppKeyCorrect(appKey: String): Boolean {
        return dataSource.getUserAppKey().equals(appKey, ignoreCase = true)
    }

    override fun setAppKey(newAppKey: String) {
        dataSource.setUserAppKey(newAppKey)
    }

}