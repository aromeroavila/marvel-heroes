package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.master.ComicListCallback;
import com.squareup.picasso.Picasso;

import java.util.List;

class ComicsAdapter extends RecyclerView.Adapter<ComicViewHolder> {

    private static final String EXTENSION_DOT = ".";

    private final ViewHolderFactory mViewHolderFactory;
    private final Picasso mPicasso;

    private List<Comic> mComics;
    private ComicListCallback mComicListCallback;

    ComicsAdapter(ViewHolderFactory viewHolderFactory, Picasso picasso) {
        mViewHolderFactory = viewHolderFactory;
        mPicasso = picasso;
    }

    void setPresenterCallback(ComicListCallback comicListCallback) {
        mComicListCallback = comicListCallback;
    }

    public void setData(List<Comic> comics) {
        mComics = comics;
        notifyDataSetChanged();
    }

    @Override
    public ComicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heroes_list_item, parent, false);

        final ComicViewHolder viewHolder = mViewHolderFactory.createComicViewHolder(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comic comic = mComics.get(viewHolder.getAdapterPosition());
                mComicListCallback.onComicClicked(comic);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ComicViewHolder holder, int position) {
        Comic comicData = mComics.get(position);
        String thumbnailPath = comicData.getThumbnail().getPath();
        String thumbnailExtension = comicData.getThumbnail().getExtension();

        holder.mComicName.setText(comicData.getTitle());
        mPicasso.load(thumbnailPath + EXTENSION_DOT + thumbnailExtension)
                .placeholder(R.mipmap.comics_list_placeholder)
                .into(holder.mComicImage);
    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (mComics != null) {
            size = mComics.size();
        }
        return size;
    }
}
