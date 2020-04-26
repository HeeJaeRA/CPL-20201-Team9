package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                player=MediaPlayer.create(MainActivity.this, R.raw.vox);
                player.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.isPlaying())  {
                    player.stop();
                    player.reset();

                }
            }
        });


    }
}