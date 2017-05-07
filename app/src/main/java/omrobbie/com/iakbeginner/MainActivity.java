package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_interaction);

//        data yang sebelumnya untuk layout_activity.xml

//        final TextView txtCenter = (TextView) findViewById(R.id.txtCenter);
//        Button btnGet = (Button) findViewById(R.id.btnGet);
//        btnGet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getText = txtCenter.getText().toString();
//                Toast.makeText(getApplicationContext(), getText, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Button btnSet = (Button) findViewById(R.id.btnSet);
//        btnSet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtCenter.setText("TextView Baru!");
//            }
//        });
//
        final EditText txtNama = (EditText) findViewById(R.id.txtNama);
        final TextView txtNamaShow = (TextView) findViewById(R.id.txtNamaShow);
        Button btnGetNama = (Button) findViewById(R.id.btnGetNama);
        btnGetNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNama = txtNama.getText().toString();
                txtNamaShow.setText("Hello, " + getNama + " !");
            }
        });
    }
}