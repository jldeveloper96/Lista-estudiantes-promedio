package com.example.listacalificaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.listacalificaciones.databinding.ActivityGradesBinding

class Grades : AppCompatActivity() {
    //Creación de variable binding
    private lateinit var binding: ActivityGradesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //Llamada a binding
        binding = ActivityGradesBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        binding.btnFinalGrade.setOnClickListener {
            //Variabales
           /* val math = binding.etMath.text
            val phy = binding.etPhy.text
            val bio = binding.etBio.text
            val hys = binding.etHys.text
            val chem = binding.etChem.text*/
            val pass = "PASS"
            val notPass = "NOT PASS"
            val error = ""

            //clase y función del promedio
            val nS = Logic().average(
                binding.etMath.text.toString().toFloat(),
                binding.etPhy.text.toString().toFloat(),
                binding.etBio.text.toString().toFloat(),
                binding.etHys.text.toString().toFloat(),
                binding.etChem.text.toString().toFloat()
            )

            //función para vista de resultados
                if (nS == "DATA INPUT ERROR"){
                    binding.tvStatus.text = nS
                    binding.tvFinalGrade.text = error
                }
                else{
                    val nF = nS.toFloat()
                    if (nF in 6.0..10.0) {
                        binding.tvStatus.text = pass
                        binding.tvFinalGrade.text = nS
                    } else{
                        binding.tvStatus.text = notPass
                        binding.tvFinalGrade.text = nS
                    }
                }

        }
    }
}



