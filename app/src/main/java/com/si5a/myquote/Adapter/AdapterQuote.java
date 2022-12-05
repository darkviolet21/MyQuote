package com.si5a.myquote.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterQuote {

    public class ViewHolderQuote extends RecyclerView.ViewHolder{
        TextView tvText, tvAuthor;

        public ViewHolderQuote(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id)
        }
    }

}
