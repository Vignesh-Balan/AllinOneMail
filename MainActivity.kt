package folded.arrow.allinonemail

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gmail_button.setOnClickListener(this)
        proton_button.setOnClickListener(this)
        yahoo_button.setOnClickListener(this)
        zoho_button.setOnClickListener(this)
        outlook_button.setOnClickListener(this)


    }

    override fun onClick(view: View) {

        val intent1 = when(view.id)  {
            R.id.gmail_button -> Intent(this,GmailActivity::class.java)
            R.id.proton_button -> Intent(this,ProtonActivity::class.java)
            R.id.yahoo_button -> Intent(this,YahooActivity::class.java)
            R.id.zoho_button -> Intent(this,ZohoActivity::class.java)
            R.id.outlook_button -> Intent(this,OutlookActivity::class.java)
            else -> throw IllegalArgumentException("Undefined button clicked")
        }
        startActivity(intent1)

    }
}