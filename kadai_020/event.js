//btnというidを持つHTML要素を取得し、定数に代入する
const btn = document.getElementById('btn');
const text =document.getElementById('text');
//HTML要素がクリックされたときにイベントの処理を実行する
btn.addEventListener('click',()=>{
    const childlist=document.createElement('li');
    childlist.textContent='ボタンをクリックしました';
    //繰り返し処理でチェックボックスを一つずつ取り出し、もし選択されていれば、”ボタンをクリックしました”に表示変更
    text.appendChild(childlist);
    text.textContent="ボタンをクリックしました"
});