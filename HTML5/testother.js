	if(nowDateObj > hourBegin && nowDateObj < hourEnd){
		$("#dataBatchTime").html("数据批次：6:00");
		
		$.ajax({
             type: "post",
             url:  "<%=basePath%>warningRegionForcastQuery.do",
             dataType: 'JSON',
             success: function (data, status) { 
                	 console.log(data);
                	 $("#showForcastData").bootstrapTable('load',data.results);
                	dataObj=data.results[0];
                	console.log(dataObj);
                	console.log(typeof(dataObj));
             }
             });
		
		if($("#forcastElement").val() == "降水"){
           	$("#showForcastData").bootstrapTable({ 
           		 columns: [
           		    {
           		        field: "id",
           		        title: "序号",
           		        formatter:_runningFormatter
           		    },{
           		        field: "streetName",
           		        title: "街道"  
           		    },{
           		        field: '降水',
           		        title: "天气要素"  
           		    },{
           		        field: "pre01",
           		        title: "07时",
           		        formatter:setLabel
           		    	
           		    },{
           		        field: "pre02",
           		        title: "08时",
           		        formatter:setLabel
           		    },{
           		        field: "pre03",
           		        title: "09时",
           		        formatter:setLabel   
           		    },{
           		        field: "pre04",
           		        title: "10时",
           		        formatter:setLabel   
           		    },{
           		        field: "pre05",
           		        title: "11时",
           		        formatter:setLabel   
           		    },{
           		        field: "pre06",
           		        title: "12时",
           		        formatter:setLabel  
           		    },{
           		        field: "pre07",
           		        title: "13时",
           		        formatter:setLabel 
           		    },{
           		        field: "pre08",
           		        title: "14时",
           		        formatter:setLabel 
           		    },{
           		        field: "pre09",
           		        title: "15时",
           		        formatter:setLabel 
           		    },{
           		        field: "pre10",
           		        title: "16时",
           		        formatter:setLabel
           		    },{
           		        field: "pre11",
           		        title: "17时",
           		        formatter:setLabel  
           		    },{
           		        field: "pre12",
           		        title: "18时",
           		        formatter:setLabel
           		    },{
           		        field: "pre13",
           		        title: "19时",
           		        formatter:setLabel
           		    }]
           		)};
           		}else{
           			$("#showForcastData").bootstrapTable({ 
	           			columns: [
	               		    {
	               		        field: "id",
	               		        title: "序号",
	               		        formatter:_runningFormatter
	               		    },{
	               		        field: "streetName",
	               		        title: "街道"  
	               		    },{
	               		        field: '降水',
	               		        title: "天气要素"  
	               		    },{
	               		        field: "wind01",
	               		        title: "07时",
	               		        formatter:setLabel
	               		    	
	               		    },{
	               		        field: "wind02",
	               		        title: "08时",
	               		        formatter:setLabel
	               		    },{
	               		        field: "wind03",
	               		        title: "09时",
	               		        formatter:setLabel   
	               		    },{
	               		        field: "wind04",
	               		        title: "10时",
	               		        formatter:setLabel   
	               		    },{
	               		        field: "wind05",
	               		        title: "11时",
	               		        formatter:setLabel   
	               		    },{
	               		        field: "wind06",
	               		        title: "12时",
	               		        formatter:setLabel  
	               		    },{
	               		        field: "wind07",
	               		        title: "13时",
	               		        formatter:setLabel 
	               		    },{
	               		        field: "wind08",
	               		        title: "14时",
	               		        formatter:setLabel 
	               		    },{
	               		        field: "wind09",
	               		        title: "15时",
	               		        formatter:setLabel 
	               		    },{
	               		        field: "wind10",
	               		        title: "16时",
	               		        formatter:setLabel
	               		    },{
	               		        field: "wind11",
	               		        title: "17时",
	               		        formatter:setLabel  
	               		    },{
	               		        field: "wind12",
	               		        title: "18时",
	               		        formatter:setLabel
	               		    },{
	               		        field: "wind13",
	               		        title: "19时",
	               		        formatter:setLabel
	               		    }]          
      			}); 
           	}
		}else{
			$("#dataBatchTime").html("数据批次：16:00");
			$("#affectedWindows").css("width","1000px");
			$("#dataTable").css("width","1000px");
			
			<%--  $.ajax({
	             type: "post",
	             url:  "<%=basePath%>warningRegionForcastQuery.do",
	             dataType: 'JSON',
	             success: function (data, status) {
	                 if (data.operate == "000000") {
	                	console.log(data);
	                	$("#showForcastData").bootstrapTable({  
	            		    columns: [
	            		    {
	            		        field: "id",
	            		        title: "序号",
	            		        formatter:_runningFormatter
	            		    },{
	            		        field: data.streetName,
	            		        title: "街道"  
	            		    },{
	            		        field: 降水,
	            		        title: "天气要素"  
	            		    },{
	            		        field: data.pre01,
	            		        title: "07时",
	            		        formatter:setLabel
	            		    	
	            		    },{
	            		        field: data.pre02,
	            		        title: "08时",
	            		        formatter:setLabel
	            		    },{
	            		        field: data.pre03,
	            		        title: "09时",
	            		        formatter:setLabel   
	            		    },{
	            		        field: data.pre04,
	            		        title: "10时",
	            		        formatter:setLabel   
	            		    },{
	            		        field: data.pre05,
	            		        title: "11时",
	            		        formatter:setLabel   
	            		    },{
	            		        field: data.pre06,
	            		        title: "12时",
	            		        formatter:setLabel  
	            		    },{
	            		        field: data.pre07,
	            		        title: "13时",
	            		        formatter:setLabel 
	            		    },{
	            		        field: data.pre08,
	            		        title: "14时",
	            		        formatter:setLabel 
	            		    },{
	            		        field: data.pre09,
	            		        title: "15时",
	            		        formatter:setLabel 
	            		    },{
	            		        field: data.pre10,
	            		        title: "16时",
	            		        formatter:setLabel
	            		    },{
	            		        field: data.pre11,
	            		        title: "17时",
	            		        formatter:setLabel  
	            		    },{
	            		        field: data.pre12,
	            		        title: "18时",
	            		        formatter:setLabel
	            		    },{
	            		        field: data.pre13,
	            		        title: "19时",
	            		        formatter:setLabel
	            		    }],

	            		 }); 
	                 }
	             },
	            
	         }); --%>
			$("#showForcastData").bootstrapTable({
			    columns: [{
			        field: "id",
			        title: "序号",
			        formatter:_runningFormatter
			    },{
			        field: "streetName",
			        title: "街道"  
			    },{
			        field: "forcastElement",
			        title: "天气要素"  
			    },{
			        field: "hour9",
			        title: "17时",
			        formatter:setLabel
			    	
			    },{
			        field: "hour10",
			        title: "18时",
			        formatter:setLabel
			    },{
			        field: "hour11",
			        title: "19时",
			        formatter:setLabel   
			    },{
			        field: "hour12",
			        title: "20时",
			        formatter:setLabel   
			    },{
			        field: "hour13",
			        title: "21时",
			        formatter:setLabel   
			    },{
			        field: "hour14",
			        title: "22时",
			        formatter:setLabel  
			    },{
			        field: "hour15",
			        title: "23时",
			        formatter:setLabel 
			    },{
			        field: "hour16",
			        title: "24时",
			        formatter:setLabel 
			    },{
			        field: "hour18",
			        title: "01时",
			        formatter:setLabel
			    },{
			        field: "hour19",
			        title: "02时",
			        formatter:setLabel  
			    },{
			        field: "hour20",
			        title: "03时",
			        formatter:setLabel
			    },{
			        field: "hour15",
			        title: "04时",
			        formatter:setLabel
			    },{
			        field: "hour15",
			        title: "05时",
			        formatter:setLabel
			    },{
			        field: "hour15",
			        title: "06时",
			        formatter:setLabel
			    },{
			        field: "hour15",
			        title: "07时",
			        formatter:setLabel
			    }],
	
			 }); 
			
			 $.ajax({
	             type: "post",
	             url:  "<%=basePath%>warningRegionForcastQuery.do",
	             dataType: 'JSON',
	             success: function (data, status) {
	                 if (data.operate == "000000") {
	                	console.log(data);
	                 }
	             },
	             error: function () {
	               //  alert('编辑失败');	
	             },
	             complete: function () {
	
	             }
	
	         });
	/* 		 onEditableSave: function (field, row, oldValue, $el) {
		         $.ajax({
		             type: "post",
		             url: "warningRegionForcastQpfDataUpdateValue.do",
		             data: row,
		             dataType: 'JSON',
		             success: function (data, status) {
		                 if (data.operate == "000000") {
		                	 $("#confirmMessageModalConfigWarningServiceProduct").html(_confirmMessage("保存数据成功!",null,"display:none"));
		    				 $("#confirmMessageModalConfigWarningServiceProduct").modal('toggle');	
		                 }else{
			                 $("#confirmMessageModalConfigWarningServiceProduct").html(_confirmMessage("保存数据失败!",null,"display:none"));
		    				 $("#confirmMessageModalConfigWarningServiceProduct").modal('toggle');
		                 }
		             },
		             error: function () {
		               //  alert('编辑失败');	
		             },
		             complete: function () {
		
		             }
		
		         });
		     } */
	}
	 	