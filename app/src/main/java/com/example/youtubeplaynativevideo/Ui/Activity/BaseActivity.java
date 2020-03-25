package com.example.youtubeplaynativevideo.Ui.Activity;



import androidx.appcompat.app.AppCompatActivity;
import com.example.youtubeplaynativevideo.Ui.Fragment.BaseFragment;

public class BaseActivity extends AppCompatActivity {

    public BaseFragment baseFragment;

    public void superBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed() {
        baseFragment.onBack();
    }
}

