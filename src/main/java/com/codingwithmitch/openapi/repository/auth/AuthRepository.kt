package com.codingwithmitch.openapi.repository.auth

import com.codingwithmitch.openapi.api.auth.OpenApiAuthService
import com.codingwithmitch.openapi.api.persistence.AccountPropertiesDao
import com.codingwithmitch.openapi.api.persistence.AuthTokenDao
import com.codingwithmitch.openapi.session.SessionManager

class AuthRepository constructor( authTokenDao:AuthTokenDao,accountPropertiesDao: AccountPropertiesDao,openApiAuthService: OpenApiAuthService,sessionManager: SessionManager){

}