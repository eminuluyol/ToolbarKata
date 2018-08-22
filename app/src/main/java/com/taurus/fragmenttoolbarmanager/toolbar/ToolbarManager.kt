package com.taurus.fragmenttoolbarmanager.toolbar

import android.support.v4.app.FragmentActivity
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View

class ToolbarManager constructor(
        private var builder: FragmentToolbar,
        private var container: View,
        private var activity: FragmentActivity?
) {

    fun prepareToolbar() {
        if (builder.resId != FragmentToolbar.NO_TOOLBAR) {
            val containerActivity = activity as AppCompatActivity
            val fragmentToolbar = container.findViewById(builder.resId) as Toolbar

            if (builder.title != FragmentToolbar.NO_TITLE) {
                fragmentToolbar.setTitle(builder.title)
            }

            if (builder.menuId != FragmentToolbar.NO_MENU_ITEM) {
                fragmentToolbar.inflateMenu(builder.menuId)
            }

            if (!builder.menuItems.isEmpty() && !builder.menuClicks.isEmpty()) {
                val menu = fragmentToolbar.menu
                for ((index, menuItemId) in builder.menuItems.withIndex()) {
                    (menu.findItem(menuItemId) as MenuItem).setOnMenuItemClickListener(builder.menuClicks[index])
                }
            }

            if (builder.isOnHomePressedDefaultAction) {
                containerActivity.setSupportActionBar(fragmentToolbar)
                containerActivity.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            }

            if (builder.customHomeAsUpIndicator !=FragmentToolbar.NO_CUSTOM_HOME_AS_UP_INDICATOR) {
                containerActivity.setSupportActionBar(fragmentToolbar)
                containerActivity.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
                containerActivity.supportActionBar!!.setHomeAsUpIndicator(builder.customHomeAsUpIndicator)
            }

            if(builder.colorId != FragmentToolbar.NO_COLOR) {
                fragmentToolbar.setBackgroundColor(ContextCompat.getColor(fragmentToolbar.context,builder.colorId))
            }
        }
    }
}
