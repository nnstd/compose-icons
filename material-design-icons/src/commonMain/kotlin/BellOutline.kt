package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellOutline: ImageVector
    get() {
        if (_BellOutline != null) {
            return _BellOutline!!
        }
        _BellOutline = ImageVector.Builder(
            name = "BellOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                curveTo(14f, 22.1f, 13.1f, 23f, 12f, 23f)
                reflectiveCurveTo(10f, 22.1f, 10f, 21f)
                moveTo(21f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 7.9f, 7f, 5.2f, 10f, 4.3f)
                verticalLineTo(4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                reflectiveCurveTo(14f, 2.9f, 14f, 4f)
                verticalLineTo(4.3f)
                curveTo(17f, 5.2f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(17f)
                lineTo(21f, 19f)
                moveTo(17f, 11f)
                curveTo(17f, 8.2f, 14.8f, 6f, 12f, 6f)
                reflectiveCurveTo(7f, 8.2f, 7f, 11f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _BellOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellOutline: ImageVector? = null
