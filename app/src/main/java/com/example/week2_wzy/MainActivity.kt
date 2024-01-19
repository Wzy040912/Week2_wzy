package com.example.week2_wzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.week2_wzy.adapter.GoodsAdapter
import com.example.week2_wzy.base.BaseActivity
import com.example.week2_wzy.databinding.ActivityMainBinding
import com.example.week2_wzy.entity.Data
import com.example.week2_wzy.home.HomeModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    lateinit var hm:HomeModel
    lateinit var adapter:GoodsAdapter
    val list= mutableListOf<Data>()

    override fun initdata() {
        hm=ViewModelProvider(this)[HomeModel::class.java]
        hm.getGood(0,1,10)
        hm.success.observe(this){
            list.addAll(it.data)
            adapter.notifyDataSetChanged()
        }
    }

    override fun initview() {
        db.rv.layoutManager=GridLayoutManager(this,2)
        adapter=GoodsAdapter(list)
        db.rv.adapter=adapter
//点击事件
        adapter.setOnItemClickListener { adapter, view, position ->
            intent=Intent(this,XqActivity::class.java)
            startActivity(intent)
        }

    }

    override fun bindLayout(): Int=R.layout.activity_main

}