package azimjon.com.bikeshop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import azimjon.com.bikeshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf(
            GridItem(R.drawable.bike2, "Road Bike", "PEUGEOT - LR01", "\$ 1,999.99"),
                GridItem(R.drawable.helmet01, "Road Helmet", "SMITH - Trade", "\$ 120"),
            GridItem(R.drawable.bike2, "Road Bike", "PEUGEOT - LR01", "\$ 1,999.99"),
            GridItem(R.drawable.helmet01, "Road Helmet", "SMITH - Trade", "\$ 120"),
            GridItem(R.drawable.bike2, "Road Bike", "PEUGEOT - LR01", "\$ 1,999.99"),
            GridItem(R.drawable.helmet01, "Road Helmet", "SMITH - Trade", "\$ 120"),
            GridItem(R.drawable.bike2, "Road Bike", "PEUGEOT - LR01", "\$ 1,999.99"),
            GridItem(R.drawable.helmet01, "Road Helmet", "SMITH - Trade", "\$ 120"),
            GridItem(R.drawable.bike2, "Road Bike", "PEUGEOT - LR01", "\$ 1,999.99"),
            GridItem(R.drawable.helmet01, "Road Helmet", "SMITH - Trade", "\$ 120"),
        )

        val adapter = GridAdapter(this, items)
        binding.gridView.adapter = adapter



    }
}