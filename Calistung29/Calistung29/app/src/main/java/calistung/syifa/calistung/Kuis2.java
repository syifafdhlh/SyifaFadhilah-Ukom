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


public class Kuis2 extends ActionBarActivity implements View.OnClickListener{

    MediaPlayer mediaPlayer;
    private ImageView K12;
    private ImageView K22;
    private ImageView K32;
    private ImageView K42;
    private ImageView K52;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis2);

        {
            K12 = (ImageView) findViewById(R.id.K12);
            K12.setOnClickListener(this);
            {
                K12 = (ImageView) findViewById(R.id.K12);

                K12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ks2 = new Intent(getApplicationContext(), Salah.class);
                        playSound(1);
                        startActivity(ks2);
                        finish();
                    }
                });
            }
        }
        {
            K22 = (ImageView) findViewById(R.id.K22);
            K22.setOnClickListener(this);
            {
                K22 = (ImageView) findViewById(R.id.K22);

                K22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kd2 = new Intent(getApplicationContext(), KuisB.class);
                        startActivity(kd2);
                        finish();
                    }
                });
            }
        }
        {
            K32 = (ImageView) findViewById(R.id.K32);
            K32.setOnClickListener(this);
            {
                K32 = (ImageView) findViewById(R.id.K32);

                K32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kt2 = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(kt2);
                        finish();
                    }
                });
            }
        }
        {
            K42 = (ImageView) findViewById(R.id.K42);
            K42.setOnClickListener(this);
            {
                K42 = (ImageView) findViewById(R.id.K42);

                K42.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ke2 = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(ke2);
                        finish();
                    }
                });
            }
        }
        {
            K52 = (ImageView) findViewById(R.id.K52);
            K52.setOnClickListener(this);
            {
                K52 = (ImageView) findViewById(R.id.K52);

                K52.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kl2 = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(kl2);
                        finish();
                    }
                });
            }
        }
    }

    private void playSound(int k2) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k2 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k2 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k2 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k2 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis2, menu);
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

            case R.id.K12:
                playSound(2);
                break;

            case R.id.K32:
                playSound(3);
                break;

            case R.id.K42:
                playSound(4);
                break;

            case R.id.K52:
                playSound(5);
                break;
        }



    }
}
