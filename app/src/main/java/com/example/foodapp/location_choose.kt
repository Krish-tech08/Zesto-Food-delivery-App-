package com.example.foodapp
import android.widget.ArrayAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodapp.databinding.ActivityStartScreenBinding

class location_choose : AppCompatActivity() {
    private  val binding: ActivityStartScreenBinding by lazy {
        ActivityStartScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
//val locationList= arrayOf("Delhi", "Mumbai", "Bengaluru", "Hyderabad", "Chennai", "Kolkata", "Pune", "Ahmedabad", "Jaipur", "Surat",
//    "Lucknow", "Kanpur", "Nagpur", "Indore", "Bhopal", "Patna", "Ludhiana", "Agra", "Vadodara", "Nashik",
//    "Faridabad", "Meerut", "Rajkot", "Amritsar", "Varanasi", "Ranchi", "Guwahati", "Chandigarh", "Coimbatore", "Thiruvananthapuram")
//        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, locationList)
//         binding.listOf_location.setAdapter(adapter)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}