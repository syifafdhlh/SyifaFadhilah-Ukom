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


public class MembacaC extends ActionBarActivity implements View.OnClickListener {

    ImageView nextc;
    ImageView homec;
    ImageView prevc;
    private MediaPlayer mediaPlayer;
    private ImageView Cc;
    private ImageView ca;
    private ImageView ci;
    private ImageView cu;
    private ImageView ce;
    private ImageView co;
    private ImageView cangkul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membacac);

        {
            Cc = (ImageView) findViewById(R.id.Cc);
            Cc.setOnClickListener(this);
        }
        {
            ca = (ImageView) findViewById(R.id.ca);
            ca.setOnClickListener(this);
        }
        {
            ci = (ImageView) findViewById(R.id.ci);
            ci.setOnClickListener(this);
        }
        {
            cu = (ImageView) findViewById(R.id.cu);
            cu.setOnClickListener(this);
        }
        {
            ce = (ImageView) findViewById(R.id.ce);
            ce.setOnClickListener(this);
        }
        {
            co = (ImageView) findViewById(R.id.co);
            co.setOnClickListener(this);
        }
        {
            cangkul = (ImageView) findViewById(R.id.cangkul);
            cangkul.setOnClickListener(this);
        }
        {
            nextc = (ImageView) findViewById(R.id.nextc);

            nextc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nc = new Intent(getApplicationContext(), MembacaD.class);
                    startActivity(nc);
                    finish();
                }
            });
        }

        {
            prevc = (ImageView) findViewById(R.id.prevc);

            prevc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pc = new Intent(getApplicationContext(), MembacaB.class);
                    startActivity(pc);
                    finish();
                }
            });
        }



    }


    public void OnPause() {
        try {
            super.onPause();
            mediaPlayer.pause();
        } catch (Exception c) {

        }


    }

    private void playSound(int bacac) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception c) {
            Log.e("error", "blablabla");
        }


        if (bacac == 8) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ce);
        } else if (bacac == 9) {
            mediaPlayer = MediaPlayer.create(this, R.raw.cangkul);
        } else if (bacac == 10) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ca);
        } else if (bacac == 11) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ci);
        } else if (bacac == 12) {
            mediaPlayer = MediaPlayer.create(this, R.raw.cu);
        } else if (bacac == 13) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ce);
        } else if (bacac == 14) {
            mediaPlayer = MediaPlayer.create(this, R.raw.co);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_c, menu);
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
            case R.id.Cc:
                playSound(8);
                break;

            case R.id.cangkul:
                playSound(9);
                break;

            case R.id.ca:
                playSound(10);
                break;

            case R.id.ci:
                playSound(11);
                break;

            case R.id.cu:
                playSound(12);
                break;

            case R.id.ce:
                playSound(13);
                break;

            case R.id.co:
                playSound(14);
                break;
        }

    }
}
