$(document).ready(function()
{
	var nameex =  /^[a-zA-Z]+$/;
	var addex=  /^(?=.*\d)(?=.*[a-z])(?=.*[^a-zA-Z0-9])(?!.*\s).{1,30}$/;

	$("#userForm").submit(function(){
		var fname=$("#fname").val();
		if(fname==""||!nameex.test(fname))
			{
				alert("User first name can only be alphabets and cannot be empty!");
				return false;
			}
	
		var lname=$("#lname").val();
		if(lname==""||!nameex.test(lname))
			{
				alert("User last name can only be alphabets and cannot be empty!");
				return false;
			}
		
		 var options = $('#hobbies > option:selected');
         if(options.length == 0)
         {
             alert('Select a hobby!');
             return false;
         }
         if(options.length<2)
        	 {
        	 	alert("select atleast 2 hobbies!");
        	 	return false;
        	 }
		
		if($('input[name="gender"]:checked').length == 0)
		{
			//ugender=true;
			alert("select your gender!");
			return false;
		}
		
		var add=$("#address").val();
		if(add==""||!addex.test(add))
			{
				alert("address can't be empty and should contain alpha nueric and special char!")
				return false;
			}
	

		if(!$("#check").prop("checked"))
			{
				alert("Agree to T&C!");
				return false;
			}

		alert("done!");
		return true;
	
		});
});