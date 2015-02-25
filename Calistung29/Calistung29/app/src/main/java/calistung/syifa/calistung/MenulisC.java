package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenulisC extends ActionBarActivity {
    ImageView nexttc;
    ImageView prevtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulis_c);

        {
            nexttc = (ImageView) findViewById(R.id.nexttc);

            nexttc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ntc = new Intent(getApplicationContext(), MenulisD.class);
                    startActivity(ntc);
                    finish();
                }
            });
        }

        {
            prevtc = (ImageView) findViewById(R.id.prevtc);

            prevtc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptc = new Intent(getApplicationContext(), MenulisA.class);
                    startActivity(ptc);
                    finish();
                }
            });
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menulis_c, menu);
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
