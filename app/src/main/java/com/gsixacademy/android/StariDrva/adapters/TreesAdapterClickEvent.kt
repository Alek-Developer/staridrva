package com.gsixacademy.android.StariDrva.adapters

import com.gsixacademy.android.StariDrva.data.TreeData

sealed class TreesAdapterClickEvent {
    data class TreesAdapterItemClicked(val treeData: TreeData): TreesAdapterClickEvent()
}