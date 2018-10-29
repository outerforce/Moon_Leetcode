package com.utilities;

import java.util.*;//import class
import static java.util.Arrays.*;//import static member

/**
 * Created by somexoh on 2017/3/17.
 */
import static java.lang.System.*;

public class staticImport {
    public static void main(String[] args){
        int[] arr = {3,1,5,6};
        sort(arr);

        int index = binarySearch(arr,1);
        //System.out.println(Arrays.toString(arr));
        System.out.println(index);
        out.println("hah");

    }
}
