package com.wagnod.contacts

import android.content.Context
import android.content.Intent
import android.net.Uri


fun callTo(context: Context, number: String) {
    val uri = Uri.parse("tel:$number")
    val it = Intent(Intent.ACTION_DIAL, uri)
    context.startActivity(it)
}