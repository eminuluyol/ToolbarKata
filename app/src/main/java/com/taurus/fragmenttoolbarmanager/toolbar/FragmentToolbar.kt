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

        //TODO:4- If you managed to reach that point you deserved an applause.
        //TODO As we say in Turkey bad days have finally passed, now even worse days are waiting for us. :)
        //TODO This is going to be the most important task of this Kata. You know, adding a back arrow button to navigate back is a common behavior of  Fragments or Activities.
        //TODO How could you simplify this solution? Please use your implementation here in `onHomePressedDefaultAction`, you also need to visit ToolbarManager
        //TODO:Hint.4- Don't forget that activities are the fragment managers.  https://developer.android.com/reference/android/app/Activity.html#onOptionsItemSelected(android.view.MenuItem)

//        fun onHomePressedDefaultAction() = apply {
//        }

        //TODO:5- Seems like you are a tough nut to crack. But you know that right, our beloved friends designers will never let you lay back on your chair and watch some youtube videos.
        //TODO  What if some of them ask you to add a custom image for the back button.
        //TODO You can whether say go fuck yourself or give a try to write `withCustomHomeAsUpIndicator`. You can use ic_close.xml as a custom back button. Don't say thank you!!

//        fun withCustomHomeAsUpIndicator(@DrawableRes drawableRes: Int) = apply {
//        }

        //TODO:9- Alright! When you don't have a parallax effect you need a background color for your toolbar. What about implementing       //TODO this `withBackgroundColor` method. You can use the transparent color from the color.xml
//        fun withBackgroundColor(@ColorRes colorId: Int) = apply {
//        }

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
