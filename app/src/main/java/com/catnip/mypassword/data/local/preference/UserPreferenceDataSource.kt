package com.catnip.mypassword.data.local.preference

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
interface UserPreferenceDataSource {
    fun getUserAppKey(): String?
    fun setUserAppKey(newAppKey: String)
}

class UserPreferenceDataSourceImpl(
    private val userPreference: UserPreference
) : UserPreferenceDataSource {

    override fun getUserAppKey(): String? {
        return userPreference.appKey
    }

    override fun setUserAppKey(newAppKey: String) {
        userPreference.appKey = newAppKey
    }
}
