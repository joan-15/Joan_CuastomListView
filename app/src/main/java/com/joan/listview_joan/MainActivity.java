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
        emailItems.add(new EmailItem(R.drawable.persona1, "14/05/2024", "Fiesta", "hola, buenas tardes...", "Colombia", false, "hola, buenas tardes, como te encuentra? estas listo para la fista del fin de semana ? espero que puedas venir."));
        emailItems.add(new EmailItem(R.drawable.persona2, "29/05/2024", "cita medica", "buenas tades...", "colombia", false, "buenas tades señor el siguiente mensaje es un recordatorio sobre su cita de este sabado."));
        emailItems.add(new EmailItem(R.drawable.persona3, "22/04/2024", "visita", "Hola amigo...", "canada", false, "Hola amigo, voy a estar de visita por colombia el proximo mes y quero que nos reunamos por los viejos tiempos."));
        emailItems.add(new EmailItem(R.drawable.persona4, "04/04/2024", "winer", "hello, you are...", "USA", false, "hello, you are the winner of a guided tour of neuralink's offices. click on the link below"));
        emailItems.add(new EmailItem(R.drawable.persona5, "01/05/2024", "profesora", "fehca de entrega...", "chile", false, "fecha de entrega para el trabajo remoto es para el dia 08/06/2024"));

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
