package com.pg.model;

importjava.io.BufferedReader;

importjava.util.Scanner;

importjava.io.File;

importjava.io.FileNotFoundException;

importjava.io.IOException;

importjava.io.InputStreamReader;

publicclass TaxCalculator {



publicstatic void main(String[] args) throws IOException {



try(BufferedReader br1=newBufferedReader(newInputStreamReader(System.in)))

{

String str="";

str=br1.readLine();

}

catch(Exception e){

System.out.print(e);

}

finally

{



}

}

}