package com.nprmanbrandons11.picassoreclyclerview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nprmanbrandons11.picassoreclyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    val cards = listOf(
        cardMTG("Teferi,hero of dominaria","3WU","Legendary Planeswalker - Teferi","https://c1.scryfall.com/file/scryfall-cards/large/front/5/d/5d10b752-d9cb-419d-a5c4-d4ee1acb655e.jpg?1562736365"),
        cardMTG("Supreme Verdict","1WWU","Sorcery","https://c1.scryfall.com/file/scryfall-cards/large/front/a/6/a679cc74-6119-468f-8c64-5dcf216438d1.jpg?1562852509"),
        cardMTG("Memory Deluge","2UU","Instant","https://c1.scryfall.com/file/scryfall-cards/large/front/d/c/dc00fd1b-3dd9-492a-9ed4-0b6743074730.jpg?1634349038"),
        cardMTG("Flooded Strand","","Land","https://c1.scryfall.com/file/scryfall-cards/large/front/8/c/8c2996d9-3287-4480-8c04-7a378e37e3cf.jpg?1571667973"),
        cardMTG("Solitude","3WW","Creature","https://c1.scryfall.com/file/scryfall-cards/large/front/4/7/47a6234f-309f-4e03-9263-66da48b57153.jpg?1626094105"),
        cardMTG("Chalice of the Void","XX","Artifact","https://c1.scryfall.com/file/scryfall-cards/large/front/1/f/1f0d2e8e-c8f2-4b31-a6ba-6283fc8740d4.jpg?1562433485"),
        cardMTG("Shark Typhoon","5U","Enchantment","https://c1.scryfall.com/file/scryfall-cards/large/front/1/d/1da4d4f3-b3cb-4b61-81b8-06ae441c41bf.jpg?1591226502"),

        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }

    fun initRecycler(){
        binding.recyclerCards.layoutManager = LinearLayoutManager(this)
        binding.recyclerCards.adapter = CardMtgAdapter(cards)

    }
}