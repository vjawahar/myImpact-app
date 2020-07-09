package varsha.jawahar.myimpactapp.AddingPoints

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_add_trips.*
import varsha.jawahar.myimpactapp.AddLog
import varsha.jawahar.myimpactapp.R

class AddTrips : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_add_trips)


            var tempSum = 0;
            var ratio = 0

            pointResults.visibility = View.INVISIBLE

            gettingPoints.setOnClickListener {
                if(bikeTrips.text.toString().isEmpty() || carTrips.text.toString().isEmpty()){
                    pointResults.text = "Invalid Input"
                }
                val bike  = (bikeTrips.text.toString()).toDouble()
                val car = carTrips.text.toString().toDouble()
                val ratio : Double = (bike/(car + 1)) * 100
                pointResults.text = "Points: " + ratio.toString()


            tempSum = Integer.parseInt(pointResults.text.toString())
            pointResults.visibility = View.VISIBLE
            }



            buttonSave.setOnClickListener {
                AddLog.total_trips = tempSum;
            }
        }
}