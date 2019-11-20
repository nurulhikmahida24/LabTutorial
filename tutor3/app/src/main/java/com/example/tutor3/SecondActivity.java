package com.example.tutor3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    private TextView header;
    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        header = (TextView) findViewById(R.id.txtHeader);
    }

    public void returnReply(View view) {
// Membuat Intent

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}



