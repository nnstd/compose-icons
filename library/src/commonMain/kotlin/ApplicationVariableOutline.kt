package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationVariableOutline: ImageVector
    get() {
        if (_ApplicationVariableOutline != null) {
            return _ApplicationVariableOutline!!
        }
        _ApplicationVariableOutline = ImageVector.Builder(
            name = "ApplicationVariableOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(21f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                moveTo(16.6f, 8f)
                curveTo(18.1f, 9.3f, 19f, 11.1f, 19f, 13f)
                curveTo(19f, 14.9f, 18.1f, 16.7f, 16.6f, 18f)
                lineTo(15f, 17.4f)
                curveTo(16.3f, 16.4f, 17f, 14.7f, 17f, 13f)
                reflectiveCurveTo(16.3f, 9.6f, 15f, 8.6f)
                lineTo(16.6f, 8f)
                moveTo(7.4f, 8f)
                lineTo(9f, 8.6f)
                curveTo(7.7f, 9.6f, 7f, 11.3f, 7f, 13f)
                reflectiveCurveTo(7.7f, 16.4f, 9f, 17.4f)
                lineTo(7.4f, 18f)
                curveTo(5.9f, 16.7f, 5f, 14.9f, 5f, 13f)
                reflectiveCurveTo(5.9f, 9.3f, 7.4f, 8f)
                moveTo(12.1f, 12f)
                lineTo(13.5f, 10f)
                horizontalLineTo(15f)
                lineTo(12.8f, 13f)
                lineTo(14.1f, 16f)
                horizontalLineTo(12.8f)
                lineTo(12f, 14f)
                lineTo(10.6f, 16f)
                horizontalLineTo(9f)
                lineTo(11.3f, 12.9f)
                lineTo(10f, 10f)
                horizontalLineTo(11.3f)
                lineTo(12.1f, 12f)
                close()
            }
        }.build()

        return _ApplicationVariableOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationVariableOutline: ImageVector? = null
