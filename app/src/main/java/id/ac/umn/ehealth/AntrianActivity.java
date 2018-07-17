package id.ac.umn.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import io.github.manp.Syncs;
import io.github.manp.SyncsConfig;

public class AntrianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrian);



//        final Syncs io = new Syncs("ws://192.168.43.65:8080/syncs");

        //Button btnMenu = (Button) findViewById(R.id.btnMenuUtama);
        //btnMenu.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
          //      startActivity(new Intent(AntrianActivity.this, MainActivity.class));
         //   }
       // });
        ImageView getAntrian = (ImageView) findViewById(R.id.imgLogoAntrian);
        getAntrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                io.connect();
                startActivity(new Intent(AntrianActivity.this, GetAntrian.class));
            }
        });
    }
}
