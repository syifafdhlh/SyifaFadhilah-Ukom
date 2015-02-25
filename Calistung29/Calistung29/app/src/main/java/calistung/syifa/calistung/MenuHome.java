package calistung.syifa.calistung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MenuHome extends ActionBarActivity {

    ImageView baca;
    ImageView imageView2;
    ImageView imageView3;
    ImageView img4;
    ImageView imageView4;
    ImageView imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);
        {
            baca = (ImageView) findViewById(R.id.imageView);

            baca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent baca = new Intent(getApplicationContext(), MembacaActivity.class);
                    startActivity(baca);
                }
            });
        }

            {
                imageView2 = (ImageView) findViewById(R.id.imageView2);

                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ngitung = new Intent(getApplicationContext(), MenghitungActivity.class);
                        startActivity(ngitung);
                    }
                });
            }


        {
            imageView3 = (ImageView) findViewById(R.id.imageView3);

            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nulisa = new Intent(getApplicationContext(), MenulisActivity.class);
                    startActivity(nulisa);
                }
            });

        }

        {
            img4 = (ImageView) findViewById(R.id.img4);

            img4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nulisatu = new Intent(getApplicationContext(), MenulisSatu.class);
                    startActivity(nulisatu);
                }
            });
        }

        {
            imageView4 = (ImageView) findViewById(R.id.imageView4);

            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kuis = new Intent(getApplicationContext(), Kuis5.class);
                    startActivity(kuis);
                }
            });
        }
        {
            imageView5 = (ImageView) findViewById(R.id.imageView5);

            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ttg = new Intent(getApplicationContext(), About.class);
                    startActivity(ttg);
                }
            });
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_home, menu);
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
