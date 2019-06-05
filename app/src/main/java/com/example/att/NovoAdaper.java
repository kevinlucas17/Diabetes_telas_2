package com.example.att;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

class NovoAdapter extends RecyclerView.Adapter{

    private List<Historico_banco> historico_banco;
    public NovoAdapter(List<Historico_banco> historico_banco){
        this.historico_banco = historico_banco;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
