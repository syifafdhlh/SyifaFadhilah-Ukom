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


public class KuisA extends ActionBarActivity implements View.OnClickListener {


    MediaPlayer mediaPlayer;
    private ImageView KSa;
    private ImageView KBa;
    private ImageView KAa;
    private ImageView KCa;
    private ImageView KDa;
    private ImageView KEa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        {
            KSa = (ImageView) findViewById(R.id.KSa);
            KSa.setOnClickListener(this);
        }
        {
            KAa = (ImageView) findViewById(R.id.KAa);
            KAa.setOnClickListener(this);
            {
                KAa = (ImageView) findViewById(R.id.KAa);

                KAa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kaa = new Intent(getApplicationContext(), Kuis7.class);
                        startActivity(kaa);
                        finish();
                    }
                });
            }

        }
        {
            KBa = (ImageView) findViewById(R.id.KBa);
            KBa.setOnClickListener(this);

            {
                KBa = (ImageView) findViewById(R.id.KBa);

                KBa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kba = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(kba);
                        finish();
                    }
                });
            }
        }
        {
            KCa = (ImageView) findViewById(R.id.KCa);
            KCa.setOnClickListener(this);
            {
                KCa = (ImageView) findViewById(R.id.KCa);

                KCa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kca = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(kca);
                        finish();
                    }
                });
            }
        }
        {
            KDa = (ImageView) findViewById(R.id.KDa);
            KDa.setOnClickListener(this);
            {
                KDa = (ImageView) findViewById(R.id.KDa);

                KDa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kda = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(kda);
                        finish();
                    }
                });
            }
        }
        {
            KEa = (ImageView) findViewById(R.id.KEa);
            KEa.setOnClickListener(this);
            {
                KEa = (ImageView) findViewById(R.id.KEa);

                KEa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kea = new Intent(getApplicationContext(), Salah.class);
                        playSound(5);
                        startActivity(kea);
                        finish();
                    }
                });
            }
        }


    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch(Exception a){

        }


    }

    private void playSound(int ka) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (ka == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bacaa);
        } else if (ka == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ka == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ka == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (ka == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

    }
        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis, menu);
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
            case R.id.KSa:
                playSound(1);
                break;

            case R.id.KBa:
                playSound(2);
                break;

            case R.id.KCa:
                playSound(3);
                break;

            case R.id.KDa:
                playSound(4);
                break;

            case R.id.KEa:
                playSound(5);
                break;

        }

    }

}
