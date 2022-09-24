package com.catnip.mypassword.data.local.database.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
@Parcelize
@Entity(tableName = "passwords")
data class PasswordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "app_name")
    var appName: String?,
    @ColumnInfo(name = "email")
    var email: String?,
    @ColumnInfo(name = "username")
    var username: String?,
    @ColumnInfo(name = "password")
    var password: String?,
    @ColumnInfo(name = "description")
    var description: String?
) : Parcelable


