function entrar(){
    if(user.value == "urubu100" && senha.value == "urubu100"){
        location.href=`./inicio.html`;
    }else{
        alert("Usuário ou senha incorretos")
    }
}