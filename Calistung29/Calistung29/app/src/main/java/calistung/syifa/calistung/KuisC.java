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


public class KuisC extends ActionBarActivity implements View.OnClickListener {

    ImageView prevKC;
    ImageView nextKC;
    MediaPlayer mediaPlayer;
    private ImageView KSc;
    private ImageView KBc;
    private ImageView KAc;
    private ImageView KCc;
    private ImageView KDc;
    private ImageView KEc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_c);

        {
            KSc = (ImageView) findViewById(R.id.KSc);
            KSc.setOnClickListener(this);
        }
        {
            KAc = (ImageView) findViewById(R.id.KAc);
            KAc.setOnClickListener(this);
        }
        {
            KBc = (ImageView) findViewById(R.id.KBc);
            KBc.setOnClickListener(this);
        }
        {
            KCc = (ImageView) findViewById(R.id.KCc);
            KCc.setOnClickListener(this);
        }
        {
            KDc = (ImageView) findViewById(R.id.KDc);
            KDc.setOnClickListener(this);
        }
        {
            KEc = (ImageView) findViewById(R.id.KEc);
            KEc.setOnClickListener(this);
        }

        {
            nextKC = (ImageView) findViewById(R.id.nextKC);

            nextKC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kc = new Intent(getApplicationContext(), KuisD.class);
                    startActivity(kc);
                    finish();
                }
            });
        }
        {
            prevKC = (ImageView) findViewById(R.id.prevKC);

            prevKC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kpc = new Intent(getApplicationContext(), KuisB.class);
                    startActivity(kpc);
                    finish();
                }
            });
        }
    }

    private void playSound(int kc) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (kc == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ce);
        } else if (kc == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (kc == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kc == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kc == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kc == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis_c, menu);
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
            case R.id.KSc:
                playSound(1);
                break;

            case R.id.KCc:
                playSound(2);
                break;

            case R.id.KAc:
                playSound(3);
                break;

            case R.id.KEc:
                playSound(4);
                break;

            case R.id.KDc:
                playSound(5);
                break;

            case R.id.KBc:
                playSound(6);
                break;


        }

    }
}
