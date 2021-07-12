package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class  Engine @Inject constructor() {
    init{
        Log.i("hi", ":engine started ")
    }
}