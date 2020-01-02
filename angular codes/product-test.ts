import {Product} from "./product";
export class ProductTest{
    product:Product[];
    constructor(product:Product[]) {
        this.product = product;
    }
    
    add() {
        this.product.push({ id : 4, name : "RiceFlour", cost : 250, quantity : 1 });    
    }

    fetch(){
        this.product.forEach(element => {console.log(element);
     });
     console.log("*************************");
    }

    edit() {
        this.product[0].name = "Ghee";
        this.product.push();
        this.fetch();
        console.log("*************************");
    
    }

    delete() {
    delete this.product[2]; // delete the particular element in array
        //this.product.pop(); //delete the last element entered in array
        this.fetch();
        console.log("*************************");
    }
}
let productTest:ProductTest = new ProductTest([ { id : 1, name : "Rice", cost : 250, quantity : 1 },{id : 2, name : "Wheat", cost : 350, quantity : 2},{id : 3, name : "Sugar", cost : 250, quantity : 1}]);
productTest.add();
productTest.fetch();
productTest.edit();
productTest.delete();









