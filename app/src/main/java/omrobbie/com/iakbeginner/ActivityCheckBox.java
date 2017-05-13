package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;

public class ActivityCheckBox extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_checkbox);

        CheckBox chkMusic = (CheckBox) findViewById(R.id.chkMusic);
        CheckBox chkGame = (CheckBox) findViewById(R.id.chkGame);
        CheckBox chkBlog = (CheckBox) findViewById(R.id.chkBlog);
    }
}
