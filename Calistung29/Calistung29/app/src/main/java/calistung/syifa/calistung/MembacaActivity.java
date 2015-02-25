package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.util.Log;


public class MembacaActivity extends ActionBarActivity implements View.OnClickListener {

    ImageView nexta;
    private MediaPlayer mediaPlayer;
    private ImageView Aa;
    private ImageView sapel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca);
        {
            Aa = (ImageView) findViewById(R.id.Aa);
            Aa.setOnClickListener(this);
        }

        {
            sapel = (ImageView) findViewById(R.id.sapel);
            sapel.setOnClickListener(this);
        }


        {
            nexta = (ImageView) findViewById(R.id.nexta);

            nexta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(getApplicationContext(), MembacaB.class);
                    startActivity(a);
                    finish();
                }
            });
        }




    }


    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch(Exception a){

        }


    }

    private void playSound(int arg) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (arg == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bacaa);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.apel);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca, menu);
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
            case R.id.Aa:
                playSound(1);
                break;

            case R.id.sapel:
                playSound(2);
                break;

        }

    }
    }