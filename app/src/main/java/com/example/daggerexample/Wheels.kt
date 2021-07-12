package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    init{
        Log.i("hi", ":wheels started ")
    }
}