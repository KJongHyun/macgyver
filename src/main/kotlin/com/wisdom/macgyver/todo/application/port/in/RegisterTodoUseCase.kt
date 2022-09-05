package com.wisdom.macgyver.todo.application.port.`in`

interface RegisterTodoUseCase {
    fun registerTodo(registerTodoCommand: RegisterTodoCommand)
}