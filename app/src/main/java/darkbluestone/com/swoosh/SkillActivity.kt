package darkbluestone.com.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var league = ""

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
