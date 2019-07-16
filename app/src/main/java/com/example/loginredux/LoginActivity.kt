package com.example.loginredux

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.loginredux.action.LoginAction
import com.example.loginredux.reducers.mainReducer
import com.example.loginredux.state.AppState
import com.example.loginredux.state.LoggedInState
import tw.geothings.rekotlin.Store
import tw.geothings.rekotlin.StoreSubscriber

// The global application store, which is responsible for managing the appliction state.
val mainStore = Store(
    reducer = ::mainReducer,
    state = null
)

class LoginActivity : AppCompatActivity(), StoreSubscriber<AppState> {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)


        mainStore.subscribe(this)

    }

    fun validate(view: View) {
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)
        mainStore.dispatchFunction(LoginAction(username.text.toString(),password.text.toString()))
    }

    override fun newState(state: AppState) {
        // when the state changes, the UI is updated to reflect the current state
        if(state.authenticationState.loggedInState == LoggedInState.loggedIn)
        {
            updateUiWithUser()
            val i = Intent(this, Transactions::class.java)
            this.startActivity(i)
        }

    }

    private fun updateUiWithUser() {
        val welcome = "Welcome ! Bhargav"
        // TODO : initiate successful logged in experience
        Toast.makeText(
            applicationContext,
            "$welcome",
            Toast.LENGTH_LONG
        ).show()
    }


}



