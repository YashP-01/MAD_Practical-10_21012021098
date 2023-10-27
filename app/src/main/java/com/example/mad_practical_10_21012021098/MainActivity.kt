package com.example.mad_practical_10_21012021098

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var personListView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        personListView = findViewById(R.id.listview)

        val btn: FloatingActionButton = findViewById(R.id.btn_float)
        btn.setOnClickListener{
            setPersonDataToListView()
        }
    }
    fun setPersonDataToListView(){
        personListView.adapter = PersonAdapter(this, arrayListOf(
            Person("pid", "nothing", "yp@", "123", "asdfasdf", 12.4, 11.6),
            Person("pid1", "nothing1", "yp@1", "111", "asdfgghhg", 45.1, 67.4),
            Person("pid2", "nothing2", "yp@2", "145", "alkjdfai", 71.9, 23.6),
            Person("pi3", "nothing3", "yp@3", "196", "alkjiopol", 22.4, 23.8),
            Person("pid4", "nothing4", "yp@4", "110", "aldfasddi", 59.9, 11.0)
        ))
    }
}