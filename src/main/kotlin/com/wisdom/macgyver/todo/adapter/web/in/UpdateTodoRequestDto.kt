package com.wisdom.macgyver.todo.adapter.web.`in`

import com.wisdom.macgyver.todo.domain.TodoStatus

data class UpdateTodoRequestDto(
    val todoId: Long,
    val title: String,
    val status: TodoStatus
)
