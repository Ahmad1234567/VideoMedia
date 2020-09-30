package com.example.videomedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vv = (VideoView) findViewById(R.id.vv);
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(vv);
        vv.setVideoPath("android.resource://"+getPackageName()+ "/" + R.raw.aa);
        vv.setMediaController(mediaController);
        vv.requestFocus();
        vv.start();
    }

}