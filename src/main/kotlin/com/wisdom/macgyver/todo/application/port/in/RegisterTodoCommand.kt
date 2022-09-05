package com.wisdom.macgyver.todo.application.port.`in`

data class RegisterTodoCommand(
    val userId: Long,
    val title: String
)
