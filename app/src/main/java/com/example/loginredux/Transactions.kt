package com.example.loginredux

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.example.loginredux.models.DataManager
import kotlinx.android.synthetic.main.activity_transactions.*
import kotlinx.android.synthetic.main.content_transactions.*

class Transactions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transactions)
        setSupportActionBar(toolbar)

        transactionsView.adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataManager.transactions)



        amount.text = DataManager.amount.balance


    }



}
