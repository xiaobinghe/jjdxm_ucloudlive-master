package com.dou361.live.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.dou361.live.R;
import com.dou361.live.bean.AnchorBean;
import com.dou361.live.ui.holder.AnchorItemHolder;
import com.dou361.live.ui.holder.BaseViewHolder;
import com.dou361.live.ui.listener.OnItemClickRecyclerListener;

import java.util.List;

/**
 * ========================================
 * <p/>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2016/10/5
 * <p/>
 * 描 述：房间成员适配器
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class AnchorAdapter extends BaseRecyclerViewAdapter<AnchorBean> {

    public AnchorAdapter(Context mContext, List<AnchorBean> mDatas) {
        super(mContext, mDatas);
    }

    @Override
    public BaseViewHolder getItemHolder(Context mContext, OnItemClickRecyclerListener listener, ViewGroup parent) {
        return new AnchorItemHolder(mContext, listener, LayoutInflater.from(mContext).
                inflate(R.layout.holder_item_anchor, parent, false));
    }
}
