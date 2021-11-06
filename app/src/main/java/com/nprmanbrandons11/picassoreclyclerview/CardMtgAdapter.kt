package com.nprmanbrandons11.picassoreclyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.nprmanbrandons11.picassoreclyclerview.databinding.ItemCardmtgBinding
import com.squareup.picasso.Picasso

class CardMtgAdapter(val mtgCard:List<cardMTG>): RecyclerView.Adapter<CardMtgAdapter.CardHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return  CardHolder(ItemCardmtgBinding.inflate(layoutinflater,parent,false) )
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.render(mtgCard[position])
    }

    override fun getItemCount(): Int {
        return mtgCard.size
    }
    class CardHolder(val binding: ItemCardmtgBinding ):RecyclerView.ViewHolder(binding.root){

        fun render(mtgCard:cardMTG){

            binding.tvNombre.text = mtgCard.nombre
            binding.tvTipo.text = mtgCard.type
            binding.tvCMC.text = mtgCard.coste

            Picasso.get().load(mtgCard.img).into(binding.cardImage)
            binding.root.setOnClickListener{
                Toast.makeText(binding.root.context,"Has seleccionado:${mtgCard.nombre}",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
