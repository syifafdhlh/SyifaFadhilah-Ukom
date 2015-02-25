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


public class Menghitung5 extends ActionBarActivity implements View.OnClickListener {

    ImageView nextlima;
    ImageView prevlima;
    private MediaPlayer mediaPlayer;
    private ImageView lima;
    private ImageView glima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung5);

        {
            lima = (ImageView) findViewById(R.id.lima);
            lima.setOnClickListener(this);
        }

        {
            glima = (ImageView) findViewById(R.id.glima);
            glima.setOnClickListener(this);
        }

        nextlima = (ImageView) findViewById(R.id.nextlima);

        nextlima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nlima = new Intent(getApplicationContext(),Menghitung6.class);
                startActivity(nlima);
                finish();
            }
        });

        {
            prevlima = (ImageView) findViewById(R.id.prevlima);

            prevlima.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent plima = new Intent(getApplicationContext(),Menghitung4.class);
                    startActivity(plima);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.lima);
        }
        else if (aa == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.lima);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung5, menu);
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
            case R.id.lima:
                playSound(1);
                break;

            case R.id.glima:
                playSound(2);
                break;

        }

    }
}
