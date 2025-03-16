package votingsystem;

import votingsystem.service.VoterService;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.xml.xpath.XPath;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        VoterService voterService = new VoterService();

        System.out.println("Please enter Voter's id:");
        Scanner id = new Scanner(System.in);
        int voterId = id.nextInt();

        System.out.println(voterService.getVoterById(voterId));

//        System.out.println(voterService.getVoters());


//        System.out.println("Please enter Voter's id:");
//        Scanner id = new Scanner(System.in);
//        int voterId = id.nextInt();
//
//        voterService.deleteVoter(voterId);


//        System.out.println("Please enter Voter's name:");
//        Scanner name = new Scanner(System.in);
//        String voterName = name.nextLine();
//
//        System.out.println("Please enter Voter's age:");
//        Scanner age = new Scanner(System.in);
//        int voterAge = age.nextInt();
//
//        System.out.println("Please enter Voter's email:");
//        Scanner email = new Scanner(System.in);
//        String voterEmail = email.nextLine();
//
//        System.out.println("Please enter Voter's address:");
//        Scanner address = new Scanner(System.in);
//        String voterAddress = address.nextLine();
//
//        System.out.println("Please enter Voter's Phone number:");
//        Scanner phone = new Scanner(System.in);
//        int voterPhone = phone.nextInt();
//
//        System.out.println("Please enter Voter's ID");
//        Scanner id = new Scanner(System.in);
//        int voterId = id.nextInt();
//
//        voterService.updateVoters(voterName,voterAge,voterEmail,voterAddress,voterPhone,voterId);


//        System.out.println("Please enter Candidate's name:");
//        Scanner name = new Scanner(System.in);
//        String candname = name.nextLine();
//
//        System.out.println("Please enter Party's name:");
//        Scanner party = new Scanner(System.in);
//        String candParty = party.nextLine();
//
//        System.out.println("Please provide party's logo:");
//        Scanner logo = new Scanner(System.in);
//        JPEGImageReadParam partyLogo = logo.findAll();


//        System.out.println("Please enter Voter's name:");
//        Scanner name = new Scanner(System.in);
//        String updateName = name.nextLine();
//
//        System.out.println("Please enter Voter's ID:");
//        Scanner id = new Scanner(System.in);
//        int updateId = id.nextInt();
//
//        voterService.updateVoters(updateName,updateId);
//
//        System.out.println(" Please enter Voter's name:");
//        Scanner name = new Scanner(System.in);
//        String addName = name.nextLine();
//
//        System.out.println("Please enter Voter's age:");
//        Scanner age = new Scanner(System.in);
//        int addAge = age.nextInt();
//
//        System.out.println(" Please enter Voter's email:");
//        Scanner email = new Scanner(System.in);
//        String addEmail = email.nextLine();
//
//        System.out.println(" Please enter Voter's address:");
//        Scanner address = new Scanner(System.in);
//        String addAddress = address.nextLine();
//
//        System.out.println("Please enter Voter's phone:");
//        Scanner phone = new Scanner(System.in);
//        int addPhone = phone.nextInt();
//
//        System.out.println("Please enter if the voters have voted:");
//        Scanner hasvoted = new Scanner(System.in);
//        boolean addHasVoted = hasvoted.hasNextBoolean();
//
//        System.out.println(" Please enter Voter's biography:");
//        Scanner biography = new Scanner(System.in);
//        String addBiography = biography.nextLine();
//
//        voterService.addVoters(addName, addAge, addEmail, addAddress, addPhone,  addHasVoted, addBiography);

    }
}
    