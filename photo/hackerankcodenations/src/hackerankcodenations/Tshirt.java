package hackerankcodenations;

import java.io.*;
import java.util.*;

public class Tshirt {

	// Complete the solve function below.
	static String solve(List<List<Integer>> grid) {

		String yes = "No";

		List list1 = grid.get(0);
		int x1 = (int) list1.get(0);
		int y1 = (int) list1.get(1);

		List list2 = grid.get(1);
		int x2 = (int) list2.get(0);
		int y2 = (int) list2.get(1);

		List list3 = grid.get(2);
		int x3 = (int) list3.get(0);
		int y3 = (int) list3.get(1);

		List list4 = grid.get(3);
		int x4 = (int) list4.get(0);
		int y4 = (int) list4.get(1);

		List list5 = grid.get(4);
		int x5 = (int) list5.get(0);
		int y5 = (int) list5.get(1);
		if (x1 == x2 && x2 == x3) {
			if (x1 == y1 || x2 == y2 || x3 == y3) {
				if (y4 == x4) {
					if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || y5 == x1 || y5 == y2 || y5 == y3 || y5 == y4) {
						if (x5 > y5) {
							if ((x5 - y5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y5 - x5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else if (y5 == x5) {
					if (x4 == x1 || x4 == x2 || x4 == x3 || x5 == x4 || x4 == y1 || y4 == y2 || y4 == y3 || y5 == y4) {
						if (x4 > y4) {
							if ((x4 - y4) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y4 - x4) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}
			} else {

				int a[] = new int[3];
				a[0] = y2;
				a[1] = y3;
				a[2] = y4;
				Arrays.sort(a);
				if (a[2] - a[1] == a[1] - a[0]) {
					if (x4 == y4 || x5 == y5) {

						if (y4 == x4) {
							if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || y5 == x1 || y5 == y2 || y5 == y3
									|| y5 == y4) {
								if (x5 > y5) {
									if ((x5 - y5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y5 - x5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else if (y5 == x5) {
							if (x4 == x1 || x4 == x2 || x4 == x3 || x5 == x4 || x4 == y1 || y4 == y2 || y4 == y3
									|| y5 == y4) {
								if (x4 > y4) {
									if ((x4 - y4) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y4 - x4) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else {
							yes = "No";
						}

					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			}
		} else if (x2 == x3 && x3 == x4) {
			if (x2 == y2 || x3 == y3 || x4 == y4) {

				if (y1 == x1) {

					if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == y1 || y5 == y2 || y5 == y3 || y5 == y4) {
						if (x5 > y5) {
							if ((x5 - y5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y5 - x5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				} else if (y5 == x5) {
					if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || x1 == y2 || y1 == y3 || y1 == y4 || y1 == y5) {
						if (x1 > y1) {
							if ((x1 - y1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y1 - x1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			} else {
				int a[] = new int[3];
				a[0] = y2;
				a[1] = y3;
				a[2] = y4;
				Arrays.sort(a);
				if (a[2] - a[1] == a[1] - a[0]) {
					if (x1 == y1 || y5 == x5) {

						if (y1 == x1) {

							if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == y1 || y5 == y2 || y5 == y3
									|| y5 == y4) {
								if (x5 > y5) {
									if ((x5 - y5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y5 - x5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						} else if (y5 == x5) {
							if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || x1 == y2 || y1 == y3 || y1 == y4
									|| y1 == y5) {
								if (x1 > y1) {
									if ((x1 - y1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y1 - x1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else {
							yes = "No";
						}

					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			}
		} else if (x3 == x4 && x4 == x5) {
			if (x3 == y3 || x4 == y4 || x5 == y5) {
				if (y1 == x1) {

					if (x2 == x1 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == y1 || y2 == y3 || y2 == y4 || y2 == y5) {
						if (x2 > y2) {
							if ((x2 - y2) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y2 - x2) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				} else if (x2 == y2) {

					if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || y1 == y2 || y1 == x3 || y1 == y4 || y1 == y5) {
						if (x1 > y1) {
							if ((x1 - y1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y1 - x1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				}
			} else {
				int a[] = new int[3];
				a[0] = y2;
				a[1] = y3;
				a[2] = y4;
				Arrays.sort(a);
				if (a[2] - a[1] == a[2] - a[0]) {
					if (x1 == y1 || y2 == x2) {

						if (y1 == x1) {

							if (x2 == x1 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == y1 || y2 == y3 || y2 == y4
									|| y2 == y5) {
								if (x2 > y2) {
									if ((x2 - y2) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y2 - x2) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						} else if (x2 == y2) {

							if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || y1 == y2 || y1 == x3 || y1 == y4
									|| y1 == y5) {
								if (x1 > y1) {
									if ((x1 - y1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y1 - x1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						}

					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			}
		} else if (y3 == y4 && y4 == y5) {
			if (x3 == y3 || x4 == y4 || x5 == y5) {
				if (y1 == x1) {

					if (x2 == x1 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == y1 || y2 == y3 || y2 == y4 || y2 == y5) {
						if (x2 > y2) {
							if ((x2 - y2) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y2 - x2) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				} else if (x2 == y2) {

					if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || y1 == y2 || y1 == x3 || y1 == y4 || y1 == y5) {
						if (x1 > y1) {
							if ((x1 - y1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y1 - x1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				}
			} else {
				int a[] = new int[3];
				a[0] = y2;
				a[1] = y3;
				a[2] = y4;
				Arrays.sort(a);
				if (a[2] - a[1] == a[1] - a[0]) {
					if (x1 == y1 || y2 == x2) {

						if (y1 == x1) {

							if (x2 == x1 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == y1 || y2 == y3 || y2 == y4
									|| y2 == y5) {
								if (x2 > y2) {
									if ((x2 - y2) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y2 - x2) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						} else if (x2 == y2) {

							if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || y1 == y2 || y1 == x3 || y1 == y4
									|| y1 == y5) {
								if (x1 > y1) {
									if ((x1 - y1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y1 - x1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						}

					} else {
						yes = "No";

					}
				} else {
					yes = "No";
				}

			}
		} else if (y2 == y3 && y3 == y4) {

			if (x2 == y2 || x3 == y3 || x4 == y4) {

				if (y1 == x1) {

					if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == y1 || y5 == y2 || y5 == y3 || y5 == y4) {
						if (x5 > y5) {
							if ((x5 - y5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y5 - x5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}

				} else if (y5 == x5) {
					if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || x1 == y2 || y1 == y3 || y1 == y4 || y1 == y5) {
						if (x1 > y1) {
							if ((x1 - y1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y1 - x1) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			} else {
				int a[] = new int[3];
				a[0] = x2;
				a[1] = x3;
				a[2] = x4;
				Arrays.sort(a);
				if (a[2] - a[1] == a[1] - a[0]) {
					if (x1 == y1 || y5 == x5) {

						if (y1 == x1) {

							if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == y1 || y5 == y2 || y5 == y3
									|| y5 == y4) {
								if (x5 > y5) {
									if ((x5 - y5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y5 - x5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}

						} else if (y5 == x5) {
							if (x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || x1 == y2 || y1 == y3 || y1 == y4
									|| y1 == y5) {
								if (x1 > y1) {
									if ((x1 - y1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y1 - x1) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else {
							yes = "No";
						}

					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			}
		} else if (y1 == y2 && y2 == y3) {
			if (x1 == y1 || x2 == y2 || x3 == y3) {
				if (y4 == x4) {
					if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || y5 == x1 || y5 == y2 || y5 == y3 || y5 == y4) {
						if (x5 > y5) {
							if ((x5 - y5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y5 - x5) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else if (y5 == x5) {
					if (x4 == x1 || x4 == x2 || x4 == x3 || x5 == x4 || x4 == y1 || y4 == y2 || y4 == y3 || y5 == y4) {
						if (x4 > y4) {
							if ((x4 - y4) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						} else {
							if ((y4 - x4) <= 2) {
								yes = "Yes";
							} else {
								yes = "No";
							}
						}
					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}
			} else {
				int a[] = new int[3];
				a[0] = x1;
				a[1] = x2;
				a[2] = x3;
				Arrays.sort(a);
				if (a[2] - a[1] == a[1] - a[0]) {
					if (y4 == x4 || x5 == y5) {

						if (y4 == x4) {
							if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || y5 == x1 || y5 == y2 || y5 == y3
									|| y5 == y4) {
								if (x5 > y5) {
									if ((x5 - y5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y5 - x5) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else if (y5 == x5) {
							if (x4 == x1 || x4 == x2 || x4 == x3 || x5 == x4 || x4 == y1 || y4 == y2 || y4 == y3
									|| y5 == y4) {
								if (x4 > y4) {
									if ((x4 - y4) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								} else {
									if ((y4 - x4) <= 2) {
										yes = "Yes";
									} else {
										yes = "No";
									}
								}
							} else {
								yes = "No";
							}
						} else {
							yes = "No";
						}

					} else {
						yes = "No";
					}
				} else {
					yes = "No";
				}

			}
		}

		return yes;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		for (int tItr = 0; tItr < t; tItr++) {
			List<List<Integer>> points = new ArrayList<>();

			for (int i = 0; i < 5; i++) {
				String[] pointsRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				List<Integer> pointsRowItems = new ArrayList<>();

				for (int j = 0; j < 2; j++) {
					int pointsItem = Integer.parseInt(pointsRowTempItems[j]);
					pointsRowItems.add(pointsItem);
				}

				points.add(pointsRowItems);
			}

			String result = solve(points);
			System.out.println(result);

		}

		bufferedReader.close();
	}
}
