def numUniqueEmails(emails):
    diff_email_addr = set()

    for email in emails:
        local, domain = email.split('@')
        local = local.split('+')[0].replace('.', '')
        diff_email_addr.add(f"{local}@{domain}")
    
    return diff_email_addr

print(numUniqueEmails(["test.email+alex@leetcode.com","test.email.leet+alex@code.com"]))
        