def breakingRecords(scores):
    highest_score = scores[0]
    lowest_score = scores[0]
    count_highest = 0
    count_lowest = 0

    for score in scores:
        if score > highest_score:
            highest_score = score
            count_highest += 1
        if score < lowest_score:
            lowest_score = score
            count_lowest += 1

    return [count_highest, count_lowest]

print(breakingRecords([3, 4, 21, 36, 10, 28, 35, 5, 24, 42]))