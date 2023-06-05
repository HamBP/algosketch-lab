package me.algosketch.manualdependencyinjection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginRepository: LoginRepository,
) : ViewModel() {
    fun login() {
        viewModelScope.launch {
            println("로그인!!")
            loginRepository.login()
        }
    }

    companion object {
        fun provideFactory(loginRepository: LoginRepository): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return LoginViewModel(loginRepository) as T
                }
            }
        }
    }
}