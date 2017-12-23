package com.fisal.madinaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by fisal on 23/12/2017.
 */

class EventPageAdapter extends FragmentStatePagerAdapter {

    private String Event_menu = "Events";

    public EventPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    private static int NUM_ITEMS = 1;

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {

        return EventFragment.newInstance(1, "Events");

    }


    // @Override
    public CharSequence getPageTitle(int position) {
        //CharSequence title = null;

        return Event_menu;

    }


}
