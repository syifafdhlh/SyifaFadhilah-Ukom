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


public class Kuis1 extends ActionBarActivity implements View.OnClickListener{

    ImageView nextK11;
    MediaPlayer mediaPlayer;
    private ImageView KS11;
    private ImageView K11;
    private ImageView K21;
    private ImageView K31;
    private ImageView K41;
    private ImageView K51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis1);

        {
            KS11 = (ImageView) findViewById(R.id.KS11);
            KS11.setOnClickListener(this);
        }
        {
            K11 = (ImageView) findViewById(R.id.K11);
            K11.setOnClickListener(this);
        }
        {
            K21 = (ImageView) findViewById(R.id.K21);
            K21.setOnClickListener(this);
        }
        {
            K31 = (ImageView) findViewById(R.id.K31);
            K31.setOnClickListener(this);
        }
        {
            K41 = (ImageView) findViewById(R.id.K41);
            K41.setOnClickListener(this);
        }
        {
            K51 = (ImageView) findViewById(R.id.K51);
            K51.setOnClickListener(this);
        }

        {
            nextK11 = (ImageView) findViewById(R.id.nextK11);

            nextK11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kns = new Intent(getApplicationContext(), Kuis5.class);
                    startActivity(kns);
                    finish();
                }
            });
        }
    }

    private void playSound(int k1) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k1 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k1 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k1 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k1 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k1 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis1, menu);
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
            case R.id.K11:
                playSound(1);
                break;

            case R.id.K21:
                playSound(2);
                break;

            case R.id.K31:
                playSound(3);
                break;

            case R.id.K41:
                playSound(4);
                break;

            case R.id.K51:
                playSound(5);
                break;

        }


    }
    }

