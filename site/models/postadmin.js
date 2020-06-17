const db = require('./db');

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

module.exports = Admin;
//Admin.sync({force: true});