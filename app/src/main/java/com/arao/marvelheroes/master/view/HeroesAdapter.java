package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.master.HeroesListCallback;
import com.arao.marvelheroes.master.model.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {

    private static final String EXTENSION_DOT = ".";

    private final ViewHolderFactory mViewHolderFactory;
    private final Picasso mPicasso;

    private List<Result> mHeroesList;
    private HeroesListCallback mHeroesListCallback;

    HeroesAdapter(ViewHolderFactory viewHolderFactory, Picasso picasso) {
        mViewHolderFactory = viewHolderFactory;
        mPicasso = picasso;
    }

    void setPresenterCallback(HeroesListCallback heroesListCallback) {
        mHeroesListCallback = heroesListCallback;
    }

    public void setData(List<Result> heroesList) {
        mHeroesList = heroesList;
        notifyDataSetChanged();
    }

    @Override
    public HeroesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heroes_list_item, parent, false);

        final HeroesViewHolder viewHolder = mViewHolderFactory.createHeroesViewHolder(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result hero = mHeroesList.get(viewHolder.getAdapterPosition());
                mHeroesListCallback.onHeroClicked(hero);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HeroesViewHolder holder, int position) {
        Result heroData = mHeroesList.get(position);
        String thumbnailPath = heroData.getThumbnail().getPath();
        String thumbnailExtension = heroData.getThumbnail().getExtension();

        holder.mHeroName.setText(heroData.getName());
        mPicasso.load(thumbnailPath + EXTENSION_DOT + thumbnailExtension)
                .placeholder(R.mipmap.heroes_list_placeholder)
                .into(holder.mHeroImage);
    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (mHeroesList != null) {
            size = mHeroesList.size();
        }
        return size;
    }
}
