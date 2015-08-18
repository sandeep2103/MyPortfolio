package com.example.sandeep_kumar_mittal.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by sandeep_kumaar_mittal on 19/8/15.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        switch (v.getId()) {
            case R.id.btnSpotify_Streamer:
                findViewById(R.id.btnSpotify_Streamer).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch Spotify Steamer App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case R.id.btnScores_App:
                findViewById(R.id.btnScores_App).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch Scores App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case R.id.btnLibrary_App:
                findViewById(R.id.btnLibrary_App).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch Library App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case R.id.btnBuild_It_Bigger:
                findViewById(R.id.btnBuild_It_Bigger).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch Build It Bigger App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case R.id.btnXyz_Reader:
                findViewById(R.id.btnXyz_Reader).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch XYZ Reader App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
            case R.id.btnCapstone:
                findViewById(R.id.btnCapstone).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText( getApplicationContext(),
                                "This button will launch my Capstone App!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                break;
        }
    }
}
