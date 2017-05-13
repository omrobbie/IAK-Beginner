package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityCheckBox extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_checkbox);

        final CheckBox chkMusic = (CheckBox) findViewById(R.id.chkMusic);
        final CheckBox chkGame = (CheckBox) findViewById(R.id.chkGame);
        final CheckBox chkBlog = (CheckBox) findViewById(R.id.chkBlog);

        chkMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), chkMusic.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        chkGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), chkGame.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        chkBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), chkBlog.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}