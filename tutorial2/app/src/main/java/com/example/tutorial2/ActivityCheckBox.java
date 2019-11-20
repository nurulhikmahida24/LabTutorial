package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityCheckBox extends Activity {
    CheckBox ch1,ch2;
    Button b1,b2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_checkbox);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);

        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Checkbox 1: ").append(ch1.isChecked());
                result.append("\nCheckbox 2: ").append(ch2.isChecked());
                Toast.makeText(ActivityCheckBox.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
