package javacore.chapter05.object.exercise;

public class ProductSorting {


    public String name;
    public String category;

    public double price;
    public char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    public static ProductSorting[] changeCurrency(ProductSorting[] array){

        for(int index = 0; index < array.length; index++){
            if(array[index].currency == '€'){

                array[index].price *= 1.18;
            }

            if(array[index].currency == '£'){

                array[index].price *= 1.37;
            }
            array[index].currency = '$';
        }

        return array;
    }

    public static ProductSorting[] triByValue(ProductSorting[] array){

        for (int index = 1; index < array.length; index++) {
            //car on commencera par comparer la valeur juste à gauche dans le tableau
            int comparaisonIndex = index - 1;
            ProductSorting savedProduct = array[index];

            while (comparaisonIndex >= 0 && array[comparaisonIndex].price > savedProduct.price) {

                array[comparaisonIndex + 1] = array[comparaisonIndex];
                comparaisonIndex--;
            }
            array[comparaisonIndex + 1] = savedProduct;

        }
        return array;
    }


    public static void main(String[] args) {

        ProductSorting[] productArray = generateFakeProductList();

        // Écrivez votre code ci-dessous
        productArray = changeCurrency(productArray);

        for(int index = 0; index < productArray.length; index++) {

            System.out.print(productArray[index].price);
            System.out.print(productArray[index].currency + "\n");
        }

        productArray = triByValue(productArray);

        System.out.println("\n\nAprès le tri\n-------------------------\n");
        for(ProductSorting ps : productArray){

            System.out.println(ps.name + " " + ps.price);
        }

    }

    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }
}
