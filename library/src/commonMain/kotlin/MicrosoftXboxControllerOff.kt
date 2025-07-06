package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftXboxControllerOff: ImageVector
    get() {
        if (_MicrosoftXboxControllerOff != null) {
            return _MicrosoftXboxControllerOff!!
        }
        _MicrosoftXboxControllerOff = ImageVector.Builder(
            name = "MicrosoftXboxControllerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(12.5f, 15.75f)
                horizontalLineTo(8.75f)
                curveTo(6.75f, 15.75f, 6f, 18f, 4f, 19f)
                curveTo(2f, 19f, 0.5f, 16.04f, 4.42f, 7.69f)
                lineTo(2f, 5.27f)
                moveTo(9.33f, 6.23f)
                horizontalLineTo(14.67f)
                curveTo(16f, 5f, 18.81f, 6.67f, 18.81f, 6.67f)
                lineTo(19.25f, 7.5f)
                horizontalLineTo(19.5f)
                curveTo(23f, 15f, 22.28f, 18.2f, 20.69f, 18.87f)
                lineTo(7.62f, 5.8f)
                curveTo(8.25f, 5.73f, 8.87f, 5.81f, 9.33f, 6.23f)
                moveTo(12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                close()
            }
        }.build()

        return _MicrosoftXboxControllerOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftXboxControllerOff: ImageVector? = null
