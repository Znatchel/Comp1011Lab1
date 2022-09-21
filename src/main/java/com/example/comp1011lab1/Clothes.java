package com.example.comp1011lab1;


import java.util.Arrays;
import java.util.List;

public class Clothes {
    private String size;
    private String  colour;
    private int amount;

    public Clothes(String size, String colour,  int amount) {
        //here is a comment
        setSize(size);
        setColour(colour);
        setAmount(amount);


    }

    private void setAmount(int amount) {
        this.amount = amount;
    }


    public String getSize() {
        return size;
    }

    public static List<String> validSizes()
    {
        return Arrays.asList("small", "medium", "large","x-large");
    }

    /**
     * Validate that the argument is "small", "medium" or "large", "x-large"
     * @param size
     */
    public void setSize(String size) {
        size = size.toLowerCase().trim();  //removes any leading or trailing white spaces and makes it all lower case
        List<String> validSizes = validSizes();

        //check if the argument is one of the valid sizes
        if (validSizes.contains(size))
            this.size = size;
        else
            throw new IllegalArgumentException("valid sizes are: " + validSizes);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAmount() {
        return amount;
    }





}
