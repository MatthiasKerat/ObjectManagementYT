package com.kapps.objectmanagement.data.dto

data class PersonDto(
    val id:String,
    val name:String,
    val date_of_birth:String,
    val address:String = "Default address",
    val country_code:String = "Default country code"
)
