package com.codingwithmitch.openapi.api.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.codingwithmitch.openapi.models.AccountProperties

//access local database
@Dao
interface AccountPropertiesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAndReplace(accountProperties: AccountProperties):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertOrIgnore(accountProperties: AccountProperties):Long


    @Query("SELECT * from account_properties where pk = :pk")
    fun searchByPK(pk:Int): AccountProperties?

    @Query("SELECT * from account_properties where email = :email")
    fun searchByPK(email:String): AccountProperties?

}