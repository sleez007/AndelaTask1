package com.example.andelatask1.model

class BioModel {

    private lateinit var fullName:String;
    private lateinit var country:String;
    private lateinit var email:String;
    private lateinit var phoneNumber:String;
    private lateinit var slackUsername:String;

    fun setFullName(fullName:String){
        this.fullName =fullName;
    }

    fun setCountry(country:String){
        this.country = country;
    }

    fun setEmail(email:String){
        this.email = email;
    }

    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }

    fun setSlackUsername(slackUserName:String){
        this.slackUsername = slackUsername
    }


    fun getFullName():String{
        return fullName;
    }

    fun getCountry():String{
        return country;
    }

    fun getEmail():String{
        return email;
    }

    fun getPhoneNumber():String{
        return phoneNumber
    }

    fun getSlackUsername():String{
        return slackUsername;
    }
}