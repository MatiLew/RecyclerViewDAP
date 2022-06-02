package com.example.recyclerviewdap.viewModels

import androidx.lifecycle.ViewModel
import com.example.recyclerviewdap.entities.Filosofia

class MainViewModel : ViewModel() {
    var filosofos: MutableList<Filosofia> = ArrayList()

    init {
        addFilo()
    }

    fun addFilo() {
        filosofos.add(
            Filosofia(
                "Platon",
                "Academia de Atenas",
                "IV a.C.",
                "https://www.biografiasyvidas.com/biografia/p/fotos/platon_2.jpg",
                "Buenas tardes"
            )
        )
        filosofos.add(
            Filosofia(
                "Maquiavelo",
                "Escuela de Florencia",
                "XV",
                "https://cdn.culturagenial.com/es/imagenes/nicolas-maquiavelo-cke.jpg"
            )
        )
       filosofos.add(
            Filosofia(
                "Spinoza",
                "Universidad Leiden",
                "XVII",
                "https://www.biografiasyvidas.com/biografia/s/fotos/spinoza.jpg"
            )
        )
        filosofos.add(
            Filosofia(
                "Descartes",
                "Varios",
                "XVI",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Frans_Hals_-_Portret_van_Ren%C3%A9_Descartes.jpg/800px-Frans_Hals_-_Portret_van_Ren%C3%A9_Descartes.jpg"
            )
        )
    }
}