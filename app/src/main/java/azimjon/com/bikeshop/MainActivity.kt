package azimjon.com.bikeshop

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import azimjon.com.bikeshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf(
            RecyclerViewItem(
                R.drawable.bike01,
                "Road Bike",
                "PEUGEOT - LR01",
                "\$ 1,999.99",
                "The LR01 combines iconic PEUGEOT design with agile, dynamic performance. With a lugged steel frame and 16-speed Shimano Claris drivetrain, it's perfect for city commuting or road trips."
            ),
            RecyclerViewItem(
                R.drawable.helmet01,
                "Road Helmet",
                "SMITH - Trade",
                "\$ 120",
                "Designed for safety and comfort, this helmet features advanced aerodynamic design and optimal ventilation for long rides."
            ),
            RecyclerViewItem(
                R.drawable.bike3,
                "Mountain Bike",
                "Trek Marlin 7",
                "\$ 999.99",
                "Built for rugged terrain, this bike features a strong aluminum frame and wide tires for better grip and stability on uneven paths."
            ),

        )


        val recyclerView = binding.recyclerView

        val adapter = RecyclerViewAdapter(items)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter


        adapter.setListener(object : RecyclerViewListener {
            override fun onItemClick(position: Int) {
                Intent(this@MainActivity, BikeDescriptionActivity::class.java).apply {
                    putExtra("image", items[position].imageRes)
                    putExtra("name", items[position].name)
                    putExtra("category", items[position].category)
                    putExtra("price", items[position].price)
                    putExtra("description", items[position].description)
                    startActivity(this)
                }
            }
        })
    }
}