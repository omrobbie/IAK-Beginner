package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static omrobbie.com.iakbeginner.R.id.lvList;

public class ActivityWeather extends Activity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        final ListView lvList = (ListView) findViewById(R.id.lvList);

        final ArrayList<Weather> data = new ArrayList<>();

        for (i = 1; i <= 3; i++) {
            Weather weather = new Weather(R.drawable.android_kejar, "Antroid Kejar " + i);
            data.add(weather);
        }

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
                Toast.makeText(getApplicationContext(), data.get(position).title + " removed", Toast.LENGTH_SHORT).show();
                data.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
    }
}