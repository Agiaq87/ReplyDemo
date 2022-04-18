package it.giaquinto.fides.replydemo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import it.giaquinto.fides.replydemo.R
import it.giaquinto.fides.replydemo.model.feedrss.FeedItem

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    lateinit var openNews: (link: String) -> Unit

    inner class NewsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView by lazy { view.findViewById(R.id.titleText) }
        private val description: TextView by lazy { view.findViewById(R.id.descriptionText) }

        private lateinit var item: FeedItem

        fun insertItem(item: FeedItem): NewsViewHolder {
            this.item = item
            title.text = item.title
            description.text = item.description
            return this
        }

        fun setLink() = view.setOnClickListener {
            item.link?.let { openNews(it) }
        }
    }

    fun setList(list: List<FeedItem>) = differ.submitList(list)

    private val diffCallBack = object : DiffUtil.ItemCallback<FeedItem>() {
        override fun areItemsTheSame(oldItem: FeedItem, newItem: FeedItem): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: FeedItem, newItem: FeedItem): Boolean =
            oldItem.title == newItem.title &&
                    oldItem.link == newItem.link &&
                    oldItem.description == newItem.description

    }

    private val differ = AsyncListDiffer(this, diffCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder =
        NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.detail_list, parent, false)
        )

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.insertItem(differ.currentList[position]).setLink()
    }

    override fun getItemCount(): Int = differ.currentList.size
}