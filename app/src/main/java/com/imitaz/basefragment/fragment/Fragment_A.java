package com.imitaz.basefragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatRadioButton;

import com.imitaz.basefragment.AppConstant;
import com.imitaz.basefragment.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Fragment_A extends BaseFragment {
    private Context mContext;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a, container, false);
        mContext = getActivity().getApplicationContext();
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn_next)
    public void btnNext() {
        replece.setView(AppConstant.SETP_B, AppConstant.SETP_B_NAME);

    }
}
