from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
import time

web = webdriver.Chrome(ChromeDriverManager().install())
web.get("https://www.santillanaconnect.com/Account/Login/?wtrealm=http%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fcompartir%2F&wreply=https%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fsso%2Floginconnect")
time.sleep(5)

