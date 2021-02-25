package ab.sampleher.music_player.Adapter

import ab.sampleher.music_player.PlayerActivity
import ab.sampleher.music_player.R
import ab.sampleher.music_player.model.ImageModel
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import kotlin.math.round

class MusicRecycle(val context: Context,var ImageMod:List<ImageModel>): RecyclerView.Adapter<MusicRecycle.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val view=LayoutInflater.from(parent.context).inflate(R.layout.music_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(ImageMod[position])
        holder.itemView.setOnClickListener(View.OnClickListener {
            val model= ImageMod.get(position)

            val imageVi:Int=model.Image
            val intent=Intent(context,PlayerActivity::class.java)
            intent.putExtra("imageview",imageVi)
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
      return ImageMod.size
    }

   inner class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {

      fun bind(ImageMod:ImageModel)
      {

         itemView.findViewById<ImageView>(R.id.Banner).load(ImageMod.Image)
         {
            // transformations(RoundedCornersTransformation(1000.0f))
             transformations(CircleCropTransformation())
         }
      }
    }

}