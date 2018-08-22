package com.taurus.fragmenttoolbarmanager

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taurus.fragmenttoolbarmanager.toolbar.FragmentToolbar
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : BaseFragment() {

    //TODO:5- Such a mess UI isn't it? Because you are just looking at the UI, not trying to see the hidden beauty behind it.
    //TODO If you are into Japanese culture besides Hentai movies, then it is time to tidy this mess up. Red poppies and a samurai behind what a stunning scene. Never underestimate a hearth of a samurai :)
    //TODO:Hint.5- (Maybe the only problem is your behaviors) https://developer.android.com/reference/android/support/design/widget/AppBarLayout


    //TODO:6- Now it looks like a Friday night beer (Imagine a sound like an angel sighing). You think you are done!
    //TODO Of course not, now our designers want you to implement a design like in this GIF file
    //TODO http://androcode.es/wp-content/uploads/2015/10/simple_coordinator.gif
    //TODO The Fab button must scroll up with the app bar content and must be invisible when the CollapsingToolbar is fully collapsed. How would you do that?
    //TODO:Hint.6- http://bfy.tw/JWYk

    //TODO:7- Everything looks so good right. Just scroll up again, but wait for a minute, what was that?
    //TODO The Toolbar exits the window, right? Let's try to fix it then. I am sure CollapsingToolbar must know how to fix it.
    //TODO:Hint.7- If you ask me the problem it looks like a collapsingMode problem https://developer.android.com/reference/android/support/design/widget/CollapsingToolbarLayout.LayoutParams

    //TODO:8- You did it. Look at this stunning UI. Parallax samurai image, anchored floating action button and this scrolling effect it is smooth :)
    //TODO And when you tab on the fab button this nice snack bar message...
    //TODO eeaahh wait a minute I just washed my hands probably the touch event detector doesn't recognize the wet finger events. Let me give another try....
    //TODO hmm ok it is broken. This time no help, you should fix it on your own.

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabButton.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
                .withId(R.id.toolbar2)
                .withTitle(R.string.title_second_fragment)
                .build()
    }
}
