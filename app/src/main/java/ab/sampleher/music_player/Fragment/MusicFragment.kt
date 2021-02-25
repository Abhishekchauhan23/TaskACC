package ab.sampleher.music_player.Fragment

import ab.sampleher.music_player.Adapter.MusicRecycle
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ab.sampleher.music_player.R
import ab.sampleher.music_player.model.ImageModel
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicFragment : Fragment() {

     private lateinit var RecyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val MusicFrag= inflater.inflate(R.layout.fragment_music, container, false)

        var todolist= mutableListOf(
            ImageModel(R.drawable.cardless),
            ImageModel(R.drawable.sleep),
            ImageModel(R.drawable.drake),
            ImageModel(R.drawable.bhoot),
                ImageModel(R.drawable.closer),
                ImageModel(R.drawable.jalebibaby),
            ImageModel(R.drawable.lagaan),
            ImageModel(R.drawable.augustdir),
            ImageModel(R.drawable.chitchor),
            ImageModel(R.drawable.fe),
            ImageModel(R.drawable.hindimedium),
            ImageModel(R.drawable.laxmi),
            ImageModel(R.drawable.se),
            ImageModel(R.drawable.runfree),
            ImageModel(R.drawable.bb),


        )

        RecyclerView=MusicFrag.findViewById(R.id.MusicRc)
        val adapter= context?.let { MusicRecycle(it,todolist) }
        RecyclerView.adapter=adapter
        RecyclerView.layoutManager= GridLayoutManager(context,2)


     return MusicFrag
    }


}