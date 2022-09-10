package com.example.rxpractice0002.model.entity

import com.example.rxpractice0002.model.dto.OperatingSystemDto
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


@Table("operating_systems")
data class OperatingSystem(

    @Id
    val id: Long? = null,

    @Column("name")
    val name: String,

    @Column("version")
    val version: String
) {
    fun toDto() = OperatingSystemDto(
        id = id!!,
        name = name,
        version = version
    )
}