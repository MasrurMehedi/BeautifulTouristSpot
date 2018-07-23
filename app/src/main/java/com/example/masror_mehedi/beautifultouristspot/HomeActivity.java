package com.example.masror_mehedi.beautifultouristspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnRangamati,btnBandarban,btnSajek,btnNilgiri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRangamati = findViewById(R.id.btn_ranga);
        btnBandarban = findViewById(R.id.btn_bandarban);
        btnSajek     = findViewById(R.id.btn_sajek);
        btnNilgiri   = findViewById(R.id.btn_nilgiri);


        btnRangamati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Rangamati");
                Toast.makeText(HomeActivity.this,"Rangamati",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnBandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Bandarban");
                Toast.makeText(HomeActivity.this,"Bandarban",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnSajek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Sajek");
                Toast.makeText(HomeActivity.this,"Sajek",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        btnNilgiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,DetailsActivity.class);

                i.putExtra( "place","Nilgiri");
                Toast.makeText(HomeActivity.this,"Dhaka",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });


    }
}
