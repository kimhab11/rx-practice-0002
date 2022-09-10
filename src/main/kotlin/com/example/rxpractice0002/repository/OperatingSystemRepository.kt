package com.example.rxpractice0002.repository

import com.example.rxpractice0002.model.entity.OperatingSystem
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface OperatingSystemRepository : ReactiveCrudRepository<OperatingSystem,Long> {
}