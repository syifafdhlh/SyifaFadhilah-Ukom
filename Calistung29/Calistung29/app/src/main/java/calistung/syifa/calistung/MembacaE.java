package calistung.syifa.calistung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MembacaE extends ActionBarActivity implements View.OnClickListener {

    ImageView nexte;
    ImageView preve;
    private MediaPlayer mediaPlayer;
    private ImageView ee;
    private ImageView ember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membacae);

        {
           ee = (ImageView) findViewById(R.id.Ee);
            ee.setOnClickListener(this);
        }

        {
            ember = (ImageView) findViewById(R.id.ember);
            ember.setOnClickListener(this);
        }



        {
            preve = (ImageView) findViewById(R.id.preve);

            preve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pe = new Intent(getApplicationContext(),MembacaD.class);
                    startActivity(pe);
                    finish();
                }
            });
        }

        {
            nexte = (ImageView) findViewById(R.id.nexte);

            nexte.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ne = new Intent(getApplicationContext(),MembacaF.class);
                    startActivity(ne);
                    finish();
                }
            });
        }


    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch(Exception e){

        }


    }

    private void playSound(int bacae) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception e) {
            Log.e("error", "blablabla");
        }


        if (bacae == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bacae);
        } else if (bacae == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ember);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_e, menu);
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
            case R.id.Ee:
                playSound(1);
                break;

            case R.id.ember:
                playSound(2);
                break;

        }

    }
    }
