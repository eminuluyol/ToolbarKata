package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabButton.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
                .withId(R.id.toolbar2)
                .withTitle(R.string.title_second_fragment)
                .build()
    }
}
