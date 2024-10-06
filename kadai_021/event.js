//btnというidを持つHTML要素を取得し、定数に代入する
const btn = document.getElementById('btn');
const text =document.getElementById('text');
//HTML要素がクリックされたときにイベントの処理を実行する
btn.addEventListener('click',()=>{
    setTimeout(()=>{
        text.textContent="ボタンをクリックしました";
    },2000);
    
});