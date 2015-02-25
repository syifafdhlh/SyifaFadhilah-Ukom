package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenulisTiga extends ActionBarActivity {
    ImageView nextttiga;
    ImageView homettiga;
    ImageView prevttiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulis_tiga);
        nextttiga = (ImageView) findViewById(R.id.nextttiga);
        {
            nextttiga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nte = new Intent(getApplicationContext(), MenulisEmpat.class);
                    startActivity(nte);
                    finish();
                }
            });
        }



        {
            prevttiga = (ImageView) findViewById(R.id.prevttiga);

            prevttiga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pte = new Intent(getApplicationContext(), MenulisDua.class);
                    startActivity(pte);
                    finish();
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menulis_tiga, menu);
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
