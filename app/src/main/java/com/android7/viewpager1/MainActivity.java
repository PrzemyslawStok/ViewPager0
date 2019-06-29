package com.android7.viewpager1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment2.OnFragmentInteractionListener {

    @Override
    public void onButtonOkClicked(int no) {
        Toast.makeText(this,"asdfsdfs",Toast.LENGTH_SHORT).show();
    }

    class fragmentAdapter extends FragmentStatePagerAdapter{

        public fragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            Fragment0 fragment0 = new Fragment0();
            fragment0.setListener(new Fragment0.OnFragment0Listener() {
                @Override
                public void onButton0Clicked() {
                    Toast.makeText(MainActivity.this,"Button0 clicked",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void wyswietlTekst(String tekst) {
                    Toast.makeText(MainActivity.this,tekst,Toast.LENGTH_SHORT).show();
                }
            });

            return fragment0;

            /*if(i>2)
                return new BlankFragment();
            else
                return BlankFragment2.newInstance("Pierwszy napis","Kolejny napis");*/
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "page "+(position+1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ViewPager pager = findViewById(R.id.viewpager);

        pager.setAdapter(new fragmentAdapter(getSupportFragmentManager()));


        /*FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout,new BlankFragment());
        ft.commit();*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
