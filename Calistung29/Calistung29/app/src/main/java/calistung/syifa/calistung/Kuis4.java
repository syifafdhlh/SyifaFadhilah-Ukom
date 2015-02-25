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


public class Kuis4 extends ActionBarActivity implements View.OnClickListener {

    ImageView prevK24;
    ImageView nextK14;
    MediaPlayer mediaPlayer;
    private ImageView K14;
    private ImageView K24;
    private ImageView K34;
    private ImageView K44;
    private ImageView K54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis4);


        {
            K14 = (ImageView) findViewById(R.id.K14);
            K14.setOnClickListener(this);
        }
        {
            K24 = (ImageView) findViewById(R.id.K24);
            K24.setOnClickListener(this);
        }
        {
            K34 = (ImageView) findViewById(R.id.K34);
            K34.setOnClickListener(this);
        }
        {
            K44 = (ImageView) findViewById(R.id.K44);
            K44.setOnClickListener(this);
        }
        {
            K54 = (ImageView) findViewById(R.id.K54);
            K54.setOnClickListener(this);
        }

        {
            nextK14 = (ImageView) findViewById(R.id.nextK14);

            nextK14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn4 = new Intent(getApplicationContext(), Kuis9.class);
                    startActivity(kn4);
                    finish();
                }
            });
        }

        {
            prevK24 = (ImageView) findViewById(R.id.prevK24);

            prevK24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp4 = new Intent(getApplicationContext(), Kuis2.class);
                    startActivity(kp4);
                    finish();
                }
            });
        }
    }

    private void playSound(int k4) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


         if (k4 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k4 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k4 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k4 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k4 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k4 == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis4, menu);
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

        switch (v.getId())
        {
            case R.id.K44:
                playSound(1);
                break;

            case R.id.K14:
                playSound(2);
                break;

            case R.id.K24:
                playSound(3);
                break;
            case R.id.K34:
                playSound(4);
                break;
            case R.id.K54:
                playSound(5);
                break;
        }

    }
}
