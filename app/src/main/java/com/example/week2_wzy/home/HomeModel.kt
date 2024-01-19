package com.example.week2_wzy.home

import androidx.lifecycle.MutableLiveData
import com.example.week2_wzy.base.BaseModel
import com.example.week2_wzy.entity.GoodsEntity
import io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess

class HomeModel :BaseModel(){
    val repo=HomeRepo()
    val success=MutableLiveData<GoodsEntity>()
    val field=MutableLiveData<String>()

    fun getGood(category:Int,currentPage:Int,pageSize:Int){
        repo.getGoods(category,currentPage,pageSize,success,field)
    }
//        repo.getGoods(category,currentPage,pageSize,success,field)

}