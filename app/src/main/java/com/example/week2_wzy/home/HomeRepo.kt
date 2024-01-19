package com.example.week2_wzy.home

import androidx.lifecycle.MutableLiveData
import com.example.week2_wzy.base.BaseRepo
import com.example.week2_wzy.entity.GoodsEntity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class HomeRepo:BaseRepo() {
    fun getGoods(category_id :Int,
                 currentPage:Int,
                 pageSize:Int,
                 success:MutableLiveData<GoodsEntity>,
                 field:MutableLiveData<String>){
        api().getGoods(category_id,currentPage,pageSize)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<GoodsEntity>{
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
//                    field.value=e.message
                }

                override fun onComplete() {

                }

                override fun onNext(t: GoodsEntity) {
                    success.value=t
                }

            })
    }
}