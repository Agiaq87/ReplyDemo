package it.giaquinto.fides.replydemo.ui.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(
    view: View
) : RecyclerView.ViewHolder(view) {
    abstract var item: T?

    abstract fun onBind(item: T)
}