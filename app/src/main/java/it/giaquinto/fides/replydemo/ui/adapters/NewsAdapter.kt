package it.giaquinto.fides.replydemo.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView by lazy { view.findViewById(R.id.) }

        init {
            view.setOnClickListener {
                openNews()
            }
        }
    }
}