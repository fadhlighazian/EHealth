package id.ac.umn.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CatatanPasienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_pasien);

        Button btnKirim = (Button) findViewById(R.id.btnKirim);
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText deskripsiSakit = (EditText) findViewById(R.id.txtDesktripsiSakit);
                final EditText alergiObat = (EditText) findViewById(R.id.txtAlergiObat);
                deskripsiSakit.getText().toString();
                alergiObat.getText().toString();

                String[] selectionArgs = {getIntent().getStringExtra("ID")};

                Toast.makeText(getApplicationContext(),deskripsiSakit.getText().toString(),Toast.LENGTH_LONG).show();

                Toast.makeText(CatatanPasienActivity.this, selectionArgs.toString(), Toast.LENGTH_SHORT).show();

                startActivity(new Intent(CatatanPasienActivity.this, MainActivity.class));


            }
        });
    }
}
