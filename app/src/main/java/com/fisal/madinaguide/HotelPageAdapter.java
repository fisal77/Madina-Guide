package com.fisal.madinaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by fisal on 23/12/2017.
 */

class HotelPageAdapter extends FragmentStatePagerAdapter {

    private String Hotel_menu = "Hotels";

    public HotelPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    private static int NUM_ITEMS = 1;

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {

        return HotelFragment.newInstance(1, "Hotels");

    }


    // @Override
    public CharSequence getPageTitle(int position) {
        //CharSequence title = null;

        return Hotel_menu;

    }


}
