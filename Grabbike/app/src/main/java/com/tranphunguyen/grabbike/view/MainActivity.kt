package com.tranphunguyen.grabbike.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import com.tranphunguyen.grabbike.Adapter.SplashScreenAdapter
import com.tranphunguyen.grabbike.R
import com.tranphunguyen.grabbike.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val adapter = SplashScreenAdapter(supportFragmentManager)

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(position: Int) {

                btn_participation.visibility = View.GONE

                when(position) {
                    0 -> {
                        indicator1.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_selected))
                        indicator2.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                        indicator3.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                    }
                    1 -> {
                        indicator1.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                        indicator2.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_selected))
                        indicator3.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                    }
                    2 -> {
                        indicator1.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                        indicator2.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_unselect))
                        indicator3.setImageDrawable(resources.getDrawable(R.drawable.ic_slide_selected))

                        btn_participation.visibility = View.VISIBLE
                    }
                }
            }

        })

        dataBinding.adapter = adapter
    }
}
