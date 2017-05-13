package omrobbie.com.iakbeginner;

import android.content.Context;
import android.widget.ArrayAdapter;

public class WeatherAdapter extends ArrayAdapter<Weather>{
    public WeatherAdapter(Context context, int resource, Weather[] objects) {
        super(context, resource, objects);
    }
}
