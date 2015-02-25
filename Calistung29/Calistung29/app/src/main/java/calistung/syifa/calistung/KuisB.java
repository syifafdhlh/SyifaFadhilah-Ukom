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


public class KuisB extends ActionBarActivity implements View.OnClickListener{

    MediaPlayer mediaPlayer;
    private ImageView KSb;
    private ImageView KBb;
    private ImageView KAb;
    private ImageView KCb;
    private ImageView KDb;
    private ImageView KEb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_b);

        {
            KSb = (ImageView) findViewById(R.id.KSb);
            KSb.setOnClickListener(this);
        }

        {
            KAb = (ImageView) findViewById(R.id.KAb);
            KAb.setOnClickListener(this);
            {
                KAb = (ImageView) findViewById(R.id.KAb);

                KAb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kab = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(kab);
                        finish();
                    }
                });
            }
        }

        {
            KBb = (ImageView) findViewById(R.id.KBb);
            KBb.setOnClickListener(this);
            {
                KBb = (ImageView) findViewById(R.id.KBb);

                KBb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kbb = new Intent(getApplicationContext(), Benar.class);
                        playSound(2);
                        startActivity(kbb);
                        finish();
                    }
                });
            }
        }

        {
            KCb = (ImageView) findViewById(R.id.KCb);
            KCb.setOnClickListener(this);
            {
                KCb = (ImageView) findViewById(R.id.KCb);

                KCb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kcb = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(kcb);
                        finish();
                    }
                });
            }
        }

        {
            KDb = (ImageView) findViewById(R.id.KDb);
            KDb.setOnClickListener(this);
            {
                KDb = (ImageView) findViewById(R.id.KDb);

                KDb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kdb = new Intent(getApplicationContext(), Salah.class);
                        playSound(5);
                        startActivity(kdb);
                        finish();
                    }
                });
            }
        }

        {
            KEb = (ImageView) findViewById(R.id.KEb);
            KEb.setOnClickListener(this);
            {
                KEb = (ImageView) findViewById(R.id.KEb);

                KEb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent keb = new Intent(getApplicationContext(), Salah.class);
                        playSound(6);
                        startActivity(keb);
                        finish();
                    }
                });
            }
        }

    }

    private void playSound(int kb) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (kb == 1) {
            mediaPlayer = MediaPlayer.create(this, R.raw.be);
        } else if (kb == 2) {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        }else if (kb == 3) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kb == 4) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kb == 5) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        } else if (kb == 6) {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis_b, menu);
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
            case R.id.KSb:
                playSound(1);
                break;

            case R.id.KBb:
                playSound(2);
                break;

            case R.id.KAb:
                playSound(3);
                break;

            case R.id.KCb:
                playSound(4);
                break;

            case R.id.KDb:
                playSound(5);
                break;

            case R.id.KEb:
                playSound(6);
                break;


        }
    }
}
