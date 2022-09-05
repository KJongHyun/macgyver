package com.wisdom.macgyver.todo.application

import com.wisdom.macgyver.todo.application.port.`in`.UpdateTodoCommand
import com.wisdom.macgyver.todo.application.port.`in`.UpdateTodoUseCase
import com.wisdom.macgyver.todo.domain.TodoRepository
import com.wisdom.macgyver.todo.exception.TodoNotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class UpdateTodoService(private val todoRepository: TodoRepository) : UpdateTodoUseCase {

    override fun updateTodo(updateTodoCommand: UpdateTodoCommand) {
        val todo = todoRepository.findByIdOrNull(updateTodoCommand.todoId) ?: throw TodoNotFoundException()
        todo.update(updateTodoCommand)
    }
}