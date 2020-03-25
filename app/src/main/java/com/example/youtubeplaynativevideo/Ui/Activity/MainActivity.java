package com.example.youtubeplaynativevideo.Ui.Activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.example.youtubeplaynativevideo.Helper.HelperMethod;
import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.Ui.Fragment.HomeFragment;
import com.example.youtubeplaynativevideo.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity  {
    private String apiKey = "AIzaSyB43vfEpUD3NFH5ZV3l1UXcJOZ5aZ7SIZQ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        HelperMethod.ReplaceFragment(getSupportFragmentManager(),new HomeFragment()
                ,R.id.activity_main_fragmentcontainer_container,null,null);
    }


}
