package com.example.listacalificaciones


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacalificaciones.databinding.ItemStudentBinding
import com.squareup.picasso.Picasso



class StudentAdapter(val student:List<Student>): RecyclerView.Adapter<StudentAdapter.StudentHolder>() {

    //Llamada a viewBinding

    //Clase para crear la llamada al holder
    inner class StudentHolder(val binding: ItemStudentBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        val binding = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        with(holder) {
            with(student[position]) {
                binding.etName.text = this.name
                binding.etAge.text = this.age
                binding.etId.text = this.id
                Picasso.get().load(this.image).into(binding.ivStudent)
                }
            binding.btnSendRv.setOnClickListener(View.OnClickListener() {
                    val i = Intent(this.itemView.context,Grades::class.java)
                    holder.itemView.context.startActivity(i)
            })

            }
        }
    override fun getItemCount(): Int {
        return student.size
    }

}
