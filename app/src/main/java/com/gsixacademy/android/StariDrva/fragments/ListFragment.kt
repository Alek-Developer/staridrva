package com.gsixacademy.android.StariDrva.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gsixacademy.android.StariDrva.R
import com.gsixacademy.android.StariDrva.adapters.TreesAdapter
import com.gsixacademy.android.StariDrva.data.TreeData
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        var treeList = ArrayList<TreeData>()

        treeList.add(TreeData("name1"))
        treeList.add(TreeData("name2"))
        treeList.add(TreeData("name3"))
        treeList.add(TreeData("name4"))


        recycler_view_main.adapter = TreesAdapter(treeList) {

        }
    }

}