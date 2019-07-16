package com.example.loginredux.models


object DataManager {

    val transactions = ArrayList<Transactions>()
    val amount = Amount("$500.00")

    init {
        initializeTransactions()
    }

    private fun initializeTransactions() {
        var trans = Transactions("Feb 20,2014",
            "Store Purchase CVS",
            "$5.00")
        transactions.add(trans)

        trans = Transactions("Feb 14,2014",
            "Bill Paid METRO PCS",
            "$50.00")
        transactions.add(trans)

        trans = Transactions("Feb 3,2014",
            "Store Purchase DOLLAR GENERAL",
            "$50.00")
        transactions.add(trans)

        trans = Transactions("Jan 31,2014",
            "ACH LOAD",
            "$5000.00")
        transactions.add(trans)

        trans = Transactions("Feb 20,2014",
            "Store Purchase CVS",
            "$4.00")
        transactions.add(trans)

        trans = Transactions("Feb 14,2014",
            "Bill Paid METRO PCS",
            "$40.00")
        transactions.add(trans)

        trans = Transactions("Feb 3,2014",
            "Store Purchase DOLLAR GENERAL",
            "$40.00")
        transactions.add(trans)

        trans = Transactions("Jan 31,2014",
            "ACH LOAD",
            "$4000.00")
        transactions.add(trans)

        trans = Transactions("Feb 20,2014",
            "Store Purchase CVS",
            "$3.00")
        transactions.add(trans)

        trans = Transactions("Feb 14,2014",
            "Bill Paid METRO PCS",
            "$30.00")
        transactions.add(trans)

        trans = Transactions("Feb 3,2014",
            "Store Purchase DOLLAR GENERAL",
            "$30.00")
        transactions.add(trans)

        trans = Transactions("Jan 31,2014",
            "ACH LOAD",
            "$3000.00")
        transactions.add(trans)

    }
}