// equal mean == operator are used in string(java) different way

// example of == using literal in string --------> 1(example)
public class eua {
    public  static  void main(String args[]){
        String s1="hellow";
        String s2="hellow";
        System.out.println(s1==s2);

    }

    
}

//output true(matched)


// example of == using new keyword in string -------->(2 example) 


public class eua {
    public  static  void main(String args[]){
        String s1= new String("hellow");
        String s2= new String("hellow");
        System.out.println(s1==s2);

    }

    
}

//output--->false(not)