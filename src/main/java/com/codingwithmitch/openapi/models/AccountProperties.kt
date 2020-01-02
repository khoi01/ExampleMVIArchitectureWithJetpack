package com.codingwithmitch.openapi.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "account_properties")
data class AccountProperties(
    @SerializedName("pk") //get from retrofit
    @Expose //get from retrofit
    @PrimaryKey(autoGenerate = false) //get from room
    @ColumnInfo(name="pk") //get from room
    var pk:Int,

    @SerializedName("email") //get from retrofit
    @Expose //get from retrofit
    @ColumnInfo(name="email") //get from room
    var email:String,

    @SerializedName("username") //get from retrofit
    @Expose //get from retrofit
    @ColumnInfo(name="username") //get from room
    var username:String

)