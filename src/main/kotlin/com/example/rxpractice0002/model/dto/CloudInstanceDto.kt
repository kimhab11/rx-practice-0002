package com.example.rxpractice0002.model.dto

import com.example.rxpractice0002.handler.AppUser

data class CloudInstanceDto(
    val id: Long,
    val instanceName: String,
    val publicIpAddress: String,
    var operatingSystem: OperatingSystemDto? = null,
    var owner: AppUser? = null
)

