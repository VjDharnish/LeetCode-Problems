import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stock{
	String cmpName;
	double price;
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Stock(String cmpName, double price) {
		super();
		this.cmpName = cmpName;
		this.price = price;
	}
	
}

public class ReadWriteCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputFile = "input.csv";
		String outputFile="output.csv";
		List <Stock> stocks = getStocks(inputFile);
		Collections.sort(stocks,new Comparator<Stock>() {

			@Override
			public int compare(Stock o1, Stock o2) {
				if(o1.getPrice()<o2.getPrice())
				return 1;
				else
					return -1;
			}
			
		});
		writeFile(stocks,outputFile);
			
		
		

	}

	private static void writeFile(List<Stock> stocks, String outputFile) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter(outputFile);
			for(Stock stock:stocks) {
				writer.append(stock.getCmpName()).append(',').append(Double.toString(stock.getPrice())).append("\n");
			}
			System.out.println("wriitten");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static List<Stock> getStocks(String inputFile) {
		// TODO Auto-generated method stub
		List<Stock>stocks  = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			String line;
			while((line=br.readLine())!=null) {
				String[]parts = line.split(",");
				Double price  = Double.parseDouble(parts[1]);
				stocks.add(new Stock(parts[0],price));
			}
			return stocks;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
