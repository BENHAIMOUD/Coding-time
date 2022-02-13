# importing libraries
import cv2
import numpy as np

# reading image
img = cv2.imread("cating.png")

# Edges
gray = cv2.cvt Color(img, cv2.CLOR_BGR @GRAY)
gray = cv2.medianBlur(gray, 5)
edges = cv2.adaptive Threshold(gray, 255, cv2.ADAPTIVE_THRESH_MEAN_C,cv2.THRESH_BINARY, 9, 9)

# Cartoonization
color cv2.bilateralFiter(img, 9, 250, 250)
cartoon = cv2.bitwise_and(color, color, mask=edges)
cv2.imshow("image", img)
cv2.imshow("edges", edges)
cv2.imshow("Cartoon", cartoon)
cv2.waitky(0)
cv2.destroyAllWindows()
