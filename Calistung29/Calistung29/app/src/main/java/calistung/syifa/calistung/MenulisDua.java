package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenulisDua extends ActionBarActivity {
    ImageView nexttdua;
    ImageView hometdua;
    ImageView prevtdua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menulis_dua);
        {
            nexttdua = (ImageView) findViewById(R.id.nexttdua);

            nexttdua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ntd = new Intent(getApplicationContext(), MenulisTiga.class);
                    startActivity(ntd);
                    finish();
                }
            });
        }




        {
            prevtdua = (ImageView) findViewById(R.id.prevtdua);

            prevtdua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ptd = new Intent(getApplicationContext(), MenulisSatu.class);
                    startActivity(ptd);
                    finish();
                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menulis_dua, menu);
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
