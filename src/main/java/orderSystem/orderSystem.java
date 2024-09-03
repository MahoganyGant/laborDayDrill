package orderSystem;

public class orderSystem {

    public static void main(String[] args) {
        String product = "Rice";
        int quantity = 159;
        double pricePerBowl = 5.0;
        double distance = 15.0;

        // Calculate delivery fee
        /*
        originally I thought I needed to add further parameters like if the distance is between
        5-15 do "etc." but I found out I didn't need to do that because the code only moves on
        to the next else if the first section didn't apply meaning if I added those additional
        parameters it would have been checking twice which would have been unnecessary.
         */
        double fee;
        if (distance <= 5) {
            fee = 2;
        } else if (distance <= 15) {
            fee = 5;
        } else if (distance <= 25) {
            fee = 10;
        } else if (distance <= 50) {
            fee = 15;
        } else {
            fee = 20;
        }

        // calculating the order price
        double totalPrice = quantity * pricePerBowl + fee;

        // print the receipt
        System.out.println("Product: " + product);
        System.out.println("Qty: " + quantity);
        System.out.println("Price per bowl: " + pricePerBowl);
        System.out.println("Distance: " + distance + " miles");
        System.out.println("Delivery Fee: " + fee);
        System.out.println("Total: " + totalPrice);
    }

}
