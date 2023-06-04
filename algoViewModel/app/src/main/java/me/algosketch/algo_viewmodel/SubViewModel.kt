package me.algosketch.algo_viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import java.io.Closeable
import kotlin.coroutines.CoroutineContext

/**
 * viewModel이 삭제되어도 close가 자동으로 호출되지 않음.
 * 아마 lifecycle 버전이 2.5이상이 아니어서 그런 것 같지만, 확인하는 방법을 모르겠음.
 * lifecycle을 직접 추가하면 충돌이 일어나서 실행되지 않음.
 */
class CloseableCoroutineScope(
    context: CoroutineContext = SupervisorJob() + Dispatchers.Main.immediate
) : Closeable, CoroutineScope {
    override val coroutineContext: CoroutineContext = context
    override fun close() {
        coroutineContext.cancel()
        println("is close() called?")
    }
}

class SubViewModel(
    private val coroutineScope: CoroutineScope = CloseableCoroutineScope()
) : ViewModel() {

    fun test() {
        /**
         * 실험 내용 및 결과 : 두 스코프를 다른 스코프임.
         * coroutineScope를 생성자로 받는 이유는 단지 커스텀하기 위함. 자동으로 이루어지지는 않음.
         */
        println("viewModelScope $viewModelScope")
        println("coroutineScope $coroutineScope")
    }

    override fun onCleared() {
        println("onCleared")
        coroutineScope.cancel()
    }
}