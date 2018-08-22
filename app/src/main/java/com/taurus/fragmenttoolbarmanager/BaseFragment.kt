package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar
import com.taurus.fragmenttoolbarmanager.toolbar.ToolbarManager

abstract class BaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ToolbarManager(builder(), view).prepareToolbar()
    }

    protected abstract fun builder(): FragmentToolbar
}
