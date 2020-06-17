const express = require("express");
const app = express();
const handlebars = require('express-handlebars');
const bodyParser = require('body-parser');
const Empresa = require('./models/postempresa');
//const Admin = require('./models/postadmin');
const { dirname } = require("path");
const { sequelize } = require("./models/db");
const db = require("./models/db");


    app.engine('handlebars', handlebars({defaultLayout: 'main'}))
    app.set('view engine', 'handlebars')

//BodyParser
app.use(bodyParser.urlencoded({extended: false}))
app.use(bodyParser.json())
app.use(express.static('public'));



app.get("/", function(req, res){
    res.send("Ola");
})
/*
app.get("/cadastro1", function(req, res){
    res.sendFile(__dirname + "/bootstrap-dash/register.html")
})
*/
app.get('/cadastro2', function(req, res){
    res.sendFile(__dirname + '/public/register.html')
})

app.post('/dash', function(req, res){
    /*try {
        Empresa.sequelize.authenticate();
        console.log('Connection has been established successfully.');
      } catch (error) {
        console.error('Unable to connect to the database:', error);
      }
    */
    
    Empresa.create({
        nomeEmpresa: req.body.nomeEmpresa,
        cnpj: req.body.cnpj2
    })
    /*
    Admin.create({
        emailAdmin: req.body.emailAdmin,
        senhaAdmin: req.body.senhaAdmin
    })
    
    .then(function(){
        res.redirect('/dash/:idAdmin')
    }).catch(function(erro){
        res.send("ERRROU: "+erro)
    

        //Admin.findAll({where: {'idAdmin': 2}})
        .then(function(retorno){
            //res.sendFile(__dirname + "/public/index.html")
            //res.render('dash', {retorno : retorno})
            res.send('Conectado');
        }).catch(function(erro){
            res.send("Erro né :"+erro)
        });*/
    
});

app.post('/maquinas/funcionario', function(req, res){
    res.send("OLAAAA")
})


app.get('/deletar/:id', function(req, res){
    Post.destroy({where: {'id': req.params.id}}).then(function(){
       res.send('Postagem deletada com sucesso!')
    }).catch(function(erro){
       res.send('Esta postagem não existe! ')
    })
})

app.get('/login', function(req, res){
    res.sendFile(__dirname + '/public/login.html')
})


//Ultima linha do código:
app.listen(4000, function(){
    console.log("\nServidor rodando na porta 4000");
});