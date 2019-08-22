package com.tranphunguyen.grabbike.Fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tranphunguyen.grabbike.R
import com.tranphunguyen.grabbike.databinding.FragmentSplashScreenOneBinding
import com.tranphunguyen.grabbike.databinding.FragmentSplashScreenThreeBinding

class SplashScreenThreeFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val dataBinding = DataBindingUtil.inflate<FragmentSplashScreenThreeBinding>(inflater, R.layout.fragment_splash_screen_three,container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}