package com.fisal.madinaguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        HomeFragment.OnFragmentInteractionListener,
        HistoricalSiteFragment.OnFragmentInteractionListener,
        HotelFragment.OnFragmentInteractionListener,
        RestaurantFragment.OnFragmentInteractionListener,
        EventFragment.OnFragmentInteractionListener {

    FragmentStatePagerAdapter adapterViewPager;
    ViewPager myViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myViewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tableLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tableLayout.setupWithViewPager(myViewPager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        drawer.openDrawer(navigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the home action
            adapterViewPager = new HomePageAdapter(getSupportFragmentManager());
            myViewPager.setAdapter(adapterViewPager);
            this.setTitle(R.string.nav_home);

        } else if (id == R.id.nav_historical_site) {
            // Handle the historical site action
            adapterViewPager = new HistoricalSitePageAdapter(getSupportFragmentManager());
            myViewPager.setAdapter(adapterViewPager);
            this.setTitle(R.string.nav_historical_site);

        } else if (id == R.id.nav_hotel) {
            adapterViewPager = new HotelPageAdapter(getSupportFragmentManager());
            myViewPager.setAdapter(adapterViewPager);
            this.setTitle(R.string.nav_hotel);

        } else if (id == R.id.nav_restaurant) {
            adapterViewPager = new RestaurantPageAdapter(getSupportFragmentManager());
            myViewPager.setAdapter(adapterViewPager);
            this.setTitle(R.string.nav_restaurant);

        } else if (id == R.id.nav_event) {
            adapterViewPager = new EventPageAdapter(getSupportFragmentManager());
            myViewPager.setAdapter(adapterViewPager);
            this.setTitle(R.string.nav_events);

        } else if (id == R.id.nav_share) {
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, "You can downloading our Madina Guide app. Just contact us: Fisal0707@gmail.com");
            shareIntent.setType("text/plain");
            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(shareIntent);

        } else if (id == R.id.nav_send) {
            //TODO Implicit Intent
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
