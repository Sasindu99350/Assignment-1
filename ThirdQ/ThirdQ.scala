object ThirdQ extends App{


     def cost(x:Int):Double={
     
        var total_for_books:Double=(24.95-(24.95*40/100))*x;
        var total_for_shipping:Double=0;
        if(x<=50)
       {  
          total_for_shipping=50*3;


      
       }
       
       else{
             total_for_shipping=(50*3)+((3/2)*(x-50));
   
  
  

         }

    return total_for_shipping+total_for_books;





          }



    println("Wholesale cost for 60= Rs."+cost(60));




}