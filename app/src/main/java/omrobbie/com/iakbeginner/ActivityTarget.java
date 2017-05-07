package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityTarget extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_target);

        String getData = getIntent().getExtras().getString("data");
        Toast.makeText(getApplicationContext(), getData, Toast.LENGTH_SHORT).show();
    }
}