package com.aysenurgokce.sayaclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.aysenurgokce.sayaclar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        object : CountDownTimer(30000,1000){
            //bunlar uygulamamız gereken fonksiyonlar
            override fun onTick(p0: Long) {//p0 kaç saniye kaldığını gösteriyor ihtiyacımız olursa burdan alaibiliriz
                //her bir tikte ne yapayım onu gösterir
                binding.textView.text = "Left: ${p0 / 1000}"
            }

            override fun onFinish() {
                // bittiğinden ne yapıcaz onu gösteriyor
                binding.textView.text = "Left:0"
            }

        }.start()
    }
}
