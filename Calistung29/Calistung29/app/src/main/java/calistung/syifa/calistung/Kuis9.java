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


public class Kuis9 extends ActionBarActivity implements View.OnClickListener{
    ImageView prevK29;
    ImageView nextK19;
    MediaPlayer mediaPlayer;
    private ImageView KS19;
    private ImageView K69;
    private ImageView K79;
    private ImageView K89;
    private ImageView K99;
    private ImageView K109;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis9);


        {
            K69 = (ImageView) findViewById(R.id.K69);
            K69.setOnClickListener(this);
        }
        {
            K79 = (ImageView) findViewById(R.id.K79);
            K79.setOnClickListener(this);
        }
        {
            K89 = (ImageView) findViewById(R.id.K89);
            K89.setOnClickListener(this);
        }
        {
            K99 = (ImageView) findViewById(R.id.K99);
            K99.setOnClickListener(this);
        }
        {
            K109 = (ImageView) findViewById(R.id.K109);
            K109.setOnClickListener(this);
        }


        {
            prevK29 = (ImageView) findViewById(R.id.prevK29);

            prevK29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kp9 = new Intent(getApplicationContext(), Kuis4.class);
                    startActivity(kp9);
                    finish();
                }
            });
        }
        {
            nextK19 = (ImageView) findViewById(R.id.nextK19);

            nextK19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kn9 = new Intent(getApplicationContext(), Kuis10.class);
                    startActivity(kn9);
                    finish();
                }
            });
        }
    }


    private void playSound(int k9) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (k9 == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        } else if (k9 == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k9 == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k9 == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (k9 == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis9, menu);
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
        switch (v.getId()) {
            case R.id.K99:
                playSound(1);
                break;

            case R.id.K69:
                playSound(2);
                break;

            case R.id.K89:
                playSound(3);
                break;

            case R.id.K109:
                playSound(4);
                break;

            case R.id.K79:
                playSound(5);
                break;


        }
    }
}
