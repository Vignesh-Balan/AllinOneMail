package folded.arrow.allinonemail

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.browser.customtabs.CustomTabsIntent

class GmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gmail)

        val url ="https://www.gmail.com"
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(url))

        // Find the WebView by its unique ID
//        val w = findViewById<View>(R.id.web) as WebView
//
//        // loading http://www.google.com url in the the WebView.
//        w.loadUrl("https://www.gmail.com")
//
//        // this will enable the javascript.
//        w.settings.javaScriptEnabled = true
//
//        // WebViewClient allows you to handle
//        // onPageFinished and override Url loading.
//        w.webViewClient = WebViewClient()
    }
}