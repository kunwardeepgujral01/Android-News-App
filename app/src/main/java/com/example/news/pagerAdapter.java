package com.example.news;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class pagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public pagerAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new homeFragment();

            case 1:
                return new sportsFragment();

            case 2:
                return new healthFragment();
            case 3:
                return new scienceFragment();
            case 4:
                return new entertainmentFragment();
            case 5:
                return new techFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
