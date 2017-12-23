package com.fisal.madinaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by fisal on 23/12/2017.
 */

class HistoricalSitePageAdapter extends FragmentStatePagerAdapter {

    private String HistoricalSite_menu = "Historical Location";


    public HistoricalSitePageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    private static int NUM_ITEMS = 1;

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
//        switch (position){
//
//            case 0:
        return HistoricalSiteFragment.newInstance(1, HistoricalSite_menu);
        // }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return HistoricalSite_menu;
    }
}



