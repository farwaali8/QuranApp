package com.example.Quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // Receive the intent from MainActivity2
        String selectedAyat = getIntent().getStringExtra("selectedAyat");

        // Set the selectedAyat to a TextView or use it as needed
        TextView selectedAyatTextView = findViewById(R.id.textView2);
        selectedAyatTextView.setText(selectedAyat);
    }
}