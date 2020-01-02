 function validate(){ 
	document.getElementById("title_msg").innerHTML = " ";
	document.getElementById("boxOffice_msg").innerHTML = " ";
	document.getElementById("launch_msg").innerHTML = " ";
	document.getElementById("genre_msg").innerHTML = " ";
    var title = document.getElementById("title_id").value;
    var boxOffice = document.getElementById("box_id").value;
    var dateLaunch = document.getElementById("launch_id").value;
    var titleLen = title.length;
    var boxOfficeLen = boxOffice.length;
    var dateLen = dateLaunch.length;
	var dateArray = /^\d{1,2}\/\d{1,2}\/\d{4}$/;
    var validationFlag = 0;
    
    if (titleLen == ""){
       document.getElementById("title_msg").innerHTML = "*Title is required <br> *Title should have 2 to 100 characters";
	   validationFlag = 1;
    }
    else if(titleLen == 1 || titleLen == 2 || titleLen>65){
       document.getElementById("title_msg").innerHTML = "*Title should have 2 to 100 characters";
	   validationFlag = 1;
    }
    if (boxOffice == ""){
       document.getElementById("boxOffice_msg").innerHTML = "*Box Office is required";
 	   validationFlag = 1;
    }
   /* else if(isNaN(boxOffice)){
       document.getElementById("boxOffice_msg").innerHTML = "*Box Office has to be a number";
       validationFlag = 1;
    }*/
    if (dateLen == ""){
       document.getElementById("launch_msg").innerHTML = "*Date of Launch is required <br> *Please follow the specified date format";
	   validationFlag = 1;
    }
	/*else if(!dateLaunch.match(dateArray)){
	   document.getElementById("launch_msg").innerHTML = "*Please follow the specified date format";
	   validationFlag = 1;
	}	
    if(document.getElementById("none").selected){
       document.getElementById("genre_msg").innerHTML = "*Select one genre";
       validationFlag = 1;
    }*/
    
 }