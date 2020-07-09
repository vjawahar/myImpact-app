package varsha.jawahar.myimpactapp.AddingPoints

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_meals.*
import varsha.jawahar.myimpactapp.AddLog
import varsha.jawahar.myimpactapp.R

class AddMeals: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_meals)

        var tempPoints = 0;
        var num = 0
        resultPoints.visibility = View.INVISIBLE


        calcPoints.setOnClickListener {
            if(numMeals.text.toString().isEmpty()){
                resultPoints.text = "Invalid Input"
            }

            else {
                num = Integer.parseInt(numMeals.text.toString())


                resultPoints.text = "Points: " + num + "0"


            }

           tempPoints = num * 10
            resultPoints.visibility = View.VISIBLE
        }



        savingButton.setOnClickListener {
            //tempPoints = Integer.parseInt(resultPoints.text.toString())
            AddLog.total_meals = tempPoints


        }

    }
}