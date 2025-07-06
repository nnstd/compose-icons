package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyAlertOutline: ImageVector
    get() {
        if (_KeyAlertOutline != null) {
            return _KeyAlertOutline!!
        }
        _KeyAlertOutline = ImageVector.Builder(
            name = "KeyAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(6f)
                verticalLineTo(13.32f)
                curveTo(3.58f, 12.17f, 2f, 9.72f, 2f, 7f)
                curveTo(2f, 3.14f, 5.14f, 0f, 9f, 0f)
                curveTo(12.86f, 0f, 16f, 3.14f, 16f, 7f)
                curveTo(16f, 9.72f, 14.42f, 12.18f, 12f, 13.32f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(11.94f)
                lineTo(10.67f, 11.71f)
                curveTo(12.66f, 11f, 14f, 9.11f, 14f, 7f)
                curveTo(14f, 4.24f, 11.76f, 2f, 9f, 2f)
                reflectiveCurveTo(4f, 4.24f, 4f, 7f)
                curveTo(4f, 9.11f, 5.34f, 11f, 7.33f, 11.71f)
                lineTo(8f, 11.94f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(12f, 7f)
                curveTo(12f, 8.66f, 10.66f, 10f, 9f, 10f)
                reflectiveCurveTo(6f, 8.66f, 6f, 7f)
                reflectiveCurveTo(7.34f, 4f, 9f, 4f)
                reflectiveCurveTo(12f, 5.34f, 12f, 7f)
                moveTo(9f, 8f)
                curveTo(9.55f, 8f, 10f, 7.55f, 10f, 7f)
                reflectiveCurveTo(9.55f, 6f, 9f, 6f)
                reflectiveCurveTo(8f, 6.45f, 8f, 7f)
                reflectiveCurveTo(8.45f, 8f, 9f, 8f)
                moveTo(20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
            }
        }.build()

        return _KeyAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KeyAlertOutline: ImageVector? = null
