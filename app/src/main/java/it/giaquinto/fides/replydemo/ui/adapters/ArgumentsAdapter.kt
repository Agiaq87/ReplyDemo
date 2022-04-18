package it.giaquinto.fides.replydemo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import it.giaquinto.fides.replydemo.R

class ArgumentsAdapter(val listener: (String) -> Unit) :
    RecyclerView.Adapter<ArgumentsAdapter.ArgumentsViewHolder>() {

    inner class ArgumentsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView by lazy { view.findViewById(R.id.textView2) }

        init {
            view.setOnClickListener {
                listener(title.text.toString())
            }
        }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem.hashCode() == newItem.hashCode()
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgumentsViewHolder =
        ArgumentsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )

    override fun onBindViewHolder(holder: ArgumentsViewHolder, position: Int) {
        holder.title.text = differ.currentList[position]
    }

    override fun getItemCount(): Int = differ.currentList.size
}