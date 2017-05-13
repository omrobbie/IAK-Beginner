package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import static omrobbie.com.iakbeginner.R.id.chkMusic;

public class ActivityCheckBox extends Activity {

    String txtEnabled = "";

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
                txtEnabled = (chkMusic.isChecked()) ? "enabled" : "disabled";
                Toast.makeText(getApplicationContext(), chkMusic.getText().toString() + " " + txtEnabled, Toast.LENGTH_SHORT).show();
            }
        });

        chkGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEnabled = (chkGame.isChecked()) ? "enabled" : "disabled";
                Toast.makeText(getApplicationContext(), chkGame.getText().toString() + " " + txtEnabled, Toast.LENGTH_SHORT).show();
            }
        });

        chkBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEnabled = (chkBlog.isChecked()) ? "enabled" : "disabled";
                Toast.makeText(getApplicationContext(), chkBlog.getText().toString() + " " + txtEnabled, Toast.LENGTH_SHORT).show();
            }
        });
    }
}