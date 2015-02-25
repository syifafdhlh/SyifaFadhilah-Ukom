package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MembacaH extends ActionBarActivity {

    ImageView nexth;
    ImageView prevh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca_h);

        {
            prevh = (ImageView) findViewById(R.id.prevh);

            prevh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ph = new Intent(getApplicationContext(),MembacaG.class);
                    startActivity(ph);
                    finish();
                }
            });
        }

        {
            nexth = (ImageView) findViewById(R.id.nexth);

            nexth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nh = new Intent(getApplicationContext(),MembacaI.class);
                    startActivity(nh);
                    finish();
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_membaca_h, menu);
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
