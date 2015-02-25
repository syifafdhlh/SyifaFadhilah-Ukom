package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Menghitung6 extends ActionBarActivity {

    ImageView nextenam;
    ImageView prevenam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung6);

        nextenam = (ImageView) findViewById(R.id.nextenam);

        nextenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nenam = new Intent(getApplicationContext(),Menghitung7.class);
                startActivity(nenam);
                finish();
            }
        });

        {
            prevenam = (ImageView) findViewById(R.id.prevenam);

            prevenam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent penam = new Intent(getApplicationContext(),Menghitung5.class);
                    startActivity(penam);
                    finish();
                }
            });
        }


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
}
