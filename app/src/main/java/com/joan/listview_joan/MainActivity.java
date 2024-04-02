package com.joan.listview_joan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<EmailItem> emailItems = new ArrayList<>();
    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView emailListView = findViewById(R.id.emailListView);


        emailItems.add(new EmailItem(R.drawable.persona1, "Persona 1", false, "Este es el mensaje para Persona 1."));
        emailItems.add(new EmailItem(R.drawable.persona2, "Persona 2", false, "Mensaje especial de Persona 2."));
        emailItems.add(new EmailItem(R.drawable.persona3, "Persona 3", false, "Aquí va el texto para Persona 3."));
        emailItems.add(new EmailItem(R.drawable.persona4, "Persona 4", false, "Descripción detallada para Persona 4."));
        emailItems.add(new EmailItem(R.drawable.persona5, "Persona 5", false, "Información relevante de Persona 5."));

        emailAdapter = new EmailAdapter(this, emailItems);
        emailListView.setAdapter(emailAdapter);

        emailListView.setOnItemClickListener((parent, view, position, id) -> {
            EmailItem item = emailItems.get(position);
            item.setRead(true);
            emailAdapter.notifyDataSetChanged();

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("message", item.getMessage());
            startActivity(intent);
        });
    }
}
