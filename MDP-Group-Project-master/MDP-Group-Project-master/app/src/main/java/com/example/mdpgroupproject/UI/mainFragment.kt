package com.example.mdpgroupproject.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mdpgroupproject.R



class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    fun newInstance(): MainFragment {
        return MainFragment()

    }


    companion object {
        fun newInstance() = MainFragment()
    }

//    class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {
//
//        override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
//            // An item was selected. You can retrieve the selected item using
//            // parent.getItemAtPosition(pos)
//        }
//
//        override fun onNothingSelected(parent: AdapterView<*>) {
//            // Another interface callback
//        }
//
//
//    }


}
