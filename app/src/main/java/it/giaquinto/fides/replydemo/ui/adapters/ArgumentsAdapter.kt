package it.giaquinto.fides.replydemo.ui.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class ArgumentsAdapter : RecyclerView.Adapter<ArgumentsAdapter.ArgumentsViewHolder>() {

    inner class ArgumentsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem.hashCode() == newItem.hashCode()
    }

    val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgumentsViewHolder {
        //ArgumentsViewHolder(LayoutInflater.from(parent.context))
    }

    override fun onBindViewHolder(holder: ArgumentsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = differ.currentList.size
}