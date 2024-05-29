package com.joan.listview_joan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageViewProfile = findViewById(R.id.imageViewProfile);
        TextView textViewDate = findViewById(R.id.textViewDate);
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewMessage = findViewById(R.id.messageTextView);
        TextView textViewCountry = findViewById(R.id.textViewCountry);

        int imageResource = getIntent().getIntExtra("imageResource", -1);
        String date = getIntent().getStringExtra("date");
        String title = getIntent().getStringExtra("title");
        String message = getIntent().getStringExtra("message");
        String country = getIntent().getStringExtra("country");

        imageViewProfile.setImageResource(imageResource);
        textViewDate.setText(date);
        textViewTitle.setText(title);
        textViewMessage.setText(message);
        textViewCountry.setText(country);
    }
}
