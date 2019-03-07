package com.ismailhakkiaydin.tablayout.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class IconTabAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentListesi=new ArrayList<>();



    public IconTabAdapter(FragmentManager fm, List<Fragment> fraList) {
        super(fm);

        this.fragmentListesi=fraList;

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListesi.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListesi.size();
    }

}
