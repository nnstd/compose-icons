package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyChange: ImageVector
    get() {
        if (_KeyChange != null) {
            return _KeyChange!!
        }
        _KeyChange = ImageVector.Builder(
            name = "KeyChange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2f)
                curveTo(9.5f, 2f, 11.1f, 3.2f, 11.7f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 9.8f, 9.4f, 11f, 7.5f, 11f)
                curveTo(5f, 11f, 3f, 9f, 3f, 6.5f)
                reflectiveCurveTo(5f, 2f, 7.5f, 2f)
                moveTo(7.5f, 5f)
                curveTo(6.7f, 5f, 6f, 5.7f, 6f, 6.5f)
                reflectiveCurveTo(6.7f, 8f, 7.5f, 8f)
                reflectiveCurveTo(9f, 7.3f, 9f, 6.5f)
                reflectiveCurveTo(8.3f, 5f, 7.5f, 5f)
                moveTo(7.5f, 13f)
                curveTo(9.5f, 13f, 11.1f, 14.2f, 11.7f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 20.8f, 9.4f, 22f, 7.5f, 22f)
                curveTo(5f, 22f, 3f, 20f, 3f, 17.5f)
                reflectiveCurveTo(5f, 13f, 7.5f, 13f)
                moveTo(7.5f, 16f)
                curveTo(6.7f, 16f, 6f, 16.7f, 6f, 17.5f)
                reflectiveCurveTo(6.7f, 19f, 7.5f, 19f)
                reflectiveCurveTo(9f, 18.3f, 9f, 17.5f)
                reflectiveCurveTo(8.3f, 16f, 7.5f, 16f)
                close()
            }
        }.build()

        return _KeyChange!!
    }

@Suppress("ObjectPropertyName")
private var _KeyChange: ImageVector? = null
