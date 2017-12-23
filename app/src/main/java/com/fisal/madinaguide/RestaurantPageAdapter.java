package com.fisal.madinaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by fisal on 23/12/2017.
 */

class RestaurantPageAdapter extends FragmentStatePagerAdapter {

    private String Restaurant_menu = "Restaurants";

    public RestaurantPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    private static int NUM_ITEMS = 1;

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {

        return RestaurantFragment.newInstance(1, "Restaurants");
    }


    // @Override
    public CharSequence getPageTitle(int position) {
        //CharSequence title = null;

        return Restaurant_menu;

    }


}
