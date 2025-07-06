package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftXboxControllerBatteryMedium: ImageVector
    get() {
        if (_MicrosoftXboxControllerBatteryMedium != null) {
            return _MicrosoftXboxControllerBatteryMedium!!
        }
        _MicrosoftXboxControllerBatteryMedium = ImageVector.Builder(
            name = "MicrosoftXboxControllerBatteryMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                moveTo(21.67f, 5f)
                curveTo(22.4f, 5f, 23f, 5.6f, 23f, 6.33f)
                verticalLineTo(19.67f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.67f, 21f)
                horizontalLineTo(14.33f)
                curveTo(13.6f, 21f, 13f, 20.4f, 13f, 19.67f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.75f)
                curveTo(5.75f, 16.75f, 5f, 19f, 3f, 20f)
                curveTo(1f, 20f, -0.5f, 17f, 3.5f, 8.5f)
                horizontalLineTo(3.75f)
                lineTo(4.19f, 7.67f)
                curveTo(4.19f, 7.67f, 7f, 6f, 8.33f, 7.23f)
                horizontalLineTo(13f)
                verticalLineTo(6.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.33f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(21.67f)
                moveTo(11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                close()
            }
        }.build()

        return _MicrosoftXboxControllerBatteryMedium!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftXboxControllerBatteryMedium: ImageVector? = null
