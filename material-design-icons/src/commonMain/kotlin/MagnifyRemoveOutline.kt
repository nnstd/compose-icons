package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyRemoveOutline: ImageVector
    get() {
        if (_MagnifyRemoveOutline != null) {
            return _MagnifyRemoveOutline!!
        }
        _MagnifyRemoveOutline = ImageVector.Builder(
            name = "MagnifyRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 14f)
                horizontalLineTo(14.71f)
                lineTo(14.43f, 13.73f)
                curveTo(15.41f, 12.59f, 16f, 11.11f, 16f, 9.5f)
                curveTo(16f, 5.91f, 13.09f, 3f, 9.5f, 3f)
                reflectiveCurveTo(3f, 5.91f, 3f, 9.5f)
                reflectiveCurveTo(5.91f, 16f, 9.5f, 16f)
                curveTo(11.11f, 16f, 12.59f, 15.41f, 13.73f, 14.43f)
                lineTo(14f, 14.71f)
                verticalLineTo(15.5f)
                lineTo(19f, 20.5f)
                lineTo(20.5f, 19f)
                lineTo(15.5f, 14f)
                moveTo(9.5f, 14f)
                curveTo(7f, 14f, 5f, 12f, 5f, 9.5f)
                reflectiveCurveTo(7f, 5f, 9.5f, 5f)
                reflectiveCurveTo(14f, 7f, 14f, 9.5f)
                reflectiveCurveTo(12f, 14f, 9.5f, 14f)
                moveTo(10.91f, 11.62f)
                lineTo(9.5f, 10.21f)
                lineTo(8.09f, 11.62f)
                lineTo(7.38f, 10.91f)
                lineTo(8.79f, 9.5f)
                lineTo(7.38f, 8.09f)
                lineTo(8.09f, 7.38f)
                lineTo(9.5f, 8.79f)
                lineTo(10.91f, 7.38f)
                lineTo(11.62f, 8.09f)
                lineTo(10.21f, 9.5f)
                lineTo(11.62f, 10.91f)
                lineTo(10.91f, 11.62f)
                close()
            }
        }.build()

        return _MagnifyRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyRemoveOutline: ImageVector? = null
