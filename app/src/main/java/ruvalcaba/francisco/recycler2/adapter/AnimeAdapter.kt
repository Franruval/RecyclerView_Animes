package ruvalcaba.francisco.recycler2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ruvalcaba.francisco.recycler2.R
import ruvalcaba.francisco.recycler2.modelo.Anime

class AnimeAdapter(val listaAnimes:ArrayList<Anime>):RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNombre: TextView
        val ivAnime: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            tvNombre = view.findViewById(R.id.tvNombre)
            ivAnime = view.findViewById(R.id.ivAnime)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view= LayoutInflater.from(parent.context).inflate(R.layout.vista_individual,parent,false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvNombre.text = listaAnimes[position].nombre
        Picasso.get().load(listaAnimes[position].imagen).into(viewHolder.ivAnime)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = listaAnimes.size

}