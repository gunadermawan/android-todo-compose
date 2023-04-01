package com.gunder.learntodocompose.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.gunder.todocompose.utils.Constant.LIST_ARGUMENT_KEY
import com.gunder.todocompose.utils.Constant.LIST_SCREEN

fun NavGraphBuilder.listComposable(navigateToTaskScreen: (Int) -> Unit) {
    composable(
        route = LIST_SCREEN, arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {

    }
}