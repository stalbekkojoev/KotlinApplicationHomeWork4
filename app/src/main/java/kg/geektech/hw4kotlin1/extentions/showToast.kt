package kg.geektech.hw4kotlin1.extentions

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showToastAdapter(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
