package com.anilcaliskan.affirmationsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anilcaliskan.affirmationsapp.databinding.RecyclerRowBinding

class Adapter(private val context: Context,val dataset: List<Landscape>): RecyclerView.Adapter<Adapter.LandscapeHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class LandscapeHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }

    //Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandscapeHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_row, parent, false)

        return LandscapeHolder(adapterLayout)
    }

     //Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: LandscapeHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    //Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataset.size

}

