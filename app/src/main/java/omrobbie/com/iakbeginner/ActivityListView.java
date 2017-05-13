package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.value;

public class ActivityListView extends Activity{

    String value[] = {"value a", "value b", "value c", "value d", "value e"};
    ArrayList<String> data = new ArrayList<>();
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        final ListView lvList = (ListView) findViewById(R.id.lvList);

        for (i=1; i<=5; i++) {
            data.add("Value " + i);
        }
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        lvList.setAdapter(adapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), data.get(position) + " remove", Toast.LENGTH_SHORT).show();
                data.remove(position);
                adapter.notifyDataSetChanged();
            }
        });

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add("Value " + i++);
                adapter.notifyDataSetChanged();
                lvList.setSelection(adapter.getCount() - 1);
            }
        });
    }
}