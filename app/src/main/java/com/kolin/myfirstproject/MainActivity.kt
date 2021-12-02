package com.kolin.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

/*
Александр Пушкин — Меж горных стен несется Терек
*/


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Меж горных стен несется Терек,\n" +
                "Волнами точит дикий берег,")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Клокочет вкруг огромных скал,\n" +
                "То здесь, то там дорогу роет,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Как зверь живой, ревет и воет —\n" +
                "И вдруг утих и смирен стал.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Все ниже, ниже опускаясь,\n" +
                "Уж он бежит едва живой.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Так, после бури истощаясь,\n" +
                "Поток струится дождевой.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"И вот обнажилось\n" +
                "Его кремнистое русло.")
    }

}