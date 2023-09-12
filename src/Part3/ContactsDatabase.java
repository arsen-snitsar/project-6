package Part3;
import java.util.Arrays;
import java.util.Scanner;

public class ContactsDatabase {

    public static Scanner keyboard = new Scanner(System.in);

    public static void printContacts(String [] arrayToPrint, int contactCount){
        for (int i = 0; i < contactCount; i++) {
            System.out.println((i+1) + ". " + arrayToPrint[i]);
        }
    }

    public static String [] addSamples(String [] arrayToAddSamplesTo){
        for (int i = 0; i < 10; i++) {
            arrayToAddSamplesTo[i] = "Random Sample Contact №" + (i+1);
        }
        return arrayToAddSamplesTo;
    }

    public static String [] addContact(String [] arrayToAddContactsTo, int contactCount){
        int i = contactCount;
        String userString = "not x";
        while (!userString.equals("x")){
            System.out.printf("Enter №%d contact (or type \"x\", if you wish to stop adding contacts): ", (i+1));
            userString = keyboard.nextLine();
            if (!userString.equals("x"))
                arrayToAddContactsTo[i] = userString;
            i++;
        }
        return arrayToAddContactsTo;
    }

    public static String [] editContact(String [] arrayToEdit){
        System.out.print("Please, enter index of contact you wish to edit: ");
        int i = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("Contact №%d: %s", (i+1), arrayToEdit[i]);
        System.out.print("Please, enter new name for the contact: ");
        arrayToEdit[i] = keyboard.nextLine();
        return arrayToEdit;
    }

    public static void searchContact(String [] arrayToSearch){
        System.out.print("Please, enter a phrase to look for in the array: ");
        String search = keyboard.nextLine();
        for (int i = 0; i < arrayToSearch.length; i++) {
            if (arrayToSearch[i].contains(search))
                System.out.printf("Contact №%d: %s", (i+1), arrayToSearch[i]);
        }
    }

    public static String [] deleteAllContacts(String [] arrayToDelete){
        for (int i = 0; i < arrayToDelete.length; i++) {
            arrayToDelete[i] = "";
        }
        return arrayToDelete;
    }

    public static String [] deleteSelected(String [] arrayToDeleteFrom){
        System.out.print("Please, enter the index of element to delete: ");
        int index = keyboard.nextInt() - 1;
        keyboard.nextLine();
        arrayToDeleteFrom[index] = "DELETED";
        return arrayToDeleteFrom;
    }

    public static int countContacts(String [] arrayToCount){
        int i = 0;
        while (!arrayToCount[i].equals("")){
            i++;
        }
        return i;
    }

    public static int selectAFunction(){
        System.out.println("Hello! This is a contacts app. Please, select a function (by entering a number):\n" +
                "1 - print contacts\n" +
                "2 - add sample contacts\n" +
                "3 - add a contact\n" +
                "4 - edit contact\n" +
                "5 - search contact\n" +
                "6 - delete selected contact\n" +
                "7 - delete all contacts\n" +
                "8 - exit\n");
        int selectedFunction = keyboard.nextInt();
        keyboard.nextLine();
        return selectedFunction;
    }

    public static void main(String[] args) {
        int arraySize = 100000, contactCount = 0, selectedFunction;
        String [] contactsArray = new String[arraySize];
        boolean shouldExit = false;

        contactsArray = deleteAllContacts(contactsArray);

        while (!shouldExit){
            selectedFunction = selectAFunction();
            switch (selectedFunction){
                case 1:
                    printContacts(contactsArray, countContacts(contactsArray));
                    break;
                case 2:
                    contactsArray = addSamples(contactsArray);
                    break;
                case 3:
                    contactsArray = addContact(contactsArray, countContacts(contactsArray));
                    break;
                case 4:
                    contactsArray = editContact(contactsArray);
                    break;
                case 5:
                    searchContact(contactsArray);
                    break;
                case 6:
                    contactsArray = deleteSelected(contactsArray);
                    break;
                case 7:
                    contactsArray = deleteAllContacts(contactsArray);
                    break;
                case 8:
                    shouldExit = true;
                    break;
            }
        }



    }
}