package fr.utt.if26.peirun_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message = "Bonjour IF26";



    @Override
    /* peirun do onCreate

     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView)findViewById(R.id.message);
        tx.setText(message);

    }
}
