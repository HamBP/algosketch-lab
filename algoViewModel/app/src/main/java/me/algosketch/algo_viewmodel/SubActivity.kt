package me.algosketch.algo_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class SubActivity : AppCompatActivity() {
    private val viewModel: SubViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        viewModel.test()

        lifecycle
    }
}