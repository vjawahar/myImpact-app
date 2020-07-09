package varsha.jawahar.myimpactapp.AddingPoints

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_shower.*
import varsha.jawahar.myimpactapp.AddLog
import varsha.jawahar.myimpactapp.R


class AddShower: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_shower)

        pointNum.visibility = View.INVISIBLE
        var resultPoint = 0;

        getPoints.setOnClickListener {
            if(editShower.text.toString().isEmpty()){
                pointNum.text = "Invalid Input"
            }

            else {
                val num = Integer.parseInt(editShower.text.toString())

                if(num > 15){
                    pointNum.text = "Points: 00"
                }

                else if(num > 10){
                    pointNum.text = "Points: 10"
                }

                else if(num > 5){
                    pointNum.text = "Points: 20"
                }
                else if(num > 0){
                    pointNum.text = "Points: 30"
                }
                else if(num == 0){
                    pointNum.text = "Go take a quick shower!!"
                }
            }


            pointNum.visibility = View.VISIBLE

        }


        saveButton.setOnClickListener {
            resultPoint = Integer.parseInt(pointNum.text.toString().substring(8, 10))
            AddLog.total_showers = resultPoint
        }

    }



}