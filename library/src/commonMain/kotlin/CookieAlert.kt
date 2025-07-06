package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CookieAlert: ImageVector
    get() {
        if (_CookieAlert != null) {
            return _CookieAlert!!
        }
        _CookieAlert = ImageVector.Builder(
            name = "CookieAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                curveTo(16f, 8f, 15f, 8f, 15f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                curveTo(13f, 6f, 12f, 6f, 12f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                curveTo(11f, 3f, 10f, 3f, 10f, 3f)
                curveTo(5f, 3f, 1f, 7f, 1f, 12f)
                reflectiveCurveTo(5f, 21f, 10f, 21f)
                reflectiveCurveTo(19f, 17f, 19f, 12f)
                curveTo(19f, 11.5f, 19f, 11f, 18.9f, 10.5f)
                curveTo(18.6f, 10f, 18f, 10f, 18f, 10f)
                moveTo(4.5f, 13f)
                curveTo(3.7f, 13f, 3f, 12.3f, 3f, 11.5f)
                reflectiveCurveTo(3.7f, 10f, 4.5f, 10f)
                reflectiveCurveTo(6f, 10.7f, 6f, 11.5f)
                reflectiveCurveTo(5.3f, 13f, 4.5f, 13f)
                moveTo(6f, 7.5f)
                curveTo(6f, 6.7f, 6.7f, 6f, 7.5f, 6f)
                reflectiveCurveTo(9f, 6.7f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 9f, 7.5f, 9f)
                reflectiveCurveTo(6f, 8.3f, 6f, 7.5f)
                moveTo(9f, 19f)
                curveTo(8.2f, 19f, 7.5f, 18.3f, 7.5f, 17.5f)
                reflectiveCurveTo(8.2f, 16f, 9f, 16f)
                reflectiveCurveTo(10.5f, 16.7f, 10.5f, 17.5f)
                reflectiveCurveTo(9.8f, 19f, 9f, 19f)
                moveTo(9.5f, 14f)
                curveTo(8.7f, 14f, 8f, 13.3f, 8f, 12.5f)
                reflectiveCurveTo(8.7f, 11f, 9.5f, 11f)
                reflectiveCurveTo(11f, 11.7f, 11f, 12.5f)
                reflectiveCurveTo(10.3f, 14f, 9.5f, 14f)
                moveTo(14.5f, 16f)
                curveTo(13.7f, 16f, 13f, 15.3f, 13f, 14.5f)
                reflectiveCurveTo(13.7f, 13f, 14.5f, 13f)
                curveTo(15.3f, 13f, 16f, 13.7f, 16f, 14.5f)
                reflectiveCurveTo(15.3f, 16f, 14.5f, 16f)
                moveTo(21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(23f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _CookieAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CookieAlert: ImageVector? = null
