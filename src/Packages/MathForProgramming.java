package Packages;

import java.util.Arrays;

@FunctionalInterface
interface Action<X>{
    X[] getResoult(X[] A, X[] B);
    default void show(X[] resoult){
        for (int i = 0; i < resoult.length; i++){
            System.out.print(resoult[i] == null ? "" : resoult[i] + " ");
        }
    }
}
public class MathForProgramming{
    public static Integer[] Unit(Integer[] LotsOfA, Integer[] LotsOfB){
        Action<Integer> obj = (Integer[] A, Integer[] B) -> {
            Integer[] resoult = new Integer[A.length + B.length];
            int i = 0;
            do {
                resoult[i] = A[i];
                i++;
            } while (i < A.length);
            int j = 0;
            do {
                resoult[i] = B[j];
                i++;
                j++;
            } while (j < B.length);
            return resoult;
        };

        //obj.show(obj.getResoult(LotsOfA, LotsOfB));
        return obj.getResoult(LotsOfA, LotsOfB);
    }

    public static void Intersection(Integer[] LotsOfA, Integer[] LotsOfB){
        Action<Integer> obj = (Integer[] A, Integer[] B) -> {
            Integer[] resoult = new Integer[A.length + B.length];

            Integer[] all = Unit(A, B);

            int k = 0;
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < B.length; j++){
                    for (int l = 0; l < all.length; l++){
                        if (A[i] == all[l] && B[j] == all[l]){
                            resoult[k] = all[l];
                        }
                    }
                }
                k++;
            }

            return resoult;
        };

        obj.show(obj.getResoult(LotsOfA, LotsOfB));
    }

    public static void Difference(Integer[] LotsOfA, Integer[] LotsOfB){
        Action<Integer> obj = (Integer[] A, Integer[] B) -> {
            Integer[] resoult = Unit(A, B);

            for (int i = 0; i < B.length; i++){
                for (int j = 0; j < resoult.length; j++){
                    if (B[i] == resoult[j]){
                        resoult[j] = null;
                    }
                }
            }

            return resoult;
        };

        obj.show(obj.getResoult(LotsOfA, LotsOfB));
    }

    public static void SimmetricDifference(Integer[] LotsOfA, Integer[] LotsOfB){
        Action<Integer> obj = (Integer[] A, Integer[] B) -> {
            Integer[] resoult = Unit(A, B);

            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < B.length; j++){
                    for (int l = 0; l < resoult.length; l++){
                        if (A[i] == resoult[l] && B[j] == resoult[l]){
                            resoult[l] = null;
                        }
                    }
                }
            }

            return resoult;
        };

        obj.show(obj.getResoult(LotsOfA, LotsOfB));
    }
}
