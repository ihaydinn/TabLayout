package com.ismailhakkiaydin.tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

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

public class TextTab extends AppCompatActivity {


    List<Fragment> fragmentListesi=new ArrayList<>();
    List<String> tabBaslikListesi=new ArrayList<>();
    TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tab);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Text Tab Örnek");

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
        setTabIcons();


    }

    public void setData(Fragment yeniSayfaFragment, String baslik){

        fragmentListesi.add(yeniSayfaFragment);
        tabBaslikListesi.add(baslik);

    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);
        tabLayout.getTabAt(2).setIcon(R.drawable.instagram);
        tabLayout.getTabAt(3).setIcon(R.drawable.netflix);
        tabLayout.getTabAt(4).setIcon(R.drawable.twitter);
        tabLayout.getTabAt(5).setIcon(R.drawable.whatsapp);


    }


}