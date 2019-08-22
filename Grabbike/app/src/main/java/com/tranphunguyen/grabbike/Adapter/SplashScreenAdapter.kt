package com.tranphunguyen.grabbike.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log
import com.tranphunguyen.grabbike.Fragment.SplashScreenOneFragment
import com.tranphunguyen.grabbike.Fragment.SplashScreenThreeFragment
import com.tranphunguyen.grabbike.Fragment.SplashScreenTwoFragment

class SplashScreenAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private val listFragment = mutableListOf<Fragment>()

    init {
        listFragment.add(SplashScreenOneFragment())
        listFragment.add(SplashScreenTwoFragment())
        listFragment.add(SplashScreenThreeFragment())
    }

    override fun getItem(p0: Int): Fragment {
        Log.d("Adapter",p0.toString())
        return listFragment[p0]
    }

    override fun getCount(): Int {
        return listFragment.size
    }
}