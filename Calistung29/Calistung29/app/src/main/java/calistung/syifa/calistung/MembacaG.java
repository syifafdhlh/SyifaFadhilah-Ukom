package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MembacaG extends ActionBarActivity {

    ImageView nextg;
    ImageView prevg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca_g);

        {
            prevg = (ImageView) findViewById(R.id.prevg);

            prevg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pg = new Intent(getApplicationContext(),MembacaF.class);
                    startActivity(pg);
                    finish();
                }
            });
        }

        {
            nextg = (ImageView) findViewById(R.id.nextg);

            nextg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ng = new Intent(getApplicationContext(),MembacaH.class);
                    startActivity(ng);
                    finish();
                }
            });
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_g, menu);
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
