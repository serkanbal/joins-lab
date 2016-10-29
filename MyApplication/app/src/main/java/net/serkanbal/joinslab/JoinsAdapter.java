package net.serkanbal.joinslab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Serkan on 28/10/16.
 */

public class JoinsAdapter extends RecyclerView.Adapter<JoinsViewHolder> {
    private List<String> mList;

    public JoinsAdapter(List<String> list) {
        mList = list;
    }

    @Override
    public JoinsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new JoinsViewHolder(inflater.inflate(android.R.layout.simple_list_item_1,
                parent,false));
    }

    @Override
    public void onBindViewHolder(JoinsViewHolder holder, int position) {
        holder.mTextView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
