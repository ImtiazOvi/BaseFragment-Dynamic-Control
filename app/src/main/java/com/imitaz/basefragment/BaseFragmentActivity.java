package com.imitaz.basefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.imitaz.basefragment.fragment.Fragment_A;
import com.imitaz.basefragment.fragment.Fragment_B;
import com.imitaz.basefragment.fragment.Fragment_C;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseFragmentActivity extends AppCompatActivity implements ViewReplace {

    @BindView(R.id.txt_title)
    TextView txtTitle;


    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_base_fragment_activitty);
        mContext = getApplicationContext();
        ButterKnife.bind(this);

        initUI();
    }

    private void initUI() {
        currentViewIndex(AppConstant.SETP_A, AppConstant.SETP_A_NAME);
    }

    @OnClick(R.id.img_back)
    public void imgBack() {
        backButton();

    }


    @Override
    public void setView(int position, String title) {
        currentViewIndex(position, title);
    }

    public void currentViewIndex(int index, String title) {
        txtTitle.setText(title);
        switch (index) {
            case AppConstant.SETP_A:
                replaceCurrentView(new Fragment_A(), title);
                break;
            case AppConstant.SETP_B:
                replaceCurrentView(new Fragment_B(), title);
                break;
            case AppConstant.SETP_C:
                replaceCurrentView(new Fragment_C(), title);
                break;
        }

    }


    public void replaceCurrentView(Fragment fragment, String title) {
        FragmentTransaction transaction = ((FragmentActivity) this).getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment).addToBackStack(title).commit();

    }


    @Override
    public void onBackPressed() {
        backButton();
    }

    private void backButton() {

        try {
            if (getSupportFragmentManager().getBackStackEntryCount() >= 2) {
                getSupportFragmentManager().popBackStack();
                String tag = getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount() - 2).getName();
                txtTitle.setText(tag);

            } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                finish();
            }


        } catch (Exception e) {
            finish();
        }
    }


}
