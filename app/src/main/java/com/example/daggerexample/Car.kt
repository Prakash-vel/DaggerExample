package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine,wheels: Wheels) {

    init {
        Log.i("hi", "driving")
    }
}