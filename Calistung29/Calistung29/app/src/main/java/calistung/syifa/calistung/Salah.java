package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Salah extends ActionBarActivity {

    ImageView back;
    ImageView ulang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah);

        {
            back = (ImageView) findViewById(R.id.back);

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent back = new Intent(getApplicationContext(), MenuHome.class);
                    startActivity(back);
                    finish();
                }
            });
        }

        {
            ulang = (ImageView) findViewById(R.id.ulang);

            ulang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ulg = new Intent(getApplicationContext(), Kuis5.class);
                    startActivity(ulg);
                    finish();
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_salah, menu);
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
