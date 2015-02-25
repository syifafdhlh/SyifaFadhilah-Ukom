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


public class Menghitung4 extends ActionBarActivity implements View.OnClickListener {

    ImageView nextempat;
    ImageView prevempat;
    private MediaPlayer mediaPlayer;
    private ImageView empat;
    private ImageView gempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung4);

        {
            empat = (ImageView) findViewById(R.id.empat);
            empat.setOnClickListener(this);
        }

        {
            gempat = (ImageView) findViewById(R.id.gempat);
            gempat.setOnClickListener(this);
        }

        nextempat = (ImageView) findViewById(R.id.nextempat);

        nextempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nempat = new Intent(getApplicationContext(),Menghitung5.class);
                startActivity(nempat);
                finish();
            }
        });

        {
            prevempat = (ImageView) findViewById(R.id.prevempat);

            prevempat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pempat = new Intent(getApplicationContext(),Menghitung3.class);
                    startActivity(pempat);
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

    private void playSound(int aa) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (aa == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.empat);
        }
        else if (aa == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.empat);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung4, menu);
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
            case R.id.empat:
                playSound(1);
                break;

            case R.id.gempat:
                playSound(2);
                break;

        }


    }
}
