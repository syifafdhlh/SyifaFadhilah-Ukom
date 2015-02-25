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


public class Menghitung2 extends ActionBarActivity implements View.OnClickListener {

    ImageView nextdua;
    ImageView prevdua;
    private MediaPlayer mediaPlayer;
    private ImageView dua;
    private ImageView gdua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung2);

        {
            dua = (ImageView) findViewById(R.id.dua);
            dua.setOnClickListener(this);
        }

        {
            gdua = (ImageView) findViewById(R.id.gdua);
            gdua.setOnClickListener(this);
        }

        nextdua = (ImageView) findViewById(R.id.nextdua);

        nextdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ndua = new Intent(getApplicationContext(),Menghitung3.class);
                startActivity(ndua);
                finish();
            }
        });

        {
            prevdua = (ImageView) findViewById(R.id.prevdua);

            prevdua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pdua = new Intent(getApplicationContext(),MenghitungActivity.class);
                    startActivity(pdua);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.dua);
        }
        else if (aa == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.dua);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung2, menu);
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
            case R.id.dua:
                playSound(1);
                break;

            case R.id.gdua:
                playSound(2);
                break;

        }


    }
}
