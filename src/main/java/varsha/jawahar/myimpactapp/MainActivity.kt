package varsha.jawahar.myimpactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        logButton.setOnClickListener {
            val intent = Intent(this, AddLog:: class.java)
            startActivity(intent)
        }

        statsButton.setOnClickListener {
            val intent = Intent(this, MyStats:: class.java)
            startActivity(intent)
        }

        rewardsButton.setOnClickListener {  }

        userButton.setOnClickListener {
            val intent = Intent(this, Settings:: class.java)
            startActivity(intent)
        }

    }
}
