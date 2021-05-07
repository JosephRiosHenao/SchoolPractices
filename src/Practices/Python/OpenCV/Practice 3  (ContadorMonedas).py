import cv2
import numpy as np

original = cv2.imread("D:\JOSEPH\GIT\SchoolPractices\src\Practices\Python\OpenCV\IMG\Monedas.jpg")

gris = cv2.cvtColor(original,cv2.COLOR_BGR2GRAY)

blur = cv2.GaussianBlur(gris,(7,7),0)

canny = cv2.Canny(blur,60,100)


cv2.imshow("Output",canny)
cv2.waitKey(0)
cv2.destroyAllWindows() 