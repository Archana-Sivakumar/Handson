import {Employee} from "./employee";
import {Department} from "./department";
import {Skill} from "./skill";
let employee:Employee =  {
    id : 800344,
    name : "Archana",
    salary : 10000,
    permanent : true,
    department: {id: 1, name:"Payroll"},
    skill: [{"id":1,"name":"HTML"},{"id":2,"name":"CSS"},{"id":3,"name":"JS"}]
};
console.log("id: "+ employee.id);
console.log("name: "+ employee.name);
console.log("salary: "+ employee.salary);
console.log("permanent: "+ employee.permanent);
console.log("department id: "+ employee.department.id);
console.log("department Name: "+ employee.department.name);
console.log("skill[0]: "+ employee.skill[0].id +"," +employee.skill[0].name);
console.log("skill[1]: "+ employee.skill[1].id +"," +employee.skill[1].name);
console.log("skill[2]: "+ employee.skill[2].id +"," +employee.skill[2].name);