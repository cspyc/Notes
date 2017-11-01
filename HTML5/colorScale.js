//显示色阶图
	function showColorScale(item){
		if(item=="huadongRadarMosaic" || item=="raderExtrapolate" ){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/radar.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}else if(item=="QPF"){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/QPF.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}else if(item=="shortTerm360m" || item=="huadongAreaRain24h" || item=="huadongAreaRain240h" || item=="huadongAreaGale24h " || item=="huadongAreaGale240h" || item=="longterm45d"){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/forcast.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}else if(item=="typhoon"){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/typhoon.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}else if(item=="basicReflection"){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/radarBasicReflection.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}else if(item=="FWSatelliteFenlie" || item=="FWSatelliteHongwai"){
			var scaleImage= document.createElement("img");
			scaleImage.src = "colorScale/FWSatellite.png";
			document.getElementById("colorScale").appendChild(scaleImage);
		}
	}