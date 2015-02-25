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


public class Kuis8 extends ActionBarActivity implements View.OnClickListener{

    ImageView prevK28;
    ImageView nextK18;
    MediaPlayer mediaPlayer;
    private ImageView KS18;
    private ImageView K68;
    private ImageView K78;
    private ImageView K88;
    private ImageView K98;
    private ImageView K108;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis8);


        {
            K68 = (ImageView) findViewById(R.id.K68);
            K68.setOnClickListener(this);
        }
        {
            K78 = (ImageView) findViewById(R.id.K78);
            K78.setOnClickListener(this);
        }
        {
            K88 = (ImageView) findViewById(R.id.K88);
            K88.setOnClickListener(this);
        }
        {
            K98 = (ImageView) findViewById(R.id.K98);
            K98.setOnClickListener(this);
        }
        {
            K108 = (ImageView) findViewById(R.id.K108);
            K108.setOnClickListener(this);
        }


        {
            prevK28 = (ImageView) findViewById(R.id.prevK28);

            prevK28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp8 = new Intent(getApplicationContext(), Kuis7.class);
                    startActivity(kp8);
                    finish();
                }
            });
        }
        {
            nextK18 = (ImageView) findViewById(R.id.nextK18);

            nextK18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn8 = new Intent(getApplicationContext(), Kuis2.class);
                    startActivity(kn8);
                    finish();
                }
            });
        }
    }

    private void playSound(int k8) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k8 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k8 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k8 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k8 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k8 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis8, menu);
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
            case R.id.K88:
                playSound(1);
                break;

            case R.id.K68:
                playSound(2);
                break;

            case R.id.K78:
                playSound(3);
                break;

            case R.id.K98:
                playSound(4);
                break;

            case R.id.K108:
                playSound(5);
                break;
        }
    }
}
