package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static omrobbie.com.iakbeginner.R.id.txtJudul;
import static omrobbie.com.iakbeginner.R.id.txtTitle;

public class ActivityTarget extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_target);

        int getIcon = getIntent().getExtras().getInt("icon");
        String getTitle = getIntent().getExtras().getString("title");

        ImageView imgGambar = (ImageView) findViewById(R.id.imgGambar);
        imgGambar.setImageResource(getIcon);

        TextView txtJudul = (TextView) findViewById(R.id.txtJudul);
        txtJudul.setText(getTitle);
    }
}