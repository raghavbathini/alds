package collections.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class compare2Maps {

	public static void main(String[] args) {
		Map<String, Map<String, String>> act = new HashMap<String, Map<String, String>>();
		
		Map<String, String> Inbound_Traffic = new HashMap<String, String>();
		Inbound_Traffic.put("Google Drive", "0.00");
		Inbound_Traffic.put("OneDrive", "0.00");
		Inbound_Traffic.put("Dropbox", "15039");
		Inbound_Traffic.put("Salesforce" ,"0.00");
		act.put("Inbound Tarffic", Inbound_Traffic);
		Map<String, String> Category = new HashMap<String, String>();
		Category.put("Google Drive", "Cloud Storage");
		Category.put("OneDrive", "Cloud Storage");
		Category.put("Dropbox", "Cloud Storage");
		Category.put("Salesforce" ,"CRM");
		act.put("Category", Category);

//		, Category={Google Drive=Cloud Storage, OneDrive=Cloud Storage, Dropbox=Cloud Storage, Salesforce=CRM}, Risk Score={Google Drive=1, OneDrive=2, Dropbox=9, Salesforce=1}, Outbound Traffic={Google Drive=0.00, OneDrive=0.00, Dropbox=0.00, Salesforce=0.00}, User Count={Google Drive=1, OneDrive=1, Dropbox=1, Salesforce=1}, Total Traffic={Google Drive=0.00, OneDrive=0.00, Dropbox=15039, Salesforce=0.00}};
//		{InBound Tarffic={Google Drive=0.00, OneDrive=0.00, Box=1367, Dropbox=15039, Salesforce=0.00}, Category={Google Drive=Cloud Storage, OneDrive=Cloud Storage, Box=Cloud Storage, Dropbox=Cloud Storage, Salesforce=CRM}, Risk Score={Google Drive=3, OneDrive=2, Box=2, Dropbox=1, Salesforce=4}, OutBound Traffic={Google Drive=0.00, OneDrive=0.00, Box=136719, Dropbox=0.00, Salesforce=0.00}, User Count={Google Drive=1, OneDrive=1, Box=1, Dropbox=1, Salesforce=1}, Total Traffic={Google Drive=0.00, OneDrive=0.00, Box=138086, Dropbox=15039, Salesforce=0.00}}

		Map<String, Map<String, String>> exp = new HashMap<String, Map<String, String>>();
		
		Map<String, String> exp_Inbound_Traffic = new HashMap<String, String>();
		exp_Inbound_Traffic.put("Google Drive", "0.00");
		exp_Inbound_Traffic.put("OneDrive", "0.00");
		exp_Inbound_Traffic.put("Dropbox", "15039");
		exp_Inbound_Traffic.put("Salesforce" ,"0.00");
		exp_Inbound_Traffic.put("Box" ,"1367");
		exp.put("Inbound Tarffic", exp_Inbound_Traffic);
		Map<String, String> exp_Category = new HashMap<String, String>();
		exp_Category.put("Google Drive", "Cloud Storage");
		exp_Category.put("OneDrive", "Cloud Storage");
		exp_Category.put("Dropbox", "Cloud Storage");
		exp_Category.put("Salesforce" ,"CRM");
		exp_Category.put("Box", "Cloud Storage");
		exp.put("Category", exp_Category);
		
		System.out.println("act -->"+act.toString());
		System.out.println("exp -->"+exp.toString());
		
		compare(act, exp);
	}
	
	public static void compare(Map<String, Map<String, String>> act, Map<String, Map<String, String>> exp) {
//		if(act.equals(exp))
//			System.out.println("actual and expected are same");
//		else {
//			System.out.println("actual and expected are different");
		Map<String, String> contentMap = new HashMap<String, String>();
		Map<String, Map<String, String>> failureMap = new HashMap<String, Map<String, String>>();
		for (String uiValue : act.keySet()) {
			for (String expValue : exp.keySet()) {
				if (uiValue.equals(expValue)) {
					contentMap = contentValidation(act.get(uiValue), exp.get(expValue));
					break;
				}
			}
			failureMap.put(uiValue, contentMap);
		}

		}

	private static Map<String, String> contentValidation(Map<String, String> actualMap, Map<String, String> expectedMap) {
		Map<String, String> failureMap = new HashMap<String, String>();
		System.out.println("****");
		if (actualMap.size() == expectedMap.size()) {
			if (actualMap.equals(expectedMap)) {
				// System.out.println("Both actualMap and expectedMaps are
				// same...");
			} else {
				Iterator<String> actualMapIterator = actualMap.keySet().iterator();
				while (actualMapIterator.hasNext()) {
					String name = actualMapIterator.next();
					String actvalue = actualMap.get(name);
					String expvalue = expectedMap.get(name);
					boolean valueMatches = false;
					if (expectedMap.keySet().contains(name)) {
						if (actvalue.contains(",") && expvalue.contains(",")) {
							String actvalues[] = actvalue.split(",");
							Arrays.sort(actvalues);
							String expvalues[] = expvalue.split(",");
							Arrays.sort(expvalues);
							valueMatches = Arrays.equals(actvalues, expvalues);
						} else {
							if (expectedMap.get(name).equals(actvalue)) {
								valueMatches = true;
							}
						}
					}
					if (!valueMatches) {
						failureMap.put(name, actvalue);
					}
				}
			}
		}
		else {
		    Map<String, String> difference = new HashMap<String, String> ();
		    difference.putAll(actualMap);
		    difference.putAll(expectedMap);
		    if(actualMap.size() > expectedMap.size())
		    	difference.entrySet().removeAll(expectedMap.entrySet());
		    else
		    	difference.entrySet().removeAll(actualMap.entrySet());
		    
		    System.out.println("diff map -->"+difference.toString());
		    failureMap.putAll(difference);
		    System.out.println("diff map -->"+failureMap.toString());
		}
		
		// System.out.println(failureMap);
		return failureMap;
	}

	
	


}
