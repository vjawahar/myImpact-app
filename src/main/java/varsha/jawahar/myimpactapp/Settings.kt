package varsha.jawahar.myimpactapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_meals.*
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {





    companion object Goal {
        var userGoal = 0;

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        var tempGoal = 0;

        //set goal



        resultGoal.visibility = View.INVISIBLE


        resultGoal.text = "Goal: "

        saverButton.setOnClickListener {

           tempGoal = Integer.parseInt(userInput.text.toString())

           resultGoal.visibility = View.VISIBLE
            userGoal = tempGoal
        }



    }
}