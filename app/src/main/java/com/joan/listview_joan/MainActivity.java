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

        // Agregando datos de ejemplo con mensajes específicos
        emailItems.add(new EmailItem(R.drawable.persona1, "01/01/2023", "Titulo 1", "Inicio del mensaje 1...", "Pais 1", false, "Este es el mensaje completo para Persona 1."));
        emailItems.add(new EmailItem(R.drawable.persona2, "02/02/2023", "Titulo 2", "Inicio del mensaje 2...", "Pais 2", false, "Mensaje completo especial de Persona 2."));
        emailItems.add(new EmailItem(R.drawable.persona3, "03/03/2023", "Titulo 3", "Inicio del mensaje 3...", "Pais 3", false, "Aquí va el texto completo para Persona 3."));
        emailItems.add(new EmailItem(R.drawable.persona4, "04/04/2023", "Titulo 4", "Inicio del mensaje 4...", "Pais 4", false, "Descripción completa para Persona 4."));
        emailItems.add(new EmailItem(R.drawable.persona5, "05/05/2023", "Titulo 5", "Inicio del mensaje 5...", "Pais 5", false, "Información completa relevante de Persona 5."));

        emailAdapter = new EmailAdapter(this, emailItems);
        emailListView.setAdapter(emailAdapter);

        emailListView.setOnItemClickListener((parent, view, position, id) -> {
            EmailItem item = emailItems.get(position);
            item.setRead(true);
            emailAdapter.notifyDataSetChanged();

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("imageResource", item.getImageResource());
            intent.putExtra("date", item.getDate());
            intent.putExtra("title", item.getTitle());
            intent.putExtra("message", item.getMessage());
            intent.putExtra("country", item.getCountry());
            startActivity(intent);
        });
    }
}
