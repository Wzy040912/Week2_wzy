package com.example.week2_wzy.base.net

import com.example.week2_wzy.entity.GoodsEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/goods/info")
    fun getGoods(@Query("category_id")category_id :Int,
                 @Query("currentPage")currentPage  :Int,
                 @Query("pageSize")pageSize   :Int,
                 ):Observable<GoodsEntity>
}