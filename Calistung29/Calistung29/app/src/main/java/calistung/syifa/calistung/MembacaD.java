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


public class MembacaD extends ActionBarActivity implements View.OnClickListener{

    ImageView nextd;
    ImageView prevd;
    private MediaPlayer mediaPlayer;
    private ImageView Dd;
    private ImageView da;
    private ImageView di;
    private ImageView du;
    private ImageView de;
    private ImageView doo;
    private ImageView domba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membacad);

        {
            Dd = (ImageView) findViewById(R.id.Dd);
            Dd.setOnClickListener(this);
        }
        {
            da = (ImageView) findViewById(R.id.da);
            da.setOnClickListener(this);
        }
        {
            di = (ImageView) findViewById(R.id.di);
            di.setOnClickListener(this);
        }
        {
            du = (ImageView) findViewById(R.id.du);
            du.setOnClickListener(this);
        }
        {
            de = (ImageView) findViewById(R.id.de);
            de.setOnClickListener(this);
        }
        {
            doo = (ImageView) findViewById(R.id.doo);
            doo.setOnClickListener(this);
        }
        {
            domba = (ImageView) findViewById(R.id.domba);
            domba.setOnClickListener(this);
        }

        {
            nextd = (ImageView) findViewById(R.id.nextd);

            nextd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nd = new Intent(getApplicationContext(), MembacaE.class);
                    startActivity(nd);
                    finish();
                }
            });
        }
        {
            prevd = (ImageView) findViewById(R.id.prevd);

            prevd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pd = new Intent(getApplicationContext(), MembacaC.class);
                startActivity(pd);
                finish();
            }
        });
    }


    }


    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch(Exception d){

        }


    }

    private void playSound(int bacad) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception d) {
            Log.e("error", "blablabla");
        }


        if (bacad == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.de);
        } else if (bacad == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.domba);
        } else if (bacad == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.da);
        } else if (bacad == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.di);
        } else if (bacad == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.du);
        } else if (bacad == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.de);
        } else if (bacad == 7) {
            mediaPlayer = MediaPlayer.create(this, R.raw.doo);
        }
        mediaPlayer.setLooping(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_d, menu);
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
            case R.id.Dd:
                playSound(1);
                break;

            case R.id.domba:
                playSound(2);
                break;

            case R.id.da:
                playSound(3);
                break;

            case R.id.di:
                playSound(4);
                break;

            case R.id.du:
                playSound(5);
                break;

            case R.id.de:
                playSound(6);
                break;

            case R.id.doo:
                playSound(7);
                break;
        }

    
        
    }
}
