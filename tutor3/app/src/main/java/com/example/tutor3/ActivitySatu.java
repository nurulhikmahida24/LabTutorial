package com.example.tutor3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.tutor3.R;

import androidx.annotation.Nullable;

public class ActivitySatu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);
        final EditText editText = (EditText)findViewById(R.id.urlText); Button btn = (Button) findViewById(R.id.btnSatu); btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
// Membuat objek Intent
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url));
// Menjalankan Activity dengan parameter Intent
                startActivity(intent);
            }
        });
    }

}

