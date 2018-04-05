package com.test.mvp.demo.ui.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.test.mvp.demo.R;
import com.test.mvp.demo.ui.fragment.login.LoginFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener {

    @BindView(R.id.fragment_container)
    protected FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if(savedInstanceState == null){ // Load fragment
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                    LoginFragment.newInstance(null, null), LoginFragment.class.getSimpleName())
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
