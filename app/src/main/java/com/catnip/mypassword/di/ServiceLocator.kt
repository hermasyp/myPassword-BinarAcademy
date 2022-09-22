package com.catnip.mypassword.di

import android.content.Context
import com.catnip.mypassword.data.local.preference.UserPreference
import com.catnip.mypassword.data.local.preference.UserPreferenceDataSource
import com.catnip.mypassword.data.local.preference.UserPreferenceDataSourceImpl
import com.catnip.mypassword.data.repository.LocalRepository
import com.catnip.mypassword.data.repository.LocalRepositoryImpl

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
object ServiceLocator {

    fun provideUserPreference(context: Context): UserPreference {
        return UserPreference(context)
    }

    fun provideUserPreferenceDataSource(context: Context): UserPreferenceDataSource {
        return UserPreferenceDataSourceImpl(provideUserPreference(context))
    }

    fun provideLocalRepository(context: Context): LocalRepository {
        return LocalRepositoryImpl(provideUserPreferenceDataSource(context))
    }

}