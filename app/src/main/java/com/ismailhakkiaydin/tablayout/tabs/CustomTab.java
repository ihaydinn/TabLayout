package com.ismailhakkiaydin.tablayout.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.ismailhakkiaydin.tablayout.R;
import com.ismailhakkiaydin.tablayout.adapters.TextTabAdapter;
import com.ismailhakkiaydin.tablayout.fragments.FragmentFive;
import com.ismailhakkiaydin.tablayout.fragments.FragmentFour;
import com.ismailhakkiaydin.tablayout.fragments.FragmentOne;
import com.ismailhakkiaydin.tablayout.fragments.FragmentSix;
import com.ismailhakkiaydin.tablayout.fragments.FragmentThree;
import com.ismailhakkiaydin.tablayout.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class CustomTab extends AppCompatActivity {


    List<Fragment> fragmentListesi=new ArrayList<>();
    List<String> tabBaslikListesi=new ArrayList<>();
    TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Custom View Tab Örnek");

        ViewPager viewPager= (ViewPager) findViewById(R.id.viewPager);
        tabLayout= (TabLayout) findViewById(R.id.tabs);

        setData(new FragmentOne(), "Tab 1");
        setData(new FragmentTwo(), "Tab 2");
        setData(new FragmentThree(), "Tab 3");
        setData(new FragmentFour(), "Tab 4");
        setData(new FragmentFive(), "Tab 5");
        setData(new FragmentSix(), "Tab 6");


        TextTabAdapter adapter=new TextTabAdapter(getSupportFragmentManager(), fragmentListesi, tabBaslikListesi);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        setCustomViewForTabs(0, "Örnek 1", "Tab 1");
        setCustomViewForTabs(1, "Örnek 2", "Tab 2");
        setCustomViewForTabs(2, "Örnek 3", "Tab 3");
        setCustomViewForTabs(3, "Örnek 4", "Tab 4");
        setCustomViewForTabs(4, "Örnek 5", "Tab 5");
        setCustomViewForTabs(5, "Örnek 6", "Tab 6");



    }

    private void setCustomViewForTabs(int position, String baslik, String altBaslik) {

        View tabView= LayoutInflater.from(this).inflate(R.layout.tab_item, null);

        TextView tvBaslik= (TextView) tabView.findViewById(R.id.tabTextTitle);
        TextView tbSubTitle= (TextView) tabView.findViewById(R.id.tabTextSubTitle);

        tvBaslik.setText(baslik);
        tbSubTitle.setText(altBaslik);

        tabLayout.getTabAt(position).setCustomView(tabView);


    }

    public void setData(Fragment yeniSayfaFragment, String baslik){

        fragmentListesi.add(yeniSayfaFragment);
        tabBaslikListesi.add(baslik);

    }




}
