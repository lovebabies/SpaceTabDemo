package com.begamob.spacetabdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Space
import com.begamob.spacetabdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.spaceView.apply {
            initWithSaveInstanceState(savedInstanceState)
            addSpaceItem(SpaceItem("One", R.drawable.ic_tab_one))
            addSpaceItem(SpaceItem("Two", R.drawable.ic_tab_two))
            addSpaceItem(SpaceItem("Three", R.drawable.ic_tab_three))
            addSpaceItem(SpaceItem("Four", R.drawable.ic_tab_four))
//            addSpaceItem(SpaceItem("Five", R.drawable.ic_tab_five))
        }


    }
}