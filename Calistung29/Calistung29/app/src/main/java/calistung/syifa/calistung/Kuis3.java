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


public class Kuis3 extends ActionBarActivity implements View.OnClickListener{

    ImageView prevK23;
    ImageView nextK13;
    MediaPlayer mediaPlayer;
    private ImageView KS13;
    private ImageView K13;
    private ImageView K23;
    private ImageView K33;
    private ImageView K43;
    private ImageView K53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis3);

        {
            KS13 = (ImageView) findViewById(R.id.KS13);
            KS13.setOnClickListener(this);
        }
        {
            K13 = (ImageView) findViewById(R.id.K13);
            K13.setOnClickListener(this);
        }
        {
            K23 = (ImageView) findViewById(R.id.K23);
            K23.setOnClickListener(this);
        }
        {
            K33 = (ImageView) findViewById(R.id.K33);
            K33.setOnClickListener(this);
        }
        {
            K43 = (ImageView) findViewById(R.id.K43);
            K43.setOnClickListener(this);
        }
        {
            K53 = (ImageView) findViewById(R.id.K53);
            K53.setOnClickListener(this);
        }

        {
            nextK13 = (ImageView) findViewById(R.id.nextK13);

            nextK13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn3 = new Intent(getApplicationContext(), Kuis7.class);
                    startActivity(kn3);
                    finish();
                }
            });
        }

        {
            prevK23 = (ImageView) findViewById(R.id.prevK23);

            prevK23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp3 = new Intent(getApplicationContext(), Kuis5.class);
                    startActivity(kp3);
                    finish();
                }
            });
        }
    }

    private void playSound(int k3) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k3 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k3 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }else if (k3 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }else if (k3 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }else if (k3 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis3, menu);
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
            case R.id.K33:
                playSound(1);
                break;

            case R.id.K13:
                playSound(2);
                break;

            case R.id.K23:
                playSound(3);
                break;

            case R.id.K43:
                playSound(4);
                break;

            case R.id.K53:
                playSound(5);
                break;


        }

    }
}
