package com.example.masror_mehedi.beautifultouristspot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView textName;
    TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace = findViewById(R.id.img_place);
        textName = findViewById(R.id.txt_name);
        textTitle = findViewById(R.id.txt_title);

        String getPlace = getIntent().getExtras().getString("place");

        Log.d("place",getPlace);//for Log
        if (getPlace.equals("Rangamati"))
        {
            imgPlace.setImageResource(R.drawable.ranga);
            textTitle.setText(R.string.ran_title);
            textName.setText(R.string.ran_desc);
        }
        else if (getPlace.equals("Bandarban")){
            imgPlace.setImageResource(R.drawable.bandarbon);
            textTitle.setText(R.string.ban_title);
            textName.setText(R.string.ban_desc);

        }
        else if (getPlace.equals("Sajek")){
            imgPlace.setImageResource(R.drawable.sajek);
            textTitle.setText(R.string.saj_title);
            textName.setText(R.string.saj_desc);
        }

        else {
            imgPlace.setImageResource(R.drawable.nilgiri);
            textTitle.setText(R.string.nil_title);
            textName.setText(R.string.nil_desc);
        }
    }
}
