package omrobbie.com.iakbeginner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityRadioButton extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_radiobutton);

        final RadioGroup rbgVote = (RadioGroup) findViewById(R.id.rbgVote);
        rbgVote.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if ((rb != null) && (checkedId > -1)) {
                    Toast.makeText(getApplicationContext(), rb.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbgVote.clearCheck();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = (RadioButton) rbgVote.findViewById(rbgVote.getCheckedRadioButtonId());
                if (rb != null) {
                    Toast.makeText(getApplicationContext(), rb.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
