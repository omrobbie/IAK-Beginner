package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static omrobbie.com.iakbeginner.R.id.lvList;
import static omrobbie.com.iakbeginner.R.id.txtNama;

public class ActivityWeather extends Activity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        final ListView lvList = (ListView) findViewById(R.id.lvList);

        final ArrayList<Weather> data = new ArrayList<>();

//        for (i = 1; i <= 3; i++) {
//            Weather weather = new Weather(R.drawable.android_kejar, "Antroid Kejar " + i);
//            data.add(weather);
//        }

        // sementara, masukkan data secara manual
        Weather jeruk = new Weather(R.drawable.jeruk, "jeruk");
        data.add(jeruk);

        Weather anggur = new Weather(R.drawable.anggur, "anggur");
        data.add(anggur);

        Weather kiwi = new Weather(R.drawable.kiwi, "kiwi");
        data.add(kiwi);

        Weather mangga = new Weather(R.drawable.mangga, "mangga");
        data.add(mangga);

        Weather manggis = new Weather(R.drawable.manggis, "manggis");
        data.add(manggis);

        Weather nanas = new Weather(R.drawable.nanas, "nanas");
        data.add(nanas);

        Weather pisang = new Weather(R.drawable.pisang, "pisang");
        data.add(pisang);

        Weather semangka = new Weather(R.drawable.semangka, "semangka");
        data.add(semangka);

        Weather pepaya = new Weather(R.drawable.pepaya, "pepaya");
        data.add(pepaya);

        Weather apel = new Weather(R.drawable.apel, "apel");
        data.add(apel);
        // ---

        final WeatherAdapter adapter = new WeatherAdapter(this, R.layout.layout_listitem, data);
        lvList.setAdapter(adapter);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Weather weather = new Weather(R.drawable.android_kejar, "Antroid Kejar " + i++);
                data.add(weather);
                adapter.notifyDataSetChanged();
                lvList.setSelection(adapter.getCount() - 1);
            }
        });

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(), data.get(position).title + " removed", Toast.LENGTH_SHORT).show();
//                data.remove(position);
//                adapter.notifyDataSetChanged();

                Intent toTarget = new Intent(getApplicationContext(), ActivityTarget.class);
                toTarget.putExtra("icon", data.get(position).icon);
                toTarget.putExtra("title", data.get(position).title);
                startActivity(toTarget);
            }
        });
    }
}