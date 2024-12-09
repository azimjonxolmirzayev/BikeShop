package azimjon.com.bikeshop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import azimjon.com.bikeshop.databinding.ActivityBikeDescriptionBinding

class BikeDescriptionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBikeDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBikeDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra("image", R.drawable.bike01)
        val name = intent.getStringExtra("name")
        val category = intent.getStringExtra("category")
        val price = intent.getStringExtra("price")
        val description = intent.getStringExtra("description")

        binding.nameTv.text = name?.uppercase()
        binding.imageView.setImageResource(imageId)
        binding.nametv2.text = name?.uppercase()
        binding.descriptionTv.text = description
        binding.priceTv.text = price

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}