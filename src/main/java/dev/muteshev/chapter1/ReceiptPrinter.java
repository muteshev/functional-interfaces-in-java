package dev.muteshev.chapter1;
@FunctionalInterface
public interface ReceiptPrinter
{
    void print(Receipt receipt);

    default double computeTotal(Receipt receipt)
    {
        double discountedPrice = receipt.price 
                               - (receipt.price * receipt.discount);
        return discountedPrice + (discountedPrice * receipt.tax);
    }
}
