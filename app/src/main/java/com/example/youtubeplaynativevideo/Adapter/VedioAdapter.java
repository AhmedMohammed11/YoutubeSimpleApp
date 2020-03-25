package com.example.youtubeplaynativevideo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeplaynativevideo.Pojo.YoutubeVedio;
import com.example.youtubeplaynativevideo.R;

import java.util.ArrayList;
import java.util.List;

public class VedioAdapter extends RecyclerView.Adapter<VedioAdapter.VedioViewHolder> {
    private List<YoutubeVedio> youtubeVideoList;

    public VedioAdapter() {
        youtubeVideoList = new ArrayList<>();
    }

    public void setYoutubeVideoList(List<YoutubeVedio> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public VedioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_vedio, parent, false);
        return new VedioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VedioViewHolder holder, int position) {
        holder.vedioWeb.loadData(youtubeVideoList.get(position).getVedioUrl(), "text/html", "utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public static class VedioViewHolder extends RecyclerView.ViewHolder {
        WebView vedioWeb;

        public VedioViewHolder(@NonNull View itemView) {
            super(itemView);
            vedioWeb = itemView.findViewById(R.id.web_vedio_view);
            vedioWeb.getSettings().setJavaScriptEnabled(true);
            vedioWeb.setWebChromeClient(new WebChromeClient() {
            });
        }
    }
}
