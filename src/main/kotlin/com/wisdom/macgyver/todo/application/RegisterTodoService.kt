package com.wisdom.macgyver.todo.application

import com.wisdom.macgyver.todo.application.port.`in`.RegisterTodoCommand
import com.wisdom.macgyver.todo.application.port.`in`.RegisterTodoUseCase
import com.wisdom.macgyver.todo.domain.Todo
import com.wisdom.macgyver.todo.domain.TodoRepository
import org.springframework.stereotype.Service

@Service
class RegisterTodoService(private val todoRepository: TodoRepository) : RegisterTodoUseCase {
    override fun registerTodo(registerTodoCommand: RegisterTodoCommand) {
        todoRepository.save(Todo(title = registerTodoCommand.title))
    }
}