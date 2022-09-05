package com.wisdom.macgyver.todo.application.port.`in`

import com.wisdom.macgyver.todo.domain.TodoStatus

data class UpdateTodoCommand(
    val todoId: Long,
    val title: String,
    val status: TodoStatus
)