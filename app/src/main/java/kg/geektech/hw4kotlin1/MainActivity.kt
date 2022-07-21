package kg.geektech.hw4kotlin1

import android.view.LayoutInflater
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kg.geektech.hw4kotlin1.adapter.PagerAdapter
import kg.geektech.hw4kotlin1.base.BaseActivity
import kg.geektech.hw4kotlin1.databinding.ActivityMainBinding
import kg.geektech.hw4kotlin1.extentions.setIconAlpha
import kg.geektech.hw4kotlin1.extentions.setIconColor

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_confirmation_number_24)
                    setIconColor(tab, R.color.purple_500)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_countertops_24)
                    setIconColor(tab, R.color.teal_200)
                }
                else -> {
                    tab.setIcon(R.drawable.ic_baseline_history_24)
                    setIconColor(tab, R.color.teal_700)

                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) = setIconAlpha(tab, 250)


            override fun onTabUnselected(tab: TabLayout.Tab) = setIconAlpha(tab, 70)


            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun initViewPager() {
        binding.viewPager2.adapter = PagerAdapter(this)
    }
}