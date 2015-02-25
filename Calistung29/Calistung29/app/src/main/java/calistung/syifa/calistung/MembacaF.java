package calistung.syifa.calistung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MembacaF extends ActionBarActivity {


    ImageView nextf;
    ImageView prevf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca_f);

        {
            prevf = (ImageView) findViewById(R.id.prevf);

            prevf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pf = new Intent(getApplicationContext(),MembacaE.class);
                    startActivity(pf);
                    finish();
                }
            });
        }

        {
            nextf = (ImageView) findViewById(R.id.nextf);

            nextf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ng = new Intent(getApplicationContext(),MembacaG.class);
                    startActivity(ng);
                    finish();
                }
            });
        }


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
}
