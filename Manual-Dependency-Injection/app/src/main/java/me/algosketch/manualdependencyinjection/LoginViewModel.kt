package me.algosketch.manualdependencyinjection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginRepository: LoginRepository,
) : ViewModel() {
    fun login() {
        viewModelScope.launch {
            loginRepository.login()
        }
    }
}