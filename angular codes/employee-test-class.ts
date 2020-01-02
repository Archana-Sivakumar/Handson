import {Employee} from "./employee";
export class EmployeeTest{
    employee:Employee;
    constructor(employee:Employee){
        this.employee = employee;
    }
    display(){
        console.log("EmployeeId: "+ this.employee.id); 
        console.log("EmployeeName: "+ this.employee.name);
        console.log("EmployeeSalary: "+ this.employee.salary); 
        console.log("EmployeePermanent: "+ this.employee.permanent);
        console.log("EmployeeDepartmentId: "+ this.employee.department.id);
        console.log("EmployeeDepartmentName: "+ this.employee.department.name);
        console.log("EmployeeSkill[0]: "+ this.employee.skill[0].id + "," + this.employee.skill[0].name);
        console.log("EmployeeSkill[1]: "+ this.employee.skill[1].id + "," + this.employee.skill[1].name);
        console.log("EmployeeSkill[0]: "+ this.employee.skill[2].id + "," + this.employee.skill[2].name);
    }
}
let employeeTest:EmployeeTest = new EmployeeTest({id:102, name:"John",salary:10000,permanent: true,department: {id: 1, name:"Payroll"},skill: [{id:1,name:"HTML"},{id:2,name:"CSS"},{id:3,name:"JS"}]});
employeeTest.display();