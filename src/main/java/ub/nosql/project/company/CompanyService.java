package ub.nosql.project.company;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;

import ub.nosql.project.util.DatabaseTable;
import ub.nosql.project.util.UtilitySession;

@Service
public class CompanyService {

	public CompanyBO createCompanyBO(CompanyBO companyBO) {
		// TODO Auto-generated method stub

		try {
			ApiFuture<DocumentReference> result = UtilitySession.initData().collection(DatabaseTable.COMPANY)
					.add(companyBO);
			companyBO.setCompanyId(result.get().getId());
			result.get().update("companyId", companyBO.getCompanyId());
			System.out.println("Update time : " + companyBO.toString());
			return companyBO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			companyBO.setException(true);
			companyBO.setMessage(e.getMessage());
			return companyBO;
		}
	}

	public CompanyBO updateCompanyBO(CompanyBO companyBO) {
		// TODO Auto-generated method stub
		if (companyBO.getCompanyId() != null) {
			try {
				DocumentReference docRef = UtilitySession.initData().collection(DatabaseTable.COMPANY)
						.document(companyBO.getCompanyId());

				// Update age and favorite color
				Map<String, Object> updates = new HashMap<String, Object>();
				updates.put("name", companyBO.getName());

				// Async update document
				ApiFuture<WriteResult> writeResult = docRef.update(updates);

				System.out.println("Update time : " + writeResult.get().getUpdateTime());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				companyBO.setException(true);
				companyBO.setMessage("Fire store Error");
			}
		} else {
			companyBO.setException(true);
			companyBO.setMessage("Company Not Set");
		}
		return companyBO;
	}

	public CompanyBO getCompanyById(CompanyBO companyBO) {
		// TODO Auto-generated method stub
		if (companyBO.getCompanyId() != null) {
			try {
				DocumentReference docRef = UtilitySession.initData().collection(DatabaseTable.COMPANY)
						.document(companyBO.getCompanyId());
				ApiFuture<DocumentSnapshot> future = docRef.get();
				DocumentSnapshot document = future.get();
				if (document.exists()) {
					// convert document to POJO
					companyBO = document.toObject(CompanyBO.class);
					System.out.println(companyBO);
				} else {
					companyBO.setException(true);
					companyBO.setMessage("Company Id not Set");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				companyBO.setException(true);
				companyBO.setMessage("Fire store Error");
			}
		} else {
			companyBO.setException(true);
			companyBO.setMessage("Company Not Set");
		}
		return companyBO;
	}
}
