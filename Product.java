package SearchAlgorithm;
import java.util.Scanner;
/*Write a Java Program
1. Create a function to accept the details of 10 Products
2. Create a function to arrange the elements in ascending order 
	by using selection sort algorithm
3. Create a function to find any one of the product in the given 
	list and then display that product details to the user. Linear Search
ProductID, ProductName, ProductDescription
Arrange The details as per product Name
Search the Details as per Product Name
While searching the product the ProductName and Description should be displayed
 */
public class Product {
	int productId;
	String productName;
	String productDiscription;
	public static void main(String[] args) {
		Product product=new Product();
		String[] products=product.intputProducts();
		String[]  sortedProducts=product.selectionSort(products);
		System.out.println("Product details.");
		for (int i = 0; i < sortedProducts.length; i++) 
			System.out.println(sortedProducts[i]);
		System.out.println("Enter the Product you want to search");
		Scanner scanner=new Scanner(System.in);
		String searchProduct=scanner.next();
		int res=product.linearSearch(sortedProducts,searchProduct);
		if (res==1)
			System.out.println("Product found in the list. "+searchProduct);
		else
			System.out.println("Product not found.");
	}
	public String[] intputProducts() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of products.");
		int size=scanner.nextInt();
		String productArray[]=new String[size];
		System.out.println("Enter the product details.");
		System.out.println("Enter the product Name");
		for (int i = 0; i < productArray.length; i++) 
			productArray[i]=scanner.next();
		return productArray;
	}

	public String[] selectionSort(String product[]) {
		for ( int j=0; j < product.length-1; j++ ){
			int min = j;
			for ( int k=j+1; k < product.length; k++ )
				if ( product[k].compareTo( product[min] ) < 0 ) min = k;  
			String temp = product[j];
			product[j] = product[min];
			product[min] = temp;
		}
		return product;
	}
	public int linearSearch(String string[], String search){
		int i;
		int res = 0;
		for(i = 0; i<10; i++){
			if (search.equals(string[i])){
				res = 1;
				break;
			}
		}
		return res;
	}
}
