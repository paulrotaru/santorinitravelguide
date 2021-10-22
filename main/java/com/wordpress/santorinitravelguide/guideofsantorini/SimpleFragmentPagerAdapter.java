package com.wordpress.santorinitravelguide.guideofsantorini;

/**
 * Created by proiect5 on 09/01/2018.
 */

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private Context mContext;


    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new santorini();
        } else if (position == 1) {
            return new sleep_and_eat();
        } else if (position == 2) {
            return new what_to_do();
        } else {
            return new save_money();
        }
    }
        @Override
        public int getCount () {
            return 4;
        }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.santorini_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.sleep_and_eat);
        } else if (position == 2) {
            return mContext.getString(R.string.what_to_do);
        } else {
            return mContext.getString(R.string.save_money_fragment);
        }


    }



    }