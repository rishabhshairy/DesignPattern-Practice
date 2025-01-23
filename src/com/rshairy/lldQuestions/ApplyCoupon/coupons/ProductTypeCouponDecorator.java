package com.rshairy.lldQuestions.ApplyCoupon.coupons;

import com.rshairy.lldQuestions.ApplyCoupon.product.Product;
import com.rshairy.lldQuestions.ApplyCoupon.product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeCouponDecorator extends CouponDecorator {

    Product product;
    int discountPercentage;
    ProductType productType;
    static List<ProductType> productEligibleForDiscount = new ArrayList<>();

    static {
        productEligibleForDiscount.add(ProductType.HARDWARE);
        productEligibleForDiscount.add(ProductType.COSMETICS);
    }

    public ProductTypeCouponDecorator(Product product, int discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (productEligibleForDiscount.contains(product.getProductType())) {
            return price - (price * discountPercentage) / 100;
        }
        return price;
    }
}
