package com.example.cryptographyapp;

public class encode {
    public static String enc(String s) {
        // create a string to add in the initial
        // binary code for extra security


        String initializer = "11111111";
        int ct = 0;
        // create an array
        int a[] = new int[11111111];
//        storing string in an array
        for (int i = 0; i < s.length(); i++) {
// put the ascii value of
            // each character in the array
            a[i] = s.charAt(i);
            ct++;
        }
//        result = null
        String res="";
//        array of size 111
        int bin[]=new int [111];
//        index
        int idx=0;

        // run a loop of the size of string
        for(int ii=0;ii<ct;ii++){
            // get the ascii value at position
            // i1 from the first array
            int temp = a[ii];
            for(int j=0;j<ct;j++) bin[j]=0;
                idx=0;
                while(temp>0){
                    bin[idx++]= temp%2;
                    temp=temp/2;
                }
//                digits
                String dig="";
                String temps;
                for(int j=0;j<7;j++){
                    // convert the integer to string
                    temps =Integer.toString(bin[j]);
                    // add the string using
                    // concatenation function
                    dig= dig.concat(temps);

                }
                String rev="";
            // reverse the string
//                concating the digits after converting into integer form
                for(int j=dig.length()-1;j>=0;j--){
                    char ca = dig.charAt(j);
//                    reversing the whole value
                    rev =rev.concat(String.valueOf(ca));

                }
//                rev=reverse
                res = res.concat(rev);
            }
            res = initializer.concat(res);
            return res;
        }

    }
