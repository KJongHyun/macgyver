package com.wisdom.macgyver.todo.domain

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long> {
}