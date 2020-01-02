"use strict";
exports.__esModule = true;
var ProductTest = /** @class */ (function () {
    function ProductTest(product) {
        this.product = product;
    }
    ProductTest.prototype.add = function () {
        this.product.push({ id: 4, name: "RiceFlour", cost: 250, quantity: 1 });
    };
    ProductTest.prototype.fetch = function () {
        this.product.forEach(function (element) {
            console.log(element);
        });
        console.log("*************************");
    };
    ProductTest.prototype.edit = function () {
        this.product[0].name = "Ghee";
        this.product.push();
        this.fetch();
        console.log("*************************");
    };
    ProductTest.prototype["delete"] = function () {
        delete this.product[2];
        //this.product.pop(); 
        this.fetch();
        console.log("*************************");
    };
    return ProductTest;
}());
exports.ProductTest = ProductTest;
var productTest = new ProductTest([{ id: 1, name: "Rice", cost: 250, quantity: 1 }, { id: 2, name: "Wheat", cost: 350, quantity: 2 }, { id: 3, name: "Sugar", cost: 250, quantity: 1 }]);
productTest.add();
productTest.fetch();
productTest.edit();
productTest["delete"]();
