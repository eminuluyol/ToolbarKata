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

    //TODO:2- Have you already tried to scroll the view up completely? If no then what are you waiting for? You are in a CodeKata it is not a dream... Ok, let's get back to the topic the Tabbar is overlapping the Toolbar Title, right? How can we fix it then?
    //TODO:Hint.4- https://material.io/design/components/tabs.html#spec (Size matters (blink emoji here))

    //TODO:3- Not the best design but how one can hate Pixar characters. What about switching to 3rd Fragment and coming back to the first screen. Oopss seems like we have a problem. How can we fix this empty blank screen?
    //TODO:Hint.3-  https://developer.android.com/reference/android/app/FragmentManager
    //TODO If you liked the image and jealous of a rat then this link may help you https://androidmakers.fr/

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
        val adapter = ViewPagerAdapter(activity!!.supportFragmentManager)
        adapter.addFragment(DummyFragment(), "Dummy1")
        adapter.addFragment(DummyFragment(), "Dummy2")
        adapter.addFragment(DummyFragment(), "Dummy3")
        viewPager.adapter = adapter
    }
}
