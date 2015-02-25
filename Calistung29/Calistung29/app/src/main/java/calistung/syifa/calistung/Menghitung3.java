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


public class Menghitung3 extends ActionBarActivity implements View.OnClickListener {

    ImageView nexttiga;
    ImageView prevtiga;
    private MediaPlayer mediaPlayer;
    private ImageView tiga;
    private ImageView gtiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung3);

        {
            tiga = (ImageView) findViewById(R.id.tiga);
            tiga.setOnClickListener(this);
        }

        {
            gtiga = (ImageView) findViewById(R.id.gtiga);
            gtiga.setOnClickListener(this);
        }

        nexttiga = (ImageView) findViewById(R.id.nexttiga);

        nexttiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ntiga = new Intent(getApplicationContext(),Menghitung4.class);
                startActivity(ntiga);
                finish();
            }
        });

        {
            prevtiga = (ImageView) findViewById(R.id.prevtiga);

            prevtiga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptiga = new Intent(getApplicationContext(),Menghitung2.class);
                    startActivity(ptiga);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.tiga);
        }
        else if (aa == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.tiga);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung3, menu);
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
            case R.id.tiga:
                playSound(1);
                break;

            case R.id.gtiga:
                playSound(2);
                break;

        }


    }
}
