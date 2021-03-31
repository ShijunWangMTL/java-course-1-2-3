create user 'jacstudent'@'localhost' identified by 'jacstudent';

grant all privileges on book_tracker.* to 'jacstudent'@'localhost';

alter user 'jacstudent'@'localhost' identified with mysql_native_password by 'studentjac';