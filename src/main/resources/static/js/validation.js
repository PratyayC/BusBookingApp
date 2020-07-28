$(document).ready(function(e)
{
	$('input[id$=travelDate]').datepicker({ dateFormat: 'dd-mm-yy' });
	$("#bookingDate").datepicker({ dateFormat: 'dd-mm-yy' });
	var nameex =  /^[a-zA-Z]+$/;
	console.log("***");
	
	//console.log("");
	
	$("#addForm").submit(function(){
		var name=$("#name").val();
		if(name==""||!nameex.test(name))
			{
				alert("Traveller Name can't be empty or numbers!");
				return false;
			}
	
		var source=$("#source").val();
		var dest=$("#destination").val();
		if(source==""||!nameex.test(source))
			{
				alert("Source can't be empty or numbers!");
				return false;
			}
		
		
		if(dest==""||!nameex.test(dest))
			{
				alert("Destination can't be empty or numbers!");
				return false;
			}
		if(dest==source)
			{
				alert("SOURCE AND DESTINATION CANNOT BE SAME!");
				return false;
			
			}

		var cost=$("#price").val();
		if(cost=="")
			{
				alert("provide price!");
				return false
			}
	
		var bDate=$("#bookingDate").val();
		console.log(bDate);
		var tDate=$("#travelDate").val();
		//console.log(tDate);
			//dt1 = new Date(bDate);
			//console.log(dt1);
			//dt2 = new Date(tDate);
			//var dateDiff= Math.floor((Date.UTC(dt2.getFullYear(), dt2.getMonth(), dt2.getDate()) - 
				//	Date.UTC(dt1.getFullYear(), dt1.getMonth(), dt1.getDate()) ) /(1000 * 60 * 60 * 24));
			//console.log(dateDiff);
		
		var t=$("#travelDate").datepicker("getDate");
	    var d=$("#bookingDate").datepicker("getDate");
	    var res=t-d;
	    var days = Math.floor(((res % 31536000000) % 2628000000)/86400000);
		
			if(tDate==null)
			{
				alert("provide travel date");
				return false;
			}
			
			if(bDate==null)
				{
					alert("provide booking date");
					return false;
				}
			
			if(days<10)
				{
					alert("Booking should be atleast 10 days prior to travel!");
					return false;
				}
		return true;
		
		
		});
});