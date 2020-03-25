package com.example.youtubeplaynativevideo.Ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.youtubeplaynativevideo.Pojo.YoutubeVedio;
import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.databinding.FragmentAbozaidChanelBinding;

import java.util.Vector;

import Adapter.VedioAdapter;


public class AboZaidFragment extends BaseFragment {

    Vector<YoutubeVedio> youtubeVedios =new Vector<YoutubeVedio>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        FragmentAbozaidChanelBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_abozaid_chanel, container, false);
        View view = binding.getRoot();
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));

        youtubeVedios.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/njPLHfivy9o\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVedios.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/A7zCOOEBxhU\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVedios.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CNlj-uAiqmA\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVedios.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FvNWi2nVMJo\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVedios.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4vyzrmiJLh0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

        VedioAdapter vedioAdapter = new VedioAdapter(youtubeVedios);
        binding.recyclerview.setAdapter(vedioAdapter);

        return view;
    }


    @Override
    public void onBack() {
        super.onBack();
    }
}
