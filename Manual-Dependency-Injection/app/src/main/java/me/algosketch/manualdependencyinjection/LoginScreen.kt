package me.algosketch.manualdependencyinjection

import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(viewModel: LoginViewModel) {
    viewModel.login()
}