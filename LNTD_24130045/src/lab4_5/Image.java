package lab4_5;

import lab4_2.Gallery;

public  class Image extends Gallery {
	int heigh ;
	int width ;
	String quality ;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String nameFile, double sizes) {
		super(nameFile, sizes);
		// TODO Auto-generated constructor stub
	}
	public Image(String nameFile, double sizes, int heigh, int width, String quality) {
		super(nameFile, sizes);
		this.heigh = heigh;
		this.width = width;
		this.quality = quality;

	}
	@Override
	public double timeToDownload(double speeds) {
		// TODO Auto-generated method stub
return super.timeToDownload(speeds);
        
		
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
	public void SamenameFile(String NewName) {
		// TODO Auto-generated method stub
		super.SamenameFile(NewName);
	}
	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		super.PrintAll();
		System.out.print("Image"+"\t"+ this.heigh +"\t"+ this.width +"\t"+  this.quality);
	}
	
	}


