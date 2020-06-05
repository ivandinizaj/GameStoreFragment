package com.ivand.gamestore
import android.app.Application

 class Application: Application()  {

     companion object {
         private var sInstance: Application? = null
     }

     override fun onCreate() {
         super.onCreate()
         sInstance = this
     }

     fun getInstance(): Application? {
         return sInstance
     }

 }