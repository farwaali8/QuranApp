//package com.example.Quran;
//import android.content.Intent;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//import android.os.Bundle;
//
//
//public class MainActivity2 extends AppCompatActivity {
//String[] surahContentsArray;
//    Button button;
//    EditText editText;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        button=findViewById(R.id.button7);
//        editText=findViewById(R.id.editTextNumber4);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = editText.getText().toString();
//                if (!TextUtils.isEmpty(text)) {
//                    int index = Integer.parseInt(text) - 1; // Subtract 1 to get the array index
//                    if (index >= 0 && index < surahContentsArray.length) {
//                        String selectedAyat = surahContentsArray[index];
//
//
//                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//                        intent.putExtra("selectedAyat", selectedAyat);
//                        startActivity(intent);
//                    }
//                }
//            });
//
//
//        String[] surahContents = getIntent().getStringArrayExtra("surahContents");
//
//            StringBuilder contentsBuilder = new StringBuilder();
//        for (String content : surahContents) {
//            contentsBuilder.append(content).append("\n");
//        }
//        //String surahContents = getIntent().getStringExtra("surahContents");
//        TextView surahContentsTextView = findViewById(R.id.textView);
//        //surahContentsTextView.setText(surahContents);
//        surahContentsTextView.setText(contentsBuilder.toString());
//// Store the surah contents into an array
//        surahContentsArray = contentsBuilder.toString().split("\n");
//
//    }
//}
package com.example.Quran;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String[] surahContentsArray;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button7);
        editText = findViewById(R.id.editTextNumber4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                String text = editText.getText().toString();



                if (!TextUtils.isEmpty(text)) {
                    int index = Integer.parseInt(text) ; // Subtract 1 to get the array index
                    if (index >= 0 && index < surahContentsArray.length) {
                        String selectedAyat = surahContentsArray[index];

                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                        intent.putExtra("selectedAyat", selectedAyat);
                        startActivity(intent);
                    }
                }
            }
    });

//
        final String[] surahContents = getIntent().getStringArrayExtra("surahContents");

        StringBuilder contentsBuilder = new StringBuilder();
        for (String content : surahContents) {
            contentsBuilder.append(content).append("\n");
        }

        TextView surahContentsTextView = findViewById(R.id.textView);
        surahContentsTextView.setText(contentsBuilder.toString());
        surahContentsArray = surahContents;
    }
}
