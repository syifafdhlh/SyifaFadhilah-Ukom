package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Menghitung9 extends ActionBarActivity {

    ImageView nextsembilan;
    ImageView prevsembilan;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung9);

        nextsembilan = (ImageView) findViewById(R.id.nextsembilan);

        nextsembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nsembilan = new Intent(getApplicationContext(),Menghitung10.class);
                startActivity(nsembilan);
                finish();
            }
        });

        {
            prevsembilan = (ImageView) findViewById(R.id.prevsembilan);

            prevsembilan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent psembilan = new Intent(getApplicationContext(),Menghitung8.class);
                    startActivity(psembilan);
                    finish();
                }
            });
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menghitung9, menu);
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
