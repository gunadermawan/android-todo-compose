package com.gunder.todocompose.data.models


import androidx.room.Entity
import com.gunder.todocompose.utils.Constant.DATABASE_NAME

@Entity(tableName = DATABASE_NAME)
data class ToDoTask(
    val id: Int = 0,
    val title: String,
    val message: String,
    val priority: Priority,
)
