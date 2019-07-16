package com.example.loginredux.models

data class Transactions(var date:String,var details:String,var amount:String) {
    override fun toString(): String {
        return date + "\n" + details +"\t\t"+ amount
    }
}

data class Amount(var balance:String)