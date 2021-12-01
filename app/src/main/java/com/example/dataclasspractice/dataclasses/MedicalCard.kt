package com.example.dataclasspractice.dataclasses

import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

data class MedicalCard(var id:String,
                       var fullname: String,
                       var birthDate: String,
                       var gender: String,
                       var blood: String,
                       var address: String?,
                       var vacHistory: List<History>? = null,
                       var bolezniHistory: ArrayList<bolezni>? = null
):Serializable