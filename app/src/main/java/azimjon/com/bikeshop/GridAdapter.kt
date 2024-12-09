package azimjon.com.bikeshop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    private val context: Context,
    private val items: List<GridItem>
) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.imageV)
        val categoryTv = view.findViewById<TextView>(R.id.categoryTv)
        val nameTv = view.findViewById<TextView>(R.id.nameTv)
        val priceTv = view.findViewById<TextView>(R.id.priceTv)

        val item = items[position]

        imageView.setImageResource(item.imageRes)
        categoryTv.text = item.category
        nameTv.text = item.name
        priceTv.text = item.price

        return view
    }
}