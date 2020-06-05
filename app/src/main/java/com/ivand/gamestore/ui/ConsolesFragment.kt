package com.ivand.gamestore.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivand.gamestore.R
import com.ivand.gamestore.data.Console
import com.ivand.gamestore.data.getConsoles
import com.ivand.gamestore.ui.adapter.AdapterConsoles
import kotlinx.android.synthetic.main.fragment_consoles.*

class ConsolesFragment : Fragment(), AdapterConsoles.ListenerClick {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_consoles, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AdapterConsoles(getConsoles(), this) {
//            if(!it) {
//                txtListEmpty.gone()
//            }else
//                listConsole.gone()
        }

        listMenu.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }

    }

    override fun onItemClick(console: Console) {
    }
}
