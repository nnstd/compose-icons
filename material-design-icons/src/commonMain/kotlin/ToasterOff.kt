package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToasterOff: ImageVector
    get() {
        if (_ToasterOff != null) {
            return _ToasterOff!!
        }
        _ToasterOff = ImageVector.Builder(
            name = "ToasterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(18.1f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                curveTo(3f, 9.9f, 3.9f, 9f, 5f, 9f)
                horizontalLineTo(7.1f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(15.3f, 12.1f)
                curveTo(15.6f, 11.5f, 16.3f, 11f, 17f, 11f)
                curveTo(18.1f, 11f, 19f, 11.9f, 19f, 13f)
                curveTo(19f, 13.8f, 18.6f, 14.4f, 17.9f, 14.7f)
                lineTo(21f, 17.8f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                curveTo(21f, 9.9f, 20.1f, 9f, 19f, 9f)
                horizontalLineTo(12.2f)
                lineTo(15.3f, 12.1f)
                moveTo(18f, 8f)
                curveTo(17.6f, 5.8f, 15.1f, 4f, 12f, 4f)
                curveTo(10.6f, 4f, 9.2f, 4.4f, 8.2f, 5f)
                lineTo(11.2f, 8f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ToasterOff!!
    }

@Suppress("ObjectPropertyName")
private var _ToasterOff: ImageVector? = null
