package varsha.jawahar.myimpactapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_log.*
import varsha.jawahar.myimpactapp.AddingPoints.AddMeals
import varsha.jawahar.myimpactapp.AddingPoints.AddShower
import varsha.jawahar.myimpactapp.AddingPoints.AddTrips

class AddLog: AppCompatActivity() {


    companion object Total{
        var total_showers = 0;
        var total_meals = 0;
        var total_trips = 0;

        var final_total = total_showers + total_meals + total_trips


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_log)


        addShower.setOnClickListener {
            val intent = Intent(this, AddShower:: class.java)
            startActivity(intent)
        }

        addMeals.setOnClickListener {
            val intent2 = Intent(this, AddMeals:: class.java)
            startActivity(intent2)
        }

        addTrips.setOnClickListener {
            val intent3 = Intent(this, AddTrips:: class.java )
            startActivity(intent3)
        }
    }
}