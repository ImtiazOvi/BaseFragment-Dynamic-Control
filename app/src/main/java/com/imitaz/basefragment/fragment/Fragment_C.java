package com.imitaz.basefragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imitaz.basefragment.R;

import butterknife.ButterKnife;

public class Fragment_C extends BaseFragment {
    private Context mContext;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_c, container, false);
        mContext = getActivity().getApplicationContext();
        ButterKnife.bind(this, view);
        return view;
    }
}
