package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.value;

public class ActivityListView extends Activity{

    String value[] = {"value a", "value b"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        ListView lvList = (ListView) findViewById(R.id.lvList);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, value);
        lvList.setAdapter(adapter);
    }
}
