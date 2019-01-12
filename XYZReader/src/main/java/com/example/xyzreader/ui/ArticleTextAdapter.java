package com.example.xyzreader.ui;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.List;

public class ArticleTextAdapter extends RecyclerView.Adapter<ArticleTextAdapter.BodyViewHolder> {
    private List<String> bodyTextset;
    public class BodyViewHolder extends RecyclerView.ViewHolder {

        public TextView textBody;

        public BodyViewHolder(View view){
            super(view);
            textBody = (TextView) view.findViewById(R.id.article_body_text);
        }
    }

    public ArticleTextAdapter(List<String> textList){
        bodyTextset = textList;
    }

    @Override
    public ArticleTextAdapter.BodyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_article_body, parent, false);
        return new BodyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ArticleTextAdapter.BodyViewHolder holder, int position) {
        holder.textBody.setText(Html.fromHtml(bodyTextset.get(position)));

    }

    @Override
    public int getItemCount() {
        return bodyTextset.size();
    }




}
