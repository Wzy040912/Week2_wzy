package com.example.week2_wzy.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity <VDB:ViewDataBinding>:AppCompatActivity(){
    lateinit var db:VDB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db=DataBindingUtil.setContentView(this,bindLayout())
        initview()
        initdata()
    }

    abstract fun initdata()

    abstract fun initview()

    abstract fun bindLayout(): Int
}