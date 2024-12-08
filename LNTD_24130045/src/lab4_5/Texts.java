package lab4_5;

import lab4_2.Gallery;

public class Texts extends  Gallery{
	 int number_of_line ;

	public Texts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Texts(String nameFile, double sizes) {
		super(nameFile, sizes);
		// TODO Auto-generated constructor stub
	}

	public Texts(String nameFile, double sizes, int number_of_line) {
		super(nameFile, sizes);
		this.number_of_line = number_of_line;
	}


	@Override
	public void SmallerThan(double maxSizes) {
		// TODO Auto-generated method stub
		if (this.Sizes < maxSizes ){
		    System.out.println("Maximum Size");
		  }else {
			System.out.println("Download");
		}
	}

	@Override
	public double timeToDownload(double speeds) {
		// TODO Auto-generated method stub
		return super.timeToDownload(speeds);
	}

	@Override
	public void printSizes(double printSize) {
		// TODO Auto-generated method stub
		super.printSizes(printSize);
	}

	@Override
	public void SamenameFile(String NewName) {
		// TODO Auto-generated method stub
		super.SamenameFile(NewName);
	}

	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		super.PrintAll();
		System.out.println("Texts :"+this.number_of_line);
	}




	 
	}

