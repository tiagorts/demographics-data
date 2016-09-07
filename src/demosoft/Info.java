/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosoft;

import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class Info {
    private String countryCode;
    private String countryName;
    private String topic;
    private int startYear;
    private int endYear;
    private HashMap<Integer,String> results;
    
    //Constructor
   public Info(String countryCode, String countryName, String topic, int startYear, int endYear, HashMap<Integer,String> results){
       this.countryCode = countryCode;
       this.countryName = countryName;
       this.topic = topic;
       this.startYear =  startYear;
       this.endYear =  endYear;
       this.results = results;
    }
   
   public void setCountryCode(String countryCode){
       this.countryCode = countryCode;
   }
   
   public void setCountryName(String countryName){
       this.countryName = countryName;
   }
   
   public void setTopic(String topic){
       this.topic = topic;
   }
   
   public void setStartYear(int startYear){
      this.startYear = startYear;
   }
   
   public void setEndYear(int endYear){
       this.endYear = endYear;
   }
   
   //set results
   public void addData(int year, String data){
       this.results.put(year, data);
   }
   
   public String getCountryCode(){
       return countryCode; 
   }
   
   public String getCountryName(){
       return countryName; 
   }
   
   public String getTopic(){
       return topic; 
   }
   
   public int getStartYear(){
       return startYear; 
   }
   
   public int getEndYear(){
       return endYear; 
   }
   
   public String getResult(int year){
       return results.get(year);
   }
}
   
    

