package id.ac.umn.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgAjukan = (ImageView) findViewById(R.id.imgAjukan);
        imgAjukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(MainActivity.this, AjukanActivity.class));

            }
        });

        ImageView imgRiwayat = (ImageView) findViewById(R.id.imgRiwayat);
        imgRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Go to Riwayat",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imgAntrian = (ImageView) findViewById(R.id.imgAntrian);
        imgAntrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(MainActivity.this, AntrianActivity.class));
            }
        });

        ImageView imgPesanObat = (ImageView) findViewById(R.id.imgPesan);
        imgPesanObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(MainActivity.this, PesanObatActivity.class));
            }
        });

    }
}