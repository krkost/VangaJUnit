package by.htp.vanga.entity;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Client implements Comparable<Client> {
	private String nameOfClient;
	private int ageOfClient;
	private GregorianCalendar dateOfVisit;
	private Map<GregorianCalendar, String> listStory;

	public Client() {
		listStory = new TreeMap<>();
		dateOfVisit = new GregorianCalendar();
	}

	public Client(GregorianCalendar dateOfVisit, String name, int ageOfClient) {
		super();
		this.dateOfVisit = dateOfVisit;
		this.nameOfClient = name;
		this.ageOfClient = ageOfClient;

	}

	public static Answer choosePredictiongetAnswer(int index) {
		Map<Prediction, Queue<Answer>> predictions = FortuneTeller.listOfPredictions();
		Prediction numberThatWasChosen = choosePrediction(index);
		Queue<Answer> answers = predictions.get(numberThatWasChosen);

		List <Answer> answersList = new ArrayList<>();
		answersList.addAll(answers);

		Answer answer = new Answer();
		
		answer = answersList.get(index);
		
		return answer;
	}

	private static Prediction choosePrediction(int i) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Input number from 1 to 5");
		String numberOfPrediction = String.valueOf(i);
		Prediction numberOfChosenPrediction = new Prediction();
		switch (numberOfPrediction) {
		case "1":
			numberOfChosenPrediction = new Prediction("Number 1: Your Future");
			break;
		case "2":
			numberOfChosenPrediction = new Prediction("Number 2: Your private life");
			break;
		case "3":
			numberOfChosenPrediction = new Prediction("Number 3: Your oppotunity in life");
			break;
		case "4":
			numberOfChosenPrediction = new Prediction("Number 4: Something about your past life");
			break;
		case "5":
			numberOfChosenPrediction = new Prediction("Number 5: One secret about you");
			break;
		default:
			System.out.println("Please, input number only from 1 to 5!");
		//	numberOfPrediction = scanner.next();
		}
		return numberOfChosenPrediction;

	}

	private void listStoryAdd(GregorianCalendar dateOfVisit, String result) {
		this.listStory.put(dateOfVisit, result);
	}

	public String getName() {
		return nameOfClient;
	}

	public void setName(String name) {
		this.nameOfClient = nameOfClient;
	}

	public GregorianCalendar getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(GregorianCalendar dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public Map<GregorianCalendar, String> getListStory() {
		return listStory;
	}

	public void setListStory(Map<GregorianCalendar, String> listStory) {
		this.listStory = listStory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageOfClient;
		result = prime * result + ((dateOfVisit == null) ? 0 : dateOfVisit.hashCode());
		result = prime * result + ((listStory == null) ? 0 : listStory.hashCode());
		result = prime * result + ((nameOfClient == null) ? 0 : nameOfClient.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (ageOfClient != other.ageOfClient)
			return false;
		if (dateOfVisit == null) {
			if (other.dateOfVisit != null)
				return false;
		} else if (!dateOfVisit.equals(other.dateOfVisit))
			return false;
		if (listStory == null) {
			if (other.listStory != null)
				return false;
		} else if (!listStory.equals(other.listStory))
			return false;
		if (nameOfClient == null) {
			if (other.nameOfClient != null)
				return false;
		} else if (!nameOfClient.equals(other.nameOfClient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [nameOfClient=" + nameOfClient + ", ageOfClient=" + ageOfClient + ", dateOfVisit=" + dateOfVisit
				+ ", listStory=" + listStory + "]";
	}

	@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
