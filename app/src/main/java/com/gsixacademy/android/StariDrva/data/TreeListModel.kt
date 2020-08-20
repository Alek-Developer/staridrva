package  com.gsixacademy.android.StariDrva.data

import com.google.firebase.database.IgnoreExtraProperties
import com.gsixacademy.android.StariDrva.data.TreeData

@IgnoreExtraProperties
class TreeListModel constructor(){
    val trees: ArrayList<TreeData>? = null
    val monumental_trees: ArrayList<Int>? = null
}