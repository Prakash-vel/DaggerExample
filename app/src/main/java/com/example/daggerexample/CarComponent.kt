package com.example.daggerexample

import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car
}