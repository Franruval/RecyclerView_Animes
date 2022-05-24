package ruvalcaba.francisco.recycler2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ruvalcaba.francisco.recycler2.adapter.AnimeAdapter
import ruvalcaba.francisco.recycler2.modelo.Anime

class MainActivity : AppCompatActivity() {
    lateinit var myRecycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaAnimes = ArrayList<Anime>()
        listaAnimes.add(Anime("No Game No Life","https://es.web.img2.acsta.net/pictures/19/07/12/14/27/0520437.jpg"))
        listaAnimes.add(Anime("Highschool DxD","https://static.wikia.nocookie.net/highschooldxd/images/d/d1/High_School_DxD_HERO_promo_shot.jpg"))
        listaAnimes.add(Anime("Konosuba","https://static.wikia.nocookie.net/doblaje/images/1/16/Konosuba%21_God%E2%80%99s_Blessing_on_This_Wonderful_World.jpg/revision/latest?cb=20211007003758&path-prefix=es"))
        listaAnimes.add(Anime("Kaguya Sama: Love Is War","https://ramenparados.com/wp-content/uploads/2021/10/231d6304225941de4b88378de2602cc21634770687_main.jpeg"))
        listaAnimes.add(Anime("Mob Psycho 100","https://m.media-amazon.com/images/M/MV5BZmE1NjIyNjYtMTVmMy00M2YyLTljMjMtZGQwYmUxOTU4NjRlXkEyXkFqcGdeQXVyNjc3OTE4Nzk@._V1_FMjpg_UX1000_.jpg"))
        listaAnimes.add(Anime("Mushoku Tensei","https://static.wikia.nocookie.net/doblaje/images/a/ab/Mushoku_Tensei-_Jobless_Reincarnation.png/revision/latest?cb=20210826234538&path-prefix=es"))

    myRecycler=findViewById(R.id.rvAnimes)
    myRecycler.adapter=AnimeAdapter(listaAnimes)
    myRecycler.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}