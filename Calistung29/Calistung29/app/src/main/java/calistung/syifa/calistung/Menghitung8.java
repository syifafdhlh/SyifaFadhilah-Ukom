package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Menghitung8 extends ActionBarActivity {

    ImageView nextdelapan;
    ImageView prevdelapan;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung8);

        nextdelapan = (ImageView) findViewById(R.id.nextdelapan);

        nextdelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ndelapan = new Intent(getApplicationContext(),Menghitung9.class);
                startActivity(ndelapan);
                finish();
            }
        });

        {
            prevdelapan = (ImageView) findViewById(R.id.prevdelapan);

            prevdelapan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pdelapan = new Intent(getApplicationContext(),Menghitung7.class);
                    startActivity(pdelapan);
                    finish();
                }
            });
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung8, menu);
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
