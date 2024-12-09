package azimjon.com.bikeshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import azimjon.com.bikeshop.databinding.GridItemBinding

class RecyclerViewAdapter(
    private val items: List<RecyclerViewItem>
) : RecyclerView.Adapter<RecyclerViewAdapter.MyGridViewHolder>() {

    private var recyclerViewListener: RecyclerViewListener? = null

    inner class MyGridViewHolder(val binding: GridItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                recyclerViewListener?.onItemClick(adapterPosition)
            }
        }


        fun bind(item: RecyclerViewItem) {
            binding.imageV.setImageResource(item.imageRes)
            binding.categoryTv.text = item.category
            binding.nameTv.text = item.name
            binding.priceTv.text = item.price
        }
    }

    fun setListener(listener: RecyclerViewListener) {
        recyclerViewListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGridViewHolder {
        return MyGridViewHolder(
            GridItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyGridViewHolder, position: Int) {
        holder.bind(items[position])
    }

}
