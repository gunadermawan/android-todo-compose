package com.gunder.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.gunder.todocompose.ui.theme.HighPriorityColor
import com.gunder.todocompose.ui.theme.LowPriorityColor
import com.gunder.todocompose.ui.theme.MediumPriorityColor
import com.gunder.todocompose.ui.theme.NonePriorityColor


enum class Priority(color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}