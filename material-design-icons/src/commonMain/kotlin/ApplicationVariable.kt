package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationVariable: ImageVector
    get() {
        if (_ApplicationVariable != null) {
            return _ApplicationVariable!!
        }
        _ApplicationVariable = ImageVector.Builder(
            name = "ApplicationVariable",
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
                moveTo(7.4f, 20f)
                curveTo(5.9f, 18.6f, 5f, 16.6f, 5f, 14.5f)
                reflectiveCurveTo(5.9f, 10.4f, 7.4f, 9f)
                lineTo(9f, 9.6f)
                curveTo(7.7f, 10.7f, 7f, 12.6f, 7f, 14.5f)
                reflectiveCurveTo(7.7f, 18.2f, 9f, 19.4f)
                lineTo(7.4f, 20f)
                moveTo(12.7f, 18f)
                lineTo(11.9f, 16f)
                lineTo(10.5f, 18f)
                horizontalLineTo(9f)
                lineTo(11.3f, 14.9f)
                lineTo(10f, 12f)
                horizontalLineTo(11.3f)
                lineTo(12.1f, 14f)
                lineTo(13.5f, 12f)
                horizontalLineTo(15f)
                lineTo(12.8f, 15f)
                lineTo(14.1f, 18f)
                horizontalLineTo(12.7f)
                moveTo(16.6f, 20f)
                lineTo(15f, 19.4f)
                curveTo(16.3f, 18.2f, 17f, 16.4f, 17f, 14.5f)
                reflectiveCurveTo(16.3f, 10.8f, 15f, 9.6f)
                lineTo(16.6f, 9f)
                curveTo(18.1f, 10.4f, 19f, 12.4f, 19f, 14.5f)
                curveTo(19f, 16.6f, 18.1f, 18.6f, 16.6f, 20f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ApplicationVariable!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationVariable: ImageVector? = null
