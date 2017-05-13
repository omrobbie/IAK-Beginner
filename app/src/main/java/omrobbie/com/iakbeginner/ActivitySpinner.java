package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ActivitySpinner extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_spinner);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        List<String> categories = new ArrayList<String>();
        categories.add("Beginner");
        categories.add("Intermediate");
        categories.add("Advance");
    }
}