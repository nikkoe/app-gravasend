package com.example.gravasend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CurrentTrip extends AppCompatActivity {
    private ImageButton b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currenttrip);

        b1 = findViewById(R.id.backButton);
        b2 = findViewById(R.id.btnMyTruck);
        b3 = findViewById(R.id.btnMaintenanceHistory);
        b4 = findViewById(R.id.btnMaintenanceReminders);
        b5 = findViewById(R.id.btnInspectionRecords);

        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTrip.this, MyTrips.class);
                startActivity(intent);
            }

        });
        findViewById(R.id.btnMyTruck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTrip.this, TripDashboard.class);
                startActivity(intent);
            }

        });
        findViewById(R.id.btnMaintenanceHistory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTrip.this, SafetyChecklist.class);
                startActivity(intent);
            }

        });
        findViewById(R.id.btnMaintenanceReminders).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTrip.this, DocumentCheck.class);
                startActivity(intent);
            }

        });
        findViewById(R.id.btnInspectionRecords).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTrip.this, LoadVerification.class);
                startActivity(intent);
            }

        });
    }
}
