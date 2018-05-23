package com.lee.livedemo01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lee.livedemo01.R;


/**
 * 该Fragment是用于MainDialogFragment中的pager，为了实现滑动隐藏交互Fragment的
 * 这个大家可以不用修改，但是根据各自的需求而定
 *
 */
public class EmptyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_empty, container, false);
    }
}