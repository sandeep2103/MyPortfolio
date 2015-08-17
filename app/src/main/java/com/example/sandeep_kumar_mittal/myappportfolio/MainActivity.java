package com.example.sandeep_kumar_mittal.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    private Button SpotifyStreamer;
    private Button Scores;
    private Button Library;
    private Button BuildItBigger;
    private Button XyzReader;
    private Button Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createObjectsOfLayout();
        settingClickEventOnButtons();
    }

    private void createObjectsOfLayout() {
        setSpotifyStreamer(SpotifyStreamerCreation());
        setScores(ScoresCreation());
        setLibrary(LibraryCreation());
        setBuildItBigger(BuildItBiggerCreation());
        setXyzReader(XyzReaderCreation());
        setCapstone(CapstoneCreation());
    }

    /*
    public Button getSpotifyStreamer() {
        return SpotifyStreamer;
    }*/

    public void setSpotifyStreamer(Button SpotifyStreamer) {
        this.SpotifyStreamer = SpotifyStreamer;
    }

    /*
    public Button getScores() {
        return Scores;
    }*/

    public void setScores(Button Scores) {
        this.Scores = Scores;
    }

    /*
    public Button getLibrary() {
        return Library;
    }*/

    public void setLibrary(Button Library) {
        this.Library = Library;
    }

    /*
    public Button getBuildItBigger() {
        return BuildItBigger;
    }*/

    public void setBuildItBigger(Button BuildItBigger) {
        this.BuildItBigger = BuildItBigger;
    }

    /*
    public Button getXyzReader() {
        return XyzReader;
    }*/

    public void setXyzReader(Button XyzReader) {
        this.XyzReader = XyzReader;
    }

    /*
    public Button getCapstone() {
        return Capstone;
    }*/

    public void setCapstone (Button Capstone) {
        this.Capstone = Capstone;
    }

    private void settingClickEventOnButtons()  {
        SpotifyStreamer.setOnClickListener(this);
        Scores.setOnClickListener(this);
        Library.setOnClickListener(this);
        BuildItBigger.setOnClickListener(this);
        XyzReader.setOnClickListener(this);
        Capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpotify_Streamer:
                OnSpotifyStreamerClick();
                break;
            case R.id.btnScores_App:
                OnScoresClick();
                break;
            case R.id.btnLibrary_App:
                OnLibraryClick();
                break;
            case R.id.btnBuild_It_Bigger:
                OnBuildItBiggerClick();
                break;
            case R.id.btnXyz_Reader:
                OnXyzReaderClick();
                break;
            case R.id.btnCapstone:
                OnCapstoneClick();
                break;
        }
    }

    private void OnSpotifyStreamerClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch Spotify Steamer App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button SpotifyStreamerCreation() {
        return (Button) findViewById(R.id.btnSpotify_Streamer);
    }

    private void OnScoresClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch Scores App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button ScoresCreation() {
        return (Button) findViewById(R.id.btnScores_App);
    }

    private void OnLibraryClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch Library App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button LibraryCreation() {
        return (Button) findViewById(R.id.btnLibrary_App);
    }

    private void OnBuildItBiggerClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch Build It Bigger App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button BuildItBiggerCreation() {
        return (Button) findViewById(R.id.btnBuild_It_Bigger);
    }

    private void OnXyzReaderClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch XYZ Reader App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button XyzReaderCreation() {
        return (Button) findViewById(R.id.btnXyz_Reader);
    }

    private void OnCapstoneClick() {
        Toast toast = Toast.makeText( getApplicationContext(), "This button will launch my Capstone App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    private Button CapstoneCreation() {
        return (Button) findViewById(R.id.btnCapstone);
    }

}
