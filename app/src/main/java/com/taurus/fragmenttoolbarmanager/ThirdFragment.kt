package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar

class ThirdFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
                .withId(R.id.toolbar3)
                .withTitle(R.string.title_third_fragment)
                .withBackgroundColor(R.color.toolbarTransparent)
                .build()
    }
}
