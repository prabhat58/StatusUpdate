# StatusUpdate

This project will post a random quote from your quote folder (i.e. present on your device) in your Facebook timeline on just one click.
To do the same you have to follow these steps as given below- 

# 1.) 
  Download the zip file of the project and import it on eclipse.

# 2.) 
  Now deploy your project on the tomcat server (You need to install tomcat server in eclipse) .

# 3.) 
  Now open any browser and run the local host on it. If nothing is wrong it will open a web page and ask for 'App ID', 'Secret ID' and       'Access Token'.To get the values of these parameters you need to login to developers.facebook.com.

# 4.) 
  Register your app on developers.facebook.com, after logging in go to dashboard, here you can get your 'App ID' and 'Secret ID'. For       'Access Token' go to the 'Tools & Support'-> 'Graph API Explorer'. From drop down select 'Get User Access Token', check all the           parameters present under 'User Data Permissions' and then 'Get Access token'. It will generate an 'Access Token'.

# 5.) 
  With the help of these parameters login and press 'Post Your Qoute' button. It will redirect to a new page saying 'Successfully posted a   new random quote on your facebook profile.', If the parameters provided by you are correct.

# 6.) 
  In doing the same every time you press the button an API call is made with certain parameters, It selects a random image from the quote   folder and posts it on Facebook.URL for the API call is given as - 

  http://localhost:8080/StatusUpdate/signin?appId={your_app_id}&secretId={your_secret_id}&accessToken={your_access_token}
  
  Replace {your_app_id} with your App ID, {your_secret_id} with your Secret ID and {your_access_token} by your access token.
  
# Security : 
  The App ID, Secret ID and Access Token you generated on developers.facebook.com is confidential. Do not share it with anyone else.
