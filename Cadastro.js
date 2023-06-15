let idade;

idade = prompt("Esta página é proibida para pessoas menores de 18 anos, confirme sua idade.");
if (idade>=18){
    alert("autorizado")
}else{
    alert("não autorizado,  ");
    window.close();
}
