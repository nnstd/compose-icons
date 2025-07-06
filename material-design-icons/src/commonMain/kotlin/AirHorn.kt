package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirHorn: ImageVector
    get() {
        if (_AirHorn != null) {
            return _AirHorn!!
        }
        _AirHorn = ImageVector.Builder(
            name = "AirHorn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2.8f)
                verticalLineTo(6f)
                lineTo(19f, 9.2f)
                curveTo(19f, 9.5f, 18.7f, 9.8f, 18.4f, 9.7f)
                curveTo(18.4f, 9.7f, 14.5f, 7.1f, 10f, 7.1f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.2f)
                curveTo(10.7f, 9.5f, 11.2f, 9.7f, 11.4f, 10.1f)
                lineTo(12.7f, 11.9f)
                curveTo(12.9f, 12.1f, 13f, 12.4f, 13f, 12.6f)
                verticalLineTo(20.6f)
                curveTo(13f, 21.3f, 12.3f, 22f, 11.5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.7f, 22f, 5f, 21.4f, 5f, 20.6f)
                verticalLineTo(12.6f)
                curveTo(5f, 12.3f, 5.1f, 12.1f, 5.3f, 11.9f)
                lineTo(6.6f, 10.1f)
                curveTo(6.9f, 9.7f, 7.3f, 9.5f, 7.8f, 9.5f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                curveTo(7.6f, 8.5f, 7f, 8.8f, 6.4f, 8.8f)
                curveTo(5.1f, 8.8f, 4f, 7.5f, 4f, 6f)
                curveTo(4f, 4.5f, 5.1f, 3.2f, 6.4f, 3.2f)
                curveTo(7f, 3.3f, 7.6f, 3.6f, 8f, 4f)
                verticalLineTo(2.6f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                curveTo(14.5f, 5f, 18.4f, 2.4f, 18.4f, 2.4f)
                curveTo(18.7f, 2.3f, 19f, 2.5f, 19f, 2.8f)
                close()
            }
        }.build()

        return _AirHorn!!
    }

@Suppress("ObjectPropertyName")
private var _AirHorn: ImageVector? = null
