package com.example.rxpractice0002.repository

import com.example.rxpractice0002.model.entity.CloudInstance
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface CloudInstanceRepository : ReactiveCrudRepository<CloudInstance, Long> {

    fun findByPublicIpAddress(publicIpAddress: Mono<String>): Mono<CloudInstance>

    fun findByInstanceName(instanceName: Mono<String>): Mono<CloudInstance>

    // ilike
    fun findAllByInstanceNameContainingIgnoreCase(instanceName: Mono<String>): Flux<CloudInstance>
}