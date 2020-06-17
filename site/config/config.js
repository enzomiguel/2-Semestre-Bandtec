const Sequelize = require('sequelize')
const sequelize = new Sequelize('bdviss','localadmin','#Gfgrupo1b',{
    host: "cvrviss.database.windows.net",
    port:1433,
    dialect: "mssql",
});


const conexao = sequelize.authenticate()
    .then(function(){
        console.log('AAAAAEEEEE');
    }).catch(function(err){
        console.log('NÃO FOOI')
    }).done();


/*
module.exports = {

    production: {
        username: 'localadmin@cvrviss',
        password: '#Gfgrupo1b',
        database: 'bdviss',
        host: 'cvrviss.database.windows.net',
        dialect: 'mssql',
        xuse_env_variable: 'DATABASE_URL'
    }
}
*/
//Server=tcp:cvrviss.database.windows.net,1433;Initial Catalog=bdviss;Persist Security Info=False;User ID=localadmin;Password={your_password};MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;

