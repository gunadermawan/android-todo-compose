package com.gunder.todocompose.data.models


import androidx.room.Entity
import com.gunder.todocompose.utils.Constant.DATABASE_NAME
import com.gunder.todocompose.utils.Constant.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    val id: Int = 0,
    val title: String,
    val message: String,
    val priority: Priority,
)
