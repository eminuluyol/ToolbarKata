package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.taurus.fragmenttoolbarmanager.extensions.fragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val bottomBarSelectedItemListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_first_fragment -> {
                fragmentTransaction {
                    replace(R.id.fragmentContainer, FirstFragment())
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_second_fragment -> {
                fragmentTransaction {
                    replace(R.id.fragmentContainer, SecondFragment())
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_third_fragment -> {
                fragmentTransaction {
                    replace(R.id.fragmentContainer, ThirdFragment())
                }
                return@OnNavigationItemSelectedListener true
            }
        }
        return@OnNavigationItemSelectedListener false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomBarNavigationView.setOnNavigationItemSelectedListener(bottomBarSelectedItemListener)
    }
}
