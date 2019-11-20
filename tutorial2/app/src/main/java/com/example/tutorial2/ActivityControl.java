package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ActivityControl extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_textview);
        setContentView(R.layout.control_button);
    }
}
