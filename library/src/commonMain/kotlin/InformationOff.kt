package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationOff: ImageVector
    get() {
        if (_InformationOff != null) {
            return _InformationOff!!
        }
        _InformationOff = ImageVector.Builder(
            name = "InformationOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.1f, 6f)
                curveTo(2.8f, 7.6f, 2f, 9.7f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(14.3f, 22f, 16.4f, 21.2f, 18f, 19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(12.9f)
                lineTo(13f, 14.9f)
                verticalLineTo(17f)
                moveTo(11f, 7.8f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.9f, 21.4f, 15.7f, 20.5f, 17.3f)
                lineTo(12.2f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(7.8f)
                close()
            }
        }.build()

        return _InformationOff!!
    }

@Suppress("ObjectPropertyName")
private var _InformationOff: ImageVector? = null
