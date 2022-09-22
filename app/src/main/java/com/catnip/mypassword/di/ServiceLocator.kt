package com.catnip.mypassword.di

import android.content.Context
import com.catnip.mypassword.data.local.database.AppDatabase
import com.catnip.mypassword.data.local.database.dao.PasswordDao
import com.catnip.mypassword.data.local.database.datasource.PasswordDataSource
import com.catnip.mypassword.data.local.database.datasource.PasswordDataSourceImpl
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

    fun provideAppDatabase(appContext: Context): AppDatabase {
        return AppDatabase.getInstance(appContext)
    }

    fun providePasswordDao(appContext: Context): PasswordDao {
        return provideAppDatabase(appContext).passwordDao()
    }

    fun providePasswordDataSource(appContext: Context): PasswordDataSource {
        return PasswordDataSourceImpl(providePasswordDao(appContext))
    }

    fun provideLocalRepository(context: Context): LocalRepository {
        return LocalRepositoryImpl(
            provideUserPreferenceDataSource(context),
            providePasswordDataSource(context)
        )
    }

}