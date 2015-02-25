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


public class Kuis5 extends ActionBarActivity implements View.OnClickListener {
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.K15:
                playSound(1);
                break;

            case R.id.K25:
                playSound(2);
                break;

            case R.id.K35:
                playSound(3);
                break;

            case R.id.K45:
                playSound(4);
                break;
        }

    }


    MediaPlayer mediaPlayer;
    private ImageView K15;
    private ImageView K25;
    private ImageView K35;
    private ImageView K45;
    private ImageView K55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis5);


        {
            K15 = (ImageView) findViewById(R.id.K15);
            K15.setOnClickListener(this);
            {
                K15 = (ImageView) findViewById(R.id.K15);

                K15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ks5 = new Intent(getApplicationContext(), Salah.class);
                        playSound(1);
                        startActivity(ks5);
                        finish();
                    }
                });
            }
        }

        {
            K25 = (ImageView) findViewById(R.id.K25);
            K25.setOnClickListener(this);
            {
                K25 = (ImageView) findViewById(R.id.K25);

                K25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kd5 = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(kd5);
                        finish();
                    }
                });
            }
        }

        {
            K35 = (ImageView) findViewById(R.id.K35);
            K35.setOnClickListener(this);
            {
                K35 = (ImageView) findViewById(R.id.K35);

                K35.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kt5 = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(kt5);
                        finish();
                    }
                });
            }
        }

        {
            K45 = (ImageView) findViewById(R.id.K45);
            K45.setOnClickListener(this);
            {
                K45 = (ImageView) findViewById(R.id.K45);

                K45.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ke5 = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(ke5);
                        finish();
                    }
                });
            }
        }

        {
            K55 = (ImageView) findViewById(R.id.K55);
            K55.setOnClickListener(this);
            {
                K55 = (ImageView) findViewById(R.id.K55);

                K55.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kn5 = new Intent(getApplicationContext(), KuisA.class);
                        startActivity(kn5);
                        finish();
                    }
                });
            }
        }


    }

    private void playSound(int k5) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k5 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k5 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k5 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k5 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis5, menu);
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
}
