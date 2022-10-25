package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.StringJoiner


@RestController
@RequestMapping("/hello")

class Practice {

    @GetMapping()
    fun index():String{
        val age:Int = 18
        return ("Hola Mundo tengo $age años!")

    }


    //@GetMapping("/{age}")
    //fun indexAge(@PathVariable age:Long):String{

      //  return ("Hola tengo $age años")
    //}

    @GetMapping("/{age}")
    fun ageComprobation (@PathVariable age: Long):String {
        //print("Enter the name of heavenly body: ")
        //var name= readLine()!!.toString()
        return when(age) {
            in 0..17-> ("Baby")
            in 18..50 -> ("Adult")
            in 50..100 -> ("Old")
            else -> ("Yo no sé")
        }

    }




}

