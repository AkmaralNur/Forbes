package com.example.forbes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<person> people = new ArrayList<>(Arrays.asList(
            new person("Bill Gates", "$86 B", R.drawable.flag_united_states),
            new person("Warren Buffett", "$75.6 B", R.drawable.flag_united_states),
            new person("Jeff Bezos", "$72.8 B", R.drawable.flag_united_states),
            new person("Amancio Ortega", "$71.3 B", R.drawable.flag_spain),
            new person("Mark Zuckerberg", "$56 B", R.drawable.flag_united_states),
            new person("Carlos Slim Helu", "$54.5 B", R.drawable.flag_mexico),
            new person("Larry Ellison", "$52.2 B", R.drawable.flag_united_states),
            new person("Charles Koch", "$48.3 B", R.drawable.flag_united_states),
            new person("David Koch", "$48.3 B", R.drawable.flag_united_states),
            new person("Michael Bloomberg", "$47.5 B", R.drawable.flag_united_states),
            new person("Bernard Arnault", "$41.5 B", R.drawable.flag_france),
            new person("Larry Page", "$40.7 B", R.drawable.flag_united_states),
            new person("Sergey Brin", "$39.8 B", R.drawable.flag_united_states),
            new person("Liliane Bettencourt", "$39.5 B", R.drawable.flag_united_states),
            new person("S. Robson Walton", "$34.1 B", R.drawable.flag_united_states),
            new person("Jim Walton", "$34 B", R.drawable.flag_united_states),
            new person("Alice Walton", "$33.8 B", R.drawable.flag_united_states),
            new person("Wang Jianlin", "$31.3 B", R.drawable.flag_china),
            new person("Li Ka-shing", "$31.2 B", R.drawable.flag_hong_kong),
            new person("Sheldon Adelson", "$30.4 B", R.drawable.flag_united_states),
            new person("Elon Musk", "$13.9 B", R.drawable.flag_united_states),
            new person("Jorge Paulo Lemann", "$29.2 B", R.drawable.flag_brazil),
            new person("Jack Ma", "$28.3 B", R.drawable.flag_china),
            new person("Beate Heister & Karl Albrecht Jr.", "$27.2 B", R.drawable.flag_germany),
            new person("David Thomson", "$27.2 B", R.drawable.flag_canada),
            new person("Jacqueline Mars", "$27 B", R.drawable.flag_united_states),
            new person("John Mars", "$27 B", R.drawable.flag_united_states),
            new person("Phil Knight", "$26.2 B", R.drawable.flag_united_states),
            new person("Maria Franca Fissolo", "$25.2 B", R.drawable.flag_italy),
            new person("George Soros", "$25.2 B", R.drawable.flag_united_states),
            new person("Ma Huateng", "$24.9 B", R.drawable.flag_china),
            new person("Lee Shau Kee", "$24.4 B", R.drawable.flag_hong_kong),
            new person("Mukesh Ambani", "$23.2 B", R.drawable.flag_india),
            new person("Masayoshi Son", "$21.2 B", R.drawable.flag_japan),
            new person("Kjeld Kirk Kristiansen", "$21.1 B", R.drawable.flag_denmark),
            new person("Georg Schaeffler", "$20.7 B", R.drawable.flag_germany),
            new person("Joseph Safra", "$20.5 B", R.drawable.flag_brazil),
            new person("Michael Dell", "$20.4 B", R.drawable.flag_united_states),
            new person("Susanne Klatten", "$20.4 B", R.drawable.flag_united_states),
            new person("Len Blavatnik", "$20 B", R.drawable.flag_united_states),
            new person("Laurene Powell Jobs", "$20 B", R.drawable.flag_united_states),
            new person("Paul Allen", "$19.9 B", R.drawable.flag_sweden),
            new person("Stefan Persson", "$19.6 B", R.drawable.flag_germany),
            new person("Theo Albrecht, Jr.", "$18.8 B", R.drawable.flag_germany),
            new person("Prince Alwaleed Bin Talal Alsaud", "$18.7 B", R.drawable.flag_saudi_arabia),
            new person("Leonid Mikhelson", "$18.4 B", R.drawable.flag_russia),
            new person("Charles Ergen", "$18.3 B", R.drawable.flag_united_states),
            new person("Stefan Quandt", "$18.3 B", R.drawable.flag_germany),
            new person("James Simons", "$18 B", R.drawable.flag_united_states),
            new person("Leonardo Del Vecchio", "$17.9 B", R.drawable.flag_italy),
            new person("Alexey Mordashov", "$17.5 B", R.drawable.flag_russia),
            new person("William Ding", "$17.3 B", R.drawable.flag_china),
            new person("Dieter Schwarz", "$17 B", R.drawable.flag_germany),
            new person("Ray Dalio", "$16.8 B", R.drawable.flag_united_states),
            new person("Carl Icahn", "$16.6 B", R.drawable.flag_united_states),
            new person("Lakshmi Mittal", "$16.4 B", R.drawable.flag_india),
            new person("Serge Dassault", "$16.1 B", R.drawable.flag_france),
            new person("Vladimir Lisin", "$16.1 B", R.drawable.flag_russia),
            new person("Gennady Timchenko", "$16 B", R.drawable.flag_russia),
            new person("Wang Wei", "$15.9 B", R.drawable.flag_china),
            new person("Tadashi Yanai", "$15.9 B", R.drawable.flag_japan),
            new person("Charoen Sirivadhanabhakdi", "$15.8 B", R.drawable.flag_thailand),
            new person("Francois Pinault", "$15.7 B", R.drawable.flag_france),
            new person("Hinduja family", "$15.4 B", R.drawable.flag_united_kingdom),
            new person("David & Simon Reuben", "$15.3 B", R.drawable.flag_united_kingdom),
            new person("Donald Bren", "$15.2 B", R.drawable.flag_united_states),
            new person("Alisher Usmanov", "$15.2 B", R.drawable.flag_russia),
            new person("Lee Kun-Hee", "$15.1 B", R.drawable.flag_south_korea),
            new person("Thomas & Raymond Kwok", "$15 B", R.drawable.flag_hong_kong)
            // Добавьте остальных миллиардеров по необходимости
    ));


    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        forbsAdapter adapter = new forbsAdapter(this, people);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = ((person) parent.getItemAtPosition(position)).name;
                String url = "https://www.google.ru/search?q=" + name.replace(" ", "+");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
