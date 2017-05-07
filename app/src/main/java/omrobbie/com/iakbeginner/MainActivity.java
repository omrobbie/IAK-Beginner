package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);

        final TextView txtCenter = (TextView) findViewById(R.id.txtCenter);
        Button btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getText = txtCenter.getText().toString();
                Toast.makeText(getApplicationContext(), getText, Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSet = (Button) findViewById(R.id.btnSet);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCenter.setText("TextView Baru!");
            }
        });
    }
}