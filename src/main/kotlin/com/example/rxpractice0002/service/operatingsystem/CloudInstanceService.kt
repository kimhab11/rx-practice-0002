package com.example.rxpractice0002.service.operatingsystem

import com.example.rxpractice0002.model.dto.CloudInstanceDto
import com.example.rxpractice0002.model.request.CloudInstanceRequest
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface CloudInstanceService {

    fun create(cloudInstanceRequest: CloudInstanceRequest): Mono<CloudInstanceDto>

    fun findAll(): Flux<CloudInstanceDto>
}