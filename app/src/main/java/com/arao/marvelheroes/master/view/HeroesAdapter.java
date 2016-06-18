package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.master.model.Result;

import java.util.List;

class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {

    private final ViewHolderFactory mViewHolderFactory;

    private List<Result> mHeroesList;

    HeroesAdapter(ViewHolderFactory viewHolderFactory) {
        mViewHolderFactory = viewHolderFactory;
    }

    public void setData(List<Result> heroesList) {
        mHeroesList = heroesList;
        notifyDataSetChanged();
    }

    @Override
    public HeroesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heroes_list_item, parent, false);

        return mViewHolderFactory.createHeroesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HeroesViewHolder holder, int position) {
        Result heroData = mHeroesList.get(position);
        holder.mHeroName.setText(heroData.getName());
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
