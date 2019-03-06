def conversion(v) :
	upperCase = False
	result = ''
	for c in v :
		if c >= 'A' and c <= 'Z' :
			upperCase = True
			break
	if v.find('_') > 0 and upperCase :
		print('Error')
		return
	for i in range(len(v)) :
		if (v[i]>='A' and v[i]<='Z') and (i > 0 and v[i-1]!='_') :
			result = result + '_' + v[i].lower()
		elif v[i]=='_' :
			result = result + v[i]
			v = v[:i+1] + v[i+1].upper() + v[i+2:]
		else :
			result = result + v[i]
	if upperCase == False :
		result = result.replace("_","")
	print(result)

conversion("job_Log")
conversion("jobLog")
conversion("long_and_mnemonic_identifier")
