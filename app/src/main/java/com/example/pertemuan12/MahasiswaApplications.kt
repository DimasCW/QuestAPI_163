package com.example.pertemuan12

import android.app.Application


class MahasiswaApplications: Application(){
    lateinit var container: AppContainer
    override fun OnCreate(){
        super.onCreate()
        container = MahasiswaContainer()

    }
}