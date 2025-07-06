package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarLightAlert: ImageVector
    get() {
        if (_CarLightAlert != null) {
            return _CarLightAlert!!
        }
        _CarLightAlert = ImageVector.Builder(
            name = "CarLightAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                moveTo(21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                moveTo(1f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(5.1f, 10.3f, 5.1f, 9.6f, 5.2f, 9f)
                horizontalLineTo(1f)
                moveTo(5f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                horizontalLineTo(5.2f)
                curveTo(5.1f, 14.4f, 5.1f, 13.7f, 5f, 13f)
                moveTo(5.9f, 6.4f)
                curveTo(6f, 5.8f, 6.3f, 5.4f, 6.5f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                horizontalLineTo(5.7f)
                curveTo(5.8f, 6.8f, 5.8f, 6.6f, 5.9f, 6.4f)
                moveTo(1f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(6.6f)
                curveTo(6.2f, 18.4f, 5.9f, 17.8f, 5.7f, 17f)
                horizontalLineTo(1f)
                moveTo(10f, 4.8f)
                curveTo(6f, 4.8f, 6f, 19.2f, 10f, 19.2f)
                reflectiveCurveTo(19f, 16.5f, 19f, 12f)
                reflectiveCurveTo(14f, 4.8f, 10f, 4.8f)
                moveTo(10.1f, 17.2f)
                curveTo(9.7f, 16.8f, 9f, 15f, 9f, 12f)
                reflectiveCurveTo(9.7f, 7.2f, 10.1f, 6.8f)
                curveTo(13f, 6.9f, 17f, 8.7f, 17f, 12f)
                reflectiveCurveTo(13f, 17.1f, 10.1f, 17.2f)
            }
        }.build()

        return _CarLightAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CarLightAlert: ImageVector? = null
