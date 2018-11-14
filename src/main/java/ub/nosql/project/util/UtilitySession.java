package ub.nosql.project.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class UtilitySession {

	public static Firestore initData() throws Exception   {
		FileInputStream serviceAccount;
		try {
			serviceAccount = new FileInputStream(
					"/home/vetri/Documents/workspace-sts-3.9.5.RELEASE/NosqlECom/src/test/java/ub/nosql/project/nosql-ee947-firebase-adminsdk-h101i-1fd5993a47.json");
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://nosql-ee947.firebaseio.com").build();

			FirebaseApp.initializeApp(options);
			return FirestoreClient.getFirestore();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Firebase could not initalize");

		}
		 return null;
	}
}
