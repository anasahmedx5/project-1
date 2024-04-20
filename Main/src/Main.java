import java.util.Random;
import java.util.Scanner;
public interface Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = random.nextInt(1001);
        ElectronicProduct smartphone = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);
        ClothingProduct tShirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        BookProduct oopBook = new BookProduct(3, "oopBook", 39.99f, "O’Reilly", "X Publications");
        System.out.println("Welcome to the E-commerce website!");
        System.out.println("Please enter your id: ");
        int id = input.nextInt();
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Please enter your address: ");
        String address = input.next();
        Customer c1 = new Customer(id,name, address);
        System.out.println("How many products you want to buy? ");
        int numberOfProducts = input.nextInt();
        Cart ca1 = new Cart(id, numberOfProducts);
        int index = 0;
        for (int i = 0; i < numberOfProducts; i++){
        System.out.println("please enter the product you want to add\n1-Smartphone\n2-T-Shirt\n3-oopBook");
        int choice = input.nextInt();
        if (choice==1){
            ca1.addProduct(smartphone,index);
            index++;
        }
        else if (choice==2){
            ca1.addProduct(tShirt,index);
                index++;
        }
        else if(choice ==3){
            ca1.addProduct(oopBook,index);
                index++;
        }
        else{
            System.out.println("Invalid choice");
        }
        }
        Order r1 = new Order(id,randomNumber,ca1.getProducts(),ca1.calculatePrice());
        r1.printOrderInfo();

}

}
