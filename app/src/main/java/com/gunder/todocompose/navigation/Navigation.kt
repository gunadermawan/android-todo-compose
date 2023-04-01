package com.gunder.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.gunder.learntodocompose.navigation.destination.listComposable
import com.gunder.learntodocompose.navigation.destination.taskComposable
import com.gunder.todocompose.utils.Constant.LIST_SCREEN

@Composable
fun Navigation(navController: NavHostController) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    NavHost(navController = navController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)
    }
}