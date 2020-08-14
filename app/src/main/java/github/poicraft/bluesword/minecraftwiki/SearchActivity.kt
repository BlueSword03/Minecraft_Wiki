package github.poicraft.bluesword.minecraftwiki

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient


class SearchActivity : Activity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        webView = findViewById<View>(R.id.web_view2) as WebView
        webView!!.settings.javaScriptEnabled = true
        webView!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        webView!!.loadUrl("https://minecraft-zh.gamepedia.com/index.php?search=")
    }
}
