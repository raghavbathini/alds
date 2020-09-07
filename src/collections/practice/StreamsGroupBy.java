package collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("customer.modeln.com", "login.saas.hp.com", "dcrworkforce.net", "wizards.managementdynamics.com", "dryfta.com", "Workday.com", "via.intralinks.com", "plus.google.com", "trello.com", "archibus.com", "app.onelogin.com", "partner.acumatica.com", "auth.wistia.com/session/new?app=wistia", "photoshop.com", "secure.vaeplatform.com", "app.decibelinsight.com", "fastly.hightailcdn.com", "go.actionstep.com", "signin.mentor.com", "app.bipsync.com", "osu.workforcehosting.com", "web.signinghub.com", "mailbox.org", "guru.com", "meet.google.com", "sharevault.net", "fastmail.com", "secure.lifelock.com", "abine.com", "login.playcanvas.com", "grammarly.com", "ediscovery.google.com", "hire.lever.co", "id.heroku.com", "hana.sap.com", "linkedin.com", "youtube.com", "drive.google.com", "zendesk.com", "bullhorn.com", "dropbox.com", "id.atlassian.com", "my.atlassian.com", "docusign.net", "accounts.shopify.com", "app.samanage.com", "app.asana.com", "amazon.com", "cloud.saplumira.com", "secure.echosign.com", "login.opentext.com", "idrive.com", "zenpayroll.com", "woopra.com", "app.backupify.com", "app.intercom.com", "slideshare.net", "login.druva.com", "wetransfer.com", "wunderlist.com", "login.skype.com", "secure.casefox.com", "identity.flickr.com", "egnyte.com", "calliduscloud.com", "id.vdms.io", "bitbucket.org", "home.zoho.com", "mydt.demandtec.com", "app.relateiq.com", "myheritage.com", "invoice.zoho.com", "azure.microsoft.com", "media.amazonservices.com", "vimeo.com", "tumblr.com", "glip.com", "accounts.cloud.com", "app.compendium.com", "salesiq.zoho.com", "algolia.com", "visualstudio.com", "notebook.zoho.com", "apps.na.collabserv.com", "login.imedidata.com", "be.contentful.com", "crm.dynamics.com", "account.zopim.com", "jam4.sapjam.com", "sharepoint.com", "my.workshare.com", "slack.com", "social.icims.com", "site24x7.com", "centrify.com", "bluecoat.com", "vena.io", "voicethread.com", "app.scalyr.com", "login.veeam.com", "spinbackup.com", "rollbar.com", "console.jumpcloud.com", "mailfence.com", "signin.webex.com", "admin.mindtickle.com", "maps.groupmap.com", "360suite.google.com", "my.forever.com", "hub.veryfi.com", "login.oracle.com", "login.visioncritical.com", "google-analytics.com", "portal.colocrossing.com", "my.rapidcompute.com", "zuora.com", "account.mapbox.com", "accounts.journeyapps.com", "app.compose.com", "secureportal.citrix.com", "salesnow.com", "app.swapcard.com", "login.salesforce.com", "app.raygun.io", "wrike.com", "blueworkslive.com", "iam.vchs.vmware.com", "pivotaltracker.com", "interact5.responsys.net", "apps.admob.com", "quip.com", "fileee.com", "vwo.com", "console.cloud.google.com", "website.com", "app.powerbi.com", "clearbit.com", "questionpro.com", "impact.cisco.com", "firebase.com", "app.social.com", "go.tradeshift.com", "idaas.iam.ibm.com", "squareup.com", "libs.5apps.com", "runtastic.com", "secure.aha.io", "developers.google.com", "cloud.oracle.com", "app.work.com", "messenger.yahoo.com", "app.chime.aws", "database.com", "portal.office.com", "performancemanager4.successfactors.com", "keep.google.com", "surveymonkey.com", "login.bws.birst.com", "freeagent.com", "aws.amazon.com", "taleo.net", "github.com", "assets-yammer.com", "secure.helpscout.net", "app.optimizely.com", "pinterest.com", "login.teamviewer.com", "acrobat.adobe.com", "digitalocean.com", "my.rackspace.com", "cloudally.com", "login.qlik.com", "secure.trialmanager.com", "animoto.com", "my.adobeconnect.com", "onenote.com", "proworkflow.com", "bim360field.autodesk.com", "configurator360.autodesk.com", "remind.com", "fotolia.com", "login.whosonlocation.com", "creative.adobe.com", "250ok.com", "manage.zadarastorage.com", "alignable.com", "intelligentcontract.com", "accounts.salesloft.com", "login.live.com", "fbstatic-a.akamaihd.net", "audiencecenter.google.com", "datastudio.google.com", "login.eloqua.com", "signon.service-now.com", "cloud.touchbistro.com", "login.marketing.adobe.com", "app.box.com", "gitlab.com");
		Map<Integer, List<String>> result = strings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(result); 
		List<List<String>> partitionedList = new ArrayList<List<String>>();
		for(int i: result.keySet()) 
			partitionedList.add(result.get(i));
		System.out.println(Arrays.asList(partitionedList));

	}

}
