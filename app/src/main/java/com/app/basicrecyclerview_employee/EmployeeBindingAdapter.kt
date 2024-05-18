package com.app.basicrecyclerview_employee

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("setText")
fun TextView.setText(name: String) {
    text = name
}

@BindingAdapter("setImage")
fun ImageView.setImage(image:Int){
    setImageResource(image)
}

