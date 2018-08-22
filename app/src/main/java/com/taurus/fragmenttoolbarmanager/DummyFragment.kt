package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.dummy_fragment.view.*

class DummyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dummy_fragment, container, false)

        val linearLayoutManager = LinearLayoutManager(context)
        val dummyRecylerView = view.dummyRecylerView as RecyclerView
        dummyRecylerView.layoutManager = linearLayoutManager
        dummyRecylerView.setHasFixedSize(true)
        val adapter = DessertAdapter(dummyRecylerView.context)
        dummyRecylerView.adapter = adapter

        return view
    }

}
