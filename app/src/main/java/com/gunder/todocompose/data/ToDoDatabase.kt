package com.gunder.todocompose.data

import androidx.room.Database
import com.gunder.todocompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {
    abstract fun toDoDao(): ToDoDao
}