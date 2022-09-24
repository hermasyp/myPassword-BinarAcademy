package com.catnip.mypassword.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context


/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
object ClipboardUtils {
    fun copyToClipboard(context: Context, label: String = "myPassword", selectedText: String) {
        val clipboard: ClipboardManager? =
            context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
        val clip = ClipData.newPlainText(label, selectedText)
        if (clipboard == null || clip == null) return
        clipboard.setPrimaryClip(clip)
    }
}