package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePassengers extends AppCompatActivity {

    private TextView booking;
    private TextView Feedback;
    private TextView Payment;
    private TextView TicketCharges;
    private TextView Notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_passengers);

        booking = findViewById(R.id.textViewBooking);
        Feedback = findViewById(R.id.textViewFeedback);
        Payment = findViewById(R.id.textViewPayment);
        TicketCharges = findViewById(R.id.textViewTicketCharges);
        Notice = findViewById(R.id.textViewNotice);



        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePassengers.this,Search.class);

                startActivity(intent);

            }
        });


        Feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePassengers.this,Search.class);

                startActivity(intent);

            }
        });


        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePassengers.this,pay2.class);

                startActivity(intent);

            }
        });


        TicketCharges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePassengers.this,Search.class);

                startActivity(intent);

            }
        });

        Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePassengers.this,Search.class);

                startActivity(intent);

            }
        });


    }
}