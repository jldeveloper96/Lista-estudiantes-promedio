package com.example.listacalificaciones

class Logic {
    fun average(math: Float,
                phy: Float,
                bio: Float,
                hys: Float,
                chem: Float): String {

        val dataError:String = "DATA INPUT ERROR"
        //Lógica promedio
         if(math in 0.0..10.0 &&
            phy in 0.0..10.0 &&
            bio in 0.0..10.0 &&
            hys in 0.0..10.0 &&
            chem in 0.0..10.0) {

            val sum = math + phy + hys + bio + chem
            val n = 5
            val grade = sum / n

           return grade.toString()
        }else{
            return dataError
        }

    }

}