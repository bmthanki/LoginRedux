package com.example.loginredux.reducers

import com.example.loginredux.action.LoginAction
import com.example.loginredux.models.LoggedInUser
import com.example.loginredux.models.LoginResult
import com.example.loginredux.state.AppState
import com.example.loginredux.state.AuthenticationState
import tw.geothings.rekotlin.Action
import com.example.loginredux.state.LoggedInState
import java.util.*


// the reducer is responsible for evolving the application state based
// on the actions it receives
fun mainReducer(action: Action, state: AppState?): AppState {
    // if no state has been provided, create the default state
    var state = state ?: AppState(AuthenticationState(LoggedInState.notLoggedIn, userName = ""))

    return state.copy(authenticationState = (::authenticationReducer)(action, state.authenticationState))
}

fun authenticationReducer(action: Action, state: AuthenticationState?): AuthenticationState{
    var newState =  state ?: AuthenticationState(LoggedInState.notLoggedIn,"")
    when(action){
        is LoginAction -> {
            val _loginResult = LoginResult()
            val fakeUser = LoggedInUser(UUID.randomUUID().toString(), "Bhargav")
            Result.success(fakeUser)
            newState = newState.copy(LoggedInState.loggedIn, userName = action.userName)
        }
    }
    return newState
}