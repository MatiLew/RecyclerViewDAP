package com.example.recyclerviewdap

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdap.entities.FiloAdapters
import com.example.recyclerviewdap.entities.Filosofia
import com.example.recyclerviewdap.viewModels.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment() {

    private lateinit var v: View
    lateinit var recFilo: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var filoListAdapter: FiloAdapters

    var filosofos : MutableList<Filosofia> = ArrayList()

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.main_fragment, container, false)
        recFilo = v.findViewById(R.id.rec_filo)
        filosofos.add(Filosofia("Platon", "Academia de Atenas", "IV a.C.", "https://www.biografiasyvidas.com/biografia/p/fotos/platon_2.jpg"))
        filosofos.add(Filosofia("Maquiavelo", "Escuela de Florencia", "XV", "link2"))
        filosofos.add(Filosofia("Spinoza", "Universidad Leiden", "XVII", "link3"))
        filosofos.add(Filosofia("Descartes", "Varios", "XVI", "link4"))
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }


    override fun onStart() {
        super.onStart()
        recFilo.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recFilo.layoutManager = linearLayoutManager

        filoListAdapter = FiloAdapters(filosofos, requireContext()) {
            pos -> onItemClick(pos)
        }
        recFilo.adapter = filoListAdapter
    }

    fun onItemClick ( position : Int )  {
        Snackbar.make(v,position.toString(), Snackbar.LENGTH_SHORT).show()
    }
}