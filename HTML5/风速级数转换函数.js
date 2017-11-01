
    function windDataConvert(windData){
		var wind = forcastDataConvert(windData);
		
		switch(true){
			switch(true){
			case wind>=0 && wind <= 0.2:
				return 0;
				break;
			case wind>=0.3 && wind<=1.5:
				return 1;
				break;
			case wind>=1.6 && wind<=3.3:
				return 2;
				break;
			case wind>=3.4 && wind<=5.4:
				return 3;
				break;
			case wind>=5.5 && wind<=7.9:
				return 4;
				break;
			case wind>=8.0 && wind<=10.7:
				return 5;
				break;
			case wind=>10.8 && wind<=13.8:
				return 6;
				break;
			case wind=>13.9 && wind<=17.1:
				return 7;
				break;
			case wind>=17.2 && wind<=20.7:
				return 8;
				break;
			case wind>=20.8 && wind<=24.4:
				return 9;
				break;
			case wind>=24.5 && wind<=28.4:
				return 10;
				break;
			case wind>=28.5 && wind<=32.6:
				return 11;
				break;
			case wind>=32.7 && wind<=36.9:
				return 12;
				break;
			case wind>=37.0 && wind<=41.4:
				return 13;
				break;
			case wind>=41.5 && wind<=46.1:
				return 14;
				break;
			case wind>=46.2 && wind<=50.9:
				return 15;
				break;
			case wind>=51.0 && wind<=56.0:
				return 16;
				break;
			case wind>=56.1 && wind<=61.2:
				return 17;
				break;
		}
	}