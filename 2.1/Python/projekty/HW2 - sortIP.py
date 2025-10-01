dict_ip_attempts = {"180.237.210.112": 9,
         "180.237.210.30": 5,
         "180.237.210.13": 2,
         "180.237.210.54": 10}



print(dict(sorted(dict_ip_attempts.items(), key=lambda item: item[1])))
