package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EthernetOff: ImageVector
    get() {
        if (_EthernetOff != null) {
            return _EthernetOff!!
        }
        _EthernetOff = ImageVector.Builder(
            name = "EthernetOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.32f, 4.21f)
                curveTo(2.12f, 4.56f, 2f, 4.95f, 2f, 5.38f)
                verticalLineTo(19.63f)
                curveTo(2f, 20.94f, 3.06f, 22f, 4.38f, 22f)
                horizontalLineTo(19.63f)
                curveTo(19.78f, 22f, 19.92f, 22f, 20.07f, 21.96f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(15f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7.11f)
                lineTo(15f, 16.89f)
                verticalLineTo(18f)
                moveTo(9.2f, 6f)
                lineTo(6.2f, 3f)
                horizontalLineTo(19.63f)
                curveTo(20.94f, 3f, 22f, 4.06f, 22f, 5.38f)
                verticalLineTo(18.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                close()
            }
        }.build()

        return _EthernetOff!!
    }

@Suppress("ObjectPropertyName")
private var _EthernetOff: ImageVector? = null
