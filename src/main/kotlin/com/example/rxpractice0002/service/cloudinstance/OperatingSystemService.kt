package com.example.rxpractice0002.service.cloudinstance

import com.example.rxpractice0002.model.dto.OperatingSystemDto
import com.example.rxpractice0002.model.entity.OperatingSystem
import com.example.rxpractice0002.model.request.OperatingSystemRequest
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface OperatingSystemService {

    fun save(os: OperatingSystemRequest): Mono<OperatingSystemDto>

    fun findAll(): Flux<OperatingSystemDto>
    fun findById(operatingSystemId: Long): Mono<OperatingSystem>
}