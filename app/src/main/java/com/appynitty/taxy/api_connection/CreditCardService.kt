package com.appynitty.taxy.api_connection

import com.appynitty.taxy.model.CreditCard
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): List<CreditCard>
}