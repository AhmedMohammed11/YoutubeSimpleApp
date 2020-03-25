package com.example.youtubeplaynativevideo.Ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.youtubeplaynativevideo.Adapter.VedioAdapter;
import com.example.youtubeplaynativevideo.Pojo.YoutubeVedio;
import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.databinding.FragmentAbozaidChanelBinding;
import com.example.youtubeplaynativevideo.viewmodels.ChannelViewModel;

import java.util.List;

public class AboZaidFragment extends BaseFragment {
    private VedioAdapter vedioAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        FragmentAbozaidChanelBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_abozaid_chanel, container, false);
        View view = binding.getRoot();
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        vedioAdapter = new VedioAdapter();
        binding.recyclerview.setAdapter(vedioAdapter);

        ChannelViewModel channelViewModel = new ViewModelProvider(this).get(ChannelViewModel.class);
        channelViewModel.addVideos();

        channelViewModel.getVectorMutableLiveData().observe(this, new Observer<List<YoutubeVedio>>() {
            @Override
            public void onChanged(List<YoutubeVedio> youtubeVedios) {
                vedioAdapter.setYoutubeVideoList(youtubeVedios);
            }
        });

        return view;
    }

    @Override
    public void onBack() {
        super.onBack();
    }
}
