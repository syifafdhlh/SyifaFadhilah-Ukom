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


public class MembacaB extends ActionBarActivity implements View.OnClickListener {

    ImageView nextb;
    ImageView prevb;
    private MediaPlayer mediaPlayer;
    private ImageView Bb;
    private ImageView ba;
    private ImageView bi;
    private ImageView bu;
    private ImageView be;
    private ImageView bo;
    private ImageView bola;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membacab);

        {
            Bb = (ImageView) findViewById(R.id.Bb);
            Bb.setOnClickListener(this);
        }
        {
            ba = (ImageView) findViewById(R.id.ba);
            ba.setOnClickListener(this);
        }
        {
            bi = (ImageView) findViewById(R.id.bi);
            bi.setOnClickListener(this);
        }
        {
            bu = (ImageView) findViewById(R.id.bu);
            bu.setOnClickListener(this);
        }
        {
            be = (ImageView) findViewById(R.id.be);
            be.setOnClickListener(this);
        }
        {
            bo = (ImageView) findViewById(R.id.bo);
            bo.setOnClickListener(this);
        }
        {
            bola = (ImageView) findViewById(R.id.bola);
            bola.setOnClickListener(this);
        }

    {
        nextb = (ImageView) findViewById(R.id.nextb);

        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), MembacaC.class);
                startActivity(b);
                finish();
            }
        });
    }

        {
            prevb = (ImageView) findViewById(R.id.prevb);

            prevb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pb = new Intent(getApplicationContext(),MembacaActivity.class);
                    startActivity(pb);
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

    private void playSound(int bacab) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception b) {
            Log.e("error", "blablabla");
        }


        if (bacab == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.be);
        }
        else if (bacab == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.bola);
        }
        else if (bacab == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.ba);
        }
        else if (bacab == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.bi);
        }
        else if (bacab == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.bu);
        }
        else if (bacab == 6){
            mediaPlayer = MediaPlayer.create(this, R.raw.be);
        }
        else if (bacab == 7){
            mediaPlayer = MediaPlayer.create(this, R.raw.bo);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_b, menu);
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
            case R.id.Bb:
                playSound(1);
                break;

            case R.id.bola:
                playSound(2);
                break;

            case R.id.ba:
                playSound(3);
                break;

            case R.id.bi:
                playSound(4);
                break;

            case R.id.bu:
                playSound(5);
                break;

            case R.id.be:
                playSound(6);
                break;

            case R.id.bo:
                playSound(7);
                break;
        }

    }
}
