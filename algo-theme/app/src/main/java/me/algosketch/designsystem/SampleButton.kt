package me.algosketch.designsystem

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

class SampleButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
): MaterialButton(context, attrs) {
    init {
        setBackgroundColor(0xFFEC407A.toInt())
    }
}