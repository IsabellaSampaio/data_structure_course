class Solution:
	#First solution
	#Time complexity is O(n^2) bc we have nested fors (2 of them executing n time wich makes n*n = n^2)
	#Space complexity is O(1) bc we're only creating one variable 'soma' 
	#Can be a little bit slow and not the best solution because the time is O(n^2)

	def sumOn2(self, nums: list[int], target: int) -> list[int]:
	
		for i in range(len(nums)):
			for j in range(len(nums)):
				soma = nums[i] + nums[j]
		if soma == target:
			print(soma)
			print(i)
			print(j)
		else:
			print("target not found")

	#Second solution
	#Time complexity is O(n) bc we only have one for loop that is executing n times
	#Space complexity is O(1) bc we're creating onde variable (constant) and then one list

	def sum(self, nums: list[int], target: int) -> list[int]:
		
		soma = 0
		index = []

		for i in range(0, len(nums)-1):
			soma = nums[i] + nums[i+1]
			if soma == target:
				index.append(i)
				index.append(i + 1)

		return print(index)

solution = Solution()
nums1 = [1, 2, 3, 9]
nums2 = [1, 2, 4, 4]
target = 8
result = solution.sumOn2(nums1, target)
result2 = solution.sum(nums2, target)