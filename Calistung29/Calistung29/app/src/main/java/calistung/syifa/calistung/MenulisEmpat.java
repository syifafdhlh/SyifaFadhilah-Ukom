package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenulisEmpat extends ActionBarActivity {
    ImageView nexttempat;
    ImageView prevtempat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulis_empat);
        {
            nexttempat = (ImageView) findViewById(R.id.nexttempat);

            nexttempat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ntt = new Intent(getApplicationContext(), MenulisLima.class);
                    startActivity(ntt);
                    finish();
                }
            });
        }



        {
            prevtempat = (ImageView) findViewById(R.id.prevtempat);

            prevtempat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptt = new Intent(getApplicationContext(), MenulisTiga.class);
                    startActivity(ptt);
                    finish();
                }
            });

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menulis_empat, menu);
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
