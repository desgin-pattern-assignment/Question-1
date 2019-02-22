package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    ListView<String> nameList;
    @FXML
    ListView<Float> timeList;
    @FXML
    ListView<Integer> ageList;
    @FXML
    ListView<String> ageGroupList;
    @FXML
    ListView<String> sexList;
    @FXML
    ListView<String> sortedNameList;
    @FXML
    ListView<Float> sortedTimeList;
    @FXML
    ListView<Integer> sortedAgeList;
    @FXML
    ListView<String> sortedAgeGroupList;
    @FXML
    ListView<String> sortedSexList;



    SwimData swimData;
    ArrayList<String> swNameList = new ArrayList<>();
    ArrayList<Float> swTimeList = new ArrayList<>();
    ArrayList<Integer> swAgeList = new ArrayList<>();
    ArrayList<String> swAgeGroupList = new ArrayList<>();
    ArrayList<String> swSexList = new ArrayList<>();
    ObservableList<String> namelist = FXCollections.observableList(swNameList);
    ObservableList<Float> timelist = FXCollections.observableList(swTimeList);
    ObservableList<Integer> agelist = FXCollections.observableList(swAgeList);
    ObservableList<String> ageGrouplist = FXCollections.observableList(swAgeGroupList);
    ObservableList<String> sexlist = FXCollections.observableList(swSexList);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        swimData = new SwimData("C://Users/Nahom/IdeaProjects/Q1/src/sample/TextFile.txt");

        for (int i=0; i< swimData.getTotalSwimmers(); i++){
            swNameList.add(swimData.getSwimmer(i).getName());
            swTimeList.add(swimData.getSwimmer(i).getTime());
            swAgeList.add(swimData.getSwimmer(i).getAge());
            swAgeGroupList.add(swimData.getSwimmer(i).getAgeGroup());
            swSexList.add(swimData.getSwimmer(i).getSex());
        }


        nameList.setItems(namelist);
        timeList.setItems(timelist);
        ageList.setItems(agelist);
        ageGroupList.setItems(ageGrouplist);
        sexList.setItems(sexlist);
    }

    public void sortSwimmersByTime(){
        try {
            swNameList.clear();
            swTimeList.clear();
            swAgeList.clear();
            swAgeGroupList.clear();
            swSexList.clear();

            SwimData swimData1 = swimData.makeClone();
            swimData1.sortByTime();

            for (int i = 0; i < swimData1.getTotalSwimmers(); i++) {
                swNameList.add(swimData1.getSwimmer(i).getName());
                swTimeList.add(swimData1.getSwimmer(i).getTime());
                swAgeList.add(swimData1.getSwimmer(i).getAge());
                swAgeGroupList.add(swimData1.getSwimmer(i).getAgeGroup());
                swSexList.add(swimData1.getSwimmer(i).getSex());
            }

            namelist = FXCollections.observableList(swNameList);
            timelist = FXCollections.observableList(swTimeList);
            agelist = FXCollections.observableList(swAgeList);
            ageGrouplist = FXCollections.observableList(swAgeGroupList);
            sexlist = FXCollections.observableList(swSexList);

            sortedNameList.setItems(namelist);
            sortedTimeList.setItems(timelist);
            sortedAgeList.setItems(agelist);
            sortedAgeGroupList.setItems(ageGrouplist);
            sortedSexList.setItems(sexlist);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void sortSwimmersByAge(){
        try {
            swNameList.clear();
            swTimeList.clear();
            swAgeList.clear();
            swAgeGroupList.clear();
            swSexList.clear();

            SwimData swimData1 = swimData.makeClone();
            swimData1.sortByAge();

            for (int i = 0; i < swimData1.getTotalSwimmers(); i++) {
                swNameList.add(swimData1.getSwimmer(i).getName());
                swTimeList.add(swimData1.getSwimmer(i).getTime());
                swAgeList.add(swimData1.getSwimmer(i).getAge());
                swAgeGroupList.add(swimData1.getSwimmer(i).getAgeGroup());
                swSexList.add(swimData1.getSwimmer(i).getSex());

            }

            namelist = FXCollections.observableList(swNameList);
            timelist = FXCollections.observableList(swTimeList);
            agelist = FXCollections.observableList(swAgeList);
            ageGrouplist = FXCollections.observableList(swAgeGroupList);
            sexlist = FXCollections.observableList(swSexList);

            sortedNameList.setItems(namelist);
            sortedTimeList.setItems(timelist);
            sortedAgeList.setItems(agelist);
            sortedAgeGroupList.setItems(ageGrouplist);
            sortedSexList.setItems(sexlist);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void sortSwimmersBySex(){
        try {
            swNameList.clear();
            swTimeList.clear();
            swAgeList.clear();
            swAgeGroupList.clear();
            swSexList.clear();

            SwimData swimData1 = swimData.makeClone();
            swimData1.sortBySex();

            for (int i = 0; i < swimData1.getTotalSwimmers(); i++) {
                swNameList.add(swimData1.getSwimmer(i).getName());
                swTimeList.add(swimData1.getSwimmer(i).getTime());
                swAgeList.add(swimData1.getSwimmer(i).getAge());
                swAgeGroupList.add(swimData1.getSwimmer(i).getAgeGroup());
                swSexList.add(swimData1.getSwimmer(i).getSex());

            }

            namelist = FXCollections.observableList(swNameList);
            timelist = FXCollections.observableList(swTimeList);
            agelist = FXCollections.observableList(swAgeList);
            ageGrouplist = FXCollections.observableList(swAgeGroupList);
            sexlist = FXCollections.observableList(swSexList);

            sortedNameList.setItems(namelist);
            sortedTimeList.setItems(timelist);
            sortedAgeList.setItems(agelist);
            sortedAgeGroupList.setItems(ageGrouplist);
            sortedSexList.setItems(sexlist);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
