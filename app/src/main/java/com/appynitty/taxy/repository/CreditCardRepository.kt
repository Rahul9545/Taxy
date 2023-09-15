package com.appynitty.taxy.repository

import com.appynitty.taxy.api_connection.RetrofitInstance
import com.appynitty.taxy.model.CreditCard

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): List<CreditCard> {
        return creditCardService.getCreditCards()
    }
}