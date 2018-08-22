package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : BaseFragment() {

    private val tabListener = object : TabLayout.OnTabSelectedListener {
        override fun onTabReselected(tab: TabLayout.Tab) {
            viewPager.currentItem = tab.position
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {
            //noop
        }

        override fun onTabSelected(tab: TabLayout.Tab?) {
            //noop
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
                .withId(R.id.toolbar)
                .withTitle(R.string.title_first_fragment)
                .build()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addOnTabSelectedListener(tabListener)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(DummyFragment(), "Dummy1")
        adapter.addFragment(DummyFragment(), "Dummy2")
        adapter.addFragment(DummyFragment(), "Dummy3")
        viewPager.adapter = adapter
    }
}
