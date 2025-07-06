package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EthernetCableOff: ImageVector
    get() {
        if (_EthernetCableOff != null) {
            return _EthernetCableOff!!
        }
        _EthernetCableOff = ImageVector.Builder(
            name = "EthernetCableOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(8f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(12.82f)
                lineTo(8f, 6.18f)
                verticalLineTo(4f)
                moveTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(14f, 17.27f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(13.27f)
                lineTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                close()
            }
        }.build()

        return _EthernetCableOff!!
    }

@Suppress("ObjectPropertyName")
private var _EthernetCableOff: ImageVector? = null
