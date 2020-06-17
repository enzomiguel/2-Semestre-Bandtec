module.exports = (sequelize, DataTypes) => {
    const Empresa = sequelize.define('empresa', {

        nomeEmpresa: {
            field: 'nomeEmpresa',
            type: DataTypes.STRING, // campo 'falso' (não existe na tabela). Deverá ser preenchido 'manualmente' no select
            allowNull: true
        },
        cnpj: {
            field: 'cnpj',
            type: DataTypes.STRING, 
            allowNull: true
        }
    }/*, {
        tableName: 'empresa',
        freezeTableName: true,
        underscored: true,
        timestamps: false,
    }*/);

    //return Empresa;
    module.exports = Empresa;
    
}


