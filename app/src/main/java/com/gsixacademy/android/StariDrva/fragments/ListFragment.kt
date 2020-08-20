package com.gsixacademy.android.StariDrva.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gsixacademy.android.StariDrva.MainActivity
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

      val treeListModel = (activity as MainActivity).treeListModel



        recycler_view_main.adapter = treeListModel?.trees?.let { trees ->
            treeListModel.monumental_trees?.let { monumentalTrees ->
                TreesAdapter(trees, monumentalTrees) {
                    Toast.makeText(context,"item Clicked", Toast.LENGTH_LONG).show()
                }
            }
        }






    }
    }

