package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    ImageButton play;
    ImageButton prev;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        play = (ImageButton) findViewById(R.id.play);
        play.setOnClickListener(submitButtonOnClickListener);

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(prevnOnClickListener);

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(nextnOnClickListener);

        // Find the View that shows the numbers category
        ImageButton info = (ImageButton) findViewById(R.id.info);

        // Set a click listener on that View
        info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);

                // Start the new activity
                startActivity(infoIntent);
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
                Intent shareIntent = new Intent(MainActivity.this, ShareActivity.class);

                // Start the new activity
                startActivity(shareIntent);
            }
        });

        ImageButton purchase = (ImageButton) findViewById(R.id.purchase);

        // Set a click listener on that View
        purchase.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent purchaseIntent = new Intent(MainActivity.this, PurchaseActivity.class);

                // Start the new activity
                startActivity(purchaseIntent);
            }
        });

    }



     final View.OnClickListener prevnOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){

            Toasty.info(MainActivity.this, "PREV", Toast.LENGTH_SHORT, true).show();
                //Toasty.success(MainActivity.this, "PREVIOUS", Toast.LENGTH_SHORT, true).show();


        }
    };

    final View.OnClickListener nextnOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){

            Toasty.info(MainActivity.this, "NEXT", Toast.LENGTH_SHORT, true).show();
            //Toasty.success(MainActivity.this, "NEXT", Toast.LENGTH_SHORT, true).show();


        }
    };

    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){


            Toasty.success(MainActivity.this, "PLAY/PAUSE", Toast.LENGTH_SHORT, true).show();


        }
    };
}