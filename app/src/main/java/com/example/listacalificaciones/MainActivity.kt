package com.example.listacalificaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listacalificaciones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    //Estudiantes
    var students: List<Student> = listOf(
        Student("CARLOS","21","33456","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.N1zv3yv_hO4eXbyFP28kkAHaLH%26pid%3DApi&f=1"),
        Student("MARINA","20","35987","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.qCcLRNSi-EZ-1EoMoIERlAHaEU%26pid%3DApi&f=1"),
        Student("LUIS","22","65487","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fescueladelamemoria.com%2Fwp-content%2Fuploads%2F2018%2F01%2Festudiante-eficiente.jpg&f=1&nofb=1"),
        Student("JOSÉ","24","78965","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.wZMpEx0dae3h4EzZyCiF0gHaE8%26pid%3DApi&f=1"),
        Student("MARIO","19","12356","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fd1poh340f4imgl.cloudfront.net%2Fupload%2Fimages%2F534x326%2F2015%2F07%2F12%2F400e7f724128514a58b930a75a70d597_534x326.jpg&f=1&nofb=1"),
        Student("ALBERTO","18","98713","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fenlinea.santotomas.cl%2Fwp-content%2Fuploads%2Fsites%2F2%2F2018%2F03%2Fvu-700x465.png&f=1&nofb=1"),
        Student("PABLO","21","96307","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.1uOPrgu8KaCIIT8o8B9qxQHaE8%26pid%3DApi&f=1"),
        Student("JUAN","20","96518","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fblog.miotroseguro.com%2Fwp-content%2Fuploads%2F2013%2F04%2FEstudiantes-practicas-10453448_s.jpg&f=1&nofb=1"),
        Student("LAURA","24","73198","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.uq5B3kHEJ8toxXyAakJpzgHaDt%26pid%3DApi&f=1"),
        Student("CLARISA","18","37196","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmiro.medium.com%2Fmax%2F11974%2F1*S6KveFtkjF_3IV4ct4asXA.jpeg&f=1&nofb=1"),
        Student("KARLA","26","82465","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.compass-insurance-agency.com%2Fwp-content%2Fuploads%2F2016%2F09%2Fgirl-education.jpg&f=1&nofb=1"),
        Student("MARÍA","25","37968","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.istockphoto.com%2Fphotos%2Fconfident-student-works-on-writing-assignment-picture-id670155060%3Fk%3D6%26m%3D670155060%26s%3D170667a%26w%3D0%26h%3DAEC5HDshlq0D7zlfQ4OBBI8b7rU6LkRc78SubW1evcs%3D&f=1&nofb=1"),
        Student("FERNANDA","27","11965","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.gobankingrates.com%2Fwp-content%2Fuploads%2F2014%2F08%2Fstudent-discount-shutterstock_729330226-1024x576.jpg&f=1&nofb=1"),
        Student("MONTSERRAT","20","99874","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fpngimg.com%2Fuploads%2Fstudent%2Fstudent_PNG124.png&f=1&nofb=1"),
        Student("FRIDA","19","33465","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstatic6.depositphotos.com%2F1008303%2F565%2Fi%2F950%2Fdepositphotos_5655280-stock-photo-mixed-race-college-student.jpg&f=1&nofb=1"),
        Student("KARINA","25","88465","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fpngimg.com%2Fuploads%2Fstudent%2Fstudent_PNG17.png&f=1&nofb=1"),
        Student("ANDRÉA","20","37402","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.istockphoto.com%2Fphotos%2Fhappy-female-hispanic-student-picture-id172721393%3Fk%3D6%26m%3D172721393%26s%3D170667a%26w%3D0%26h%3D9LKUBlGNZAXhYho9o1RbPSyHmQArX8PWsEZCqEWeB2A%3D&f=1&nofb=1"),
        Student("LORENA","26","40055","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fthumbs.dreamstime.com%2Fb%2Fstudent-holding-books-28702352.jpg&f=1&nofb=1"),
        Student("ANA","28","60053","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.guim.co.uk%2Fimg%2Fstatic%2Fsys-images%2FGuardian%2FPix%2Fpictures%2F2014%2F9%2F8%2F1410187723325%2Fffaa5786-6d4e-40b0-94fb-10d54d38d81d-1360x2040.jpeg%3Fw%3D1200%26q%3D55%26auto%3Dformat%26usm%3D12%26fit%3Dmax%26s%3D51e34f45e14fb59f9fbdd2061a15043c&f=1&nofb=1"),
        Student("BEATRIZ","23","776452", "http://eagle.northwestu.edu/departments/admissions/files/2018/09/Student-Workers-Megan.jpg")
    )

    //Declaracion de variable para binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //Llamada de binding para inflar vista
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Variable para guardar el binding a root
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        initRecycler()

    }



    //Llama al recyclerView adapter
    fun initRecycler(){
        binding.rvStudent.layoutManager = LinearLayoutManager(this)
        val adapter = StudentAdapter(students)
        binding.rvStudent.adapter = adapter
    }

}