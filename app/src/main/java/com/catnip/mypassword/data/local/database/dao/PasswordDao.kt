package com.catnip.mypassword.data.local.database.dao

import androidx.room.*
import com.catnip.mypassword.data.local.database.entity.PasswordEntity

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

@Dao
interface PasswordDao {
    @Query("SELECT * FROM PASSWORDS")
    suspend fun getAllPasswords() : List<PasswordEntity>

    @Query("SELECT * FROM PASSWORDS WHERE ID == :id LIMIT 1")
    suspend fun getPasswordById(id : Int) : PasswordEntity?

    @Insert
    suspend fun insertPassword(password : PasswordEntity) : Long

    @Delete
    suspend fun deletePassword(password : PasswordEntity) : Int

    @Update
    suspend fun updatePassword(password : PasswordEntity) : Int
}