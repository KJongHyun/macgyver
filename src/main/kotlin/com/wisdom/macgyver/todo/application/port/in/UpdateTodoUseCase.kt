package com.wisdom.macgyver.todo.application.port.`in`

interface UpdateTodoUseCase {
    fun updateTodo(updateTodoCommand: UpdateTodoCommand)
}