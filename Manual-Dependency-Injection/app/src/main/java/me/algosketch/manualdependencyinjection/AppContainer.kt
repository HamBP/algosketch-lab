package me.algosketch.manualdependencyinjection

class AppContainer {
    private val loginRepository = LoginRepository()

    val loginViewModel = LoginViewModel(loginRepository)
}