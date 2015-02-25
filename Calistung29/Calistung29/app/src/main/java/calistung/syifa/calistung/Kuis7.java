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


public class Kuis7 extends ActionBarActivity implements View.OnClickListener{


    MediaPlayer mediaPlayer;
    private ImageView K67;
    private ImageView K77;
    private ImageView K87;
    private ImageView K97;
    private ImageView K107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis7);


        {
            K67 = (ImageView) findViewById(R.id.K67);
            K67.setOnClickListener(this);
            {
                K67 = (ImageView) findViewById(R.id.K67);

                K67.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ke7 = new Intent(getApplicationContext(), Salah.class);
                        playSound(1);
                        startActivity(ke7);
                        finish();
                    }
                });
            }
        }
        {
            K77 = (ImageView) findViewById(R.id.K77);
            K77.setOnClickListener(this);
            {
                K77 = (ImageView) findViewById(R.id.K77);

                K77.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kt7 = new Intent(getApplicationContext(), Kuis2.class);
                        startActivity(kt7);
                        finish();
                    }
                });
            }
        }
        {
            K87 = (ImageView) findViewById(R.id.K87);
            K87.setOnClickListener(this);
            {
                K87 = (ImageView) findViewById(R.id.K87);

                K87.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kd7 = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(kd7);
                        finish();
                    }
                });
            }
        }
        {
            K97 = (ImageView) findViewById(R.id.K97);
            K97.setOnClickListener(this);
            {
                K97 = (ImageView) findViewById(R.id.K97);

                K97.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ks7 = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(ks7);
                        finish();
                    }
                });
            }
        }
        {
            K107 = (ImageView) findViewById(R.id.K107);
            K107.setOnClickListener(this);
            {
                K107 = (ImageView) findViewById(R.id.K107);

                K107.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ksp7 = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(ksp7);
                        finish();
                    }
                });
            }
        }




    }

    private void playSound(int k7) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k7 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k7 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k7 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k7 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis7, menu);
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

            case R.id.K67:
                playSound(1);
                break;

            case R.id.K87:
                playSound(2);
                break;

            case R.id.K97:
                playSound(3);
                break;

            case R.id.K107:
                playSound(4);
                break;
        }

    }
}
