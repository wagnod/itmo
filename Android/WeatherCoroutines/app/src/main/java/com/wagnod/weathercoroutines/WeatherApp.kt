package com.wagnod.weathercoroutines

import android.app.Application

class WeatherApp : Application() {
    lateinit var weatherApi: WeatherApi

    override fun onCreate() {
        super.onCreate()
        weatherApi = createWeatherApi()
        app = this
    }

    companion object {
        lateinit var app: WeatherApp
    }
}