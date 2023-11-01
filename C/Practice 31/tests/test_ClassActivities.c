//#include <stdio.h>
//#include <check.h>
//
//
//// La función que se va a probar
//int sum(int a, int b) {
//    return a + b;
//}
//
//// test_sum.c
//
//START_TEST(test_sum_positive_numbers) {
//        ck_assert_int_eq(sum(2, 3), 5);
//}
//END_TEST
//
//START_TEST(test_sum_negative_numbers) {
//    ck_assert_int_eq(sum(-1, 1), 0);
//}
//END_TEST
//
//START_TEST(test_sum_zero) {
//    ck_assert_int_eq(sum(0, 0), 0);
//}
//END_TEST
//
//int main(void) {
//    Suite *s;
//    SRunner *runner;
//    int number_failed;
//
//    s = suite_create("Sum");
//    TCase *tc_core = tcase_create("Core");
//    tcase_add_test(tc_core, test_sum_positive_numbers);
//    tcase_add_test(tc_core, test_sum_negative_numbers);
//    tcase_add_test(tc_core, test_sum_zero);
//    suite_add_tcase(s, tc_core);
//
//    runner = srunner_create(s);
//    srunner_run_all(runner, CK_NORMAL);
//    number_failed = srunner_ntests_failed(runner);
//    srunner_free(runner);
//
//    return (number_failed == 0) ? 0 : 1;
//}
