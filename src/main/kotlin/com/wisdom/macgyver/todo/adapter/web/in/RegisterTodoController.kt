package com.wisdom.macgyver.todo.adapter.web.`in`

import com.wisdom.macgyver.todo.application.port.`in`.RegisterTodoCommand
import com.wisdom.macgyver.todo.application.port.`in`.RegisterTodoUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todo")
class RegisterTodoController(private val registerTodoUseCase: RegisterTodoUseCase) {

    @PostMapping
    fun register(@RequestBody registerTodoRequestDto: RegisterTodoRequestDto) {
        registerTodoUseCase.registerTodo(RegisterTodoCommand(0, registerTodoRequestDto.title))
    }

}