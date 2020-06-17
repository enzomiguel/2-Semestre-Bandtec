const Sequelize = require('sequelize')
const sequelize = new Sequelize('viss','root','#Gf48548803843',{
    host: "localhost",
    dialect: "mysql"
});

sequelize.authenticate().then(function(){
    console.log("Conectado ao MYSQL!!!")
}).catch(function(erro){
    console.log("Falha ao se conectar: "+erro)
})
const Postagem = sequelize.define('postage')

module.exports = {
    Sequelize: Sequelize,
    sequelize: sequelize
}