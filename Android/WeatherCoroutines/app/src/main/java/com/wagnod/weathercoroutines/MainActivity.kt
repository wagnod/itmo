package com.wagnod.weathercoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        if (savedInstanceState == null) {
            launch {
                runApp()
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putCharSequence("weather", common_weather.text)
        outState.putInt("common", common_img.tag as Int)
        outState.putCharSequenceArrayList(
            "daysOfWeek", arrayListOf(
                day0.text,
                day1.text,
                day2.text,
                day3.text,
                day4.text
            )
        )
        outState.putIntegerArrayList(
            "icons", arrayListOf(
                day0_img.tag as Int,
                day1_img.tag as Int,
                day2_img.tag as Int,
                day3_img.tag as Int,
                day4_img.tag as Int
            )
        )
        outState.putCharSequenceArrayList(
            "temperatures", arrayListOf(
                day0_temp.text,
                day1_temp.text,
                day2_temp.text,
                day3_temp.text,
                day4_temp.text
            )
        )
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        common_weather.text = savedInstanceState.getCharSequence("weather")
        common_img.setImageDrawable(
            getDrawable(
                resources.getIdentifier(
                    "ic_${savedInstanceState.getInt("common")}",
                    "drawable",
                    applicationContext.packageName
                )
            )
        )
        common_img.tag = savedInstanceState.getInt("common")

        for ((i, day) in savedInstanceState.getCharSequenceArrayList("daysOfWeek")!!.withIndex()) {
            findViewById<TextView>(
                resources.getIdentifier(
                    "day${i}",
                    "id",
                    applicationContext.packageName
                )
            )
                .text = day
        }

        for ((i, icon) in savedInstanceState.getIntegerArrayList("icons")!!.withIndex()) {
            findViewById<ImageView>(
                resources.getIdentifier(
                    "day${i}_img",
                    "id",
                    applicationContext.packageName
                )
            )
                .apply {
                    setImageDrawable(
                        getDrawable(
                            resources.getIdentifier(
                                "ic_${icon}",
                                "drawable",
                                applicationContext.packageName
                            )
                        )
                    )
                    tag = icon
                }
        }

        for ((i, temp) in savedInstanceState.getCharSequenceArrayList("temperatures")!!.withIndex()) {
            findViewById<TextView>(
                resources.getIdentifier(
                    "day${i}_temp",
                    "id",
                    applicationContext.packageName
                )
            )
                .text = temp
        }
    }

    private fun runApp() = launch {
        try {
            val weather = WeatherApp.app.weatherApi.getWeatherForecast(
                BuildConfig.API_KEY,
                "en-US",
                true
            )
            val forecast = weather.dailyForecasts
            common_weather.text = "%s°C".format(forecast[0].getTemperature())
            common_img.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        "ic_${forecast[0].day.icon}",
                        "drawable",
                        applicationContext.packageName
                    )
                )
            )
            common_img.tag = forecast[0].day.icon

            for ((i, day) in forecast.withIndex()) {
                findViewById<TextView>(
                    resources.getIdentifier(
                        "day${i}", "id",
                        applicationContext.packageName
                    )
                ).text = SimpleDateFormat("EE", Locale("en")).format(day.date)
                findViewById<ImageView>(
                    resources.getIdentifier(
                        "day${i}_img", "id",
                        applicationContext.packageName
                    )
                ).apply {
                    setImageDrawable(
                        getDrawable(
                            resources.getIdentifier(
                                "ic_${day.day.icon}", "drawable",
                                applicationContext.packageName
                            )
                        )
                    )
                    tag = day.day.icon
                }
                findViewById<TextView>(
                    resources.getIdentifier(
                        "day${i}_temp", "id",
                        applicationContext.packageName
                    )
                ).text = "%s°C".format(day.getTemperature())
            }
        } catch (e: Exception) {
            Log.e("internet", "Internet is off")
            Toast.makeText(applicationContext, "Please, turn on the Internet!", Toast.LENGTH_SHORT).show()
        }
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
}
