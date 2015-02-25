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


public class KuisD extends ActionBarActivity implements View.OnClickListener{

    ImageView prevKD;
    ImageView nextKD;
    MediaPlayer mediaPlayer;
    private ImageView KSd;
    private ImageView KBd;
    private ImageView KAd;
    private ImageView KCd;
    private ImageView KDd;
    private ImageView KEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_d);

        {
            KSd = (ImageView) findViewById(R.id.KSd);
            KSd.setOnClickListener(this);
        }
        {
            KAd = (ImageView) findViewById(R.id.KAd);
            KAd.setOnClickListener(this);
        }
        {
            KBd = (ImageView) findViewById(R.id.KBd);
            KBd.setOnClickListener(this);
        }
        {
            KCd = (ImageView) findViewById(R.id.KCd);
            KCd.setOnClickListener(this);
        }
        {
            KDd = (ImageView) findViewById(R.id.KDd);
            KDd.setOnClickListener(this);
        }
        {
            KEd = (ImageView) findViewById(R.id.KEd);
            KEd.setOnClickListener(this);
        }

        {
            prevKD = (ImageView) findViewById(R.id.prevKD);

            prevKD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kpd = new Intent(getApplicationContext(), KuisC.class);
                    startActivity(kpd);
                    finish();
                }
            });
        }

        {
            nextKD = (ImageView) findViewById(R.id.nextKD);

            nextKD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kpd = new Intent(getApplicationContext(), KuisE.class);
                    startActivity(kpd);
                    finish();
                }
            });
        }
    }

    private void playSound(int kd) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (kd == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.de);
        } else if (kd == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        }else if (kd == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kd == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kd == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kd == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis_d, menu);
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
            case R.id.KSd:
                playSound(1);
                break;

            case R.id.KDd:
                playSound(2);
                break;

            case R.id.KAd:
                playSound(3);
                break;

            case R.id.KCd:
                playSound(4);
                break;

            case R.id.KEd:
                playSound(5);
                break;

            case R.id.KBd:
                playSound(5);
                break;


        }


    }
}
