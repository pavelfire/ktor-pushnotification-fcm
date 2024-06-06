You need your own admin json file

Your Firebase service account can be used to authenticate multiple Firebase features,
such as Database, Storage and Auth, programmatically via the unified Admin SDK

firebase console 
-> settings icon to left of Project Overview 
-> Service accounts-> generate new private key
-> put downloaded file near this file and rename to "service_account_key.json" 
access it from  Application.kt