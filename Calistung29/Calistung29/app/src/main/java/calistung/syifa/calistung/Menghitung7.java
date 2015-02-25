package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Menghitung7 extends ActionBarActivity {

    ImageView nexttujuh;
    ImageView prevtujuh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung7);

        nexttujuh = (ImageView) findViewById(R.id.nexttujuh);

        nexttujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ntujuh = new Intent(getApplicationContext(),Menghitung8.class);
                startActivity(ntujuh);
                finish();
            }
        });

        {
            prevtujuh = (ImageView) findViewById(R.id.prevtujuh);

            prevtujuh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptujuh = new Intent(getApplicationContext(),Menghitung6.class);
                    startActivity(ptujuh);
                    finish();
                }
            });
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung7, menu);
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
