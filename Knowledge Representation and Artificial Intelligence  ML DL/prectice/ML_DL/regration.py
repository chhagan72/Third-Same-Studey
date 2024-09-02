import pandas as pd
import numpy as np
import seaborn as sns
import statsmodels.formula.api as smf
import matplotlib.pyplot as plt


# sal=pd.read_csv("Salary_Data.csv")
# print(sal)


dataset = pd.read_csv("delivery_time.csv")
# print(dataset)

# print(dataset.info())

# sns.displot(dataset["Delivery Time"])
# plt.show()

# print(dataset.corr())


# sns.regplot(x=dataset["Sorting Time"],y=dataset["Delivery Time"])
# plt.show()


dataset = dataset.rename({'Delivery Time':'delivery_time', 'Sorting Time':'sorting_time'},axis=1)
print(dataset)


model = smf.ols("delivery_time ~ sorting_time", data=dataset).fit()
print(model.params)


# delivery_time = 6.5+1.6*5
# print(delivery_time)


new_data = pd.Series([5,8])
print(new_data)


data_prediction = pd.DataFrame(new_data, columns=['sorting_time'])
print(data_prediction)


model=model.predict(data_prediction)
print(model)