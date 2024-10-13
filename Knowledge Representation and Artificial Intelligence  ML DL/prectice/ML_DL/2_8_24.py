import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


sal = pd.read_csv("Salary_Data.csv")
# print(sal)

fig, ax = plt.subplots(1,3, figsize=(15, 5))
plt.subplot(1, 3, 1)
plt.boxplot(sal)
plt.show()

