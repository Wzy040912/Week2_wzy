package com.example.week2_wzy.adapter

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.week2_wzy.R
import com.example.week2_wzy.entity.Data

class GoodsAdapter (goodlist:MutableList<Data>):BaseQuickAdapter<Data,BaseViewHolder>(R.layout.item,goodlist){
    override fun convert(helper: BaseViewHolder, item: Data) {
        Glide.with(context).load(item.goods_default_icon).into(helper.getView(R.id.iv))
        helper.setText(R.id.tv,"${item.goods_default_price}元")
    }

}