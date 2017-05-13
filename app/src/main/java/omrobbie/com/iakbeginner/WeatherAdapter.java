package omrobbie.com.iakbeginner;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather>{
    Context context;
    int layoutResourceId;
    ArrayList<Weather> data = null;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layoutResourceId = resource;
        this.data = objects;
    }
}
