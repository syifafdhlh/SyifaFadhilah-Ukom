package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenulisA extends ActionBarActivity {
    ImageView nexttb;
    ImageView prevtb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulis2);

        {
            nexttb = (ImageView) findViewById(R.id.nexttb);

            nexttb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ntb = new Intent(getApplicationContext(), MenulisC.class);
                    startActivity(ntb);
                    finish();
                }
            });
        }

        {
            prevtb = (ImageView) findViewById(R.id.prevtb);

            prevtb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptb = new Intent(getApplicationContext(), MenulisActivity.class);
                    startActivity(ptb);
                    finish();
                }
            });
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menulis, menu);
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
