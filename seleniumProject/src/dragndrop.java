import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		String sample= "puja";
		char[] input=sample.toCharArray();
		int size=input.length-1;
		for(int i=size;i>=0;i--) 
			System.out.println(input[i]);
//		 Arrays.sort(sample);
//		 for(String str:sample) {
//			 System.out.println(str);
//		int size=sample.length;
//		for (int i = 0; i < size; i++) {
//			System.out.println(""+sample[i]);
			
    }
  	}
	


