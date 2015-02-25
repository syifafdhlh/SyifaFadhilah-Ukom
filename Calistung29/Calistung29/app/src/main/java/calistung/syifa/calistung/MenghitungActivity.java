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


public class MenghitungActivity extends ActionBarActivity implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.satu:
                playSound(1);
                break;

            case R.id.gsatu:
                playSound(2);
                break;

        }

    }


    ImageView nextsatu;
    private MediaPlayer mediaPlayer;
    private ImageView satu;
    private ImageView gsatu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung);

        {
            satu = (ImageView) findViewById(R.id.satu);
            satu.setOnClickListener(this);
        }

        {
            gsatu = (ImageView) findViewById(R.id.gsatu);
            gsatu.setOnClickListener(this);
        }

        {

            nextsatu = (ImageView) findViewById(R.id.nextsatu);

            nextsatu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nsatu = new Intent(getApplicationContext(), Menghitung2.class);
                    startActivity(nsatu);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.satu);
        }
        else if (aa == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.satu);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung, menu);
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
}
