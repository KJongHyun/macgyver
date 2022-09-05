package com.wisdom.macgyver.todo.adapter.web.`in`

import com.wisdom.macgyver.todo.application.port.`in`.UpdateTodoCommand
import com.wisdom.macgyver.todo.application.port.`in`.UpdateTodoUseCase
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todo")
class UpdateTodoController(private val updateTodoUseCase: UpdateTodoUseCase) {
    @PutMapping
    fun updateTodo(@RequestBody updateTodoRequestDto: UpdateTodoRequestDto) {
        updateTodoUseCase.updateTodo(UpdateTodoCommand(todoId = updateTodoRequestDto.todoId, title = updateTodoRequestDto.title, status = updateTodoRequestDto.status))
    }
}