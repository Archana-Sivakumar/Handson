

function validate(){ 
	
	document.getElementById("title_msg").innerHTML = " ";
	document.getElementById("price_msg").innerHTML = " ";
	document.getElementById("launch_msg").innerHTML = " ";
	document.getElementById("category_msg").innerHTML = " ";
    var title = document.getElementById("title_id").value;
    
    var price = document.getElementById("price_id").value;
    
    var dateLaunch = document.getElementById("launch_id").value;
	var dateArray = /^\d{1,2}\/\d{1,2}\/\d{4}$/;
    var titleLen = title.length;
    var priceLen = price.length;
    var dateLen = dateLaunch.length;
    var validationFlag = 0;
    if (titleLen == ""){
    	
       document.getElementById("title_msg").innerHTML = "*Title is required <br> *Title should have 2 to 65 characters";
       validationFlag = 1;
       
    }
    else if(titleLen == 1 || titleLen == 2 || titleLen>65){
       document.getElementById("title_msg").innerHTML = "*Title should have 2 to 65 characters";
       validationFlag = 1;
    }
    if (price == ""){
       document.getElementById("price_msg").innerHTML = "*Price is required";
       validationFlag = 1;
       //alert("invalidate");
    }
    else if(isNaN(price)){
       document.getElementById("price_msg").innerHTML = "*Price has to be a number";
       validationFlag = 1;
    }
    if (dateLen == "" || !dateLaunch.match(dateArray)){
       document.getElementById("launch_msg").innerHTML = "*Date of Launch is required <br> Please follow the specified date format";
	   validationFlag = 1;
    }
    if (dateLaunch == ""){
        document.getElementById("launch_msg").innerHTML = "*Date of Launch is required <br> Please follow the specified date format";
        validationFlag = 1;
     }
   if(document.getElementById("none").selected){
       document.getElementById("category_msg").innerHTML = "*Select one category";
      validationFlag = 1;
    }
    if(validationFlag == 1){
    	return false;
    }
    else{
    	return true;
    }
    
}