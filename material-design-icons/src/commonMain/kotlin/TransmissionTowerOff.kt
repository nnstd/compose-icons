package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransmissionTowerOff: ImageVector
    get() {
        if (_TransmissionTowerOff != null) {
            return _TransmissionTowerOff!!
        }
        _TransmissionTowerOff = ImageVector.Builder(
            name = "TransmissionTowerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(6.1f, 8f)
                horizontalLineTo(5.4f)
                lineTo(4.1f, 10.5f)
                lineTo(5.9f, 11.4f)
                lineTo(6.6f, 10f)
                horizontalLineTo(8.1f)
                lineTo(9.1f, 11f)
                lineTo(6.2f, 22f)
                horizontalLineTo(8.3f)
                lineTo(8.5f, 21.1f)
                lineTo(12f, 15.9f)
                lineTo(15.5f, 21.1f)
                lineTo(15.7f, 22f)
                horizontalLineTo(17.8f)
                lineTo(17f, 18.8f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(9.3f, 18.1f)
                lineTo(10.5f, 13.6f)
                lineTo(11.4f, 14.9f)
                lineTo(9.3f, 18.1f)
                moveTo(14.7f, 18.1f)
                lineTo(12.6f, 15f)
                lineTo(12.8f, 14.7f)
                lineTo(14.1f, 16f)
                lineTo(14.7f, 18.1f)
                moveTo(14.2f, 11f)
                horizontalLineTo(14.9f)
                lineTo(15.1f, 11.9f)
                lineTo(14.2f, 11f)
                moveTo(14.1f, 8f)
                horizontalLineTo(18.6f)
                lineTo(19.9f, 10.6f)
                lineTo(18.1f, 11.5f)
                lineTo(17.4f, 10f)
                horizontalLineTo(13.2f)
                lineTo(10.2f, 7f)
                lineTo(10.7f, 5f)
                horizontalLineTo(13.3f)
                lineTo(14.1f, 8f)
                moveTo(8.4f, 5.2f)
                lineTo(6.9f, 3.7f)
                lineTo(7.8f, 2f)
                horizontalLineTo(16.3f)
                lineTo(17.6f, 4.5f)
                lineTo(15.8f, 5.4f)
                lineTo(15f, 4f)
                horizontalLineTo(9f)
                lineTo(8.4f, 5.2f)
                close()
            }
        }.build()

        return _TransmissionTowerOff!!
    }

@Suppress("ObjectPropertyName")
private var _TransmissionTowerOff: ImageVector? = null
