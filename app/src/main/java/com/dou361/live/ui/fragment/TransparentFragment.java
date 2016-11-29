package com.dou361.live.ui.fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dou361.live.R;

/**
 * ========================================
 * <p>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p>
 * 作 者：陈冠明
 * <p>
 * 个人网站：http://www.dou361.com
 * <p>
 * 版 本：1.0
 * <p>
 * 创建日期：2016/10/4 13:22
 * <p>
 * 描 述：透明层
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class TransparentFragment extends BaseFragment {

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_transparent, container, false);
    }

}
