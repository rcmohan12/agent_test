package myapp;

import myapp.service.FileDataProviderService;
import myapp.service.ImageDataProviderService;

public class DataController {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
//		System.out.println("Hey There");
		fetchImageData();
		fetchFileData();
	}
	public static void startExec() {
//		System.out.println("starting exec");

	}

	public static void compute() {
//		System.out.println("computing");

	}

	public static void fetchImageData() {
		new ImageDataProviderService().provideData();
	}

	public static void fetchFileData() {
		new FileDataProviderService().provideData();
	}
}
