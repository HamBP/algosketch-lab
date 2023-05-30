package me.algosketch.manualdependencyinjection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalView
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.ViewTreeViewModelStoreOwner

object LocalViewModelStoreOwner {
    private val LocalViewModelStoreOwner = compositionLocalOf<ViewModelStoreOwner?> { null }

    val current: ViewModelStoreOwner?
    @Composable
    get() = LocalViewModelStoreOwner.current ?: ViewTreeViewModelStoreOwner.get(LocalView.current)
}