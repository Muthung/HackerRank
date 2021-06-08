// github.com/Cl9nt-m

import java.math.BigDecimal;

import java.util.*;

class Solution {

    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String [] s = new String[n+2];

        for (int i = 0; i < n; i++) {

            s[i] = sc.next();

        }

        sc.close();
        
        // We want to sort in descending order while preserving the contents 
        // of each String. A comparator can achieve this for us. We convert  
        // to BigDecimal inside our comparator so that the change is not 
        // permanent and our String's form for each number is preserved.

        Arrays.sort(s, new Comparator<String>() {

            @Override

            public int compare(String o1, String o2) {

                if (o1 == null || o2 == null) {

                    return 0;

                }

                BigDecimal o1bd = new BigDecimal(o1);

                BigDecimal o2bd = new BigDecimal(o2);

                return o2bd.compareTo(o1bd);

            }
            
        });
        
        //Output

        for (int i = 0; i < n; i++) {

            System.out.println(s[i]);

        }

    }
    
}
