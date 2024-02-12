package com.absli.APIData;

import com.absli.utils.PropertiesUtils;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.json.JSONException;
import org.json.JSONObject;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

import org.json.JSONObject;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import org.json.JSONTokener;
import org.json.JSONObject;
import java.io.IOException;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class ApiData {
	public static PropertiesUtils prop = new PropertiesUtils();

	public static String args = "9876";
	public static String bearerToken;


	public static String  CreatLead_AxisBank( HashMap<String, String> testData,String LeadID,String Plan,String FirstName,String LastName,String Gender,String PhoneNO,String PanNo) throws IOException, InterruptedException {
		CreatData(testData,Plan,FirstName,LastName,Gender,PhoneNO,PanNo);
		Thread.sleep(5000);
		String pushPayLoad = pushData(testData,LeadID,Plan);
		Thread.sleep(5000);
		String JsonBody = "{\n" + "   \"source\": \"417070313533\",\n" + "   \"document\": {\n"
				+ "        \"sourceChannel\": \"AXISBANK\",\n" + "        \"requestData\": \"" + pushPayLoad + "\",\n"
				+ "        \"type\": \"D_Elixr\"\n" + "    }\n" + "}";
		String baseUri = "https://leapuat.adityabirlasunlifeinsurance.com/leap-uat-server/api/stateMachines/getEncryption";

		RequestSpecification request = RestAssured.given().baseUri(baseUri).header("Content-Type", "application/json")
				.contentType(ContentType.JSON).body(JsonBody.toString());
		System.out.println("==================Started Creat Url & LeadID  ==============");
		Response response = request.post();
		System.out.println(response.asString());
		System.out.println(response.getStatusCode() + " " + response.getBody().toString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String url = jsonPathEvaluator.get("data");
		System.out.println(url);
		String[] resq = url.split(",");
		String update1 = resq[3];
		String update = update1.replaceAll("redirectionURL", "");
		String update2 = update.replaceFirst(":", "");
		//System.out.println(update2);
		String stringWithoutDoubleQuotes = update2.replace("\"", "");
		System.out.println("==================Successfully  Creat  Url Of Axis Bank========================");
		System.out.println(stringWithoutDoubleQuotes);
		return stringWithoutDoubleQuotes;

//

	}

	public static String bearerTokenGeneration() {
		RestAssured.baseURI = "https://liservicedev.adityabirlacapital.com";
		Response response = given().log().all().contentType(ContentType.URLENC)
				.formParam("client_id", "66573fef-7165-4a6c-b8b2-9d4ffd544a47")
				.formParam("client_secret", "C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6")
				.formParam("grant_type", "password").formParam("username", "HGSBNGUAT092")
				.formParam("password", "pass@261023").formParam("scope", "bsli")

				.when()
				.post("/bsli/sb/oauthprovider/oauth2/token");
		System.out.println("==================Started Creat Access Token ==============");
		String accessToken = response.jsonPath().getString("access_token");
		System.out.println("Access Token: " + accessToken);
		return accessToken;
	}

	public static String Encrypt( HashMap<String, String> testData,String Plan,String FirstName,String LastName,String Gender,String PhoneNO,String PanNo) throws IOException, InterruptedException {

		// String bearerToken=bearerTokenGeneration();
//		String JsonBody = "{\n" + "   \"source\": \"417070313533\",\n" + "   \"document\": {\n"
//				+ "        \"sourceChannel\": \"AXISBANK\",\n" + "        \"requestData\": {\n" + "   \"lead_data\":{\n"
//				+ "      \"bank_crm_lead_id\":\"" + args + "\",\n" + "      \"branch_code\":\"AXIS001\",\n"
//				+ "      \"proposer_address_1\":\"\",\n" + "      \"proposer_address_2\":\"\",\n"
//				+ "      \"proposer_address_3\":\"\",\n" + "      \"proposer_city\":\"\",\n"
//				+ "      \"proposer_country\":\"\",\n" + "      \"proposer_first_name\":\""+FirstName+" \",\n"
//				+ "      \"proposer_gender\":\""+Gender+"\",\n" + "      \"proposer_last_name\":\""+LastName+"\",\n"
//				+ "      \"proposer_mobile_no\":\""+PhoneNO+"\",\n" + "      \"proposer_pin_code\":\"\",\n"
//				+ "      \"proposer_state\":\"\",\n" + "      \"sp_employee_code\":\"123\",\n"
//				+ "      \"sp_irdai_code\":\"P12513\"\n" + "   },\n" + "   \"additional_data\":{\n"
//				+ "      \"proposer\":{\n" + "         \"email_id\":\"test@email.com\",\n"
//				+ "         \"proposer_pan\":\"AGYPM101D\"\n" + "      },\n" + "      \"lead_details\":{\n"
//				+ "         \"bank_account_type\":\"\",\n" + "         \"bank_customer_id\":\"\",\n"
//				+ "         \"bank_account_no\":\"\",\n" + "         \"bank_customer_income\":\"\",\n"
//				+ "         \"bank_customer_occupation\":\"\",\n" + "         \"follow_up_date\":\"\",\n"
//				+ "         \"is_proposer_same_as_insured\":\"\",\n" + "         \"nominee_name\":\"\",\n"
//				+ "         \"product_id\":\""+PanNo+"\",\n" + "         \"SP_comments\":\"\",\n"
//				+ "         \"status_date\":\"\"\n" + "      },\n" + "      \"other_details\":{\n"
//				+ "         \"address_1\":\"\",\n" + "         \"address_2\":\"\",\n" + "         \"address_3\":\"\",\n"
//				+ "         \"application_identifier\":\"\",\n" + "         \"bank_account_opening_date\":\"\",\n"
//				+ "         \"bank_branch\":\"\",\n" + "         \"bank_ifsc_code\":\"AXIS12345\",\n"
//				+ "         \"city\":\"\",\n" + "         \"ckyc_number\":\"\",\n" + "         \"country\":\"\",\n"
//				+ "         \"customer_segment\":\"\",\n" + "         \"ebcc_kyc_flag\":\"\",\n"
//				+ "         \"engaged_customer\":\"Account opened in last 3 months\",\n"
//				+ "         \"insured_middle_name\":\"\",\n" + "         \"is_business_insurance\":\"\",\n"
//				+ "         \"is_nri\":\"\",\n" + "         \"need_for_insurance\":\"Child education or marriage\",\n"
//				+ "         \"offer_id\":\"\",\n" + "         \"offer_name\":\"\",\n"
//				+ "         \"opportunity_to_meet\":\"Meeting scheduled by SP\",\n"
//				+ "         \"opportunity_to_meet_date\":\"2023-07-05T11:43:27.000+0000\",\n"
//				+ "         \"partner_lead_creation_date\":\"2023-07-05T11:43:27.000+0000\",\n"
//				+ "         \"pincode\":\"\",\n" + "         \"premium_paying_capacity\":\"Monthly average balance\",\n"
//				+ "         \"premium_paying_reason\":\"For Extra Benefits\",\n"
//				+ "         \"proposer_investment_goal\":\"\",\n" + "         \"proposer_lifestage\":\"\",\n"
//				+ "         \"proposer_middle_name\":\"\",\n" + "         \"proposer_qualification\":\"\",\n"
//				+ "         \"proposer_risk_profile\":\"\",\n" + "         \"recommended_products\":\"\",\n"
//				+ "         \"relation_with_proposer\":\"\",\n" + "         \"source_type\":\"17\",\n"
//				+ "         \"state\":\"\",\n" + "         \"sub_source_type\":\"1416\"\n" + "      }\n" + "   }\n"
//				+ "},\n" + "        \"type\": \"E_Elixr\"\n" + "    }\n" + "}";
		String JsonBody = """
   {
      "source": "417070313533",
      "document": {
         "sourceChannel": "AXISBANK",
         "requestData": {
            "lead_data": {
               "bank_crm_lead_id": "%s",
               "branch_code": "AXIS001",
               "proposer_address_1": "",
               "proposer_address_2": "",
               "proposer_address_3": "",
               "proposer_city": "",
               "proposer_country": "",
               "proposer_first_name": "%s",
               "proposer_gender": "%s",
               "proposer_last_name": "%s",
               "proposer_mobile_no": "%s",
               "proposer_pin_code": "",
               "proposer_state": "",
               "sp_employee_code": "ZZ2401",
               "sp_irdai_code": "P12513"
            },
            "additional_data": {
               "proposer": {
                  "email_id": "apoorv.gaurav-v@adityabirlacapital.com",
                  "proposer_pan": "AGYPM101D"
               },
               "lead_details": {
                  "bank_account_type": "Saving",
                  "bank_customer_id": "",
                  "bank_account_no": "918010021967138",
                  "bank_customer_income": "",
                  "bank_customer_occupation": "",
                  "follow_up_date": "",
                  "is_proposer_same_as_insured": "",
                  "nominee_name": "",
                  "product_id": "%s",
                  "SP_comments": "",
                  "status_date": ""
               },
               "other_details": {
                  "address_1": "",
                  "address_2": "",
                  "address_3": "",
                  "application_identifier": "",
                  "bank_account_opening_date": "",
                  "bank_branch": "",
                  "bank_ifsc_code": "AXIS12345",
                  "city": "",
                  "ckyc_number": "",
                  "country": "",
                  "customer_segment": "",
                  "ebcc_kyc_flag": "",
                  "engaged_customer": "Account opened in last 3 months",
                  "insured_middle_name": "",
                  "is_business_insurance": "",
                  "is_nri": "",
                  "need_for_insurance": "Child education or marriage",
                  "offer_id": "",
                  "offer_name": "",
                  "opportunity_to_meet": "Meeting scheduled by SP",
                  "opportunity_to_meet_date": "2023-07-05T11:43:27.000+0000",
                  "partner_lead_creation_date": "2023-07-05T11:43:27.000+0000",
                  "pincode": "",
                  "premium_paying_capacity": "Monthly average balance",
                  "premium_paying_reason": "For Extra Benefits",
                  "proposer_investment_goal": "",
                  "proposer_lifestage": "",
                  "proposer_middle_name": "",
                  "proposer_qualification": "",
                  "proposer_risk_profile": "",
                  "recommended_products": "",
                  "relation_with_proposer": "",
                  "source_type": "17",
                  "state": "",
                  "sub_source_type": "1416"
               }
            }
         },
         "type": "E_Elixr"
      }
   }
   """.formatted(args, FirstName, Gender, LastName, PhoneNO, PanNo);

		String baseUri = "https://leapuat.adityabirlasunlifeinsurance.com/leap-uat-server/api/stateMachines/getEncryption";
//	         if(prop.getProperties("Env").equalsIgnoreCase("UAT")) {
//	            baseUri = "https://leapuat.adityabirlasunlifeinsurance.com/leap-uat-server/api/stateMachines/startExecutionAws";
//	        }
//	        else {
//	            //Return an error or throw an exception if the parameterName is not recognized
//	            //return "Incorrect Environment value";
//	        }
//
		RequestSpecification request = RestAssured.given().baseUri(baseUri).header("Content-Type", "application/json")
				.contentType(ContentType.JSON).body(JsonBody.toString());
		System.out.println("==================Started Creat Encrypted Data ==============");
		Response response = request.post();
		Thread.sleep(5000);
		System.out.println(response.asString());
		System.out.println(response.getStatusCode() + " " + response.getBody().toString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String encryptedData = jsonPathEvaluator.get("data");

		System.out.println("Encrypted Data: " + encryptedData);
		return encryptedData;

	}

	public static void CreatData( HashMap<String, String> testData,String Plan,String FirstName,String LastName,String Gender,String PhoneNO,String PanNo) throws IOException, InterruptedException {

		bearerToken = bearerTokenGeneration();

		String encryptdata = Encrypt(testData,Plan,FirstName,LastName,Gender,PhoneNO,PanNo);
		Thread.sleep(5000);
		RestAssured.baseURI = "https://liservicedev.adityabirlacapital.com";

		// Create the request and specify the headers and body
		Response response = given().contentType(ContentType.JSON).header("partner_application_id", "AXIS_BANKING_APP")
				.header("partner_id", "AXIS_BANK").header("Authorization", "Bearer " + bearerToken)
				.body("{\n" + "    \"payload\": \"" + encryptdata + "\"\n" + "}").when()
				.post("/bsli/sb/VymoLeadCreation/getLeadCreation?client_id=66573fef-7165-4a6c-b8b2-9d4ffd544a47&client_secret=C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6");
		System.out.println("==================Started Creat  Data ============================");
		System.out.println(response.asString());
		String payload = response.jsonPath().getString("payload");
		System.out.println("payload: " + payload);
		String[] CA = payload.split("payload ");
		String payloadOUTPUT=CA[0];
		System.out.println("Creat a Data: " + payloadOUTPUT);



	}

	public static String DecryptData(HashMap<String, String> testData,String Plan) throws InterruptedException {

//		String JsonBody="{\n"
//				+ "   \"source\": \"417070313533\",\n"
//				+ "   \"document\": {\n"
//				+ "        \"sourceChannel\": \"AXISBANK\",\n"
//				+ "        \"requestData\": {\n"
//				+ "    \"bank_crm_lead_id\": "+args+",\n"
//				+ "    \"datapush\": true,\n"
//				+ "    \"update_attributes\": [\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.lead_details.bank_account_no\",\n"
//				+ "            \"value\": \"918010021967138\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.lead_details.bank_account_type\",\n"
//				+ "            \"value\": \"Savings\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.lead_details.bank_customer_id\",\n"
//				+ "            \"value\": \"123691328\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.lead_details.bank_customer_occupation\",\n"
//				+ "            \"value\": \"self_employed\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.lead_details.product_id\",\n"
//				+ "            \"value\": \""+Plan+"\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.bank_account_opening_date\",\n"
//				+ "            \"value\": \"2023-07-05\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.bank_ifsc_code\",\n"
//				+ "            \"value\": \"AXIS0001\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.ebcc_kyc_flag\",\n"
//				+ "            \"value\": \"true\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.proposer_investment_goal\",\n"
//				+ "            \"value\": \"Child's Marriage\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.proposer_lifestage\",\n"
//				+ "            \"value\": \"SINGLE\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"additional_data.other_details.proposer_risk_profile\",\n"
//				+ "            \"value\": \"Conservative\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "            \"key\": \"proposer_dob\",\n"
//				+ "            \"value\": \"1992-10-23\"\n"
//				+ "        },\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.is_business_insurance\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.is_nri\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.proposer.proposer_pan\",\n"
//				+ "			\"value\": \"AGYPM101D\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.proposer_middle_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.lead_details.is_proposer_same_as_insured\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.relation_with_proposer\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"insured_dob\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"insured_first_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.insured_middle_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"insured_last_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"insured_gender\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.lead_details.bank_customer_income\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.proposer.email_id\",\n"
//				+ "			\"value\": \"vijaydeshmukh628@gmail.com\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_pin_code\",\n"
//				+ "			\"value\": \"413308\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_address_1\",\n"
//				+ "			\"value\": \"sector 10\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_address_2\",\n"
//				+ "			\"value\": \"kamothe\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_address_3\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_city\",\n"
//				+ "			\"value\": \"Panvel\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_state\",\n"
//				+ "			\"value\": \"MAHARASTRA\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"proposer_country\",\n"
//				+ "			\"value\": \"India\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.pincode\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.address_1\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.address_2\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.address_3\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.city\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.state\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.country\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.lead_details.nominee_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.proposer_qualification\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.customer_segment\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.recommended_products\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.offer_id\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.offer_name\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.application_identifier\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.other_details.ckyc_number\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"branch_code\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"sp_irdai_code\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		},\n"
//				+ "		{\n"
//				+ "			\"key\": \"additional_data.lead_details.SP_comments\",\n"
//				+ "			\"value\": \"\"\n"
//				+ "		}\n"
//				+ "    ]\n"
//				+ "}\n"
//				+ ",\n"
//				+ "        \"type\": \"E_Elixr\"\n"
//				+ "    }\n"
//				+ "}";
//
		String JsonBody = String.format("""
        {
           "source": "417070313533",
           "document": {
                "sourceChannel": "AXISBANK",
                "requestData": {
            "bank_crm_lead_id": %s,
            "datapush": true,
            "update_attributes": [
                {
                    "key": "additional_data.lead_details.bank_account_no",
                    "value": "918010021967138"
                },
                {
                    "key": "additional_data.lead_details.bank_account_type",
                    "value": "Savings"
                },
                {
                    "key": "additional_data.lead_details.bank_customer_id",
                    "value": "123691328"
                },
                {
                    "key": "additional_data.lead_details.bank_customer_occupation",
                    "value": "self_employed"
                },
                {
                    "key": "additional_data.lead_details.product_id",
                    "value": "%s"
                },
                {
                    "key": "additional_data.other_details.bank_account_opening_date",
                    "value": "2023-07-05"
                },
                {
                    "key": "additional_data.other_details.bank_ifsc_code",
                    "value": "AXIS0001"
                },
                {
                    "key": "additional_data.other_details.ebcc_kyc_flag",
                    "value": "true"
                },
                {
                    "key": "additional_data.other_details.proposer_investment_goal",
                    "value": "Child's Marriage"
                },
                {
                    "key": "additional_data.other_details.proposer_lifestage",
                    "value": "SINGLE"
                },
                {
                    "key": "additional_data.other_details.proposer_risk_profile",
                    "value": "Conservative"
                },
                {
                    "key": "proposer_dob",
                    "value": "1992-10-23"
                },
                {
                    "key": "additional_data.other_details.is_business_insurance",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.is_nri",
                    "value": ""
                },
                {
                    "key": "additional_data.proposer.proposer_pan",
                    "value": "AGYPM101D"
                },
                {
                    "key": "additional_data.other_details.proposer_middle_name",
                    "value": ""
                },
                {
                    "key": "additional_data.lead_details.is_proposer_same_as_insured",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.relation_with_proposer",
                    "value": ""
                },
                {
                    "key": "insured_dob",
                    "value": ""
                },
                {
                    "key": "insured_first_name",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.insured_middle_name",
                    "value": ""
                },
                {
                    "key": "insured_last_name",
                    "value": ""
                },
                {
                    "key": "insured_gender",
                    "value": ""
                },
                {
                    "key": "additional_data.lead_details.bank_customer_income",
                    "value": ""
                },
                {
                    "key": "additional_data.proposer.email_id",
                    "value": "apoorv.gaurav-v@adityabirlacapital.com"
                },
                {
                    "key": "proposer_pin_code",
                    "value": "413308"
                },
                {
                    "key": "proposer_address_1",
                    "value": "sector 10"
                },
                {
                    "key": "proposer_address_2",
                    "value": "kamothe"
                },
                {
                    "key": "proposer_address_3",
                    "value": ""
                },
                {
                    "key": "proposer_city",
                    "value": "Panvel"
                },
                {
                    "key": "proposer_state",
                    "value": "MAHARASTRA"
                },
                {
                    "key": "proposer_country",
                    "value": "India"
                },
                {
                    "key": "additional_data.other_details.pincode",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.address_1",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.address_2",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.address_3",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.city",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.state",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.country",
                    "value": ""
                },
                {
                    "key": "additional_data.lead_details.nominee_name",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.proposer_qualification",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.customer_segment",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.recommended_products",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.offer_id",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.offer_name",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.application_identifier",
                    "value": ""
                },
                {
                    "key": "additional_data.other_details.ckyc_number",
                    "value": ""
                },
                {
                    "key": "branch_code",
                    "value": ""
                },
                {
                    "key": "sp_irdai_code",
                    "value": ""
                },
                {
                    "key": "additional_data.lead_details.SP_comments",
                    "value": ""
                }
            ]
        },
        "type": "E_Elixr"
    }
}
           """, args, Plan);

		String baseUri = "https://leapuat.adityabirlasunlifeinsurance.com/leap-uat-server/api/stateMachines/getEncryption";
//			         if(prop.getProperties("Env").equalsIgnoreCase("UAT")) {
//			            baseUri = "https://leapuat.adityabirlasunlifeinsurance.com/leap-uat-server/api/stateMachines/startExecutionAws";
//			        }
//			        else {
//			            //Return an error or throw an exception if the parameterName is not recognized
//			            //return "Incorrect Environment value";
//			        }
//
		RequestSpecification request = RestAssured.given().baseUri(baseUri).header("Content-Type", "application/json")
				.contentType(ContentType.JSON).body(JsonBody.toString());
		System.out.println("==================Started Creat Decrypted Data ======================");
		Response response = request.post();
		Thread.sleep(5000);
		System.out.println(response.asString());
		System.out.println(response.getStatusCode() + " " + response.getBody().toString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String Decryptdata = jsonPathEvaluator.get("data");
		System.out.println("Decrypted Data: " + Decryptdata);
		return Decryptdata;
	}

	public static String pushData(HashMap<String, String> testData,String LeadID,String Plan) throws IOException, InterruptedException {

		// String bearerToken = bearerTokenGeneration();
		String decryptdata = DecryptData(testData,Plan);
		Thread.sleep(5000);
		RestAssured.baseURI = "https://liservicedev.adityabirlacapital.com";

		// Create the request and specify the headers and body
		Response response = given().contentType(ContentType.JSON).header("partner_application_id", "AXIS_BANKING_APP")
				.header("partner_id", "AXIS_BANK").header("Authorization", "Bearer " + bearerToken)
				.body("{\n" + "    \"payload\": \"" + decryptdata + "\"\n" + "}").when()
				.post("/bsli/sb/dcb/updateleaddetails?client_id=66573fef-7165-4a6c-b8b2-9d4ffd544a47&client_secret=C2tP2wP5pW8kG8pX6nQ8sC3tT2xF0eQ8qJ8fS8xC1jB2pJ4oH6");
		System.out.println(response.asString());

		System.out.println("==================Started Push The Data ===================================");

		String payload = response.jsonPath().getString("payload");
		//System.out.println("payload: " + payload);
		String[] CA = payload.split("payload ");
		//System.out.println(CA[0]);
		String Decryptpayload = CA[0];
		System.out.println("Push The Data: " + Decryptpayload);
		return Decryptpayload;

	}

}