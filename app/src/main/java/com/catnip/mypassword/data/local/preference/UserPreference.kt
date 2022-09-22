package com.catnip.mypassword.data.local.preference

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class UserPreference(context: Context) {
    //1 : declare the preference
    private val preference: SharedPreferences = context.getSharedPreferences(NAME, MODE)

    companion object {
        private const val NAME = "myPassword"
        private const val MODE = Context.MODE_PRIVATE
    }
    //3 : define a variable for set and get the preference
    var appKey: String?
        get() = preference.getString(
            PreferenceKey.PREF_USER_APP_KEY.first,
            PreferenceKey.PREF_USER_APP_KEY.second
        )
        set(value) = preference.edit {
            this.putString(PreferenceKey.PREF_USER_APP_KEY.first,value)
        }

}

object PreferenceKey {
    //2 : define key and default value for sf, key = PREF_USER_APP_KEY, default = null
    val PREF_USER_APP_KEY = Pair("PREF_USER_APP_KEY", null)
}