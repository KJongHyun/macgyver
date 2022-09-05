package com.wisdom.macgyver.common.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(value = [AuditingEntityListener::class])
open class BaseEntity {
    @CreatedDate
    @Column(updatable = false)
    lateinit var createdAt: LocalDateTime
    @LastModifiedDate
    lateinit var updatedAt: LocalDateTime
}