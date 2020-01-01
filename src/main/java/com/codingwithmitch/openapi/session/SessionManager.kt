package com.codingwithmitch.openapi.session

import android.app.Application
import com.codingwithmitch.openapi.api.persistence.AuthTokenDao
//manage sessions

class SessionManager constructor(val authTokenDao: AuthTokenDao,val application:Application){

}