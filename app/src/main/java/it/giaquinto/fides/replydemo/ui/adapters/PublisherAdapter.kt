package it.giaquinto.fides.replydemo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import it.giaquinto.fides.replydemo.R
import it.giaquinto.fides.replydemo.ui.holder.BaseViewHolder

class PublisherAdapter(
    private val listener: (String) -> Unit
) : BaseAdapter<PublisherAdapter.PublisherViewHolder, String>(
    R.layout.item_list
) {

    inner class PublisherViewHolder(
        view: View,
        override var item: String?
    ) : BaseViewHolder<String>(view) {
        private val textView2: TextView by lazy { view.findViewById(R.id.textView2) }

        override fun onBind(item: String) {
            this.item = item
            textView2.text = item.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder =
        PublisherViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(layoutId, parent, false),
            null
        )
}


/*
class PublisherAdapter : RecyclerView.Adapter<PublisherAdapter.PublisherViewHolder>() {

    lateinit var setListener: (String) -> Unit

    inner class PublisherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            view.setOnClickListener { setListener(textView2.text.toString()) }
        }

        val textView2: TextView by lazy { view.findViewById(R.id.textView2) }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem.hashCode() == newItem.hashCode()
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    fun setList(list: List<String>) = differ.submitList(list)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder =
        PublisherViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        holder.textView2.text = differ.currentList[position]
    }

    override fun getItemCount(): Int = differ.currentList.size
}*/
