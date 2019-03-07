package com.ismailhakkiaydin.tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ismailhakkiaydin.tablayout.R;
import com.ismailhakkiaydin.tablayout.adapters.IconTabAdapter;
import com.ismailhakkiaydin.tablayout.fragments.FragmentFive;
import com.ismailhakkiaydin.tablayout.fragments.FragmentFour;
import com.ismailhakkiaydin.tablayout.fragments.FragmentOne;
import com.ismailhakkiaydin.tablayout.fragments.FragmentSix;
import com.ismailhakkiaydin.tablayout.fragments.FragmentThree;
import com.ismailhakkiaydin.tablayout.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class IconTab extends AppCompatActivity {


    List<Fragment> fragmentListesi=new ArrayList<>();
    TabLayout tabLayout;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tab);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Icon Tab Örnek");

        ViewPager viewPager= (ViewPager) findViewById(R.id.viewPager);
        tabLayout= (TabLayout) findViewById(R.id.tabs);

        setData(new FragmentOne());
        setData(new FragmentTwo());
        setData(new FragmentThree());
        setData(new FragmentFour());
        setData(new FragmentFive());
        setData(new FragmentSix());




        IconTabAdapter adapter=new IconTabAdapter(getSupportFragmentManager(), fragmentListesi);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();


    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);
        tabLayout.getTabAt(2).setIcon(R.drawable.instagram);
        tabLayout.getTabAt(3).setIcon(R.drawable.netflix);
        tabLayout.getTabAt(4).setIcon(R.drawable.twitter);
        tabLayout.getTabAt(5).setIcon(R.drawable.whatsapp);


    }

    public void setData(Fragment yeniSayfaFragment){

        fragmentListesi.add(yeniSayfaFragment);

    }



}
