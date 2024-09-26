num=11;
// 変数numの値を出力する（確認用)
console.log(num);


if(num>=1 && num % 3 ===0 && num % 5 ===0){
    console.log('3と5の倍数です');
}
else if(num>=1 && num % 3 ===0){
    console.log('3の倍数です');
}

else if(num>=1 && num % 5 ===0){
    console.log('5の倍数です');
}


else{
    console.log(num);
}