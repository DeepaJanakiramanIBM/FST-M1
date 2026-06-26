
    
from selenium import webdriver
import selenium.webdriver.common.by

with webdriver.Firefox() as driver:
   driver.get("https://training-support.net/webelements/login-form/")

   print("page Title: ", driver.title)
   
   username = driver.find_element(selenium.webdriver.common.by.By.ID, "username")

   password = driver.find_element(selenium.webdriver.common.by.By.ID, "password")

   username.send_keys("admin")

   password.send_keys("password")

   login = driver.find_element(selenium.webdriver.common.by.By.XPATH, "//button[text()='Submit']")

   login.click()

   message = driver.find_element(selenium.webdriver.common.by.By.CSS_SELECTOR, "h1.text-center")

   print("Login message: ", message.text)

