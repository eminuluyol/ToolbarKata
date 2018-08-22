package com.taurus.fragmenttoolbarmanager.toolbar

import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View

class ToolbarManager constructor(
        private var builder: FragmentToolbar,
        private var container: View
) {

    fun prepareToolbar() {
        if (builder.resId != FragmentToolbar.NO_TOOLBAR) {
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

        }
    }
}
