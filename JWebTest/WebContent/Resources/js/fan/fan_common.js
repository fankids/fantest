var has_showModalDialog = !!window.showModalDialog;//����һ��ȫ�ֱ����ж��Ƿ���ԭ��showModalDialog����  
if(!has_showModalDialog &&!!(window.opener)){         
    window.onbeforeunload=function(){  
        window.opener.hasOpenWindow = false;        //�����ر�ʱ����opener�����Ӵ����Ѿ��ر�  
    }
}  
//����window.showModalDialog�����������  
if(window.showModalDialog == undefined){  
    window.showModalDialog = function(url,mixedVar,features){  
        if(window.hasOpenWindow){  
            alert("���Ѿ�����һ�����ڣ����ȴ�����");//�����ε���ᵯ���������  
            window.myNewWindow.focus();  
        }
        window.hasOpenWindow = true;  
        if(mixedVar) var mixedVar = mixedVar;  
        //��window.showmodaldialog �� window.open ������һ�������Է�װ��ʱ��������ȥ��ʽ��һ�²���  
        if(features) var features = features.replace(/(dialog)|(px)/ig,"").replace(/;/g,',').replace(/\:/g,"=");
        if(typeof(features) != "undefined" && features.length > 0) {
        	//window.open("Sample.htm",null,"height=200,width=400,status=yes,toolbar=no,menubar=no");  
            //window.showModalDialog("modal.htm",obj,"dialogWidth=200px;dialogHeight=100px");   
            var left = (window.screen.width - parseInt(features.match(/width[\s]*=[\s]*([\d]+)/i)[1]))/2;  
            var top = (window.screen.height - parseInt(features.match(/height[\s]*=[\s]*([\d]+)/i)[1]))/2;  
            window.myNewWindow = window.open(url,"_blank",features);
        }else {
        	window.myNewWindow = window.open(url,"_blank",features);
        }
          
    }  
}