package day4;

import java.util.ArrayList;

public class Part1 {

	public static void main(String[] args) {
		int[] nums = { 17, 25, 31, 22, 79, 72, 58, 47, 62, 50, 30, 91, 11, 63, 66, 83, 33, 75, 44, 18, 56, 81, 32, 46,
				93, 13, 41, 65, 14, 95, 19, 38, 8, 35, 52, 7, 12, 70, 84, 23, 4, 42, 90, 60, 6, 40, 97, 16, 27, 86, 5,
				48, 54, 64, 29, 67, 26, 89, 99, 53, 34, 0, 57, 3, 92, 37, 59, 9, 21, 78, 51, 80, 73, 82, 76, 28, 88, 96,
				45, 69, 98, 1, 2, 71, 68, 49, 36, 15, 55, 39, 87, 77, 74, 94, 61, 85, 10, 43, 20, 24 };
		int[][][] mesas = {
				{ { 36, 63, 89, 53, 58 }, { 11, 3, 91, 79, 14 }, { 70, 56, 27, 52, 78 }, { 77, 75, 33, 96, 65 },
						{ 80, 28, 82, 32, 38 } },
				{ { 26, 20, 93, 66, 91 }, { 15, 27, 44, 88, 46 }, { 50, 42, 38, 78, 55 }, { 56, 11, 28, 81, 86 },
						{ 2, 16, 68, 77, 6 } },
				{ { 46, 71, 65, 3, 82 }, { 53, 4, 96, 97, 35 }, { 14, 70, 68, 62, 36 }, { 17, 99, 80, 37, 23 },
						{ 75, 48, 72, 88, 39 } },
				{ { 17, 74, 34, 44, 67 }, { 1, 60, 19, 59, 64 }, { 61, 12, 68, 38, 9 }, { 77, 24, 65, 40, 52 },
						{ 5, 48, 86, 95, 27 } },
				{ { 44, 30, 68, 27, 67 }, { 60, 71, 88, 70, 57 }, { 8, 85, 38, 63, 34 }, { 81, 23, 97, 28, 13 },
						{ 3, 99, 48, 12, 93 } },
				{ { 52, 68, 86, 50, 93 }, { 82, 21, 36, 40, 26 }, { 88, 59, 39, 19, 14 }, { 61, 75, 20, 6, 41 },
						{ 0, 71, 48, 34, 49 } },
				{ { 74, 14, 10, 87, 25 }, { 18, 45, 78, 3, 64 }, { 93, 57, 42, 0, 48 }, { 59, 61, 63, 62, 22 },
						{ 77, 92, 52, 20, 96 } },
				{ { 11, 10, 89, 45, 77 }, { 73, 6, 41, 99, 19 }, { 88, 5, 62, 58, 66 }, { 47, 25, 94, 7, 43 },
						{ 30, 67, 85, 57, 48 } },
				{ { 94, 22, 14, 40, 37 }, { 47, 8, 58, 48, 76 }, { 45, 84, 26, 42, 18 }, { 73, 79, 92, 25, 80 },
						{ 44, 6, 5, 2, 74 } },
				{ { 15, 13, 18, 68, 76 }, { 3, 99, 96, 92, 81 }, { 89, 10, 64, 90, 12 }, { 77, 97, 47, 56, 91 },
						{ 98, 59, 37, 11, 69 } },
				{ { 82, 51, 71, 31, 27 }, { 97, 12, 6, 70, 1 }, { 69, 41, 67, 40, 17 }, { 47, 23, 80, 9, 25 },
						{ 10, 45, 46, 42, 74 } },
				{ { 2, 50, 74, 41, 45 }, { 77, 8, 88, 35, 52 }, { 1, 87, 48, 92, 75 }, { 37, 12, 60, 33, 24 },
						{ 29, 76, 79, 34, 28 } },
				{ { 97, 84, 39, 3, 50 }, { 41, 54, 1, 29, 7 }, { 49, 12, 17, 67, 47 }, { 40, 24, 85, 33, 48 },
						{ 96, 45, 52, 9, 81 } },
				{ { 76, 41, 30, 98, 66 }, { 77, 7, 87, 22, 91 }, { 15, 32, 14, 96, 83 }, { 84, 29, 10, 45, 21 },
						{ 71, 62, 48, 9, 55 } },
				{ { 20, 11, 82, 77, 18 }, { 42, 71, 54, 57, 1 }, { 33, 64, 67, 81, 27 }, { 9, 83, 38, 78, 55 },
						{ 91, 61, 60, 98, 87 } },
				{ { 7, 45, 74, 64, 82 }, { 13, 25, 80, 43, 10 }, { 36, 44, 52, 96, 73 }, { 93, 58, 24, 42, 46 },
						{ 47, 72, 15, 20, 57 } },
				{ { 40, 16, 55, 57, 64 }, { 36, 11, 31, 33, 15 }, { 86, 70, 83, 44, 19 }, { 87, 81, 72, 58, 67 },
						{ 76, 25, 88, 5, 53 } },
				{ { 61, 85, 12, 86, 22 }, { 95, 1, 78, 90, 65 }, { 27, 76, 98, 19, 96 }, { 3, 25, 36, 64, 87 },
						{ 20, 80, 4, 38, 68 } },
				{ { 11, 90, 65, 40, 97 }, { 52, 35, 30, 32, 27 }, { 17, 94, 51, 37, 10 }, { 89, 81, 67, 78, 96 },
						{ 64, 62, 85, 74, 91 } },
				{ { 45, 79, 25, 16, 15 }, { 14, 21, 44, 24, 63 }, { 34, 90, 92, 88, 50 }, { 23, 56, 0, 48, 76 },
						{ 49, 4, 31, 84, 52 } },
				{ { 42, 34, 56, 16, 40 }, { 31, 58, 35, 8, 19 }, { 84, 53, 33, 85, 51 }, { 64, 3, 89, 92, 14 },
						{ 24, 73, 41, 6, 4 } },
				{ { 46, 35, 64, 59, 91 }, { 61, 79, 38, 72, 77 }, { 74, 63, 71, 83, 69 }, { 54, 8, 23, 70, 55 },
						{ 30, 10, 98, 50, 84 } },
				{ { 93, 45, 5, 84, 6 }, { 40, 35, 14, 47, 30 }, { 9, 71, 20, 53, 77 }, { 49, 65, 83, 96, 52 },
						{ 66, 61, 10, 97, 67 } },
				{ { 19, 94, 71, 91, 53 }, { 78, 82, 63, 27, 69 }, { 68, 16, 22, 59, 46 }, { 18, 21, 3, 49, 52 },
						{ 86, 95, 72, 11, 36 } },
				{ { 44, 25, 32, 28, 58 }, { 94, 81, 62, 63, 85 }, { 30, 60, 10, 96, 93 }, { 21, 74, 79, 90, 36 },
						{ 22, 99, 39, 55, 76 } },
				{ { 90, 26, 54, 88, 42 }, { 71, 64, 47, 69, 73 }, { 76, 2, 32, 24, 67 }, { 51, 49, 93, 60, 56 },
						{ 87, 19, 92, 94, 23 } },
				{ { 8, 59, 60, 21, 50 }, { 22, 31, 23, 11, 34 }, { 47, 99, 37, 77, 16 }, { 12, 41, 0, 79, 72 },
						{ 10, 17, 57, 91, 15 } },
				{ { 27, 9, 75, 20, 73 }, { 11, 50, 99, 70, 90 }, { 12, 47, 97, 51, 0 }, { 7, 84, 78, 76, 62 },
						{ 83, 35, 53, 44, 58 } },
				{ { 60, 74, 27, 6, 71 }, { 49, 73, 39, 50, 36 }, { 0, 95, 10, 16, 11 }, { 40, 3, 19, 72, 99 },
						{ 8, 90, 35, 82, 52 } },
				{ { 15, 33, 93, 82, 40 }, { 97, 65, 14, 35, 22 }, { 9, 30, 77, 88, 84 }, { 75, 18, 80, 12, 49 },
						{ 37, 10, 36, 21, 81 } },
				{ { 18, 39, 33, 29, 24 }, { 74, 51, 63, 55, 54 }, { 94, 98, 50, 75, 87 }, { 79, 8, 65, 91, 97 },
						{ 17, 99, 40, 90, 48 } },
				{ { 44, 8, 37, 70, 35 }, { 81, 52, 29, 30, 40 }, { 21, 54, 59, 86, 13 }, { 77, 5, 43, 31, 4 },
						{ 10, 88, 34, 56, 45 } },
				{ { 12, 72, 31, 51, 53 }, { 84, 69, 45, 9, 29 }, { 38, 86, 15, 1, 20 }, { 37, 90, 52, 34, 3 },
						{ 54, 91, 59, 63, 56 } },
				{ { 43, 94, 25, 22, 91 }, { 46, 87, 0, 27, 68 }, { 86, 90, 17, 76, 2 }, { 35, 39, 84, 26, 14 },
						{ 73, 95, 54, 63, 37 } },
				{ { 67, 98, 74, 57, 29 }, { 63, 78, 86, 94, 13 }, { 20, 4, 46, 81, 83 }, { 21, 51, 12, 33, 37 },
						{ 27, 82, 56, 11, 40 } },
				{ { 11, 52, 54, 21, 6 }, { 87, 97, 37, 67, 35 }, { 71, 91, 72, 80, 49 }, { 33, 79, 55, 51, 68 },
						{ 64, 24, 0, 10, 18 } },
				{ { 27, 99, 59, 56, 13 }, { 7, 97, 92, 74, 36 }, { 95, 67, 32, 42, 79 }, { 81, 65, 43, 75, 78 },
						{ 93, 72, 50, 41, 23 } },
				{ { 94, 5, 44, 22, 52 }, { 9, 80, 54, 98, 34 }, { 47, 86, 17, 84, 0 }, { 30, 55, 74, 7, 97 },
						{ 85, 11, 36, 88, 73 } },
				{ { 10, 98, 46, 71, 97 }, { 70, 41, 8, 11, 90 }, { 26, 77, 22, 57, 50 }, { 89, 64, 5, 20, 95 },
						{ 28, 38, 29, 31, 51 } },
				{ { 26, 80, 43, 2, 34 }, { 23, 97, 72, 21, 81 }, { 73, 68, 47, 50, 90 }, { 25, 7, 49, 82, 18 },
						{ 11, 27, 93, 66, 48 } },
				{ { 79, 28, 57, 15, 72 }, { 61, 44, 14, 27, 71 }, { 33, 30, 35, 34, 64 }, { 42, 99, 60, 13, 76 },
						{ 50, 88, 31, 19, 21 } },
				{ { 80, 79, 90, 52, 63 }, { 73, 1, 85, 44, 98 }, { 78, 76, 48, 51, 25 }, { 18, 42, 81, 53, 24 },
						{ 28, 58, 61, 39, 70 } },
				{ { 22, 55, 49, 37, 2 }, { 63, 48, 52, 69, 91 }, { 35, 85, 40, 98, 7 }, { 31, 65, 74, 79, 41 },
						{ 11, 68, 97, 67, 16 } },
				{ { 28, 56, 63, 61, 58 }, { 43, 88, 55, 60, 12 }, { 21, 77, 79, 23, 99 }, { 66, 37, 94, 45, 47 },
						{ 67, 41, 62, 87, 73 } },
				{ { 2, 65, 76, 50, 17 }, { 21, 47, 13, 53, 1 }, { 26, 71, 40, 28, 14 }, { 27, 85, 56, 97, 74 },
						{ 42, 4, 29, 90, 48 } },
				{ { 4, 90, 92, 54, 75 }, { 98, 88, 80, 18, 37 }, { 39, 87, 95, 70, 28 }, { 40, 86, 99, 34, 78 },
						{ 11, 13, 51, 38, 46 } },
				{ { 7, 26, 55, 19, 25 }, { 11, 69, 48, 37, 43 }, { 73, 61, 14, 15, 90 }, { 51, 91, 94, 54, 16 },
						{ 47, 57, 82, 65, 81 } },
				{ { 50, 99, 5, 71, 8 }, { 30, 32, 27, 54, 75 }, { 78, 91, 11, 29, 65 }, { 7, 13, 92, 20, 9 },
						{ 61, 21, 73, 12, 39 } },
				{ { 84, 64, 8, 44, 57 }, { 13, 6, 72, 32, 81 }, { 22, 21, 67, 20, 49 }, { 90, 3, 61, 25, 98 },
						{ 7, 23, 62, 45, 77 } },
				{ { 12, 85, 90, 26, 78 }, { 9, 0, 67, 88, 63 }, { 53, 70, 48, 51, 61 }, { 94, 35, 79, 2, 36 },
						{ 8, 82, 54, 46, 29 } },
				{ { 86, 67, 79, 64, 34 }, { 27, 61, 97, 85, 65 }, { 13, 39, 40, 33, 24 }, { 55, 1, 42, 31, 54 },
						{ 37, 66, 7, 46, 50 } },
				{ { 8, 31, 9, 34, 40 }, { 58, 66, 27, 14, 79 }, { 80, 45, 64, 10, 60 }, { 35, 36, 16, 57, 61 },
						{ 47, 54, 5, 85, 3, } },
				{ { 49, 34, 88, 7, 29 }, { 31, 65, 28, 94, 66 }, { 2, 14, 45, 24, 70 }, { 25, 54, 3, 1, 96 },
						{ 9, 61, 76, 86, 50 } },
				{ { 72, 8, 39, 26, 71 }, { 35, 86, 80, 76, 5 }, { 31, 4, 43, 44, 51 }, { 84, 17, 11, 20, 65 },
						{ 37, 46, 3, 95, 32 } },
				{ { 98, 94, 44, 86, 20 }, { 33, 49, 18, 74, 57 }, { 8, 27, 82, 2, 25 }, { 41, 95, 0, 59, 87 },
						{ 75, 72, 90, 45, 42 } },
				{ { 64, 70, 59, 87, 56 }, { 72, 2, 49, 92, 95 }, { 33, 68, 19, 85, 88 }, { 23, 97, 35, 34, 66 },
						{ 96, 69, 10, 90, 94 } },
				{ { 97, 32, 45, 26, 95 }, { 23, 19, 38, 82, 76 }, { 75, 69, 61, 30, 5 }, { 47, 29, 4, 16, 67 },
						{ 43, 94, 40, 2, 83 } },
				{ { 4, 52, 97, 8, 88 }, { 75, 38, 17, 16, 64 }, { 91, 47, 6, 12, 32 }, { 82, 49, 90, 73, 99 },
						{ 23, 46, 59, 85, 11 } },
				{ { 2, 45, 76, 51, 19 }, { 61, 57, 99, 8, 47 }, { 15, 43, 34, 18, 97 }, { 7, 46, 14, 81, 29 },
						{ 37, 92, 9, 50, 26 } },
				{ { 70, 25, 87, 51, 29 }, { 61, 69, 11, 89, 98 }, { 79, 78, 95, 39, 43 }, { 67, 4, 68, 66, 64 },
						{ 17, 24, 91, 80, 86 } },
				{ { 95, 44, 34, 84, 2 }, { 40, 0, 88, 16, 81 }, { 97, 64, 20, 96, 72 }, { 32, 45, 86, 78, 69 },
						{ 48, 83, 31, 65, 43 } },
				{ { 98, 53, 56, 29, 16 }, { 88, 72, 38, 99, 59 }, { 93, 68, 36, 76, 71 }, { 3, 81, 87, 28, 21 },
						{ 10, 62, 27, 23, 92 } },
				{ { 95, 71, 63, 11, 55 }, { 17, 61, 65, 16, 56 }, { 8, 5, 25, 93, 36 }, { 7, 90, 45, 34, 91 },
						{ 46, 38, 22, 14, 49 } },
				{ { 61, 60, 35, 74, 84 }, { 36, 51, 97, 34, 68 }, { 9, 57, 75, 19, 98 }, { 12, 41, 20, 14, 62 },
						{ 40, 87, 21, 95, 0 } },
				{ { 3, 30, 20, 59, 28 }, { 5, 79, 9, 98, 73 }, { 57, 94, 13, 17, 18 }, { 40, 86, 27, 12, 97 },
						{ 61, 84, 34, 14, 75 } },
				{ { 3, 65, 51, 22, 31 }, { 86, 97, 16, 83, 72 }, { 99, 26, 70, 50, 28 }, { 48, 82, 7, 78, 21 },
						{ 2, 79, 89, 32, 60 } },
				{ { 67, 21, 52, 6, 80 }, { 27, 4, 3, 40, 75 }, { 78, 20, 36, 46, 54 }, { 91, 42, 17, 39, 96 },
						{ 14, 62, 18, 63, 99 } },
				{ { 89, 5, 91, 72, 46 }, { 77, 55, 70, 42, 95 }, { 18, 14, 85, 80, 37 }, { 59, 52, 16, 81, 23 },
						{ 99, 12, 24, 76, 11 } },
				{ { 48, 16, 57, 43, 80 }, { 66, 76, 74, 31, 71 }, { 23, 81, 68, 53, 85 }, { 26, 10, 67, 94, 0 },
						{ 15, 49, 98, 86, 33 } },
				{ { 95, 38, 44, 74, 33 }, { 69, 88, 10, 81, 13 }, { 45, 62, 91, 64, 89 }, { 80, 28, 39, 63, 53 },
						{ 35, 1, 31, 98, 56 } },
				{ { 85, 93, 15, 5, 94 }, { 22, 9, 40, 84, 18 }, { 55, 58, 2, 77, 16 }, { 95, 11, 28, 48, 12 },
						{ 44, 27, 87, 42, 79 } },
				{ { 69, 45, 33, 94, 90 }, { 74, 56, 73, 51, 10 }, { 75, 60, 49, 24, 89 }, { 16, 81, 14, 38, 6 },
						{ 77, 68, 92, 15, 32 } },
				{ { 15, 7, 31, 13, 3 }, { 86, 33, 55, 35, 37 }, { 73, 47, 87, 8, 98 }, { 20, 36, 22, 77, 52 },
						{ 71, 96, 14, 89, 34 } },
				{ { 92, 19, 93, 48, 36 }, { 79, 3, 41, 88, 38 }, { 95, 5, 81, 57, 42 }, { 74, 73, 78, 82, 4 },
						{ 85, 67, 77, 15, 69 } },
				{ { 87, 18, 0, 44, 75 }, { 36, 47, 63, 1, 96 }, { 38, 41, 59, 37, 42 }, { 65, 66, 54, 81, 4 },
						{ 91, 35, 10, 48, 25 } },
				{ { 14, 35, 99, 4, 46 }, { 19, 38, 7, 12, 40 }, { 63, 84, 70, 86, 60 }, { 8, 66, 74, 65, 31 },
						{ 36, 42, 6, 22, 80 } },
				{ { 38, 21, 61, 71, 46 }, { 29, 6, 25, 67, 52 }, { 26, 15, 86, 74, 30 }, { 65, 77, 12, 59, 19 },
						{ 85, 14, 35, 42, 93 } },
				{ { 10, 15, 58, 98, 64 }, { 61, 27, 24, 39, 35 }, { 18, 20, 28, 59, 60 }, { 67, 62, 45, 3, 68 },
						{ 26, 38, 90, 92, 19 } },
				{ { 34, 2, 72, 60, 23 }, { 44, 63, 92, 8, 7 }, { 11, 5, 0, 80, 75 }, { 25, 94, 27, 48, 70 },
						{ 56, 76, 84, 90, 47 } },
				{ { 78, 31, 64, 29, 93 }, { 18, 66, 99, 97, 79 }, { 19, 95, 57, 51, 23 }, { 34, 9, 94, 45, 84 },
						{ 39, 36, 75, 47, 24 } },
				{ { 72, 41, 34, 55, 85 }, { 23, 67, 58, 37, 8 }, { 78, 31, 50, 81, 48 }, { 90, 4, 46, 63, 28 },
						{ 21, 57, 74, 45, 12 } },
				{ { 18, 67, 51, 8, 93 }, { 30, 47, 14, 46, 25 }, { 28, 41, 92, 69, 58 }, { 50, 45, 6, 84, 26 },
						{ 81, 59, 68, 13, 75 } },
				{ { 76, 3, 34, 9, 81 }, { 16, 7, 97, 67, 5 }, { 78, 28, 42, 49, 29 }, { 36, 73, 23, 83, 85 },
						{ 18, 41, 8, 64, 79 } },
				{ { 3, 91, 44, 41, 73 }, { 35, 96, 32, 13, 27 }, { 80, 77, 4, 28, 34 }, { 53, 52, 60, 39, 71 },
						{ 5, 69, 26, 64, 92 } },
				{ { 72, 32, 96, 13, 23 }, { 4, 36, 56, 20, 25 }, { 77, 70, 69, 24, 83 }, { 80, 47, 2, 81, 89 },
						{ 29, 79, 90, 67, 91 } },
				{ { 32, 5, 56, 37, 63 }, { 46, 98, 89, 2, 52 }, { 88, 15, 90, 82, 49 }, { 81, 72, 21, 93, 19 },
						{ 75, 31, 16, 18, 41 } },
				{ { 52, 29, 27, 62, 23 }, { 51, 37, 34, 64, 46 }, { 76, 32, 21, 8, 67 }, { 91, 43, 72, 73, 96 },
						{ 33, 42, 87, 41, 85 } },
				{ { 82, 71, 25, 41, 63 }, { 19, 27, 96, 11, 17 }, { 5, 92, 40, 26, 1 }, { 88, 48, 56, 58, 0 },
						{ 54, 16, 37, 95, 24 } },
				{ { 46, 55, 0, 52, 16 }, { 36, 50, 20, 22, 2 }, { 85, 94, 24, 3, 1 }, { 78, 9, 68, 84, 66 },
						{ 32, 57, 28, 17, 69 } },
				{ { 14, 9, 25, 73, 39 }, { 87, 64, 92, 33, 2 }, { 83, 77, 5, 74, 59 }, { 79, 49, 62, 6, 71 },
						{ 36, 24, 91, 65, 50 } },
				{ { 99, 50, 91, 18, 76 }, { 0, 27, 80, 78, 28 }, { 48, 92, 54, 55, 53 }, { 98, 8, 42, 19, 6 },
						{ 45, 73, 57, 36, 7 } },
				{ { 29, 40, 44, 41, 26 }, { 68, 32, 53, 56, 13 }, { 27, 79, 57, 66, 83 }, { 95, 60, 6, 30, 23 },
						{ 47, 2, 25, 77, 51 } },
				{ { 7, 81, 77, 65, 1 }, { 76, 15, 79, 29, 6 }, { 59, 48, 32, 95, 13 }, { 44, 8, 61, 35, 9 },
						{ 22, 47, 39, 45, 3 } },
				{ { 3, 49, 2, 44, 14 }, { 52, 80, 71, 24, 17 }, { 93, 40, 41, 15, 7 }, { 20, 66, 1, 83, 56 },
						{ 70, 53, 13, 0, 63 } },
				{ { 77, 62, 28, 49, 41 }, { 12, 63, 4, 65, 74 }, { 99, 98, 22, 96, 46 }, { 19, 56, 68, 84, 60 },
						{ 21, 66, 55, 57, 53 } },
				{ { 64, 55, 92, 75, 57 }, { 7, 68, 0, 28, 73 }, { 16, 21, 79, 51, 84 }, { 8, 43, 35, 87, 18 },
						{ 38, 99, 96, 53, 3 } },
				{ { 95, 46, 80, 65, 94 }, { 90, 12, 10, 69, 4 }, { 17, 23, 68, 49, 39 }, { 40, 91, 9, 27, 97 },
						{ 51, 38, 93, 66, 31 } },
				{ { 4, 26, 21, 22, 92 }, { 64, 88, 48, 90, 2 }, { 39, 10, 7, 16, 71 }, { 3, 96, 78, 15, 70 },
						{ 33, 54, 50, 72, 68 } },
				{ { 42, 97, 19, 48, 33 }, { 26, 94, 24, 34, 81 }, { 72, 80, 90, 50, 66 }, { 54, 47, 78, 98, 38 },
						{ 41, 63, 6, 89, 10 } },
				{ { 65, 54, 10, 21, 3 }, { 24, 35, 75, 78, 48 }, { 23, 76, 99, 17, 72 }, { 1, 71, 91, 18, 7 },
						{ 19, 49, 97, 81, 96 } } };

//		int[] prueba1 = { 7, 4, 9, 5, 11, 17, 23, 2, 0, 14, 21, 24, 10, 16, 13, 6, 15, 25, 12, 22, 18, 20, 8, 19, 3, 26,
//				1 };
//		int[][][] prueba2 = {
//				{ { 22, 8, 21, 6, 1 }, { 13, 2, 9, 10, 12 }, { 17, 23, 14, 3, 20 }, { 11, 4, 16, 18, 15 },
//						{ 0, 24, 7, 5, 19 } },
//				{ { 3, 9, 19, 20, 14 }, { 15, 18, 8, 11, 21 }, { 0, 13, 7, 10, 16 }, { 2, 17, 25, 24, 12 },
//						{ 22, 5, 23, 4, 6 } },
//				{ { 14, 10, 18, 22, 2 }, { 21, 16, 8, 11, 0 }, { 17, 15, 23, 13, 12 }, { 24, 9, 26, 6, 3 },
//						{ 4, 19, 20, 5, 7 } } };
		// 8442
		
		ArrayList<Integer> numsGanador = new ArrayList<Integer>();
		int[] numeros = nums.clone();
		int[][][] copia = mesas.clone();
		int cont = 0, sushi = 0, elGanador = 0, ultNum = 0, suma = 0;
		boolean ganador = false;

		while (!ganador) {
			for (int i = 0; i < copia.length; i++) {
				for (int j = 0; j < copia[i].length; j++) {
					for (int k = 0; k < copia[i][j].length; k++) {
						if (numeros[sushi] == copia[i][j][k]) {
							ultNum = copia[i][j][k];
							copia[i][j][k] = -1;
						}
					}
				}
				for (int j = 0; j < copia[i].length; j++) {
					for (int k = 0; k < copia[i][j].length; k++) {
						if (copia[i][j][k] == -1) {
							cont++;
						}
					}
					if (cont == 5) {
						elGanador = i;
						ganador = true;
					} else {
						cont = 0;
					}
				}
				for (int j = 0; j < copia[i].length; j++) {
					for (int k = 0; k < copia[i][j].length; k++) {
						if (copia[i][k][j] == -1) {
							cont++;
						}
					}
					if (cont == 5) {
						elGanador = i;
						ganador = true;
					} else {
						cont = 0;
					}
				}

			}
			sushi++;
		}
		if (ganador) {
				for (int j = 0; j < copia[0].length; j++) {
					for (int k = 0; k < copia[0][j].length; k++) {
						if (copia[elGanador][j][k] != -1) {
							suma += copia[elGanador][j][k];
						}
					}
				}
		}
		for (int i = 0; i < copia.length; i++) {
			for (int j = 0; j < copia[i].length; j++) {
				for (int k = 0; k < copia[i][j].length; k++) {
					System.out.print(copia[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
		System.out.println(ganador + " " + (elGanador + 1) + " " + ultNum * suma);
	}

}
