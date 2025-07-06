package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyOutline: ImageVector
    get() {
        if (_KeyOutline != null) {
            return _KeyOutline!!
        }
        _KeyOutline = ImageVector.Builder(
            name = "KeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(13.3f)
                curveTo(12.2f, 17.4f, 9.7f, 19f, 7f, 19f)
                curveTo(3.1f, 19f, 0f, 15.9f, 0f, 12f)
                reflectiveCurveTo(3.1f, 5f, 7f, 5f)
                curveTo(9.7f, 5f, 12.2f, 6.6f, 13.3f, 9f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                moveTo(17f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(11.9f)
                lineTo(11.7f, 10.3f)
                curveTo(11f, 8.3f, 9.1f, 7f, 7f, 7f)
                curveTo(4.2f, 7f, 2f, 9.2f, 2f, 12f)
                reflectiveCurveTo(4.2f, 17f, 7f, 17f)
                curveTo(9.1f, 17f, 11f, 15.7f, 11.7f, 13.7f)
                lineTo(11.9f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                moveTo(7f, 15f)
                curveTo(5.3f, 15f, 4f, 13.7f, 4f, 12f)
                reflectiveCurveTo(5.3f, 9f, 7f, 9f)
                reflectiveCurveTo(10f, 10.3f, 10f, 12f)
                reflectiveCurveTo(8.7f, 15f, 7f, 15f)
                moveTo(7f, 11f)
                curveTo(6.4f, 11f, 6f, 11.4f, 6f, 12f)
                reflectiveCurveTo(6.4f, 13f, 7f, 13f)
                reflectiveCurveTo(8f, 12.6f, 8f, 12f)
                reflectiveCurveTo(7.6f, 11f, 7f, 11f)
                close()
            }
        }.build()

        return _KeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KeyOutline: ImageVector? = null
