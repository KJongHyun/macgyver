package com.wisdom.macgyver.todo.domain

import com.wisdom.macgyver.common.domain.BaseEntity
import com.wisdom.macgyver.todo.application.port.`in`.UpdateTodoCommand
import javax.persistence.*

@Entity
class Todo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var title: String,
    @Enumerated(EnumType.STRING)
    var status: TodoStatus = TodoStatus.ACTIVE
) : BaseEntity() {
    fun update(updateTodoCommand: UpdateTodoCommand) {
        this.title = updateTodoCommand.title
        this.status = updateTodoCommand.status
    }
}

enum class TodoStatus(val description: String) {
    ACTIVE("활성"),
    COMPLETED("완료")
}