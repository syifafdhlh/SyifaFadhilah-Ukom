package calistung.syifa.calistung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Kuis10 extends ActionBarActivity implements View.OnClickListener {

    ImageView prevK210;
    ImageView nextK110;
    MediaPlayer mediaPlayer;
    private ImageView KS110;
    private ImageView K610;
    private ImageView K710;
    private ImageView K810;
    private ImageView K910;
    private ImageView K1010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis10);


        {
            K610 = (ImageView) findViewById(R.id.K610);
            K610.setOnClickListener(this);
        }
        {
            K710 = (ImageView) findViewById(R.id.K710);
            K710.setOnClickListener(this);
        }
        {
            K810 = (ImageView) findViewById(R.id.K810);
            K810.setOnClickListener(this);
        }
        {
            K910 = (ImageView) findViewById(R.id.K910);
            K910.setOnClickListener(this);
        }
        {
            K1010 = (ImageView) findViewById(R.id.K1010);
            K1010.setOnClickListener(this);
        }


        {
            prevK210 = (ImageView) findViewById(R.id.prevK210);

            prevK210.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp10 = new Intent(getApplicationContext(), Kuis9.class);
                    startActivity(kp10);
                    finish();
                }
            });
        }
        {
            nextK110 = (ImageView) findViewById(R.id.nextK110);

            nextK110.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn10 = new Intent(getApplicationContext(), Kuis6.class);
                    startActivity(kn10);
                    finish();
                }
            });
        }
    }

    private void playSound(int k10) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k10 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k10 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k10 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k10 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k10 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis10, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.K1010:
                playSound(1);
                break;

            case R.id.K610:
                playSound(2);
                break;

            case R.id.K710:
                playSound(3);
                break;

            case R.id.K810:
                playSound(4);
                break;

            case R.id.K910:
                playSound(5);
                break;


        }
    }
}