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


public class Kuis6 extends ActionBarActivity implements View.OnClickListener {

    ImageView prevK26;
    ImageView nextK16;
    MediaPlayer mediaPlayer;
    private ImageView KS16;
    private ImageView K66;
    private ImageView K76;
    private ImageView K86;
    private ImageView K96;
    private ImageView K106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis6);


        {
            K66 = (ImageView) findViewById(R.id.K66);
            K66.setOnClickListener(this);
        }
        {
            K76 = (ImageView) findViewById(R.id.K76);
            K76.setOnClickListener(this);
        }
        {
            K86 = (ImageView) findViewById(R.id.K86);
            K86.setOnClickListener(this);
        }
        {
            K96 = (ImageView) findViewById(R.id.K96);
            K96.setOnClickListener(this);
        }
        {
            K106 = (ImageView) findViewById(R.id.K106);
            K106.setOnClickListener(this);
        }


        {
            prevK26 = (ImageView) findViewById(R.id.prevK26);

            prevK26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp6 = new Intent(getApplicationContext(), Kuis10.class);
                    startActivity(kp6);
                    finish();
                }
            });
        }
        {
            nextK16 = (ImageView) findViewById(R.id.nextK16);

            nextK16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn6 = new Intent(getApplicationContext(), Kuis1.class);
                    startActivity(kn6);
                    finish();
                }
            });
        }
    }

    private void playSound(int k6) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k6 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k6 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k6 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k6 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k6 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis6, menu);
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
            case R.id.K66:
                playSound(1);
                break;

            case R.id.K76:
                playSound(2);
                break;

            case R.id.K86:
                playSound(3);
                break;

            case R.id.K96:
                playSound(4);
                break;

            case R.id.K106:
                playSound(5);
                break;
        }

    }
}
