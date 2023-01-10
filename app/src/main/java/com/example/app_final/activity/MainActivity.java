package com.example.app_final.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_final.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView profile = (TextView) findViewById(R.id.profile_user);

        profile.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ProfileActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView product = (TextView) findViewById(R.id.profile_food_zone);

        product.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent intent = new Intent(MainActivity.this, ProductActivity.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
