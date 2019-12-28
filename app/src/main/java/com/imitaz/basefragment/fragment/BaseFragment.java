package com.imitaz.basefragment.fragment;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.imitaz.basefragment.ViewReplace;

public class BaseFragment extends Fragment {

    public ViewReplace replece;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ViewReplace) {
            replece = (ViewReplace) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement interface");
        }

    }
}
