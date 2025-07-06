package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                curveTo(5.9f, 14f, 5f, 13.1f, 5f, 12f)
                reflectiveCurveTo(5.9f, 10f, 7f, 10f)
                reflectiveCurveTo(9f, 10.9f, 9f, 12f)
                reflectiveCurveTo(8.1f, 14f, 7f, 14f)
                moveTo(12.6f, 10f)
                curveTo(11.8f, 7.7f, 9.6f, 6f, 7f, 6f)
                curveTo(3.7f, 6f, 1f, 8.7f, 1f, 12f)
                reflectiveCurveTo(3.7f, 18f, 7f, 18f)
                curveTo(9.6f, 18f, 11.8f, 16.3f, 12.6f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                horizontalLineTo(12.6f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
