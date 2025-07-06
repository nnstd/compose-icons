package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyStar: ImageVector
    get() {
        if (_KeyStar != null) {
            return _KeyStar!!
        }
        _KeyStar = ImageVector.Builder(
            name = "KeyStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3f)
                curveTo(5f, 3f, 3f, 5f, 3f, 7.5f)
                reflectiveCurveTo(5f, 12f, 7.5f, 12f)
                curveTo(9.5f, 12f, 11.1f, 10.8f, 11.7f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 4.2f, 9.5f, 3f, 7.5f, 3f)
                moveTo(7.5f, 6f)
                curveTo(8.3f, 6f, 9f, 6.7f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 9f, 7.5f, 9f)
                reflectiveCurveTo(6f, 8.3f, 6f, 7.5f)
                reflectiveCurveTo(6.7f, 6f, 7.5f, 6f)
                moveTo(12f, 14f)
                lineTo(10.9f, 16.6f)
                lineTo(8f, 16.9f)
                lineTo(10.2f, 18.8f)
                lineTo(9.5f, 21.6f)
                lineTo(12f, 20.1f)
                lineTo(14.4f, 21.6f)
                lineTo(13.8f, 18.8f)
                lineTo(16f, 16.9f)
                lineTo(13.1f, 16.7f)
                lineTo(12f, 14f)
                close()
            }
        }.build()

        return _KeyStar!!
    }

@Suppress("ObjectPropertyName")
private var _KeyStar: ImageVector? = null
