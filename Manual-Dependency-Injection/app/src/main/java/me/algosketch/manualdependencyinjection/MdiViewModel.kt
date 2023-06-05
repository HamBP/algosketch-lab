package me.algosketch.manualdependencyinjection

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavBackStackEntry

@Composable
inline fun <reified VM : ViewModel> mdiViewModel(): VM {

    val activity: ComponentActivity = LocalContext.current.let {
        var ctx = it
        while(ctx is ContextWrapper) {
            if(ctx is Activity) {
                return@let ctx as ComponentActivity
            }
            ctx = ctx.baseContext
        }

        throw Exception()
    }

    val loginViewModel = (activity.application as MdiApplication).appContainer.loginViewModel

    return loginViewModel as VM
}