
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JessClapier
 */

class Team{
    protected String teamName, sponsorTeam;
    int i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,iTotal;
    int totalScore;
    //arraylist is created but no objects have been added, they must be added later
    ArrayList<Cyclist> myTeam = new ArrayList<>();

    public Team(String teamName, String sponsorTeam) {
        this.teamName = teamName;
        this.sponsorTeam = sponsorTeam;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSponsorTeam() {
        return sponsorTeam;
    }

    public void setSponsorTeam(String sponsorTeam) {
        this.sponsorTeam = sponsorTeam;
    }

    public int getI4() {
        return i4;
    }

    public void setI4(int i4) {
        this.i4 = i4;
    }

    public int getI5() {
        return i5;
    }

    public void setI5(int i5) {
        this.i5 = i5;
    }

    public int getI6() {
        return i6;
    }

    public void setI6(int i6) {
        this.i6 = i6;
    }

    public int getI7() {
        return i7;
    }

    public void setI7(int i7) {
        this.i7 = i7;
    }

    public int getI8() {
        return i8;
    }

    public void setI8(int i8) {
        this.i8 = i8;
    }

    public int getI9() {
        return i9;
    }

    public void setI9(int i9) {
        this.i9 = i9;
    }

    public int getI10() {
        return i10;
    }

    public void setI10(int i10) {
        this.i10 = i10;
    }

    public int getI11() {
        return i11;
    }

    public void setI11(int i11) {
        this.i11 = i11;
    }

    public int getI12() {
        return i12;
    }

    public void setI12(int i12) {
        this.i12 = i12;
    }

    public int getI13() {
        return i13;
    }

    public void setI13(int i13) {
        this.i13 = i13;
    }

    public int getI14() {
        return i14;
    }

    public void setI14(int i14) {
        this.i14 = i14;
    }

    public int getI15() {
        return i15;
    }

    public void setI15(int i15) {
        this.i15 = i15;
    }

    public int getI16() {
        return i16;
    }

    public void setI16(int i16) {
        this.i16 = i16;
    }

    public int getI17() {
        return i17;
    }

    public void setI17(int i17) {
        this.i17 = i17;
    }

    public int getI18() {
        return i18;
    }

    public void setI18(int i18) {
        this.i18 = i18;
    }

    public int getI19() {
        return i19;
    }

    public void setI19(int i19) {
        this.i19 = i19;
    }

    public int getI20() {
        return i20;
    }

    public void setI20(int i20) {
        this.i20 = i20;
    }

    public int getI21() {
        return i21;
    }

    public void setI21(int i21) {
        this.i21 = i21;
    }

    public int getiTotal() {
        return iTotal;
    }

    public void setiTotal(int iTotal) {
        this.iTotal = iTotal;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public ArrayList<Cyclist> getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(ArrayList<Cyclist> myTeam) {
        this.myTeam = myTeam;
    }
    
    public void addTotal(int points){
        this.totalScore += points;
    }
    
}

class Cyclist{
    protected String riderName, teamName;
    protected int iplace4, iplace5, iplace6, iplace7, iplace8, iplace9, iplace10;
    protected int iplace11, iplace12, iplace13, iplace14, iplace15, iplace16, 
            iplace17, iplace18, iplace19, iplace20, iplace21;
    protected boolean bYellowJersey, bGreenJersey, bPolkaJersey, bWhiteJersey;

    public Cyclist() {
    }

    public Cyclist(String riderName, String teamName) {
        this.riderName = riderName;
        this.teamName = teamName;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getIplace4() {
        return iplace4;
    }

    public void setIplace4(int iplace4) {
        this.iplace4 = iplace4;
    }

    public int getIplace5() {
        return iplace5;
    }

    public void setIplace5(int iplace5) {
        this.iplace5 = iplace5;
    }

    public int getIplace6() {
        return iplace6;
    }

    public void setIplace6(int iplace6) {
        this.iplace6 = iplace6;
    }

    public int getIplace7() {
        return iplace7;
    }

    public void setIplace7(int iplace7) {
        this.iplace7 = iplace7;
    }

    public int getIplace8() {
        return iplace8;
    }

    public void setIplace8(int iplace8) {
        this.iplace8 = iplace8;
    }

    public int getIplace9() {
        return iplace9;
    }

    public void setIplace9(int iplace9) {
        this.iplace9 = iplace9;
    }

    public int getIplace10() {
        return iplace10;
    }

    public void setIplace10(int iplace10) {
        this.iplace10 = iplace10;
    }

    public int getIplace11() {
        return iplace11;
    }

    public void setIplace11(int iplace11) {
        this.iplace11 = iplace11;
    }

    public int getIplace12() {
        return iplace12;
    }

    public void setIplace12(int iplace12) {
        this.iplace12 = iplace12;
    }

    public int getIplace13() {
        return iplace13;
    }

    public void setIplace13(int iplace13) {
        this.iplace13 = iplace13;
    }

    public int getIplace14() {
        return iplace14;
    }

    public void setIplace14(int iplace14) {
        this.iplace14 = iplace14;
    }

    public int getIplace15() {
        return iplace15;
    }

    public void setIplace15(int iplace15) {
        this.iplace15 = iplace15;
    }

    public int getIplace16() {
        return iplace16;
    }

    public void setIplace16(int iplace16) {
        this.iplace16 = iplace16;
    }

    public int getIplace17() {
        return iplace17;
    }

    public void setIplace17(int iplace17) {
        this.iplace17 = iplace17;
    }

    public int getIplace18() {
        return iplace18;
    }

    public void setIplace18(int iplace18) {
        this.iplace18 = iplace18;
    }

    public int getIplace19() {
        return iplace19;
    }

    public void setIplace19(int iplace19) {
        this.iplace19 = iplace19;
    }

    public int getIplace20() {
        return iplace20;
    }

    public void setIplace20(int iplace20) {
        this.iplace20 = iplace20;
    }

    public int getIplace21() {
        return iplace21;
    }

    public void setIplace21(int iplace21) {
        this.iplace21 = iplace21;
    }
    
    public void setPlaceAt(int iPlace, int iStage){
        switch (iStage){
            case 4: this.iplace4 = iPlace;
            break;
            case 5: this.iplace5 = iPlace;
            break;
            case 6: this.iplace6 = iPlace;
            break;
            case 7: this.iplace7 = iPlace;
            break;
            case 8: this.iplace8 = iPlace;
            break;
            case 9: this.iplace9 = iPlace;
            break;
            case 10: this.iplace10 = iPlace;
            break;
            case 11: this.iplace11 = iPlace;
            break;
            case 12: this.iplace12 = iPlace;
            break;
            case 13: this.iplace13 = iPlace;
            break;
            case 14: this.iplace14 = iPlace;
            break;
            case 15: this.iplace15 = iPlace;
            break;
            case 16: this.iplace16 = iPlace;
            break;
            case 17: this.iplace17 = iPlace;
            break;
            case 18: this.iplace18 = iPlace;
            break;
            case 19: this.iplace19 = iPlace;
            break;
            case 20: this.iplace20 = iPlace;
            break;
            case 21: this.iplace21 = iPlace;
            break;
            
        }
    }
    
    
}
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    
        //create team object for each person
        Team TeamSteve = new Team("Team Steve", "Movistar");
        Team TeamAmie = new Team("Team Amie", "Sky");
        Team TeamEliza = new Team("Team Eliza", "BMC");
        Team TeamJess = new Team("Team Jess", "Tinkoff");
        
        //create scanner and variables to store data
        Scanner osScan = new Scanner(System.in);
        Scanner oiScan = new Scanner(System.in);
        
        int iPlace, iPoints;
        String sJersey;
        int iStageSteve = 4;
        int iStageAmie = 4;
        int iStageEliza = 4;
        int iStageJess = 4;
        
        
    public frmMain() {
        initComponents();
        
        //load riders to team object cyclists array list
        //team steve
        for (int iCount = 0; iCount < lstTeamSteve.getModel().getSize(); iCount++){
            TeamSteve.myTeam.add(new Cyclist(lstTeamSteve.getModel().getElementAt(iCount), "Team Steve"));
        }
        
        //team Amie
        for (int iCount = 0; iCount < lstTeamAmie.getModel().getSize(); iCount++){
            TeamAmie.myTeam.add(new Cyclist(lstTeamAmie.getModel().getElementAt(iCount), "Team Amie"));
        }
        
        //team Eliza
        for (int iCount = 0; iCount < lstTeamEliza.getModel().getSize(); iCount++){
            TeamEliza.myTeam.add(new Cyclist(lstTeamEliza.getModel().getElementAt(iCount), "Team Eliza"));
        }
        
        //team Jess
        for (int iCount = 0; iCount < lstTeamJess.getModel().getSize(); iCount++){
            TeamJess.myTeam.add(new Cyclist(lstTeamJess.getModel().getElementAt(iCount), "Team Jess"));
        }
    }
    
    //determine number of points to give
    public void CalcPointsForSteve(){
        do {
            for(int iCount = 0; iCount < lstTeamSteve.getModel().getSize(); iCount++){
                System.out.println("Enter place for " + TeamSteve.myTeam.get(iCount).getRiderName() + ": (if not in top 20 enter '0')" );
                iPlace = oiScan.nextInt();
                TeamSteve.myTeam.get(iCount).setPlaceAt(iPlace, iStageSteve);


                switch (iPlace){
                    case 1: TeamSteve.addTotal(50);
                    break;
                    case 2: TeamSteve.addTotal(45);
                    break;
                    case 3: TeamSteve.addTotal(40);
                    break;
                    case 4: TeamSteve.addTotal(35);
                    break;
                    case 5: TeamSteve.addTotal(30);
                    break;
                    case 6: TeamSteve.addTotal(25);
                    break;
                    case 7: TeamSteve.addTotal(24);
                    break;
                    case 8: TeamSteve.addTotal(23);
                    break;
                    case 9: TeamSteve.addTotal(22);
                    break;
                    case 10: TeamSteve.addTotal(21);
                    break;
                    case 11: TeamSteve.addTotal(20);
                    break;
                    case 12: TeamSteve.addTotal(19);
                    break;
                    case 13: TeamSteve.addTotal(18);
                    break;
                    case 14: TeamSteve.addTotal(17);
                    break;
                    case 15: TeamSteve.addTotal(16);
                    break;
                    case 16: TeamSteve.addTotal(15);
                    break;
                    case 17: TeamSteve.addTotal(14);
                    break;
                    case 18: TeamSteve.addTotal(13);
                    break;
                    case 19: TeamSteve.addTotal(12);
                    break;
                    case 20: TeamSteve.addTotal(11);
                    break;
                    case 0: TeamSteve.addTotal(0);
                    break;

                }

                //add jersey bonus
                System.out.println("Did " + TeamSteve.myTeam.get(iCount).getRiderName() + " wear the yellow jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamSteve.addTotal(15);
                    TeamSteve.myTeam.get(iCount).bYellowJersey = true;
                    lblYellowJersey.setText(TeamSteve.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamSteve.myTeam.get(iCount).bYellowJersey = false;

                System.out.println("Did " + TeamSteve.myTeam.get(iCount).getRiderName() + " wear the green jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamSteve.addTotal(10);
                    TeamSteve.myTeam.get(iCount).bGreenJersey = true;
                    lblWhiteJersey.setText(TeamSteve.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamSteve.myTeam.get(iCount).bGreenJersey = false;

                System.out.println("Did " + TeamSteve.myTeam.get(iCount).getRiderName() + " wear the polka dot jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamSteve.addTotal(10);
                    TeamSteve.myTeam.get(iCount).bPolkaJersey = true;
                    lblPolkaJersey.setText(TeamSteve.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamSteve.myTeam.get(iCount).bPolkaJersey = false;

                System.out.println("Did " + TeamSteve.myTeam.get(iCount).getRiderName() + " wear the white jersey? (y/n)");
                sJersey = osScan.nextLine();
                    if (sJersey.equalsIgnoreCase("y")){
                        TeamSteve.addTotal(10);
                        TeamSteve.myTeam.get(iCount).bWhiteJersey = true;
                        lblWhiteJersey.setText(TeamSteve.myTeam.get(iCount).getRiderName());
                    }  
                    
                    else 
                        TeamSteve.myTeam.get(iCount).bWhiteJersey = true;
                }
            
            //team points
            System.out.println("Enter place for " + TeamSteve.getSponsorTeam() + ": (if not in top 5 enter '0')" );
            iPlace = oiScan.nextInt();

            switch (iPlace){
                case 1: TeamSteve.addTotal(30);
                break;
                case 2: TeamSteve.addTotal(25);
                break;
                case 3: TeamSteve.addTotal(20);
                break;
                case 4: TeamSteve.addTotal(15);
                break;
                case 5: TeamSteve.addTotal(12);
                break;
                case 0: TeamSteve.addTotal(0);
                break;
            }
            
            //print results
            switch (iStageSteve){
                case 4: lblTeamSteveScore4.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 5: lblTeamSteveScore5.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 6: lblTeamSteveScore6.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 7: lblTeamSteveScore7.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 8: lblTeamSteveScore8.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 9: lblTeamSteveScore9.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 10: lblTeamSteveScore10.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 11: lblTeamSteveScore11.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 12: lblTeamSteveScore12.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 13: lblTeamSteveScore13.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 14: lblTeamSteveScore14.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 15: lblTeamSteveScore15.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 16: lblTeamSteveScore16.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 17: lblTeamSteveScore17.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 18: lblTeamSteveScore18.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 19: lblTeamSteveScore19.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 20: lblTeamSteveScore20.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                case 21: lblTeamSteveScore21.setText(String.valueOf(TeamSteve.getTotalScore()));
                break;
                
            }
            iStageSteve++;
        } while (iStageSteve == (iStageSteve - 1));
    }
    
        public void CalcPointsForAmie(){
        do {
            for(int iCount = 0; iCount < lstTeamSteve.getModel().getSize(); iCount++){
                System.out.println("Enter place for " + TeamAmie.myTeam.get(iCount).getRiderName() + ": (if not in top 20 enter '0')" );
                iPlace = oiScan.nextInt();
                TeamAmie.myTeam.get(iCount).setPlaceAt(iPlace, iStageAmie);


                switch (iPlace){
                    case 1: TeamAmie.addTotal(50);
                    break;
                    case 2: TeamAmie.addTotal(45);
                    break;
                    case 3: TeamAmie.addTotal(40);
                    break;
                    case 4: TeamAmie.addTotal(35);
                    break;
                    case 5: TeamAmie.addTotal(30);
                    break;
                    case 6: TeamAmie.addTotal(25);
                    break;
                    case 7: TeamAmie.addTotal(24);
                    break;
                    case 8: TeamAmie.addTotal(23);
                    break;
                    case 9: TeamAmie.addTotal(22);
                    break;
                    case 10: TeamAmie.addTotal(21);
                    break;
                    case 11: TeamAmie.addTotal(20);
                    break;
                    case 12: TeamAmie.addTotal(19);
                    break;
                    case 13: TeamAmie.addTotal(18);
                    break;
                    case 14: TeamAmie.addTotal(17);
                    break;
                    case 15: TeamAmie.addTotal(16);
                    break;
                    case 16: TeamAmie.addTotal(15);
                    break;
                    case 17: TeamAmie.addTotal(14);
                    break;
                    case 18: TeamAmie.addTotal(13);
                    break;
                    case 19: TeamAmie.addTotal(12);
                    break;
                    case 20: TeamAmie.addTotal(11);
                    break;
                    case 0: TeamAmie.addTotal(0);
                    break;

                }

                //add jersey bonus
                System.out.println("Did " + TeamAmie.myTeam.get(iCount).getRiderName() + " wear the yellow jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamAmie.addTotal(15);
                    TeamAmie.myTeam.get(iCount).bYellowJersey = true;
                    lblYellowJersey.setText(TeamAmie.myTeam.get(iCount).getRiderName());
                }
                else 
                    TeamAmie.myTeam.get(iCount).bYellowJersey = false;

                System.out.println("Did " + TeamAmie.myTeam.get(iCount).getRiderName() + " wear the green jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamAmie.addTotal(10);
                    TeamAmie.myTeam.get(iCount).bGreenJersey = true;
                    lblGreenJersey.setText(TeamAmie.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamAmie.myTeam.get(iCount).bGreenJersey = false;

                System.out.println("Did " + TeamAmie.myTeam.get(iCount).getRiderName() + " wear the polka dot jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamAmie.addTotal(10);
                    TeamAmie.myTeam.get(iCount).bPolkaJersey = true;
                    lblPolkaJersey.setText(TeamAmie.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamAmie.myTeam.get(iCount).bPolkaJersey = false;

                System.out.println("Did " + TeamAmie.myTeam.get(iCount).getRiderName() + " wear the white jersey? (y/n)");
                sJersey = osScan.nextLine();
                    if (sJersey.equalsIgnoreCase("y")){
                        TeamAmie.addTotal(10);
                        TeamAmie.myTeam.get(iCount).bWhiteJersey = true;
                        lblWhiteJersey.setText(TeamAmie.myTeam.get(iCount).getRiderName());
                    }
                    else 
                        TeamAmie.myTeam.get(iCount).bWhiteJersey = false;
                }
            
            //team points
            System.out.println("Enter place for " + TeamAmie.getSponsorTeam() + ": (if not in top 5 enter '0')" );
            iPlace = oiScan.nextInt();

            switch (iPlace){
                case 1: TeamAmie.addTotal(30);
                break;
                case 2: TeamAmie.addTotal(25);
                break;
                case 3: TeamAmie.addTotal(20);
                break;
                case 4: TeamAmie.addTotal(15);
                break;
                case 5: TeamAmie.addTotal(12);
                break;
                case 0: TeamAmie.addTotal(0);
                break;
            }
            
            //print results
            switch (iStageAmie){
                case 4: lblTeamAmieScore4.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 5: lblTeamAmieScore5.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 6: lblTeamAmieScore6.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 7: lblTeamAmieScore7.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 8: lblTeamAmieScore8.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 9: lblTeamAmieScore9.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 10: lblTeamAmieScore10.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 11: lblTeamAmieScore11.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 12: lblTeamAmieScore12.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 13: lblTeamAmieScore13.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 14: lblTeamAmieScore14.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 15: lblTeamAmieScore15.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 16: lblTeamAmieScore16.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 17: lblTeamAmieScore17.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 18: lblTeamAmieScore18.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 19: lblTeamAmieScore19.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 20: lblTeamAmieScore20.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                case 21: lblTeamAmieScore21.setText(String.valueOf(TeamAmie.getTotalScore()));
                break;
                
            }
            iStageAmie++;
        } while (iStageAmie == (iStageAmie - 1));
    }
        
public void CalcPointsForEliza(){
        do {
            for(int iCount = 0; iCount < lstTeamSteve.getModel().getSize(); iCount++){
                System.out.println("Enter place for " + TeamEliza.myTeam.get(iCount).getRiderName() + ": (if not in top 20 enter '0')" );
                iPlace = oiScan.nextInt();
                TeamEliza.myTeam.get(iCount).setPlaceAt(iPlace, iStageEliza);


                switch (iPlace){
                    case 1: TeamEliza.addTotal(50);
                    break;
                    case 2: TeamEliza.addTotal(45);
                    break;
                    case 3: TeamEliza.addTotal(40);
                    break;
                    case 4: TeamEliza.addTotal(35);
                    break;
                    case 5: TeamEliza.addTotal(30);
                    break;
                    case 6: TeamEliza.addTotal(25);
                    break;
                    case 7: TeamEliza.addTotal(24);
                    break;
                    case 8: TeamEliza.addTotal(23);
                    break;
                    case 9: TeamEliza.addTotal(22);
                    break;
                    case 10: TeamEliza.addTotal(21);
                    break;
                    case 11: TeamEliza.addTotal(20);
                    break;
                    case 12: TeamEliza.addTotal(19);
                    break;
                    case 13: TeamEliza.addTotal(18);
                    break;
                    case 14: TeamEliza.addTotal(17);
                    break;
                    case 15: TeamEliza.addTotal(16);
                    break;
                    case 16: TeamEliza.addTotal(15);
                    break;
                    case 17: TeamEliza.addTotal(14);
                    break;
                    case 18: TeamEliza.addTotal(13);
                    break;
                    case 19: TeamEliza.addTotal(12);
                    break;
                    case 20: TeamEliza.addTotal(11);
                    break;
                    case 0: TeamEliza.addTotal(0);
                    break;

                }

                //add jersey bonus
                System.out.println("Did " + TeamEliza.myTeam.get(iCount).getRiderName() + " wear the yellow jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamEliza.addTotal(15);
                    TeamEliza.myTeam.get(iCount).bYellowJersey = true;
                    lblYellowJersey.setText(TeamEliza.myTeam.get(iCount).getRiderName());
                }
                else 
                    TeamEliza.myTeam.get(iCount).bYellowJersey = false;

                System.out.println("Did " + TeamEliza.myTeam.get(iCount).getRiderName() + " wear the green jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamEliza.addTotal(10);
                    TeamEliza.myTeam.get(iCount).bGreenJersey = true;
                    lblGreenJersey.setText(TeamEliza.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamEliza.myTeam.get(iCount).bGreenJersey = false;

                System.out.println("Did " + TeamEliza.myTeam.get(iCount).getRiderName() + " wear the polka dot jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamEliza.addTotal(10);
                    TeamEliza.myTeam.get(iCount).bPolkaJersey = true;
                    lblPolkaJersey.setText(TeamEliza.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamEliza.myTeam.get(iCount).bPolkaJersey = false;

                System.out.println("Did " + TeamEliza.myTeam.get(iCount).getRiderName() + " wear the white jersey? (y/n)");
                sJersey = osScan.nextLine();
                    if (sJersey.equalsIgnoreCase("y")){
                        TeamEliza.addTotal(10);
                        TeamEliza.myTeam.get(iCount).bWhiteJersey = true;
                        lblWhiteJersey.setText(TeamEliza.myTeam.get(iCount).getRiderName());
                    }
                    else 
                        TeamEliza.myTeam.get(iCount).bWhiteJersey = false;
                }
            
            //team points
            System.out.println("Enter place for " + TeamEliza.getSponsorTeam() + ": (if not in top 5 enter '0')" );
            iPlace = oiScan.nextInt();

            switch (iPlace){
                case 1: TeamEliza.addTotal(30);
                break;
                case 2: TeamEliza.addTotal(25);
                break;
                case 3: TeamEliza.addTotal(20);
                break;
                case 4: TeamEliza.addTotal(15);
                break;
                case 5: TeamEliza.addTotal(12);
                break;
                case 0: TeamEliza.addTotal(0);
                break;
            }
            
            //print results
            switch (iStageEliza){
                case 4: lblTeamElizaScore4.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 5: lblTeamElizaScore5.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 6: lblTeamElizaScore6.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 7: lblTeamElizaScore7.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 8: lblTeamElizaScore8.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 9: lblTeamElizaScore9.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 10: lblTeamElizaScore10.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 11: lblTeamElizaScore11.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 12: lblTeamElizaScore12.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 13: lblTeamElizaScore13.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 14: lblTeamElizaScore14.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 15: lblTeamElizaScore15.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 16: lblTeamElizaScore16.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 17: lblTeamElizaScore17.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 18: lblTeamElizaScore18.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 19: lblTeamElizaScore19.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 20: lblTeamElizaScore20.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                case 21: lblTeamElizaScore21.setText(String.valueOf(TeamEliza.getTotalScore()));
                break;
                
            }
            iStageEliza++;
        } while (iStageEliza == (iStageEliza - 1));
    }
        
public void CalcPointsForJess(){
        do {
            for(int iCount = 0; iCount < lstTeamSteve.getModel().getSize(); iCount++){
                System.out.println("Enter place for " + TeamJess.myTeam.get(iCount).getRiderName() + ": (if not in top 20 enter '0')" );
                iPlace = oiScan.nextInt();
                TeamJess.myTeam.get(iCount).setPlaceAt(iPlace, iStageJess);


                switch (iPlace){
                    case 1: TeamJess.addTotal(50);
                    break;
                    case 2: TeamJess.addTotal(45);
                    break;
                    case 3: TeamJess.addTotal(40);
                    break;
                    case 4: TeamJess.addTotal(35);
                    break;
                    case 5: TeamJess.addTotal(30);
                    break;
                    case 6: TeamJess.addTotal(25);
                    break;
                    case 7: TeamJess.addTotal(24);
                    break;
                    case 8: TeamJess.addTotal(23);
                    break;
                    case 9: TeamJess.addTotal(22);
                    break;
                    case 10: TeamJess.addTotal(21);
                    break;
                    case 11: TeamJess.addTotal(20);
                    break;
                    case 12: TeamJess.addTotal(19);
                    break;
                    case 13: TeamJess.addTotal(18);
                    break;
                    case 14: TeamJess.addTotal(17);
                    break;
                    case 15: TeamJess.addTotal(16);
                    break;
                    case 16: TeamJess.addTotal(15);
                    break;
                    case 17: TeamJess.addTotal(14);
                    break;
                    case 18: TeamJess.addTotal(13);
                    break;
                    case 19: TeamJess.addTotal(12);
                    break;
                    case 20: TeamJess.addTotal(11);
                    break;
                    case 0: TeamJess.addTotal(0);
                    break;

                }

                //add jersey bonus
                System.out.println("Did " + TeamJess.myTeam.get(iCount).getRiderName() + " wear the yellow jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamJess.addTotal(15);
                    TeamJess.myTeam.get(iCount).bYellowJersey = true;
                    lblYellowJersey.setText(TeamJess.myTeam.get(iCount).getRiderName());
                }
                else 
                    TeamJess.myTeam.get(iCount).bYellowJersey = false;

                System.out.println("Did " + TeamJess.myTeam.get(iCount).getRiderName() + " wear the green jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamJess.addTotal(10);
                    TeamJess.myTeam.get(iCount).bGreenJersey = true;
                    lblGreenJersey.setText(TeamJess.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamJess.myTeam.get(iCount).bGreenJersey = false;

                System.out.println("Did " + TeamJess.myTeam.get(iCount).getRiderName() + " wear the polka dot jersey? (y/n)");
                sJersey = osScan.nextLine();
                if (sJersey.equalsIgnoreCase("y")){
                    TeamJess.addTotal(10);
                    TeamJess.myTeam.get(iCount).bPolkaJersey = true;
                    lblPolkaJersey.setText(TeamJess.myTeam.get(iCount).getRiderName());
                }
                else
                    TeamJess.myTeam.get(iCount).bPolkaJersey = false;

                System.out.println("Did " + TeamJess.myTeam.get(iCount).getRiderName() + " wear the white jersey? (y/n)");
                sJersey = osScan.nextLine();
                    if (sJersey.equalsIgnoreCase("y")){
                        TeamJess.addTotal(10);
                        TeamJess.myTeam.get(iCount).bWhiteJersey = true;
                        lblWhiteJersey.setText(TeamJess.myTeam.get(iCount).getRiderName());
                    }
                    else 
                        TeamJess.myTeam.get(iCount).bWhiteJersey = false;
                }
            
            //team points
            System.out.println("Enter place for " + TeamJess.getSponsorTeam() + ": (if not in top 5 enter '0')" );
            iPlace = oiScan.nextInt();

            switch (iPlace){
                case 1: TeamJess.addTotal(30);
                break;
                case 2: TeamJess.addTotal(25);
                break;
                case 3: TeamJess.addTotal(20);
                break;
                case 4: TeamJess.addTotal(15);
                break;
                case 5: TeamJess.addTotal(12);
                break;
                case 0: TeamJess.addTotal(0);
                break;
            }
            
            //print results
            switch (iStageJess){
                case 4: lblTeamJessScore4.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 5: lblTeamJessScore5.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 6: lblTeamJessScore6.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 7: lblTeamJessScore7.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 8: lblTeamJessScore8.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 9: lblTeamJessScore9.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 10: lblTeamJessScore10.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 11: lblTeamJessScore11.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 12: lblTeamJessScore12.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 13: lblTeamJessScore13.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 14: lblTeamJessScore14.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 15: lblTeamJessScore15.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 16: lblTeamJessScore16.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 17: lblTeamJessScore17.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 18: lblTeamJessScore18.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 19: lblTeamJessScore19.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 20: lblTeamJessScore20.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                case 21: lblTeamJessScore21.setText(String.valueOf(TeamJess.getTotalScore()));
                break;
                
            }
            iStageJess++;
        } while (iStageJess == (iStageJess - 1));
    }               
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblTourdeFrance = new javax.swing.JLabel();
        lbl3580S = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTeamJess = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTeamSteve = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTeamAmie = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstTeamEliza = new javax.swing.JList<>();
        lblTeamJess = new javax.swing.JLabel();
        lblTeamSteve1 = new javax.swing.JLabel();
        lblTeamAmie = new javax.swing.JLabel();
        lblTeamEliza = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        lblStages = new javax.swing.JLabel();
        lblStagesAll = new javax.swing.JLabel();
        lblTeamSteveScore = new javax.swing.JLabel();
        lblTeamAmieScore = new javax.swing.JLabel();
        lblTeamElizaScore = new javax.swing.JLabel();
        lblTeamJessScore = new javax.swing.JLabel();
        lblTeamSteveScore4 = new javax.swing.JLabel();
        lblTeamSteveScore5 = new javax.swing.JLabel();
        lblTeamSteveScore6 = new javax.swing.JLabel();
        lblTeamSteveScore7 = new javax.swing.JLabel();
        lblTeamSteveScore8 = new javax.swing.JLabel();
        lblTeamSteveScore9 = new javax.swing.JLabel();
        lblTeamSteveScore10 = new javax.swing.JLabel();
        lblTeamSteveScore11 = new javax.swing.JLabel();
        lblTeamSteveScore12 = new javax.swing.JLabel();
        lblTeamSteveScore13 = new javax.swing.JLabel();
        lblTeamSteveScore14 = new javax.swing.JLabel();
        lblTeamSteveScore15 = new javax.swing.JLabel();
        lblTeamSteveScore16 = new javax.swing.JLabel();
        lblTeamSteveScore17 = new javax.swing.JLabel();
        lblTeamSteveScore18 = new javax.swing.JLabel();
        lblTeamSteveScore19 = new javax.swing.JLabel();
        lblTeamSteveScore20 = new javax.swing.JLabel();
        lblTeamSteveScore21 = new javax.swing.JLabel();
        lblTeamSteveScoreTotal = new javax.swing.JLabel();
        lblTeamAmieScore4 = new javax.swing.JLabel();
        lblTeamAmieScore5 = new javax.swing.JLabel();
        lblTeamAmieScore6 = new javax.swing.JLabel();
        lblTeamAmieScore7 = new javax.swing.JLabel();
        lblTeamAmieScore8 = new javax.swing.JLabel();
        lblTeamAmieScore9 = new javax.swing.JLabel();
        lblTeamAmieScore10 = new javax.swing.JLabel();
        lblTeamAmieScore11 = new javax.swing.JLabel();
        lblTeamAmieScore12 = new javax.swing.JLabel();
        lblTeamAmieScore13 = new javax.swing.JLabel();
        lblTeamAmieScore14 = new javax.swing.JLabel();
        lblTeamAmieScore15 = new javax.swing.JLabel();
        lblTeamAmieScore16 = new javax.swing.JLabel();
        lblTeamAmieScore17 = new javax.swing.JLabel();
        lblTeamAmieScore18 = new javax.swing.JLabel();
        lblTeamAmieScore19 = new javax.swing.JLabel();
        lblTeamAmieScore20 = new javax.swing.JLabel();
        lblTeamAmieScore21 = new javax.swing.JLabel();
        lblTeamAmieScoreTotal = new javax.swing.JLabel();
        lblTeamElizaScore4 = new javax.swing.JLabel();
        lblTeamElizaScore5 = new javax.swing.JLabel();
        lblTeamElizaScore6 = new javax.swing.JLabel();
        lblTeamElizaScore7 = new javax.swing.JLabel();
        lblTeamElizaScore8 = new javax.swing.JLabel();
        lblTeamElizaScore9 = new javax.swing.JLabel();
        lblTeamElizaScore10 = new javax.swing.JLabel();
        lblTeamElizaScore11 = new javax.swing.JLabel();
        lblTeamElizaScore12 = new javax.swing.JLabel();
        lblTeamElizaScore13 = new javax.swing.JLabel();
        lblTeamElizaScore14 = new javax.swing.JLabel();
        lblTeamElizaScore15 = new javax.swing.JLabel();
        lblTeamElizaScore16 = new javax.swing.JLabel();
        lblTeamElizaScore17 = new javax.swing.JLabel();
        lblTeamElizaScore18 = new javax.swing.JLabel();
        lblTeamElizaScore19 = new javax.swing.JLabel();
        lblTeamElizaScore20 = new javax.swing.JLabel();
        lblTeamElizaScore21 = new javax.swing.JLabel();
        lblTeamElizaScoreTotal = new javax.swing.JLabel();
        lblTeamJessScore4 = new javax.swing.JLabel();
        lblTeamJessScore5 = new javax.swing.JLabel();
        lblTeamJessScore6 = new javax.swing.JLabel();
        lblTeamJessScore7 = new javax.swing.JLabel();
        lblTeamJessScore8 = new javax.swing.JLabel();
        lblTeamJessScore9 = new javax.swing.JLabel();
        lblTeamJessScore10 = new javax.swing.JLabel();
        lblTeamJessScore11 = new javax.swing.JLabel();
        lblTeamJessScore12 = new javax.swing.JLabel();
        lblTeamJessScore13 = new javax.swing.JLabel();
        lblTeamJessScore14 = new javax.swing.JLabel();
        lblTeamJessScore15 = new javax.swing.JLabel();
        lblTeamJessScore16 = new javax.swing.JLabel();
        lblTeamJessScore17 = new javax.swing.JLabel();
        lblTeamJessScore18 = new javax.swing.JLabel();
        lblTeamJessScore19 = new javax.swing.JLabel();
        lblTeamJessScore20 = new javax.swing.JLabel();
        lblTeamJessScore21 = new javax.swing.JLabel();
        lblTeamJessScoreTotal = new javax.swing.JLabel();
        btnCalc4 = new javax.swing.JButton();
        btnCalc5 = new javax.swing.JButton();
        btnCalc6 = new javax.swing.JButton();
        btnCalc7 = new javax.swing.JButton();
        btnCalc8 = new javax.swing.JButton();
        btnCalc9 = new javax.swing.JButton();
        btnCalc10 = new javax.swing.JButton();
        btnCalc11 = new javax.swing.JButton();
        btnCalc12 = new javax.swing.JButton();
        btnCalc13 = new javax.swing.JButton();
        btnCalc14 = new javax.swing.JButton();
        btnCalc15 = new javax.swing.JButton();
        btnCalc16 = new javax.swing.JButton();
        btnCalc17 = new javax.swing.JButton();
        btnCalc18 = new javax.swing.JButton();
        btnCalc19 = new javax.swing.JButton();
        btnCalc20 = new javax.swing.JButton();
        btnCalc21 = new javax.swing.JButton();
        lblWhiteJersey = new javax.swing.JLabel();
        lblYellowJersey = new javax.swing.JLabel();
        lblGreenJersey = new javax.swing.JLabel();
        lblPolkaJersey = new javax.swing.JLabel();
        lblYellowJersey1 = new javax.swing.JLabel();
        lblGreenJersey1 = new javax.swing.JLabel();
        lblPolkaJersey1 = new javax.swing.JLabel();
        lblWhiteJersey1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTourdeFrance.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        lblTourdeFrance.setText("Tour de France 2016");
        pnlMain.add(lblTourdeFrance, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        lbl3580S.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl3580S.setText("3580 S. Roomies Fantasy League");
        pnlMain.add(lbl3580S, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        lstTeamJess.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fabio Aru", "Mark Cavendish", "Julian Alaphilippe", "Fabian Cancellara", "John Degenkolb", "Thibaut Pinot" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTeamJess);

        pnlMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 210, -1));

        lstTeamSteve.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chris Froome", "Andre Greipel", "Tejay van Garderen", "Warren Barguil", "Romain Bardet", "Alexander Kristoff" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstTeamSteve);

        pnlMain.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 210, -1));

        lstTeamAmie.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Alberto Contador", "Peter Sagan", "Richie Porte", "Vincenzo Nibali", "Geraint Thomas", "Joaquim Rodriguez" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstTeamAmie);

        pnlMain.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 210, -1));

        lstTeamEliza.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nairo Quintana", "Marcel Kittel", "Alejandro Valverde", "Dan Martin", "Bryan Coquard", "Daniel Teklehaimanot" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstTeamEliza);

        pnlMain.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 210, -1));

        lblTeamJess.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblTeamJess.setText("Team Jess");
        pnlMain.add(lblTeamJess, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        lblTeamSteve1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblTeamSteve1.setText("Team Steve");
        pnlMain.add(lblTeamSteve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        lblTeamAmie.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblTeamAmie.setText("Team Amie");
        pnlMain.add(lblTeamAmie, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        lblTeamEliza.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblTeamEliza.setText("Team Eliza");
        pnlMain.add(lblTeamEliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        btnPrint.setText("Print Results");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        pnlMain.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 750, -1, -1));

        lblStages.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblStages.setText("Stages");
        pnlMain.add(lblStages, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        lblStagesAll.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblStagesAll.setText("4        5        6        7        8        9        10        11        12        13        14       15        16        17        18        19        20        21        Total");
        pnlMain.add(lblStagesAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        lblTeamSteveScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTeamSteveScore.setText("Steve");
        pnlMain.add(lblTeamSteveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        lblTeamAmieScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTeamAmieScore.setText("Amie");
        pnlMain.add(lblTeamAmieScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        lblTeamElizaScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTeamElizaScore.setText("Eliza");
        pnlMain.add(lblTeamElizaScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        lblTeamJessScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTeamJessScore.setText("Jess");
        pnlMain.add(lblTeamJessScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        lblTeamSteveScore4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore4.setText("SSS");
        pnlMain.add(lblTeamSteveScore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        lblTeamSteveScore5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore5.setText("SSS");
        pnlMain.add(lblTeamSteveScore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        lblTeamSteveScore6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore6.setText("SSS");
        pnlMain.add(lblTeamSteveScore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        lblTeamSteveScore7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore7.setText("SSS");
        pnlMain.add(lblTeamSteveScore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        lblTeamSteveScore8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore8.setText("SSS");
        pnlMain.add(lblTeamSteveScore8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        lblTeamSteveScore9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore9.setText("SSS");
        pnlMain.add(lblTeamSteveScore9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        lblTeamSteveScore10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore10.setText("SSS");
        pnlMain.add(lblTeamSteveScore10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        lblTeamSteveScore11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore11.setText("SSS");
        pnlMain.add(lblTeamSteveScore11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        lblTeamSteveScore12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore12.setText("SSS");
        pnlMain.add(lblTeamSteveScore12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        lblTeamSteveScore13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore13.setText("SSS");
        pnlMain.add(lblTeamSteveScore13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        lblTeamSteveScore14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore14.setText("SSS");
        pnlMain.add(lblTeamSteveScore14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        lblTeamSteveScore15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore15.setText("SSS");
        pnlMain.add(lblTeamSteveScore15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        lblTeamSteveScore16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore16.setText("SSS");
        pnlMain.add(lblTeamSteveScore16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        lblTeamSteveScore17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore17.setText("SSS");
        pnlMain.add(lblTeamSteveScore17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        lblTeamSteveScore18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore18.setText("SSS");
        pnlMain.add(lblTeamSteveScore18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, -1, -1));

        lblTeamSteveScore19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore19.setText("SSS");
        pnlMain.add(lblTeamSteveScore19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, -1, -1));

        lblTeamSteveScore20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore20.setText("SSS");
        pnlMain.add(lblTeamSteveScore20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, -1, -1));

        lblTeamSteveScore21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScore21.setText("SSS");
        pnlMain.add(lblTeamSteveScore21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 500, -1, -1));

        lblTeamSteveScoreTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamSteveScoreTotal.setText("SSS");
        pnlMain.add(lblTeamSteveScoreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 500, -1, -1));

        lblTeamAmieScore4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore4.setText("SSS");
        pnlMain.add(lblTeamAmieScore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        lblTeamAmieScore5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore5.setText("SSS");
        pnlMain.add(lblTeamAmieScore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        lblTeamAmieScore6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore6.setText("SSS");
        pnlMain.add(lblTeamAmieScore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        lblTeamAmieScore7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore7.setText("SSS");
        pnlMain.add(lblTeamAmieScore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        lblTeamAmieScore8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore8.setText("SSS");
        pnlMain.add(lblTeamAmieScore8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        lblTeamAmieScore9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore9.setText("SSS");
        pnlMain.add(lblTeamAmieScore9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        lblTeamAmieScore10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore10.setText("SSS");
        pnlMain.add(lblTeamAmieScore10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, -1));

        lblTeamAmieScore11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore11.setText("SSS");
        pnlMain.add(lblTeamAmieScore11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        lblTeamAmieScore12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore12.setText("SSS");
        pnlMain.add(lblTeamAmieScore12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        lblTeamAmieScore13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore13.setText("SSS");
        pnlMain.add(lblTeamAmieScore13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        lblTeamAmieScore14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore14.setText("SSS");
        pnlMain.add(lblTeamAmieScore14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        lblTeamAmieScore15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore15.setText("SSS");
        pnlMain.add(lblTeamAmieScore15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, -1, -1));

        lblTeamAmieScore16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore16.setText("SSS");
        pnlMain.add(lblTeamAmieScore16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        lblTeamAmieScore17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore17.setText("SSS");
        pnlMain.add(lblTeamAmieScore17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, -1, -1));

        lblTeamAmieScore18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore18.setText("SSS");
        pnlMain.add(lblTeamAmieScore18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));

        lblTeamAmieScore19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore19.setText("SSS");
        pnlMain.add(lblTeamAmieScore19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        lblTeamAmieScore20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore20.setText("SSS");
        pnlMain.add(lblTeamAmieScore20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, -1, -1));

        lblTeamAmieScore21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScore21.setText("SSS");
        pnlMain.add(lblTeamAmieScore21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 540, -1, -1));

        lblTeamAmieScoreTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamAmieScoreTotal.setText("SSS");
        pnlMain.add(lblTeamAmieScoreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 540, -1, -1));

        lblTeamElizaScore4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore4.setText("SSS");
        pnlMain.add(lblTeamElizaScore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, -1));

        lblTeamElizaScore5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore5.setText("SSS");
        pnlMain.add(lblTeamElizaScore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        lblTeamElizaScore6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore6.setText("SSS");
        pnlMain.add(lblTeamElizaScore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, -1, -1));

        lblTeamElizaScore7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore7.setText("SSS");
        pnlMain.add(lblTeamElizaScore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        lblTeamElizaScore8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore8.setText("SSS");
        pnlMain.add(lblTeamElizaScore8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        lblTeamElizaScore9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore9.setText("SSS");
        pnlMain.add(lblTeamElizaScore9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));

        lblTeamElizaScore10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore10.setText("SSS");
        pnlMain.add(lblTeamElizaScore10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        lblTeamElizaScore11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore11.setText("SSS");
        pnlMain.add(lblTeamElizaScore11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        lblTeamElizaScore12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore12.setText("SSS");
        pnlMain.add(lblTeamElizaScore12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        lblTeamElizaScore13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore13.setText("SSS");
        pnlMain.add(lblTeamElizaScore13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        lblTeamElizaScore14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore14.setText("SSS");
        pnlMain.add(lblTeamElizaScore14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        lblTeamElizaScore15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore15.setText("SSS");
        pnlMain.add(lblTeamElizaScore15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        lblTeamElizaScore16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore16.setText("SSS");
        pnlMain.add(lblTeamElizaScore16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, -1, -1));

        lblTeamElizaScore17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore17.setText("SSS");
        pnlMain.add(lblTeamElizaScore17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, -1, -1));

        lblTeamElizaScore18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore18.setText("SSS");
        pnlMain.add(lblTeamElizaScore18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, -1, -1));

        lblTeamElizaScore19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore19.setText("SSS");
        pnlMain.add(lblTeamElizaScore19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, -1, -1));

        lblTeamElizaScore20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore20.setText("SSS");
        pnlMain.add(lblTeamElizaScore20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        lblTeamElizaScore21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScore21.setText("SSS");
        pnlMain.add(lblTeamElizaScore21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, -1, -1));

        lblTeamElizaScoreTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamElizaScoreTotal.setText("SSS");
        pnlMain.add(lblTeamElizaScoreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, -1, -1));

        lblTeamJessScore4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore4.setText("SSS");
        pnlMain.add(lblTeamJessScore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, -1, -1));

        lblTeamJessScore5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore5.setText("SSS");
        pnlMain.add(lblTeamJessScore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));

        lblTeamJessScore6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore6.setText("SSS");
        pnlMain.add(lblTeamJessScore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        lblTeamJessScore7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore7.setText("SSS");
        pnlMain.add(lblTeamJessScore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, -1, -1));

        lblTeamJessScore8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore8.setText("SSS");
        pnlMain.add(lblTeamJessScore8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        lblTeamJessScore9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore9.setText("SSS");
        pnlMain.add(lblTeamJessScore9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        lblTeamJessScore10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore10.setText("SSS");
        pnlMain.add(lblTeamJessScore10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, -1, -1));

        lblTeamJessScore11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore11.setText("SSS");
        pnlMain.add(lblTeamJessScore11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        lblTeamJessScore12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore12.setText("SSS");
        pnlMain.add(lblTeamJessScore12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        lblTeamJessScore13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore13.setText("SSS");
        pnlMain.add(lblTeamJessScore13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));

        lblTeamJessScore14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore14.setText("SSS");
        pnlMain.add(lblTeamJessScore14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, -1, -1));

        lblTeamJessScore15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore15.setText("SSS");
        pnlMain.add(lblTeamJessScore15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, -1, -1));

        lblTeamJessScore16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore16.setText("SSS");
        pnlMain.add(lblTeamJessScore16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, -1, -1));

        lblTeamJessScore17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore17.setText("SSS");
        pnlMain.add(lblTeamJessScore17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, -1, -1));

        lblTeamJessScore18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore18.setText("SSS");
        pnlMain.add(lblTeamJessScore18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, -1, -1));

        lblTeamJessScore19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore19.setText("SSS");
        pnlMain.add(lblTeamJessScore19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, -1, -1));

        lblTeamJessScore20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore20.setText("SSS");
        pnlMain.add(lblTeamJessScore20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, -1, -1));

        lblTeamJessScore21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScore21.setText("SSS");
        pnlMain.add(lblTeamJessScore21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 620, -1, -1));

        lblTeamJessScoreTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTeamJessScoreTotal.setText("SSS");
        pnlMain.add(lblTeamJessScoreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 620, -1, -1));

        btnCalc4.setText("4");
        btnCalc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc4ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        btnCalc5.setText("5");
        btnCalc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc5ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, -1, -1));

        btnCalc6.setText("6");
        btnCalc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc6ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, -1, -1));

        btnCalc7.setText("7");
        btnCalc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc7ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, -1, -1));

        btnCalc8.setText("8");
        btnCalc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc8ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        btnCalc9.setText("9");
        btnCalc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc9ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        btnCalc10.setText("10");
        btnCalc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc10ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, -1, -1));

        btnCalc11.setText("11");
        btnCalc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc11ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        btnCalc12.setText("12");
        btnCalc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc12ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, -1, -1));

        btnCalc13.setText("13");
        btnCalc13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc13ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, -1, -1));

        btnCalc14.setText("14");
        btnCalc14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc14ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, -1, -1));

        btnCalc15.setText("15");
        btnCalc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc15ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, -1, -1));

        btnCalc16.setText("16");
        btnCalc16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc16ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, -1, -1));

        btnCalc17.setText("17");
        btnCalc17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc17ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, -1, -1));

        btnCalc18.setText("18");
        btnCalc18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc18ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, -1, -1));

        btnCalc19.setText("19");
        btnCalc19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc19ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc19, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, -1, -1));

        btnCalc20.setText("20");
        btnCalc20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc20ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, -1, -1));

