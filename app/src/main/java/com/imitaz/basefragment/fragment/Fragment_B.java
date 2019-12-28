package com.imitaz.basefragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imitaz.basefragment.AppConstant;
import com.imitaz.basefragment.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Fragment_B extends BaseFragment {
    private Context mContext;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b, container, false);
        mContext = getActivity().getApplicationContext();
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.btn_next)
    public void btnNext() {
        replece.setView(AppConstant.SETP_C, AppConstant.SETP_C_NAME);

    }
}
