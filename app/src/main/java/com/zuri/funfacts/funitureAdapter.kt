package com.zuri.funfacts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class funitureAdapter(context: Context, funiture:List<Funitures>):ArrayAdapter<Funitures>(context,0,funiture) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val funiture =getItem(position)
        if( view==null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.funiture_item,parent,false)
        }
        val logo = view?.findViewById<ImageView>(R.id.image_logo)
        val name = view?.findViewById<TextView>(R.id.name)
        funiture?.Image?.let {
            logo?.setImageResource(funiture?.Image)
        }
        name?.text = funiture?.name
        return view!!
    }
}