        btnCalc21.setText("21");
        btnCalc21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalc21ActionPerformed(evt);
            }
        });
        pnlMain.add(btnCalc21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, -1, -1));

        lblWhiteJersey.setText("White Jersey");
        pnlMain.add(lblWhiteJersey, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 770, -1, -1));

        lblYellowJersey.setText("Yellow Jersey");
        pnlMain.add(lblYellowJersey, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 770, -1, -1));

        lblGreenJersey.setText("Green Jersey");
        pnlMain.add(lblGreenJersey, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 770, -1, -1));

        lblPolkaJersey.setText("Polka Jersey");
        pnlMain.add(lblPolkaJersey, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 770, -1, -1));

        lblYellowJersey1.setText("Yellow Jersey");
        pnlMain.add(lblYellowJersey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 730, -1, -1));

        lblGreenJersey1.setText("Green Jersey");
        pnlMain.add(lblGreenJersey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, -1, -1));

        lblPolkaJersey1.setText("Polka Jersey");
        pnlMain.add(lblPolkaJersey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, -1, -1));

        lblWhiteJersey1.setText("White Jersey");
        pnlMain.add(lblWhiteJersey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 730, -1, -1));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc7ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc7ActionPerformed

    private void btnCalc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc4ActionPerformed
        // TODO add your handling code here:
        //ask user for inputs
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc4ActionPerformed

    private void btnCalc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc5ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc5ActionPerformed

    private void btnCalc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc6ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc6ActionPerformed

    private void btnCalc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc8ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc8ActionPerformed

    private void btnCalc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc9ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc9ActionPerformed

    private void btnCalc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc10ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc10ActionPerformed

    private void btnCalc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc11ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc11ActionPerformed

    private void btnCalc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc12ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc12ActionPerformed

    private void btnCalc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc13ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc13ActionPerformed

    private void btnCalc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc14ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc14ActionPerformed

    private void btnCalc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc15ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc15ActionPerformed

    private void btnCalc16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc16ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc16ActionPerformed

    private void btnCalc17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc17ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc17ActionPerformed

    private void btnCalc18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc18ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc18ActionPerformed

    private void btnCalc19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc19ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc19ActionPerformed

    private void btnCalc20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc20ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc20ActionPerformed

    private void btnCalc21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalc21ActionPerformed
        // TODO add your handling code here:
        CalcPointsForSteve();
        CalcPointsForAmie();
        CalcPointsForEliza();
        CalcPointsForJess();
    }//GEN-LAST:event_btnCalc21ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        //for (int iCount = 0; iCount )
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc10;
    private javax.swing.JButton btnCalc11;
    private javax.swing.JButton btnCalc12;
    private javax.swing.JButton btnCalc13;
    private javax.swing.JButton btnCalc14;
    private javax.swing.JButton btnCalc15;
    private javax.swing.JButton btnCalc16;
    private javax.swing.JButton btnCalc17;
    private javax.swing.JButton btnCalc18;
    private javax.swing.JButton btnCalc19;
    private javax.swing.JButton btnCalc20;
    private javax.swing.JButton btnCalc21;
    private javax.swing.JButton btnCalc4;
    private javax.swing.JButton btnCalc5;
    private javax.swing.JButton btnCalc6;
    private javax.swing.JButton btnCalc7;
    private javax.swing.JButton btnCalc8;
    private javax.swing.JButton btnCalc9;
    private javax.swing.JButton btnPrint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl3580S;
    private javax.swing.JLabel lblGreenJersey;
    private javax.swing.JLabel lblGreenJersey1;
    private javax.swing.JLabel lblPolkaJersey;
    private javax.swing.JLabel lblPolkaJersey1;
    private javax.swing.JLabel lblStages;
    private javax.swing.JLabel lblStagesAll;
    private javax.swing.JLabel lblTeamAmie;
    private javax.swing.JLabel lblTeamAmieScore;
    private javax.swing.JLabel lblTeamAmieScore10;
    private javax.swing.JLabel lblTeamAmieScore11;
    private javax.swing.JLabel lblTeamAmieScore12;
    private javax.swing.JLabel lblTeamAmieScore13;
    private javax.swing.JLabel lblTeamAmieScore14;
    private javax.swing.JLabel lblTeamAmieScore15;
    private javax.swing.JLabel lblTeamAmieScore16;
    private javax.swing.JLabel lblTeamAmieScore17;
    private javax.swing.JLabel lblTeamAmieScore18;
    private javax.swing.JLabel lblTeamAmieScore19;
    private javax.swing.JLabel lblTeamAmieScore20;
    private javax.swing.JLabel lblTeamAmieScore21;
    private javax.swing.JLabel lblTeamAmieScore4;
    private javax.swing.JLabel lblTeamAmieScore5;
    private javax.swing.JLabel lblTeamAmieScore6;
    private javax.swing.JLabel lblTeamAmieScore7;
    private javax.swing.JLabel lblTeamAmieScore8;
    private javax.swing.JLabel lblTeamAmieScore9;
    private javax.swing.JLabel lblTeamAmieScoreTotal;
    private javax.swing.JLabel lblTeamEliza;
    private javax.swing.JLabel lblTeamElizaScore;
    private javax.swing.JLabel lblTeamElizaScore10;
    private javax.swing.JLabel lblTeamElizaScore11;
    private javax.swing.JLabel lblTeamElizaScore12;
    private javax.swing.JLabel lblTeamElizaScore13;
    private javax.swing.JLabel lblTeamElizaScore14;
    private javax.swing.JLabel lblTeamElizaScore15;
    private javax.swing.JLabel lblTeamElizaScore16;
    private javax.swing.JLabel lblTeamElizaScore17;
    private javax.swing.JLabel lblTeamElizaScore18;
    private javax.swing.JLabel lblTeamElizaScore19;
    private javax.swing.JLabel lblTeamElizaScore20;
    private javax.swing.JLabel lblTeamElizaScore21;
    private javax.swing.JLabel lblTeamElizaScore4;
    private javax.swing.JLabel lblTeamElizaScore5;
    private javax.swing.JLabel lblTeamElizaScore6;
    private javax.swing.JLabel lblTeamElizaScore7;
    private javax.swing.JLabel lblTeamElizaScore8;
    private javax.swing.JLabel lblTeamElizaScore9;
    private javax.swing.JLabel lblTeamElizaScoreTotal;
    private javax.swing.JLabel lblTeamJess;
    private javax.swing.JLabel lblTeamJessScore;
    private javax.swing.JLabel lblTeamJessScore10;
    private javax.swing.JLabel lblTeamJessScore11;
    private javax.swing.JLabel lblTeamJessScore12;
    private javax.swing.JLabel lblTeamJessScore13;
    private javax.swing.JLabel lblTeamJessScore14;
    private javax.swing.JLabel lblTeamJessScore15;
    private javax.swing.JLabel lblTeamJessScore16;
    private javax.swing.JLabel lblTeamJessScore17;
    private javax.swing.JLabel lblTeamJessScore18;
    private javax.swing.JLabel lblTeamJessScore19;
    private javax.swing.JLabel lblTeamJessScore20;
    private javax.swing.JLabel lblTeamJessScore21;
    private javax.swing.JLabel lblTeamJessScore4;
    private javax.swing.JLabel lblTeamJessScore5;
    private javax.swing.JLabel lblTeamJessScore6;
    private javax.swing.JLabel lblTeamJessScore7;
    private javax.swing.JLabel lblTeamJessScore8;
    private javax.swing.JLabel lblTeamJessScore9;
    private javax.swing.JLabel lblTeamJessScoreTotal;
    private javax.swing.JLabel lblTeamSteve1;
    private javax.swing.JLabel lblTeamSteveScore;
    private javax.swing.JLabel lblTeamSteveScore10;
    private javax.swing.JLabel lblTeamSteveScore11;
    private javax.swing.JLabel lblTeamSteveScore12;
    private javax.swing.JLabel lblTeamSteveScore13;
    private javax.swing.JLabel lblTeamSteveScore14;
    private javax.swing.JLabel lblTeamSteveScore15;
    private javax.swing.JLabel lblTeamSteveScore16;
    private javax.swing.JLabel lblTeamSteveScore17;
    private javax.swing.JLabel lblTeamSteveScore18;
    private javax.swing.JLabel lblTeamSteveScore19;
    private javax.swing.JLabel lblTeamSteveScore20;
    private javax.swing.JLabel lblTeamSteveScore21;
    private javax.swing.JLabel lblTeamSteveScore4;
    private javax.swing.JLabel lblTeamSteveScore5;
    private javax.swing.JLabel lblTeamSteveScore6;
    private javax.swing.JLabel lblTeamSteveScore7;
    private javax.swing.JLabel lblTeamSteveScore8;
    private javax.swing.JLabel lblTeamSteveScore9;
    private javax.swing.JLabel lblTeamSteveScoreTotal;
    private javax.swing.JLabel lblTourdeFrance;
    private javax.swing.JLabel lblWhiteJersey;
    private javax.swing.JLabel lblWhiteJersey1;
    private javax.swing.JLabel lblYellowJersey;
    private javax.swing.JLabel lblYellowJersey1;
    private javax.swing.JList<String> lstTeamAmie;
    private javax.swing.JList<String> lstTeamEliza;
    private javax.swing.JList<String> lstTeamJess;
    private javax.swing.JList<String> lstTeamSteve;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
