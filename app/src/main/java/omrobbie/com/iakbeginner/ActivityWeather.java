package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import static omrobbie.com.iakbeginner.R.id.lvList;

public class ActivityWeather extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);

        ArrayList<Weather> data = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Weather weather = new Weather(R.drawable.android_kejar, "Antroid Kejar " + i);
            data.add(weather);
        }

        WeatherAdapter adapter = new WeatherAdapter(this, R.layout.layout_listitem, data);
        lvList.setAdapter(adapter);
    }
}