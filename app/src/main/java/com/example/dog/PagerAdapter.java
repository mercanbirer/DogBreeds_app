package com.example.dog;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;


    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                RandomFragment randomFragment = new RandomFragment();
                return randomFragment;
            case 1:
                RandomByBreedFragment randomByBreedFragment = new RandomByBreedFragment();
                return randomByBreedFragment;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }
}
