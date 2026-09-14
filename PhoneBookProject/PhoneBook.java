import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PhoneBook {
	public static void main(String[] args) {
		HashMap<String, String> contacts=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		//заполнение телефонной книги
		int count=0;
		boolean validInput=false;
		while(!validInput){
			try{
				System.out.print("Сколько контактов вы хотите добавить? ");
				count=sc.nextInt();
				sc.nextLine();
				validInput=true;
			} catch (InputMismatchException e){
				System.out.println("Ошибка: нужно ввести число. Попробуйте снова.");
				sc.nextLine();
			}
		}
		//ввод контактов
		for(int i=1;i<=count;i++){
			System.out.print("Имя контакта номер "+i+": ");
			String name=sc.nextLine();
			System.out.print("Телефон контакта: "+name+" ");
			String phone=sc.nextLine();
			contacts.put(name, phone);
		}
		
		//меню
		validInput=false;
		while(!validInput){
			try{
		boolean running=true;
		while(running){
			System.out.println();
			System.out.println("Что вы хотите сделать?");
			System.out.println("1 - Найти контакт");
			System.out.println("2 - Удалить контакт");
			System.out.println("3  -  Показать все контакты");
			System.out.println("4 - Выйти");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("Введите имя для поиска");
					String searchName=sc.nextLine();
					if(contacts.containsKey(searchName)){
						System.out.println("Телефон "+searchName+":"+contacts.get(searchName));
					} else {
						System.out.println("Контакт "+searchName+" не найден");
					}
					break;
					
				case 2:
					System.out.println("Введите имя для удаления");
					String removeName=sc.nextLine();
					if(contacts.containsKey(removeName)){
						contacts.remove(removeName);
					} else {
						System.out.println("Контакт "+removeName+" не найден");
					}
					break;
					
				case 3:
					System.out.println("Все контакты:");
					for(String key:contacts.keySet()){
						System.out.println(key+"   ->   "+ contacts.get(key));
					}
					break;
					
				case 4:
					running=false;
					System.out.println("Выход из программы");
					break;
				
				default:
					System.out.println("Неверный выбор. Попробуйте снова.");
		}
		}
		validInput=true;
			} catch(InputMismatchException e){
				System.out.println("Ошибка: нужно ввести число. Попробуйте снова.");
				sc.nextLine();
			}
		}
		
		sc.close();
}
}