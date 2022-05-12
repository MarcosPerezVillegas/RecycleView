package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Modelo.Personaje
import com.example.recycleview.adaptador.PersonajeAdapter

class MainActivity : AppCompatActivity() {
    lateinit var miRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonaje = ArrayList<Personaje>()
        listaPersonaje.add(Personaje("Chika Fujiwara","https://imgur.com/WGdU0Yc.png"))
        listaPersonaje.add(Personaje("Kaguya Shinomiya","https://cdn.discordapp.com/attachments/472313197836107780/607384191361089536/RHQrQyY.png"))
        listaPersonaje.add(Personaje("Kanna Kamui","https://cdn.discordapp.com/attachments/872026548692209738/872046024611479612/cKGCgYe.png"))
        listaPersonaje.add(Personaje("Asuka Langley Soryu","https://imgur.com/DEzQHLs.png"))
        listaPersonaje.add(Personaje("Fubuki","https://imgur.com/YnPBBZz.png"))
        miRecyclerView = findViewById(R.id.RecyclerVista)
        miRecyclerView.adapter=PersonajeAdapter(listaPersonaje)
        miRecyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        //GridLayoutManager
        //StaggeredGridLayoutManager
    }
}