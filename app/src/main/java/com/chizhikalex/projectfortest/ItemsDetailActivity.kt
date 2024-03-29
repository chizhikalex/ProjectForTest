package com.chizhikalex.projectfortest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_items_detail.*

/**
 * An activity representing a single Items detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a [ItemsListActivity].
 */
class ItemsDetailActivity : AppCompatActivity() {

    companion object {
        var x: Handler? = null
        var y: Handler? = null
        var z: Handler? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_detail)
        setSupportActionBar(detail_toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        x = Handler {
            Log.e("TTTTTTTTTTT","x")
            app_bar.setLifted(true)
        }

        y = Handler{
            Log.e("TTTTTTTTTTT","y")
            true
        }
        z = Handler{
            Log.e("TTTTTTTЕTTTTн","z")
            true
        }

        x?.sendEmptyMessage(0)
        y?.sendEmptyMessage(0)
        z?.sendEmptyMessage(0)
        z?.sendEmptyMessage(0)
        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            val fragment = ItemsDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(
                        ItemsDetailFragment.ARG_ITEM_ID,
                        intent.getStringExtra(ItemsDetailFragment.ARG_ITEM_ID)
                    )
                }
            }

            supportFragmentManager.beginTransaction()
                .add(R.id.items_detail_container, fragment)
                .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            android.R.id.home -> {
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back

                navigateUpTo(Intent(this, ItemsListActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
}
