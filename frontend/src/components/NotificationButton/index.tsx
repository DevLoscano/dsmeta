import icon from '../../assets/img/nortification-icon.svg'
import './styles.css'

function NotificationButton() {
  return (
    <div className="dsmeta-red-btn">
      <img src={icon} alt="Nortificar" />
    </div>
  )
}

export default NotificationButton