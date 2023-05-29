package me.algosketch.designsystem

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.theme.MaterialComponentsViewInflater

class SampleViewInflater : MaterialComponentsViewInflater() {
    override fun createButton(context: Context, attrs: AttributeSet): AppCompatButton {
        return SampleButton(context, attrs)
    }
}