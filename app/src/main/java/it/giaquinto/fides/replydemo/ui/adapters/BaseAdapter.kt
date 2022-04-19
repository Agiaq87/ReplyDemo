package it.giaquinto.fides.replydemo.ui.adapters

import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import it.giaquinto.fides.replydemo.ui.holder.BaseViewHolder

abstract class BaseAdapter<VH : BaseViewHolder<T>, T : Comparable<T>>(
    protected val layoutId: Int
) : RecyclerView.Adapter<VH>() {

    private val diffCallback = object : DiffUtil.ItemCallback<T>() {
        override fun areItemsTheSame(oldItem: T, newItem: T): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: T, newItem: T): Boolean =
            oldItem.compareTo(newItem) == 0

    }

    private val differ = AsyncListDiffer(this, diffCallback)

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: VH, position: Int) =
        holder.onBind(differ.currentList[position])

    fun setList(list: List<T>) = differ.submitList(list)

}