package com.lee.livedemo01.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lee.livedemo01.R;
import com.lee.livedemo01.fragment.LiveViewFragment;
import com.lee.livedemo01.fragment.MainDialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LiveViewFragment liveViewFragment = new LiveViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flmain, liveViewFragment).commit();
        new MainDialogFragment().show(getSupportFragmentManager(),"MainDialogFragment");
        
    }
}
