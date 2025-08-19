def maximumWealth(accounts):
    max_wealth = sum(accounts[0])

    for account in accounts:
        if sum(account) > max_wealth:
            max_wealth = sum(account)
    
    return max_wealth