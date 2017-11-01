    //当文档加载完成后，再执行js脚本
    window.onload = init;
    function init(){
        var button = document.getElementById("addButton");
        //定义事件，当鼠标点击后，调用函数
        button.onclick = handleButtonClick;
    }

    
    function handleButtonClick() {
       var textInput = document.getElementById("songTextInput");
       var songName = textInput.value;
       if(songName == null || songName == ""){
           alert("Please Input the songName!");

       }else{
            var li = document.createElement("li");
            li.innerHTML = songName;
            var ul =document.getElementById("playlist");            
            ul.appendChild(li);
            
       }
}
   
