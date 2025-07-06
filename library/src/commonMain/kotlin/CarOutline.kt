package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarOutline: ImageVector
    get() {
        if (_CarOutline != null) {
            return _CarOutline!!
        }
        _CarOutline = ImageVector.Builder(
            name = "CarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 6f)
                curveTo(18.7f, 5.4f, 18.1f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.8f, 5f, 5.3f, 5.4f, 5.1f, 6f)
                lineTo(3f, 12f)
                verticalLineTo(20f)
                curveTo(3f, 20.5f, 3.5f, 21f, 4f, 21f)
                horizontalLineTo(5f)
                curveTo(5.6f, 21f, 6f, 20.5f, 6f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                curveTo(18f, 20.5f, 18.5f, 21f, 19f, 21f)
                horizontalLineTo(20f)
                curveTo(20.5f, 21f, 21f, 20.5f, 21f, 20f)
                verticalLineTo(12f)
                lineTo(18.9f, 6f)
                moveTo(6.8f, 7f)
                horizontalLineTo(17.1f)
                lineTo(18.2f, 10f)
                horizontalLineTo(5.8f)
                lineTo(6.8f, 7f)
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(7.5f, 13f)
                curveTo(8.3f, 13f, 9f, 13.7f, 9f, 14.5f)
                reflectiveCurveTo(8.3f, 16f, 7.5f, 16f)
                reflectiveCurveTo(6f, 15.3f, 6f, 14.5f)
                reflectiveCurveTo(6.7f, 13f, 7.5f, 13f)
                moveTo(16.5f, 13f)
                curveTo(17.3f, 13f, 18f, 13.7f, 18f, 14.5f)
                reflectiveCurveTo(17.3f, 16f, 16.5f, 16f)
                curveTo(15.7f, 16f, 15f, 15.3f, 15f, 14.5f)
                reflectiveCurveTo(15.7f, 13f, 16.5f, 13f)
                close()
            }
        }.build()

        return _CarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CarOutline: ImageVector? = null
