package id.ac.umn.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AjukanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajukan);

        final String bagian = "Mata";

        final ImageView imgEye = (ImageView) findViewById(R.id.imgEye);
        imgEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(AjukanActivity.this, LamaWaktuActivity.class);
                intent.putExtra("img", "eye");
                //intent.putExtra("ID", bagian);
                startActivity(intent);

            }
        });

        ImageView imgHand = (ImageView) findViewById(R.id.imgHand);
        imgHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(AjukanActivity.this, LamaWaktuActivity.class);
                intent.putExtra("img", "hand");
                //intent.putExtra("ID", bagian);
                startActivity(intent);
            }
        });

        ImageView imgHeart = (ImageView) findViewById(R.id.imgHeart);
        imgHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(AjukanActivity.this, LamaWaktuActivity.class);
                intent.putExtra("img", "heart");
                //intent.putExtra("ID", bagian);
                startActivity(intent);
            }
        });

        ImageView imgKaki = (ImageView) findViewById(R.id.imgKaki);
        imgKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(AjukanActivity.this, LamaWaktuActivity.class);
                intent.putExtra("img", "kaki");
                //intent.putExtra("ID", bagian);
                startActivity(intent);
            }
        });


    }
}
