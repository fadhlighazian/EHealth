package id.ac.umn.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LamaWaktuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lama_waktu);

        ImageView defaultImg = (ImageView) findViewById(R.id.defaultImg);
        Intent myIntent = getIntent();

        String imageName = myIntent.getStringExtra("img");
        int resID = getResources().getIdentifier(imageName , "drawable", getPackageName());
        defaultImg.setImageResource(resID);




        final SeekBar seekbar = (SeekBar) findViewById(R.id.seekbarWaktu);
        seekbar.setMax(30);

        final TextView textView = (TextView) findViewById(R.id.textView);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                textView.setText(progress+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button btnYa = (Button) findViewById(R.id.btnYa);
        btnYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(LamaWaktuActivity.this, String.valueOf(seekbar.getProgress()), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LamaWaktuActivity.this, CatatanPasienActivity.class));
            }
        });

        Button btnTidak = (Button) findViewById(R.id.btnTidak);
        btnTidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LamaWaktuActivity.this, CatatanPasienActivity.class));

            }
        });
    }
}
