import pandas as pd
import numpy as np



pf = pd.read_csv("delivery_time.csv")
# print(pf)

# print(pf.head())

drop_data = ['Delivery Time',
            'Sorting Time' ]

# pf.drop(drop_data, inplace=True, axis = 1)
# print(pf)

# pf.drop(columns=drop_data,inplace=True)
# print(pf)

# print(pf['Delivery Time'].is_unique)

pf = pf.set_index("Delivery Time")
# print(pf.head())

# pf=pf.loc[21.00]
# print(pf)


# pf.get_dtype_counts()
# print(pf)

pf = pf.drop_duplicates()
print(pf)


