grammar dolores;

program : 'violent_delights' statement + 'violent_ends';

statement : assign | add | print;

assign : 'i choose to see' ID 'as' (NUMBER | ID);
print : (NUMBER | ID) 'seems like something to me';
add : 'analysis mode add' (NUMBER | ID) 'to' ID;  

ID	: [a-z]+ ;
NUMBER : [0-9]+ ;
WS : [ \n\t]+ -> skip;
