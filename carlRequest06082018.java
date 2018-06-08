import java.io.File;

import java.io.FileNotFoundException;

import java.math.BigInteger;

import java.util.Scanner;public class SumTheNumbers {

   private String currToken;

   private String textString;

   private File f;

   private BigInteger sum;    public SumTheNumbers(numbers.txt) {

       this.f = f;

   }    public BigInteger getSum() throws FileNotFoundException {

       BigInteger total = new BigInteger("0");

       Scanner input = new Scanner(this.numbers.txt);

       while (input.hasNext()) {

           String numString = input.next();

           BigInteger value = new BigInteger(numString);

           total = total.add(value);

       }

       this.sum = total;

       return this.sum;

   }}