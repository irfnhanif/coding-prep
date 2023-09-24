difficulty = input("Difficulty: ")
problem_name = input("Problem name: ")
file_name = difficulty + " " + problem_name
converted_file_name = file_name.lower().replace(" ", "_")

file = open(converted_file_name + ".py", "w+")
file.write("New Hackerrank problem, Fight!")