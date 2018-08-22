package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar

class ThirdFragment : BaseFragment() {

    //TODO:10- First add `onHomePressedDefaultAction` to your FragmentToolbar then you will see that UI is fucked up. Just hack it (Pay attention I didn't say fix it)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
                .withId(R.id.toolbar3)
                .withTitle(R.string.title_third_fragment)
                .build()
    }
}
