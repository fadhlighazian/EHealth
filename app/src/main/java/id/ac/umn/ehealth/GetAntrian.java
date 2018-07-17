package id.ac.umn.ehealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daasuu.cat.CountAnimationTextView;

import java.util.Random;

import io.github.manp.Syncs;
import io.github.manp.SyncsConfig;

public class GetAntrian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //SyncsConfig config=new SyncsConfig();
       // config.reconnectDelay=1000;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_antrian);

        Random rand = new Random();
        int number = rand.nextInt(1000)+1;

        CountAnimationTextView mCountAnimationTextView = (CountAnimationTextView) findViewById(R.id.count_animation_textView);
        mCountAnimationTextView
                .setAnimationDuration(5000)
                .countAnimation(0, number);

        String nomorAntrian = String.valueOf(number);
        mCountAnimationTextView.setText(nomorAntrian);
    }
}

