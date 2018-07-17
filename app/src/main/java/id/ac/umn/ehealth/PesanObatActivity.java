package id.ac.umn.ehealth;

import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PesanObatActivity extends AppCompatActivity {

    ListView list;
    String [] titles;
    String [] description;
    int[] imgs = {R.drawable.delcogen,R.drawable.hansaplast,R.drawable.mixagrip,R.drawable.panadol};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_obat);

        Resources res = getResources();

        titles = res.getStringArray(R.array.titles);
        description = res.getStringArray(R.array.description);

        list = (ListView) findViewById(R.id.list1);

        MyAdapter adapter = new MyAdapter(this,titles,imgs,description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),Integer.toString(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        int[] imgss;
        String myTitles[];
        String myDescription[];

        MyAdapter(Context c, String []titles,int[] img, String[]description){
            super(c,R.layout.row,R.id.text1,titles);
            this.context = c;
            this.imgss = img;
            this.myDescription = description;
            this.myTitles = titles;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = (ImageView) row.findViewById(R.id.icon);
            TextView myTitle = (TextView) row.findViewById(R.id.text1);
            TextView myDescription = (TextView) row.findViewById(R.id.text2);

            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(description[position]);

            return row;
        }
    }
}
