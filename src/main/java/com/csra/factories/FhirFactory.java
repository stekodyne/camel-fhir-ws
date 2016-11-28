package com.csra.factories;

import com.csra.fhir.ObjectFactory;

public class FhirFactory {
    public static Object getObject(String objectType) {
        ObjectFactory objectFactory = new ObjectFactory();
        Object object = null;

        switch (objectType) {
            case "a":
                object = objectFactory.createA();
                break;
            case "acontent":
                object = objectFactory.createAContent();
                break;
            case "abbr":
                object = objectFactory.createAbbr();
                break;
            case "account":
                object = objectFactory.createAccount();
                break;
            case "accountstatus":
                object = objectFactory.createAccountStatus();
                break;
            case "acronym":
                object = objectFactory.createAcronym();
                break;
            case "actionlist":
                object = objectFactory.createActionList();
                break;
            case "address":
                object = objectFactory.createAddress();
                break;
            case "address2":
                object = objectFactory.createAddress2();
                break;
            case "addresstype":
                object = objectFactory.createAddressType();
                break;
            case "addressuse":
                object = objectFactory.createAddressUse();
                break;
            case "administrativegender":
                object = objectFactory.createAdministrativeGender();
                break;
            case "age":
                object = objectFactory.createAge();
                break;
            case "aggregationmode":
                object = objectFactory.createAggregationMode();
                break;
            case "allergyintolerance":
                object = objectFactory.createAllergyIntolerance();
                break;
            case "allergyintolerancecategory":
                object = objectFactory.createAllergyIntoleranceCategory();
                break;
            case "allergyintolerancecertainty":
                object = objectFactory.createAllergyIntoleranceCertainty();
                break;
            case "allergyintolerancecriticality":
                object = objectFactory.createAllergyIntoleranceCriticality();
                break;
            case "allergyintolerancereaction":
                object = objectFactory.createAllergyIntoleranceReaction();
                break;
            case "allergyintoleranceseverity":
                object = objectFactory.createAllergyIntoleranceSeverity();
                break;
            case "allergyintolerancestatus":
                object = objectFactory.createAllergyIntoleranceStatus();
                break;
            case "allergyintolerancetype":
                object = objectFactory.createAllergyIntoleranceType();
                break;
            case "annotation":
                object = objectFactory.createAnnotation();
                break;
            case "answerformat":
                object = objectFactory.createAnswerFormat();
                break;
            case "appointment":
                object = objectFactory.createAppointment();
                break;
            case "appointmentparticipant":
                object = objectFactory.createAppointmentParticipant();
                break;
            case "appointmentresponse":
                object = objectFactory.createAppointmentResponse();
                break;
            case "appointmentstatus":
                object = objectFactory.createAppointmentStatus();
                break;
            case "area":
                object = objectFactory.createArea();
                break;
            case "assertiondirectiontype":
                object = objectFactory.createAssertionDirectionType();
                break;
            case "assertionoperatortype":
                object = objectFactory.createAssertionOperatorType();
                break;
            case "assertionresponsetypes":
                object = objectFactory.createAssertionResponseTypes();
                break;
            case "attachment":
                object = objectFactory.createAttachment();
                break;
            case "auditevent":
                object = objectFactory.createAuditEvent();
                break;
            case "auditeventaction":
                object = objectFactory.createAuditEventAction();
                break;
            case "auditeventdetail":
                object = objectFactory.createAuditEventDetail();
                break;
            case "auditeventevent":
                object = objectFactory.createAuditEventEvent();
                break;
            case "auditeventnetwork":
                object = objectFactory.createAuditEventNetwork();
                break;
            case "auditeventobject":
                object = objectFactory.createAuditEventObject();
                break;
            case "auditeventoutcome":
                object = objectFactory.createAuditEventOutcome();
                break;
            case "auditeventparticipant":
                object = objectFactory.createAuditEventParticipant();
                break;
            case "auditeventparticipantnetworktype":
                object = objectFactory.createAuditEventParticipantNetworkType();
                break;
            case "auditeventsource":
                object = objectFactory.createAuditEventSource();
                break;
            case "b":
                object = objectFactory.createB();
                break;
            case "backboneelement":
                object = objectFactory.createBackboneElement();
                break;
            case "base":
                object = objectFactory.createBase();
                break;
            case "base64binary":
                object = objectFactory.createBase64Binary();
                break;
            case "basic":
                object = objectFactory.createBasic();
                break;
            case "bdo":
                object = objectFactory.createBdo();
                break;
            case "big":
                object = objectFactory.createBig();
                break;
            case "binary":
                object = objectFactory.createBinary();
                break;
            case "bindingstrength":
                object = objectFactory.createBindingStrength();
                break;
            case "block":
                object = objectFactory.createBlock();
                break;
            case "blockquote":
                object = objectFactory.createBlockquote();
                break;
            case "body":
                object = objectFactory.createBody();
                break;
            case "bodysite":
                object = objectFactory.createBodySite();
                break;
            case "boolean":
                object = objectFactory.createBoolean();
                break;
            case "br":
                object = objectFactory.createBr();
                break;
            case "bundle":
                object = objectFactory.createBundle();
                break;
            case "bundleentry":
                object = objectFactory.createBundleEntry();
                break;
            case "bundlelink":
                object = objectFactory.createBundleLink();
                break;
            case "bundlerequest":
                object = objectFactory.createBundleRequest();
                break;
            case "bundleresponse":
                object = objectFactory.createBundleResponse();
                break;
            case "bundlesearch":
                object = objectFactory.createBundleSearch();
                break;
            case "bundletype":
                object = objectFactory.createBundleType();
                break;
            case "button":
                object = objectFactory.createButton();
                break;
            case "buttoncontent":
                object = objectFactory.createButtonContent();
                break;
            case "caption":
                object = objectFactory.createCaption();
                break;
            case "careplan":
                object = objectFactory.createCarePlan();
                break;
            case "careplanactivity":
                object = objectFactory.createCarePlanActivity();
                break;
            case "careplanactivitystatus":
                object = objectFactory.createCarePlanActivityStatus();
                break;
            case "careplandetail":
                object = objectFactory.createCarePlanDetail();
                break;
            case "careplanparticipant":
                object = objectFactory.createCarePlanParticipant();
                break;
            case "careplanrelatedplan":
                object = objectFactory.createCarePlanRelatedPlan();
                break;
            case "careplanrelationship":
                object = objectFactory.createCarePlanRelationship();
                break;
            case "careplanstatus":
                object = objectFactory.createCarePlanStatus();
                break;
            case "cite":
                object = objectFactory.createCite();
                break;
            case "claim":
                object = objectFactory.createClaim();
                break;
            case "claimcoverage":
                object = objectFactory.createClaimCoverage();
                break;
            case "claimdetail":
                object = objectFactory.createClaimDetail();
                break;
            case "claimdiagnosis":
                object = objectFactory.createClaimDiagnosis();
                break;
            case "claimitem":
                object = objectFactory.createClaimItem();
                break;
            case "claimmissingteeth":
                object = objectFactory.createClaimMissingTeeth();
                break;
            case "claimpayee":
                object = objectFactory.createClaimPayee();
                break;
            case "claimprosthesis":
                object = objectFactory.createClaimProsthesis();
                break;
            case "claimresponse":
                object = objectFactory.createClaimResponse();
                break;
            case "claimresponseadditem":
                object = objectFactory.createClaimResponseAddItem();
                break;
            case "claimresponseadjudication":
                object = objectFactory.createClaimResponseAdjudication();
                break;
            case "claimresponseadjudication1":
                object = objectFactory.createClaimResponseAdjudication1();
                break;
            case "claimresponseadjudication2":
                object = objectFactory.createClaimResponseAdjudication2();
                break;
            case "claimresponseadjudication3":
                object = objectFactory.createClaimResponseAdjudication3();
                break;
            case "claimresponseadjudication4":
                object = objectFactory.createClaimResponseAdjudication4();
                break;
            case "claimresponsecoverage":
                object = objectFactory.createClaimResponseCoverage();
                break;
            case "claimresponsedetail":
                object = objectFactory.createClaimResponseDetail();
                break;
            case "claimresponsedetail1":
                object = objectFactory.createClaimResponseDetail1();
                break;
            case "claimresponseerror":
                object = objectFactory.createClaimResponseError();
                break;
            case "claimresponseitem":
                object = objectFactory.createClaimResponseItem();
                break;
            case "claimresponsenote":
                object = objectFactory.createClaimResponseNote();
                break;
            case "claimresponsesubdetail":
                object = objectFactory.createClaimResponseSubDetail();
                break;
            case "claimsubdetail":
                object = objectFactory.createClaimSubDetail();
                break;
            case "claimtype":
                object = objectFactory.createClaimType();
                break;
            case "clinicalimpression":
                object = objectFactory.createClinicalImpression();
                break;
            case "clinicalimpressionfinding":
                object = objectFactory.createClinicalImpressionFinding();
                break;
            case "clinicalimpressioninvestigations":
                object = objectFactory.createClinicalImpressionInvestigations();
                break;
            case "clinicalimpressionruledout":
                object = objectFactory.createClinicalImpressionRuledOut();
                break;
            case "clinicalimpressionstatus":
                object = objectFactory.createClinicalImpressionStatus();
                break;
            case "code":
                object = objectFactory.createCode();
                break;
            case "code2":
                object = objectFactory.createCode2();
                break;
            case "codeableconcept":
                object = objectFactory.createCodeableConcept();
                break;
            case "coding":
                object = objectFactory.createCoding();
                break;
            case "col":
                object = objectFactory.createCol();
                break;
            case "colgroup":
                object = objectFactory.createColgroup();
                break;
            case "communication":
                object = objectFactory.createCommunication();
                break;
            case "communicationpayload":
                object = objectFactory.createCommunicationPayload();
                break;
            case "communicationrequest":
                object = objectFactory.createCommunicationRequest();
                break;
            case "communicationrequestpayload":
                object = objectFactory.createCommunicationRequestPayload();
                break;
            case "communicationrequeststatus":
                object = objectFactory.createCommunicationRequestStatus();
                break;
            case "communicationstatus":
                object = objectFactory.createCommunicationStatus();
                break;
            case "composition":
                object = objectFactory.createComposition();
                break;
            case "compositionattestationmode":
                object = objectFactory.createCompositionAttestationMode();
                break;
            case "compositionattester":
                object = objectFactory.createCompositionAttester();
                break;
            case "compositionevent":
                object = objectFactory.createCompositionEvent();
                break;
            case "compositionsection":
                object = objectFactory.createCompositionSection();
                break;
            case "compositionstatus":
                object = objectFactory.createCompositionStatus();
                break;
            case "conceptmap":
                object = objectFactory.createConceptMap();
                break;
            case "conceptmapcontact":
                object = objectFactory.createConceptMapContact();
                break;
            case "conceptmapdependson":
                object = objectFactory.createConceptMapDependsOn();
                break;
            case "conceptmapelement":
                object = objectFactory.createConceptMapElement();
                break;
            case "conceptmapequivalence":
                object = objectFactory.createConceptMapEquivalence();
                break;
            case "conceptmaptarget":
                object = objectFactory.createConceptMapTarget();
                break;
            case "condition":
                object = objectFactory.createCondition();
                break;
            case "conditionevidence":
                object = objectFactory.createConditionEvidence();
                break;
            case "conditionstage":
                object = objectFactory.createConditionStage();
                break;
            case "conditionverificationstatus":
                object = objectFactory.createConditionVerificationStatus();
                break;
            case "conditionaldeletestatus":
                object = objectFactory.createConditionalDeleteStatus();
                break;
            case "conformance":
                object = objectFactory.createConformance();
                break;
            case "conformancecertificate":
                object = objectFactory.createConformanceCertificate();
                break;
            case "conformancecontact":
                object = objectFactory.createConformanceContact();
                break;
            case "conformancedocument":
                object = objectFactory.createConformanceDocument();
                break;
            case "conformanceendpoint":
                object = objectFactory.createConformanceEndpoint();
                break;
            case "conformanceevent":
                object = objectFactory.createConformanceEvent();
                break;
            case "conformanceeventmode":
                object = objectFactory.createConformanceEventMode();
                break;
            case "conformanceimplementation":
                object = objectFactory.createConformanceImplementation();
                break;
            case "conformanceinteraction":
                object = objectFactory.createConformanceInteraction();
                break;
            case "conformanceinteraction1":
                object = objectFactory.createConformanceInteraction1();
                break;
            case "conformancemessaging":
                object = objectFactory.createConformanceMessaging();
                break;
            case "conformanceoperation":
                object = objectFactory.createConformanceOperation();
                break;
            case "conformanceresource":
                object = objectFactory.createConformanceResource();
                break;
            case "conformanceresourcestatus":
                object = objectFactory.createConformanceResourceStatus();
                break;
            case "conformancerest":
                object = objectFactory.createConformanceRest();
                break;
            case "conformancesearchparam":
                object = objectFactory.createConformanceSearchParam();
                break;
            case "conformancesecurity":
                object = objectFactory.createConformanceSecurity();
                break;
            case "conformancesoftware":
                object = objectFactory.createConformanceSoftware();
                break;
            case "conformancestatementkind":
                object = objectFactory.createConformanceStatementKind();
                break;
            case "constraintseverity":
                object = objectFactory.createConstraintSeverity();
                break;
            case "contactpoint":
                object = objectFactory.createContactPoint();
                break;
            case "contactpointsystem":
                object = objectFactory.createContactPointSystem();
                break;
            case "contactpointuse":
                object = objectFactory.createContactPointUse();
                break;
            case "contenttype":
                object = objectFactory.createContentType();
                break;
            case "contract":
                object = objectFactory.createContract();
                break;
            case "contractactor":
                object = objectFactory.createContractActor();
                break;
            case "contractactor1":
                object = objectFactory.createContractActor1();
                break;
            case "contractfriendly":
                object = objectFactory.createContractFriendly();
                break;
            case "contractlegal":
                object = objectFactory.createContractLegal();
                break;
            case "contractrule":
                object = objectFactory.createContractRule();
                break;
            case "contractsigner":
                object = objectFactory.createContractSigner();
                break;
            case "contractterm":
                object = objectFactory.createContractTerm();
                break;
            case "contractvalueditem":
                object = objectFactory.createContractValuedItem();
                break;
            case "contractvalueditem1":
                object = objectFactory.createContractValuedItem1();
                break;
            case "count":
                object = objectFactory.createCount();
                break;
            case "coverage":
                object = objectFactory.createCoverage();
                break;
            case "dataelement":
                object = objectFactory.createDataElement();
                break;
            case "dataelementcontact":
                object = objectFactory.createDataElementContact();
                break;
            case "dataelementmapping":
                object = objectFactory.createDataElementMapping();
                break;
            case "dataelementstringency":
                object = objectFactory.createDataElementStringency();
                break;
            case "date":
                object = objectFactory.createDate();
                break;
            case "datetime":
                object = objectFactory.createDateTime();
                break;
            case "daysofweek":
                object = objectFactory.createDaysOfWeek();
                break;
            case "dd":
                object = objectFactory.createDd();
                break;
            case "decimal":
                object = objectFactory.createDecimal();
                break;
            case "del":
                object = objectFactory.createDel();
                break;
            case "detectedissue":
                object = objectFactory.createDetectedIssue();
                break;
            case "detectedissuemitigation":
                object = objectFactory.createDetectedIssueMitigation();
                break;
            case "detectedissueseverity":
                object = objectFactory.createDetectedIssueSeverity();
                break;
            case "device":
                object = objectFactory.createDevice();
                break;
            case "devicecomponent":
                object = objectFactory.createDeviceComponent();
                break;
            case "devicecomponentproductionspecification":
                object = objectFactory.createDeviceComponentProductionSpecification();
                break;
            case "devicemetric":
                object = objectFactory.createDeviceMetric();
                break;
            case "devicemetriccalibration":
                object = objectFactory.createDeviceMetricCalibration();
                break;
            case "devicemetriccalibrationstate":
                object = objectFactory.createDeviceMetricCalibrationState();
                break;
            case "devicemetriccalibrationtype":
                object = objectFactory.createDeviceMetricCalibrationType();
                break;
            case "devicemetriccategory":
                object = objectFactory.createDeviceMetricCategory();
                break;
            case "devicemetriccolor":
                object = objectFactory.createDeviceMetricColor();
                break;
            case "devicemetricoperationalstatus":
                object = objectFactory.createDeviceMetricOperationalStatus();
                break;
            case "devicestatus":
                object = objectFactory.createDeviceStatus();
                break;
            case "deviceuserequest":
                object = objectFactory.createDeviceUseRequest();
                break;
            case "deviceuserequestpriority":
                object = objectFactory.createDeviceUseRequestPriority();
                break;
            case "deviceuserequeststatus":
                object = objectFactory.createDeviceUseRequestStatus();
                break;
            case "deviceusestatement":
                object = objectFactory.createDeviceUseStatement();
                break;
            case "dfn":
                object = objectFactory.createDfn();
                break;
            case "diagnosticorder":
                object = objectFactory.createDiagnosticOrder();
                break;
            case "diagnosticorderevent":
                object = objectFactory.createDiagnosticOrderEvent();
                break;
            case "diagnosticorderitem":
                object = objectFactory.createDiagnosticOrderItem();
                break;
            case "diagnosticorderpriority":
                object = objectFactory.createDiagnosticOrderPriority();
                break;
            case "diagnosticorderstatus":
                object = objectFactory.createDiagnosticOrderStatus();
                break;
            case "diagnosticreport":
                object = objectFactory.createDiagnosticReport();
                break;
            case "diagnosticreportimage":
                object = objectFactory.createDiagnosticReportImage();
                break;
            case "diagnosticreportstatus":
                object = objectFactory.createDiagnosticReportStatus();
                break;
            case "digitalmediatype":
                object = objectFactory.createDigitalMediaType();
                break;
            case "distance":
                object = objectFactory.createDistance();
                break;
            case "div":
                object = objectFactory.createDiv();
                break;
            case "dl":
                object = objectFactory.createDl();
                break;
            case "documentmanifest":
                object = objectFactory.createDocumentManifest();
                break;
            case "documentmanifestcontent":
                object = objectFactory.createDocumentManifestContent();
                break;
            case "documentmanifestrelated":
                object = objectFactory.createDocumentManifestRelated();
                break;
            case "documentmode":
                object = objectFactory.createDocumentMode();
                break;
            case "documentreference":
                object = objectFactory.createDocumentReference();
                break;
            case "documentreferencecontent":
                object = objectFactory.createDocumentReferenceContent();
                break;
            case "documentreferencecontext":
                object = objectFactory.createDocumentReferenceContext();
                break;
            case "documentreferencerelated":
                object = objectFactory.createDocumentReferenceRelated();
                break;
            case "documentreferencerelatesto":
                object = objectFactory.createDocumentReferenceRelatesTo();
                break;
            case "documentreferencestatus":
                object = objectFactory.createDocumentReferenceStatus();
                break;
            case "documentrelationshiptype":
                object = objectFactory.createDocumentRelationshipType();
                break;
            case "domainresource":
                object = objectFactory.createDomainResource();
                break;
            case "dt":
                object = objectFactory.createDt();
                break;
            case "duration":
                object = objectFactory.createDuration();
                break;
            case "element":
                object = objectFactory.createElement();
                break;
            case "elementdefinition":
                object = objectFactory.createElementDefinition();
                break;
            case "elementdefinitionbase":
                object = objectFactory.createElementDefinitionBase();
                break;
            case "elementdefinitionbinding":
                object = objectFactory.createElementDefinitionBinding();
                break;
            case "elementdefinitionconstraint":
                object = objectFactory.createElementDefinitionConstraint();
                break;
            case "elementdefinitionmapping":
                object = objectFactory.createElementDefinitionMapping();
                break;
            case "elementdefinitionslicing":
                object = objectFactory.createElementDefinitionSlicing();
                break;
            case "elementdefinitiontype":
                object = objectFactory.createElementDefinitionType();
                break;
            case "eligibilityrequest":
                object = objectFactory.createEligibilityRequest();
                break;
            case "eligibilityresponse":
                object = objectFactory.createEligibilityResponse();
                break;
            case "em":
                object = objectFactory.createEm();
                break;
            case "encounter":
                object = objectFactory.createEncounter();
                break;
            case "encounterclass":
                object = objectFactory.createEncounterClass();
                break;
            case "encounterhospitalization":
                object = objectFactory.createEncounterHospitalization();
                break;
            case "encounterlocation":
                object = objectFactory.createEncounterLocation();
                break;
            case "encounterlocationstatus":
                object = objectFactory.createEncounterLocationStatus();
                break;
            case "encounterparticipant":
                object = objectFactory.createEncounterParticipant();
                break;
            case "encounterstate":
                object = objectFactory.createEncounterState();
                break;
            case "encounterstatushistory":
                object = objectFactory.createEncounterStatusHistory();
                break;
            case "enrollmentrequest":
                object = objectFactory.createEnrollmentRequest();
                break;
            case "enrollmentresponse":
                object = objectFactory.createEnrollmentResponse();
                break;
            case "episodeofcare":
                object = objectFactory.createEpisodeOfCare();
                break;
            case "episodeofcarecareteam":
                object = objectFactory.createEpisodeOfCareCareTeam();
                break;
            case "episodeofcarestatus":
                object = objectFactory.createEpisodeOfCareStatus();
                break;
            case "episodeofcarestatushistory":
                object = objectFactory.createEpisodeOfCareStatusHistory();
                break;
            case "eventtiming":
                object = objectFactory.createEventTiming();
                break;
            case "explanationofbenefit":
                object = objectFactory.createExplanationOfBenefit();
                break;
            case "extension":
                object = objectFactory.createExtension();
                break;
            case "extensioncontext":
                object = objectFactory.createExtensionContext();
                break;
            case "familyhistorystatus":
                object = objectFactory.createFamilyHistoryStatus();
                break;
            case "familymemberhistory":
                object = objectFactory.createFamilyMemberHistory();
                break;
            case "familymemberhistorycondition":
                object = objectFactory.createFamilyMemberHistoryCondition();
                break;
            case "fieldset":
                object = objectFactory.createFieldset();
                break;
            case "filteroperator":
                object = objectFactory.createFilterOperator();
                break;
            case "flag":
                object = objectFactory.createFlag();
                break;
            case "flagstatus":
                object = objectFactory.createFlagStatus();
                break;
            case "flow":
                object = objectFactory.createFlow();
                break;
            case "form":
                object = objectFactory.createForm();
                break;
            case "formcontent":
                object = objectFactory.createFormContent();
                break;
            case "goal":
                object = objectFactory.createGoal();
                break;
            case "goaloutcome":
                object = objectFactory.createGoalOutcome();
                break;
            case "goalstatus":
                object = objectFactory.createGoalStatus();
                break;
            case "group":
                object = objectFactory.createGroup();
                break;
            case "groupcharacteristic":
                object = objectFactory.createGroupCharacteristic();
                break;
            case "groupmember":
                object = objectFactory.createGroupMember();
                break;
            case "grouptype":
                object = objectFactory.createGroupType();
                break;
            case "guidedependencytype":
                object = objectFactory.createGuideDependencyType();
                break;
            case "guidepagekind":
                object = objectFactory.createGuidePageKind();
                break;
            case "guideresourcepurpose":
                object = objectFactory.createGuideResourcePurpose();
                break;
            case "h1":
                object = objectFactory.createH1();
                break;
            case "h2":
                object = objectFactory.createH2();
                break;
            case "h3":
                object = objectFactory.createH3();
                break;
            case "h4":
                object = objectFactory.createH4();
                break;
            case "h5":
                object = objectFactory.createH5();
                break;
            case "h6":
                object = objectFactory.createH6();
                break;
            case "httpverb":
                object = objectFactory.createHTTPVerb();
                break;
            case "head":
                object = objectFactory.createHead();
                break;
            case "healthcareservice":
                object = objectFactory.createHealthcareService();
                break;
            case "healthcareserviceavailabletime":
                object = objectFactory.createHealthcareServiceAvailableTime();
                break;
            case "healthcareservicenotavailable":
                object = objectFactory.createHealthcareServiceNotAvailable();
                break;
            case "healthcareserviceservicetype":
                object = objectFactory.createHealthcareServiceServiceType();
                break;
            case "hr":
                object = objectFactory.createHr();
                break;
            case "html":
                object = objectFactory.createHtml();
                break;
            case "humanname":
                object = objectFactory.createHumanName();
                break;
            case "i":
                object = objectFactory.createI();
                break;
            case "id":
                object = objectFactory.createId();
                break;
            case "identifier":
                object = objectFactory.createIdentifier();
                break;
            case "identifieruse":
                object = objectFactory.createIdentifierUse();
                break;
            case "identityassurancelevel":
                object = objectFactory.createIdentityAssuranceLevel();
                break;
            case "imagingobjectselection":
                object = objectFactory.createImagingObjectSelection();
                break;
            case "imagingobjectselectionframes":
                object = objectFactory.createImagingObjectSelectionFrames();
                break;
            case "imagingobjectselectioninstance":
                object = objectFactory.createImagingObjectSelectionInstance();
                break;
            case "imagingobjectselectionseries":
                object = objectFactory.createImagingObjectSelectionSeries();
                break;
            case "imagingobjectselectionstudy":
                object = objectFactory.createImagingObjectSelectionStudy();
                break;
            case "imagingstudy":
                object = objectFactory.createImagingStudy();
                break;
            case "imagingstudyinstance":
                object = objectFactory.createImagingStudyInstance();
                break;
            case "imagingstudyseries":
                object = objectFactory.createImagingStudySeries();
                break;
            case "img":
                object = objectFactory.createImg();
                break;
            case "immunization":
                object = objectFactory.createImmunization();
                break;
            case "immunizationexplanation":
                object = objectFactory.createImmunizationExplanation();
                break;
            case "immunizationreaction":
                object = objectFactory.createImmunizationReaction();
                break;
            case "immunizationrecommendation":
                object = objectFactory.createImmunizationRecommendation();
                break;
            case "immunizationrecommendationdatecriterion":
                object = objectFactory.createImmunizationRecommendationDateCriterion();
                break;
            case "immunizationrecommendationprotocol":
                object = objectFactory.createImmunizationRecommendationProtocol();
                break;
            case "immunizationrecommendationrecommendation":
                object = objectFactory.createImmunizationRecommendationRecommendation();
                break;
            case "immunizationvaccinationprotocol":
                object = objectFactory.createImmunizationVaccinationProtocol();
                break;
            case "implementationguide":
                object = objectFactory.createImplementationGuide();
                break;
            case "implementationguidecontact":
                object = objectFactory.createImplementationGuideContact();
                break;
            case "implementationguidedependency":
                object = objectFactory.createImplementationGuideDependency();
                break;
            case "implementationguideglobal":
                object = objectFactory.createImplementationGuideGlobal();
                break;
            case "implementationguidepackage":
                object = objectFactory.createImplementationGuidePackage();
                break;
            case "implementationguidepage":
                object = objectFactory.createImplementationGuidePage();
                break;
            case "implementationguideresource":
                object = objectFactory.createImplementationGuideResource();
                break;
            case "inline":
                object = objectFactory.createInline();
                break;
            case "input":
                object = objectFactory.createInput();
                break;
            case "ins":
                object = objectFactory.createIns();
                break;
            case "instanceavailability":
                object = objectFactory.createInstanceAvailability();
                break;
            case "instant":
                object = objectFactory.createInstant();
                break;
            case "integer":
                object = objectFactory.createInteger();
                break;
            case "issueseverity":
                object = objectFactory.createIssueSeverity();
                break;
            case "issuetype":
                object = objectFactory.createIssueType();
                break;
            case "kbd":
                object = objectFactory.createKbd();
                break;
            case "label":
                object = objectFactory.createLabel();
                break;
            case "legend":
                object = objectFactory.createLegend();
                break;
            case "li":
                object = objectFactory.createLi();
                break;
            case "link":
                object = objectFactory.createLink();
                break;
            case "linktype":
                object = objectFactory.createLinkType();
                break;
            case "list":
                object = objectFactory.createList();
                break;
            case "listentry":
                object = objectFactory.createListEntry();
                break;
            case "listmode":
                object = objectFactory.createListMode();
                break;
            case "liststatus":
                object = objectFactory.createListStatus();
                break;
            case "location":
                object = objectFactory.createLocation();
                break;
            case "locationmode":
                object = objectFactory.createLocationMode();
                break;
            case "locationposition":
                object = objectFactory.createLocationPosition();
                break;
            case "locationstatus":
                object = objectFactory.createLocationStatus();
                break;
            case "map":
                object = objectFactory.createMap();
                break;
            case "markdown":
                object = objectFactory.createMarkdown();
                break;
            case "measmntprinciple":
                object = objectFactory.createMeasmntPrinciple();
                break;
            case "media":
                object = objectFactory.createMedia();
                break;
            case "medication":
                object = objectFactory.createMedication();
                break;
            case "medicationadministration":
                object = objectFactory.createMedicationAdministration();
                break;
            case "medicationadministrationdosage":
                object = objectFactory.createMedicationAdministrationDosage();
                break;
            case "medicationadministrationstatus":
                object = objectFactory.createMedicationAdministrationStatus();
                break;
            case "medicationbatch":
                object = objectFactory.createMedicationBatch();
                break;
            case "medicationcontent":
                object = objectFactory.createMedicationContent();
                break;
            case "medicationdispense":
                object = objectFactory.createMedicationDispense();
                break;
            case "medicationdispensedosageinstruction":
                object = objectFactory.createMedicationDispenseDosageInstruction();
                break;
            case "medicationdispensestatus":
                object = objectFactory.createMedicationDispenseStatus();
                break;
            case "medicationdispensesubstitution":
                object = objectFactory.createMedicationDispenseSubstitution();
                break;
            case "medicationingredient":
                object = objectFactory.createMedicationIngredient();
                break;
            case "medicationorder":
                object = objectFactory.createMedicationOrder();
                break;
            case "medicationorderdispenserequest":
                object = objectFactory.createMedicationOrderDispenseRequest();
                break;
            case "medicationorderdosageinstruction":
                object = objectFactory.createMedicationOrderDosageInstruction();
                break;
            case "medicationorderstatus":
                object = objectFactory.createMedicationOrderStatus();
                break;
            case "medicationordersubstitution":
                object = objectFactory.createMedicationOrderSubstitution();
                break;
            case "medicationpackage":
                object = objectFactory.createMedicationPackage();
                break;
            case "medicationproduct":
                object = objectFactory.createMedicationProduct();
                break;
            case "medicationstatement":
                object = objectFactory.createMedicationStatement();
                break;
            case "medicationstatementdosage":
                object = objectFactory.createMedicationStatementDosage();
                break;
            case "medicationstatementstatus":
                object = objectFactory.createMedicationStatementStatus();
                break;
            case "messageheader":
                object = objectFactory.createMessageHeader();
                break;
            case "messageheaderdestination":
                object = objectFactory.createMessageHeaderDestination();
                break;
            case "messageheaderresponse":
                object = objectFactory.createMessageHeaderResponse();
                break;
            case "messageheadersource":
                object = objectFactory.createMessageHeaderSource();
                break;
            case "messagesignificancecategory":
                object = objectFactory.createMessageSignificanceCategory();
                break;
            case "meta":
                object = objectFactory.createMeta();
                break;
            case "meta2":
                object = objectFactory.createMeta2();
                break;
            case "money":
                object = objectFactory.createMoney();
                break;
            case "nameuse":
                object = objectFactory.createNameUse();
                break;
            case "namingsystem":
                object = objectFactory.createNamingSystem();
                break;
            case "namingsystemcontact":
                object = objectFactory.createNamingSystemContact();
                break;
            case "namingsystemidentifiertype":
                object = objectFactory.createNamingSystemIdentifierType();
                break;
            case "namingsystemtype":
                object = objectFactory.createNamingSystemType();
                break;
            case "namingsystemuniqueid":
                object = objectFactory.createNamingSystemUniqueId();
                break;
            case "narrative":
                object = objectFactory.createNarrative();
                break;
            case "narrativestatus":
                object = objectFactory.createNarrativeStatus();
                break;
            case "noscript":
                object = objectFactory.createNoscript();
                break;
            case "notetype":
                object = objectFactory.createNoteType();
                break;
            case "nutritionorder":
                object = objectFactory.createNutritionOrder();
                break;
            case "nutritionorderadministration":
                object = objectFactory.createNutritionOrderAdministration();
                break;
            case "nutritionorderenteralformula":
                object = objectFactory.createNutritionOrderEnteralFormula();
                break;
            case "nutritionordernutrient":
                object = objectFactory.createNutritionOrderNutrient();
                break;
            case "nutritionorderoraldiet":
                object = objectFactory.createNutritionOrderOralDiet();
                break;
            case "nutritionorderstatus":
                object = objectFactory.createNutritionOrderStatus();
                break;
            case "nutritionordersupplement":
                object = objectFactory.createNutritionOrderSupplement();
                break;
            case "nutritionordertexture":
                object = objectFactory.createNutritionOrderTexture();
                break;
            case "object":
                object = objectFactory.createObject();
                break;
            case "observation":
                object = objectFactory.createObservation();
                break;
            case "observationcomponent":
                object = objectFactory.createObservationComponent();
                break;
            case "observationreferencerange":
                object = objectFactory.createObservationReferenceRange();
                break;
            case "observationrelated":
                object = objectFactory.createObservationRelated();
                break;
            case "observationrelationshiptype":
                object = objectFactory.createObservationRelationshipType();
                break;
            case "observationstatus":
                object = objectFactory.createObservationStatus();
                break;
            case "oid":
                object = objectFactory.createOid();
                break;
            case "ol":
                object = objectFactory.createOl();
                break;
            case "operationdefinition":
                object = objectFactory.createOperationDefinition();
                break;
            case "operationdefinitionbinding":
                object = objectFactory.createOperationDefinitionBinding();
                break;
            case "operationdefinitioncontact":
                object = objectFactory.createOperationDefinitionContact();
                break;
            case "operationdefinitionparameter":
                object = objectFactory.createOperationDefinitionParameter();
                break;
            case "operationkind":
                object = objectFactory.createOperationKind();
                break;
            case "operationoutcome":
                object = objectFactory.createOperationOutcome();
                break;
            case "operationoutcomeissue":
                object = objectFactory.createOperationOutcomeIssue();
                break;
            case "operationparameteruse":
                object = objectFactory.createOperationParameterUse();
                break;
            case "optgroup":
                object = objectFactory.createOptgroup();
                break;
            case "option":
                object = objectFactory.createOption();
                break;
            case "order":
                object = objectFactory.createOrder();
                break;
            case "orderresponse":
                object = objectFactory.createOrderResponse();
                break;
            case "orderstatus":
                object = objectFactory.createOrderStatus();
                break;
            case "orderwhen":
                object = objectFactory.createOrderWhen();
                break;
            case "organization":
                object = objectFactory.createOrganization();
                break;
            case "organizationcontact":
                object = objectFactory.createOrganizationContact();
                break;
            case "p":
                object = objectFactory.createP();
                break;
            case "param":
                object = objectFactory.createParam();
                break;
            case "parameters":
                object = objectFactory.createParameters();
                break;
            case "parametersparameter":
                object = objectFactory.createParametersParameter();
                break;
            case "participantrequired":
                object = objectFactory.createParticipantRequired();
                break;
            case "participantstatus":
                object = objectFactory.createParticipantStatus();
                break;
            case "participationstatus":
                object = objectFactory.createParticipationStatus();
                break;
            case "patient":
                object = objectFactory.createPatient();
                break;
            case "patientanimal":
                object = objectFactory.createPatientAnimal();
                break;
            case "patientcommunication":
                object = objectFactory.createPatientCommunication();
                break;
            case "patientcontact":
                object = objectFactory.createPatientContact();
                break;
            case "patientlink":
                object = objectFactory.createPatientLink();
                break;
            case "paymentnotice":
                object = objectFactory.createPaymentNotice();
                break;
            case "paymentreconciliation":
                object = objectFactory.createPaymentReconciliation();
                break;
            case "paymentreconciliationdetail":
                object = objectFactory.createPaymentReconciliationDetail();
                break;
            case "paymentreconciliationnote":
                object = objectFactory.createPaymentReconciliationNote();
                break;
            case "period":
                object = objectFactory.createPeriod();
                break;
            case "person":
                object = objectFactory.createPerson();
                break;
            case "personlink":
                object = objectFactory.createPersonLink();
                break;
            case "positiveint":
                object = objectFactory.createPositiveInt();
                break;
            case "practitioner":
                object = objectFactory.createPractitioner();
                break;
            case "practitionerpractitionerrole":
                object = objectFactory.createPractitionerPractitionerRole();
                break;
            case "practitionerqualification":
                object = objectFactory.createPractitionerQualification();
                break;
            case "pre":
                object = objectFactory.createPre();
                break;
            case "precontent":
                object = objectFactory.createPreContent();
                break;
            case "procedure":
                object = objectFactory.createProcedure();
                break;
            case "procedurefocaldevice":
                object = objectFactory.createProcedureFocalDevice();
                break;
            case "procedureperformer":
                object = objectFactory.createProcedurePerformer();
                break;
            case "procedurerequest":
                object = objectFactory.createProcedureRequest();
                break;
            case "procedurerequestpriority":
                object = objectFactory.createProcedureRequestPriority();
                break;
            case "procedurerequeststatus":
                object = objectFactory.createProcedureRequestStatus();
                break;
            case "procedurestatus":
                object = objectFactory.createProcedureStatus();
                break;
            case "processrequest":
                object = objectFactory.createProcessRequest();
                break;
            case "processrequestitem":
                object = objectFactory.createProcessRequestItem();
                break;
            case "processresponse":
                object = objectFactory.createProcessResponse();
                break;
            case "processresponsenotes":
                object = objectFactory.createProcessResponseNotes();
                break;
            case "propertyrepresentation":
                object = objectFactory.createPropertyRepresentation();
                break;
            case "provenance":
                object = objectFactory.createProvenance();
                break;
            case "provenanceagent":
                object = objectFactory.createProvenanceAgent();
                break;
            case "provenanceentity":
                object = objectFactory.createProvenanceEntity();
                break;
            case "provenanceentityrole":
                object = objectFactory.createProvenanceEntityRole();
                break;
            case "provenancerelatedagent":
                object = objectFactory.createProvenanceRelatedAgent();
                break;
            case "q":
                object = objectFactory.createQ();
                break;
            case "quantity":
                object = objectFactory.createQuantity();
                break;
            case "quantitycomparator":
                object = objectFactory.createQuantityComparator();
                break;
            case "questionnaire":
                object = objectFactory.createQuestionnaire();
                break;
            case "questionnairegroup":
                object = objectFactory.createQuestionnaireGroup();
                break;
            case "questionnairequestion":
                object = objectFactory.createQuestionnaireQuestion();
                break;
            case "questionnaireresponse":
                object = objectFactory.createQuestionnaireResponse();
                break;
            case "questionnaireresponseanswer":
                object = objectFactory.createQuestionnaireResponseAnswer();
                break;
            case "questionnaireresponsegroup":
                object = objectFactory.createQuestionnaireResponseGroup();
                break;
            case "questionnaireresponsequestion":
                object = objectFactory.createQuestionnaireResponseQuestion();
                break;
            case "questionnaireresponsestatus":
                object = objectFactory.createQuestionnaireResponseStatus();
                break;
            case "questionnairestatus":
                object = objectFactory.createQuestionnaireStatus();
                break;
            case "range":
                object = objectFactory.createRange();
                break;
            case "ratio":
                object = objectFactory.createRatio();
                break;
            case "reference":
                object = objectFactory.createReference();
                break;
            case "referralrequest":
                object = objectFactory.createReferralRequest();
                break;
            case "referralstatus":
                object = objectFactory.createReferralStatus();
                break;
            case "relatedperson":
                object = objectFactory.createRelatedPerson();
                break;
            case "remittanceoutcome":
                object = objectFactory.createRemittanceOutcome();
                break;
            case "resource":
                object = objectFactory.createResource();
                break;
            case "resourcecontainer":
                object = objectFactory.createResourceContainer();
                break;
            case "resourceversionpolicy":
                object = objectFactory.createResourceVersionPolicy();
                break;
            case "responsetype":
                object = objectFactory.createResponseType();
                break;
            case "restfulconformancemode":
                object = objectFactory.createRestfulConformanceMode();
                break;
            case "riskassessment":
                object = objectFactory.createRiskAssessment();
                break;
            case "riskassessmentprediction":
                object = objectFactory.createRiskAssessmentPrediction();
                break;
            case "samp":
                object = objectFactory.createSamp();
                break;
            case "sampleddata":
                object = objectFactory.createSampledData();
                break;
            case "sampleddatadatatype":
                object = objectFactory.createSampledDataDataType();
                break;
            case "schedule":
                object = objectFactory.createSchedule();
                break;
            case "script":
                object = objectFactory.createScript();
                break;
            case "searchentrymode":
                object = objectFactory.createSearchEntryMode();
                break;
            case "searchmodifiercode":
                object = objectFactory.createSearchModifierCode();
                break;
            case "searchparamtype":
                object = objectFactory.createSearchParamType();
                break;
            case "searchparameter":
                object = objectFactory.createSearchParameter();
                break;
            case "searchparametercontact":
                object = objectFactory.createSearchParameterContact();
                break;
            case "select":
                object = objectFactory.createSelect();
                break;
            case "signature":
                object = objectFactory.createSignature();
                break;
            case "simplequantity":
                object = objectFactory.createSimpleQuantity();
                break;
            case "slicingrules":
                object = objectFactory.createSlicingRules();
                break;
            case "slot":
                object = objectFactory.createSlot();
                break;
            case "slotstatus":
                object = objectFactory.createSlotStatus();
                break;
            case "small":
                object = objectFactory.createSmall();
                break;
            case "span":
                object = objectFactory.createSpan();
                break;
            case "specimen":
                object = objectFactory.createSpecimen();
                break;
            case "specimencollection":
                object = objectFactory.createSpecimenCollection();
                break;
            case "specimencontainer":
                object = objectFactory.createSpecimenContainer();
                break;
            case "specimenstatus":
                object = objectFactory.createSpecimenStatus();
                break;
            case "specimentreatment":
                object = objectFactory.createSpecimenTreatment();
                break;
            case "string":
                object = objectFactory.createString();
                break;
            case "strong":
                object = objectFactory.createStrong();
                break;
            case "structuredefinition":
                object = objectFactory.createStructureDefinition();
                break;
            case "structuredefinitioncontact":
                object = objectFactory.createStructureDefinitionContact();
                break;
            case "structuredefinitiondifferential":
                object = objectFactory.createStructureDefinitionDifferential();
                break;
            case "structuredefinitionkind":
                object = objectFactory.createStructureDefinitionKind();
                break;
            case "structuredefinitionmapping":
                object = objectFactory.createStructureDefinitionMapping();
                break;
            case "structuredefinitionsnapshot":
                object = objectFactory.createStructureDefinitionSnapshot();
                break;
            case "style":
                object = objectFactory.createStyle();
                break;
            case "sub":
                object = objectFactory.createSub();
                break;
            case "subscription":
                object = objectFactory.createSubscription();
                break;
            case "subscriptionchannel":
                object = objectFactory.createSubscriptionChannel();
                break;
            case "subscriptionchanneltype":
                object = objectFactory.createSubscriptionChannelType();
                break;
            case "subscriptionstatus":
                object = objectFactory.createSubscriptionStatus();
                break;
            case "substance":
                object = objectFactory.createSubstance();
                break;
            case "substanceingredient":
                object = objectFactory.createSubstanceIngredient();
                break;
            case "substanceinstance":
                object = objectFactory.createSubstanceInstance();
                break;
            case "sup":
                object = objectFactory.createSup();
                break;
            case "supplydelivery":
                object = objectFactory.createSupplyDelivery();
                break;
            case "supplydeliverystatus":
                object = objectFactory.createSupplyDeliveryStatus();
                break;
            case "supplyrequest":
                object = objectFactory.createSupplyRequest();
                break;
            case "supplyrequeststatus":
                object = objectFactory.createSupplyRequestStatus();
                break;
            case "supplyrequestwhen":
                object = objectFactory.createSupplyRequestWhen();
                break;
            case "systemrestfulinteraction":
                object = objectFactory.createSystemRestfulInteraction();
                break;
            case "table":
                object = objectFactory.createTable();
                break;
            case "tbody":
                object = objectFactory.createTbody();
                break;
            case "td":
                object = objectFactory.createTd();
                break;
            case "testscript":
                object = objectFactory.createTestScript();
                break;
            case "testscriptaction":
                object = objectFactory.createTestScriptAction();
                break;
            case "testscriptaction1":
                object = objectFactory.createTestScriptAction1();
                break;
            case "testscriptaction2":
                object = objectFactory.createTestScriptAction2();
                break;
            case "testscriptassert":
                object = objectFactory.createTestScriptAssert();
                break;
            case "testscriptcapability":
                object = objectFactory.createTestScriptCapability();
                break;
            case "testscriptcontact":
                object = objectFactory.createTestScriptContact();
                break;
            case "testscriptfixture":
                object = objectFactory.createTestScriptFixture();
                break;
            case "testscriptlink":
                object = objectFactory.createTestScriptLink();
                break;
            case "testscriptmetadata":
                object = objectFactory.createTestScriptMetadata();
                break;
            case "testscriptoperation":
                object = objectFactory.createTestScriptOperation();
                break;
            case "testscriptrequestheader":
                object = objectFactory.createTestScriptRequestHeader();
                break;
            case "testscriptsetup":
                object = objectFactory.createTestScriptSetup();
                break;
            case "testscriptteardown":
                object = objectFactory.createTestScriptTeardown();
                break;
            case "testscripttest":
                object = objectFactory.createTestScriptTest();
                break;
            case "testscriptvariable":
                object = objectFactory.createTestScriptVariable();
                break;
            case "textarea":
                object = objectFactory.createTextarea();
                break;
            case "tfoot":
                object = objectFactory.createTfoot();
                break;
            case "th":
                object = objectFactory.createTh();
                break;
            case "thead":
                object = objectFactory.createThead();
                break;
            case "time":
                object = objectFactory.createTime();
                break;
            case "timing":
                object = objectFactory.createTiming();
                break;
            case "timingrepeat":
                object = objectFactory.createTimingRepeat();
                break;
            case "title":
                object = objectFactory.createTitle();
                break;
            case "tr":
                object = objectFactory.createTr();
                break;
            case "transactionmode":
                object = objectFactory.createTransactionMode();
                break;
            case "tt":
                object = objectFactory.createTt();
                break;
            case "typerestfulinteraction":
                object = objectFactory.createTypeRestfulInteraction();
                break;
            case "ul":
                object = objectFactory.createUl();
                break;
            case "unitsoftime":
                object = objectFactory.createUnitsOfTime();
                break;
            case "unknowncontentcode":
                object = objectFactory.createUnknownContentCode();
                break;
            case "unsignedint":
                object = objectFactory.createUnsignedInt();
                break;
            case "uri":
                object = objectFactory.createUri();
                break;
            case "use":
                object = objectFactory.createUse();
                break;
            case "uuid":
                object = objectFactory.createUuid();
                break;
            case "valueset":
                object = objectFactory.createValueSet();
                break;
            case "valuesetcodesystem":
                object = objectFactory.createValueSetCodeSystem();
                break;
            case "valuesetcompose":
                object = objectFactory.createValueSetCompose();
                break;
            case "valuesetconcept":
                object = objectFactory.createValueSetConcept();
                break;
            case "valuesetconcept1":
                object = objectFactory.createValueSetConcept1();
                break;
            case "valuesetcontact":
                object = objectFactory.createValueSetContact();
                break;
            case "valuesetcontains":
                object = objectFactory.createValueSetContains();
                break;
            case "valuesetdesignation":
                object = objectFactory.createValueSetDesignation();
                break;
            case "valuesetexpansion":
                object = objectFactory.createValueSetExpansion();
                break;
            case "valuesetfilter":
                object = objectFactory.createValueSetFilter();
                break;
            case "valuesetinclude":
                object = objectFactory.createValueSetInclude();
                break;
            case "valuesetparameter":
                object = objectFactory.createValueSetParameter();
                break;
            case "var":
                object = objectFactory.createVar();
                break;
            case "visionbase":
                object = objectFactory.createVisionBase();
                break;
            case "visioneyes":
                object = objectFactory.createVisionEyes();
                break;
            case "visionprescription":
                object = objectFactory.createVisionPrescription();
                break;
            case "visionprescriptiondispense":
                object = objectFactory.createVisionPrescriptionDispense();
                break;
            case "xpathusagetype":
                object = objectFactory.createXPathUsageType();
                break;
            default:
            	object = null;
                break;
        }

        return object;
    }
}
