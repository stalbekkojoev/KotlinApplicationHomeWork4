package kg.geektech.hw4kotlin1.extentions

import android.content.Context
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout


fun Context.setIconColor(tabLayout: TabLayout.Tab, color: Int) {
    tabLayout.icon?.setTint(ContextCompat.getColor(this, color))
}
fun setIconAlpha(tabLayout: TabLayout.Tab, alpha: Int) {
    tabLayout.icon?.alpha = alpha
}