package me.algosketch.algo_viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class SubViewModel(
    private val coroutineScope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
) : ViewModel() {

    fun test() {
        /**
         * 실험 내용 및 결과 : 두 스코프를 다른 스코프임.
         * coroutineScope를 생성자로 받는 이유는 단지 커스텀하기 위함. 자동으로 이루어지지는 않음.
         */
        println("viewModelScope $viewModelScope")
        println("coroutineScope $coroutineScope")
    }
}