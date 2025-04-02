package io.github.kayquesanmartin.status_alunos

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var alunoSpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        alunoSpinner = findViewById(R.id.alunoSpinner)

        val options = resources.getStringArray(R.array.alunos)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, options)
        alunoSpinner.adapter = adapter

        alunoSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedAluno = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity2, "Aluno selecionado: $selectedAluno", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Não mudar nada")
            }

        }

    }
}