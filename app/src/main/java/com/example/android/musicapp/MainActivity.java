package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        ImageButton info = (ImageButton) findViewById(R.id.info);

        // Set a click listener on that View
        info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, InfoActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageButton share = (ImageButton) findViewById(R.id.share);

        // Set a click listener on that View
        share.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ShareActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        ImageButton purchase = (ImageButton) findViewById(R.id.purchase);

        // Set a click listener on that View
        purchase.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, PurchaseActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }
}