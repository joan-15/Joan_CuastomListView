package com.joan.listview_joan;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);


        String message = getIntent().getStringExtra("message");


        TextView messageTextView = findViewById(R.id.messageTextView);
        messageTextView.setText(message);
    }
}
