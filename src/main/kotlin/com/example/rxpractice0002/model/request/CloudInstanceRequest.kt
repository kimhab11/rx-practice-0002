package com.example.rxpractice0002.model.request

import com.example.rxpractice0002.model.entity.CloudInstance
import kotlin.random.Random

data class CloudInstanceRequest(
    val instanceName: String,
    val operatingSystemId: Long,
    val owner: String
){
    fun toEntity() = CloudInstance(
        instanceName = instanceName,
        operatingSystemId = operatingSystemId,
        owner = owner,
        publicIpAddress = "${Random.nextInt(0,256)}.${Random.nextInt(0,256)}.${Random.nextInt(0,256)}.${Random.nextInt(0,256)}"
    )
}