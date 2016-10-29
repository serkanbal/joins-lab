package net.serkanbal.joinslab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Serkan on 28/10/16.
 */

public class JoinsViewHolder extends RecyclerView.ViewHolder{
    public TextView mTextView;


    public JoinsViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(android.R.id.text1);
    }
}
