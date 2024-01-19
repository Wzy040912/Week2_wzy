package com.example.week2_wzy.base

import com.example.week2_wzy.base.net.Api
import com.example.week2_wzy.base.net.RetrofitManager

open class BaseRepo {
    fun api():Api=RetrofitManager.getRetrofit().create(Api::class.java)
}