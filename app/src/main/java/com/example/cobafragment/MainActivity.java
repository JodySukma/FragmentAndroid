package com.example.cobafragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFragmentSatu;
    Button btnFragmentDua;

    FragmentManager fragmentManager;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmentSatu = findViewById(R.id.btn_framnet_1);
        btnFragmentDua = findViewById(R.id.btn_framnet_2);

        btnFragmentSatu.setOnClickListener(this);
        btnFragmentDua.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();

        switch (view.getId()){
            case R.id.btn_framnet_1:
                fragment = new FragmentSatu();

                break;

            case R.id.btn_framnet_2:
                fragment = new FragmentDua();

                break;
        }

        fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();

    }
}
