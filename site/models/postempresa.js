const db = require('./db');

const Empresa = db.sequelize.define('empresas',{

    idEmpresa: {
        type: db.Sequelize.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    nomeEmpresa:{
        type: db.Sequelize.STRING
    },
    cnpj: {
        type: db.Sequelize.STRING
    }
});

const Admin = db.sequelize.define('administradores',{
    idAdmin: {
        type: db.Sequelize.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    emailAdmin:{
        type: db.Sequelize.STRING
    },
    senhaAdmin:{
        type: db.Sequelize.STRING
    }
});



module.exports = Empresa;
//Empresa.sync({force: true});
