import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produit pomme = new Produit(100, "pomme");
		Produit banane = new Produit(75, "banane");
		Produit cerise = new Produit(150, "cerise");
		String result = new String();
		int somme = 0;
		int cptcerise =0;
		int cptbanane =0;
		int cptapple =0;
		int cptmele =0;
		int ctpfruit =0;
		int ctppomme =0;
		
		while(true)
		{
			System.out.println("Entrez votre commande :");
			Scanner scan = new Scanner(System.in);
			result = scan.nextLine();
			
			String str[]=result.split(",");
			
			for(int i =0; i < str.length ; i++){
			
			
			if(str[i].equals(pomme.nom)|| str[i].equals("mele") || str[i].equals("apple") || str[i].equals(banane.nom) || str[i].equals(cerise.nom))
			{
				//reduction de 2 euro pour 5 fruit
				ctpfruit += 1;
				if(ctpfruit == 5)
				{
					somme = somme - 200;
					ctpfruit = 0;
				}
				// POMMME
				if(str[i].equals(pomme.nom))
				{
					somme += pomme.prix;
					cptmele += 1;
					if(ctppomme/4 == 1)
					{
						somme = somme - 50;
						cptmele = 0;
					}
					somme += pomme.prix;
				}
				// Mele
				else if(str[i].equals("mele"))
				{	
					cptmele += 1;
					if(cptmele/2 == 1)
					{
						somme = somme - 50;
						cptmele = 0;
					}
					somme += pomme.prix;
				}
				// APPLE
				else if(str[i].equals("apple"))
				{	
					cptapple += 1;
					if(cptapple/3 == 1)
					{
						cptapple = 0;
					}else{
						somme += pomme.prix;
					}
				}
				// BANANE
				else if(str[i].equals(banane.nom))
				{	
					cptbanane += 1;
					if(cptbanane/2 == 1)
					{
						cptbanane = 0;
					}else{
						somme += banane.prix;
					}
				}
				// CERISE
				else
				{	
					cptcerise += 1;
					if(cptcerise/2 == 1)
					{
						somme = somme - 20;
						cptcerise = 0;
					}
					somme += cerise.prix;
				}
				System.out.println(somme);
			}
		}
	}
	}
}
