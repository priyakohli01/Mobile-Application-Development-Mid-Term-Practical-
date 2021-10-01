package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button explicit , implicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   explicit = (Button)findViewById(R.id.explicit);
   implicit = (Button)findViewById(R.id.implicit);

   explicit.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i = new Intent(getApplicationContext() ,ImplicitActivity.class);
           startActivity(i);
       }
   });

   implicit.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i = new Intent(Intent.ACTION_DIAL);
           i.setData(Uri.parse("tel:"+ "7088292032"));
           startActivity(i);
       }
   });



    }
}