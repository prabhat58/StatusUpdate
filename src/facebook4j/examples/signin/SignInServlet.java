package facebook4j.examples.signin;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;
import facebook4j.Media;
import facebook4j.Photo;
import facebook4j.PhotoUpdate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.Random;

@SuppressWarnings("unused")
public class SignInServlet extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
//    	String message = request.getParameter("message"); // Just checking if message is being posted
    	String appId = request.getParameter("appId");
    	String secretId = request.getParameter("secretId");
    	String accessToken = request.getParameter("accessToken");
    	
    	Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId(appId, secretId);
        AccessToken at = new AccessToken(accessToken);
        facebook.setOAuthAccessToken(at);
        try {
//			facebook.postStatusMessage(message);
        	
        	File folder = new File("E:/StatusUpdate/src/facebook4j/examples/signin/Quotes");
        	File[] listOfFiles = folder.listFiles();
        	int len = listOfFiles.length;
        	
        	int hash[] = new int[len];
        	for(int i=0;i<hash.length;i++){
        		hash[i] = 0;
        	}
        	
        	Random rand = new Random();
        	int n = rand.nextInt(len-1) + 0;
        	
        	boolean flag = true;
        	
        	
        	/*for (int i = 0; i < listOfFiles.length; i++) {
        	      if (listOfFiles[i].isFile()) {
        	        System.out.println("File " + listOfFiles[i].getName());
        	      } else if (listOfFiles[i].isDirectory()) {
        	        System.out.println("Directory " + listOfFiles[i].getName());
       	      }
       	    }*/  // Just to check number of quotes available.
        	
        	while(flag == true){
        		if(hash[n]== 1){
        			Random rand1 = new Random();
                	n = rand1.nextInt(len-1) + 0;
        		}
        		else{
        			hash[n] = 1;
        			flag = false;
        		}
        			
        	}
        	
        	Media media=new Media(listOfFiles[n]);
        	
        	
//          photoUpdate = new PhotoUpdate(media);
        	facebook.postPhoto(media);
		} catch (FacebookException e) {
			e.printStackTrace();
		}
        response.sendRedirect("success.jsp");
    }
}
