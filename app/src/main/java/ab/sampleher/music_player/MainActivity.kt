package ab.sampleher.music_player
import ab.sampleher.music_player.Fragment.MusicFragment
import ab.sampleher.music_player.Fragment.AlbumFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var pager2:ViewPager2

    private lateinit var MusicFragment:Fragment
    private lateinit var AlbumFragment:Fragment

    private lateinit var f1Fragment:FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Views Declare
        tabLayout=findViewById(R.id.tabLayout)
        MusicFragment=MusicFragment()
        AlbumFragment=AlbumFragment()

         setCurrentFragment(MusicFragment)

        // Tab Layout
        tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(applicationContext, "Tab " + tab?.getPosition(), Toast.LENGTH_SHORT).show();
                if ( tab?.getPosition()==1)
                {
                    setCurrentFragment(AlbumFragment)
                }
                if (tab?.getPosition()==0){
                    setCurrentFragment(MusicFragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.f1fragment,fragment)
            commit()
        }
}