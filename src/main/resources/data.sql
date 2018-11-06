/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  vanessa
 * Created: 6 nov. 2018
 */
insert into user (id, email, first_name, last_name) values (HIBERNATE_SEQUENCE.nextval, 'vanessa.huhn@gmail.com', 'Vanessa', 'Huhn');

insert into link (id, date, topic, url, user_id) values (HIBERNATE_SEQUENCE.nextval, '2018-11-06', 'WEB', 'http://google.fr', 1);
