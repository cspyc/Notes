alert("javaScript TEST!");
	console("JavaScript测试！");
		//扩大受影响客户可视框
		function showForcastDataResult(){
			$("#dataTable").css("display","");
			$("#dataTable").css("width",45%);
		}
		
		
		function setLabel1(value,row){
			var forcastElementId = row.id;
			var pre ="";
			var wind ="";
			var  result="";
			if(forcastElementId % 2 !== 0){
				if(value >= 10){
					pre ='<span style="color:red">'+value+'</span>';
					result = pre;
				}
			}else{
				if(value >= 7){
					wind ='<span style="color:red">'+value+'</span>';
					result = wind;
				}
			}
			return result;
		}
		
		function setLabel(value,row,index){
			var forcastElementId = row.id; 
			var  result="";
			if(row.id % 2 !== 0){
				if(value >= 10){
					 return '<span style="color:red">'+value+'</span>'; 
				}
			}else{
				if(value >= 7){
					return '<span style="color:blue">'+value+'</span>'; 
				}
			}
			
			alert(row.id);
		}
		