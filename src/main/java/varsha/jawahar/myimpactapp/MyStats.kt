package varsha.jawahar.myimpactapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_stats.*

class MyStats: AppCompatActivity() {





        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_my_stats)



            println("USER GOAL" + Settings.userGoal)

          //  progressBar.max = Settings.userGoal
            progressBar.max = Settings.userGoal //user goal
            progressBar.progress = 60
                //AddLog.final_total //TOTAL



        }







}