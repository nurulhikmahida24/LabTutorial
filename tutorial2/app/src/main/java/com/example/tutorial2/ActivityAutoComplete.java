package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;

public class ActivityAutoComplete extends Activity {
    AutoCompleteTextView autocmplt;
    String[] arr = {"Aditya Got Cha", "Kulsum", "Daffa Ahmad", "Edgar Jeremiah", "Farid", "Felix",
            "Haidar", "Raihan", "Rakha"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocmplt = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,
                arr);
        autocmplt.setThreshold(2);
        autocmplt.setAdapter(adapter);
    }
}
