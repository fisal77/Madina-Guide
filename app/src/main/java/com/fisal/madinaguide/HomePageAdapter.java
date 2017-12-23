package com.fisal.madinaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by fisal on 23/12/2017.
 */

class HomePageAdapter extends FragmentStatePagerAdapter {

    private String Home_menu = "Home";

    public HomePageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    private static int NUM_ITEMS = 5;

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return HomeFragment.newInstance(0, Home_menu);
            case 1:
                return HistoricalSiteFragment.newInstance(1, "Historical Sites");
            case 2:
                return HotelFragment.newInstance(2, "Hotels");
            case 3:
                return RestaurantFragment.newInstance(3, "Restaurants");
            case 4:
                return EventFragment.newInstance(4, "Events");
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        switch (position) {
            case 0:
                title = Home_menu;
                break;
            case 1:
                title = "Historical Locations";
                break;
            case 2:
                title = "Hotels";
                break;
            case 3:
                title = "Restaurants";
                break;
            case 4:
                title = "Events";
                break;
            default:
                title = R.string.page_position + "" + position;
                break;
        }

        return title;
    }

}
