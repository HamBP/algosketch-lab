package me.algosketch.manualdependencyinjection

import kotlinx.coroutines.delay

class LoginRepository {
    suspend fun login(): Boolean {
        delay(500)
        return true
    }
}