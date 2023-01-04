package com.example.viewbindingexample

import java.io.Serializable

data class UserInformation(
    var isim: String,
    var yas: String,
    var check: Boolean
) : Serializable
