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


public class KuisE extends ActionBarActivity implements View.OnClickListener{
    ImageView prevKE;
    ImageView nextKE;
    MediaPlayer mediaPlayer;
    private ImageView KSe;
    private ImageView KBe;
    private ImageView KAe;
    private ImageView KCe;
    private ImageView KDe;
    private ImageView KEe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_e);

        {
            KSe = (ImageView) findViewById(R.id.KSe);
            KSe.setOnClickListener(this);
        }
        {
            KAe = (ImageView) findViewById(R.id.KAe);
            KAe.setOnClickListener(this);
        }
        {
            KBe = (ImageView) findViewById(R.id.KBe);
            KBe.setOnClickListener(this);
        }
        {
            KCe = (ImageView) findViewById(R.id.KCe);
            KCe.setOnClickListener(this);
        }
        {
            KDe = (ImageView) findViewById(R.id.KDe);
            KDe.setOnClickListener(this);
        }
        {
            KEe = (ImageView) findViewById(R.id.KEe);
            KEe.setOnClickListener(this);
        }

        {
            prevKE = (ImageView) findViewById(R.id.prevKD);

            prevKE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kpe = new Intent(getApplicationContext(), KuisD.class);
                    startActivity(kpe);
                    finish();
                }
            });
        }
    }

    private void playSound(int ke) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (ke == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bacae);
        } else if (ke == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        }else if (ke == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ke == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ke == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ke == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis_e, menu);
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
            case R.id.KSe:
                playSound(1);
                break;

            case R.id.KEe:
                playSound(2);
                break;

            case R.id.KAe:
                playSound(3);
                break;

            case R.id.KCe:
                playSound(4);
                break;

            case R.id.KDe:
                playSound(5);
                break;

            case R.id.KBe:
                playSound(5);
                break;


        }




    }
}
