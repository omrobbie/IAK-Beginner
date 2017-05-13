package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.value;

public class ActivityListView extends Activity{

    String value[] = {"value a", "value b", "value c", "value d", "value e"};
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);

        for (int i=0; i<15; i++) {
            data.add("Value " + i);
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        lvList.setAdapter(adapter);
    }
}