package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityWeather extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);

        ArrayList<Weather> data = new ArrayList<>();
        Weather weather = new Weather(R.drawable.android_kejar, "Title");
        data.add(weather);
        
    }
}