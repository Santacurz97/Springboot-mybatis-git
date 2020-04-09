/**
 * 
 */

$(function(){
	if(getCookie("pas")&&getCookie("name")){ //判断页面是否有对应Cookie
	    dx.value=getCookie("name");             //有则写入
	    pas.value=getCookie("pas");
	}else{
	    dx.value="";                            //无则写空
	    pas.value="";
	}

    if(mdl.checked){                       //判断多选框是否选中
        setCookie("name",dx.value,7);       //如选中则添加Cookie，添加内容为用户输入的密码和用户名
        setCookie("pas",pas.value,7);
    }else{
        removeCookie("name");   //如没选中，则删除掉对应的Cookie
        removeCookie("pas");
    }
    
})
