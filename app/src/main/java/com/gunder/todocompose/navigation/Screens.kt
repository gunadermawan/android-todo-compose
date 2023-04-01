package com.gunder.todocompose.navigation

import androidx.navigation.NavHostController
import com.gunder.todocompose.utils.Action
import com.gunder.todocompose.utils.Constant.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("taskId/$taskId")
    }
}