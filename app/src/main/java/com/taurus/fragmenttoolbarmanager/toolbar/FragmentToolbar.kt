package com.taurus.fragmenttoolbarmanager.toolbar

import android.support.annotation.*
import android.view.MenuItem

class FragmentToolbar constructor(
        @IdRes val resId: Int,
        @StringRes val title: Int,
        @MenuRes val menuId: Int,
        val menuItems: MutableList<Int>,
        val menuClicks: MutableList<MenuItem.OnMenuItemClickListener?>,
        val isOnHomePressedDefaultAction: Boolean,
        @DrawableRes val customHomeAsUpIndicator: Int,
        @ColorRes val colorId: Int
) {

    companion object {
        const val NO_TOOLBAR = -1
        const val NO_TITLE = -1
        const val NO_MENU_ITEM = -1
        const val NO_COLOR = -1
        const val NO_CUSTOM_HOME_AS_UP_INDICATOR = -1
    }

    class Builder {
        private var resId: Int = -1
        private var menuId: Int = -1
        private var title: Int = -1
        private var colorId: Int = -1
        private var menuItems: MutableList<Int> = mutableListOf()
        private var menuClicks: MutableList<MenuItem.OnMenuItemClickListener?> = mutableListOf()
        private var isOnHomePressedDefaultAction = false
        private var customHomeAsUpIndicator = -1


        fun withId(@IdRes resId: Int) = apply { this.resId = resId }

        fun withTitle(title: Int) = apply { this.title = title }

        fun withMenu(@MenuRes menuId: Int) = apply { this.menuId = menuId }

        fun withMenuItems(menuItems: MutableList<Int>, menuClicks: MutableList<MenuItem.OnMenuItemClickListener?>) = apply {
            this.menuItems.addAll(menuItems)
            this.menuClicks.addAll(menuClicks)
        }

        fun build() = FragmentToolbar(
                resId,
                title,
                menuId,
                menuItems,
                menuClicks,
                isOnHomePressedDefaultAction,
                customHomeAsUpIndicator,
                colorId
        )


    }
}
