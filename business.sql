DROP TABLE IF EXISTS aohe_user;
CREATE TABLE aohe_user (
    id int(11) NOT NULL AUTO_INCREMENT COMMIT '用户id',
    username varchar (50) NOT NULL COMMIT '用户名',
    password varchar (50) NOT NULL COMMIT '用户密码,MD5加密',
    userpic varchar (100) COMMIT '用户头像',
    email varchar (50) NOT NULL COMMIT '用户email',
    phone varchar (20) NOT NULL COMMIT '用户phone',
    question varchar (100) NOT NULL COMMIT '找回密码问题',
    answer varchar (100) NOT NULL COMMIT '找回密码答案',
    role int(4) NOT NULL COMMIT '角色0-管理员,1-普通用户',
    create_time datetime NOT NULL COMMIT '创建时间',
    update_time datetime (100) NOT NULL COMMIT '最后一次更新时间',
    ip varchar(20) NOT NULL,
    PRIMARY KEY ('id'),
    UNIQUE KEY 'user_name_unique' ('username') USING BTREE
)ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;