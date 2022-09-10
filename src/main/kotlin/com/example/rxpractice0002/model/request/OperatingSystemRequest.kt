package com.example.rxpractice0002.model.request

import com.example.rxpractice0002.model.entity.OperatingSystem

data class OperatingSystemRequest(
    val name: String,
    val version: String
){
    fun toEntity() = OperatingSystem(
        name = name,
        version = version
    )
}
