package com.kolin.myfirstproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
/* /// информация с прошлых лекций ///
const val TAG = "MainActivity"
const val KEY = "random text"

lateinit var randomTextView : TextView

lateinit var randomButton : Button
*/

private const val HELLO_KEY = "hello"
lateinit var nextActivityButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton=findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://www.youtube.com/watch?v=lu07gmDTKcc&ab_channel=%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D1%8F23")
            val openBrowserIntent = Intent (Intent.ACTION_VIEW, link)
            val chooser=Intent.createChooser(openBrowserIntent, "Play Market")
            startActivity(chooser)
        }



        }

    }





/// информация с прошлых лекций ///


/*nextActivityButton.setOnClickListener {
    val phoneNumberUri = Uri.parse("tel:89025632565")
    val callIntent = Intent (Intent.ACTION_CALL, phoneNumberUri)
    startActivity(callIntent)
}

*/





/*

nextActivityButton.setOnClickListener {
    val googleLink = Uri.parse("https://google.com")
    val openBrowserIntent = Intent (Intent.ACTION_VIEW, googleLink)
    startActivity(openBrowserIntent)
}

*/






/*
        randomTextView=findViewById(R.id.random_textView)
        randomButton=findViewById(R.id.random_button)

        if (savedInstanceState!= null)
            randomTextView.text = savedInstanceState.getString(KEY)

        randomButton.setOnClickListener {
            randomize()
        }

    }

  fun randomize () {
      randomTextView.text= Random.nextInt(until = 100).toString()

  }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY,randomTextView.text.toString())

    }

}
*/











    /*

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
*/