package com.gsixacademy.android.StariDrva.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gsixacademy.android.StariDrva.R
import com.gsixacademy.android.StariDrva.data.TreeData


class TreesAdapter(
    val treesData: ArrayList<TreeData>,
    val monumental: ArrayList<Int>,
    treesAdapterClickEvent: (TreesAdapterClickEvent) -> Unit):RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.tree_list_row,parent, false))
    }

    override fun getItemCount(): Int {
        return treesData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(treesData[position], position)
    }

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindData(treeDate: TreeData, position: Int) {

        }
    }
}