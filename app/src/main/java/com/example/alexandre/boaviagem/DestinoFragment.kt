package com.example.alexandre.boaviagem


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DestinoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destino, container, false)

        val layout = inflater.inflate(R.layout.fragment_destino, container, false)

        val listaLocal = arrayOf("Rio de Janeiro","Florianopolis","Chapeco","São Paulo","Manaus","Balneario Camboriu","Blumenau"
            ,"Porto Alegre","Belo Horizonte","Angra dos Reis","Brasilia","Porto de Galinhas","Recife","Vitoria")
        var mySpinner: Spinner? = layout.findViewById(R.id.spinner)

        var adapter = ArrayAdapter(this.context, android.R.layout.simple_list_item_1,listaLocal)
        mySpinner!!.adapter = adapter

        return layout
    }


}
