package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftXboxController: ImageVector
    get() {
        if (_MicrosoftXboxController != null) {
            return _MicrosoftXboxController!!
        }
        _MicrosoftXboxController = ImageVector.Builder(
            name = "MicrosoftXboxController",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 15.75f)
                curveTo(6.75f, 15.75f, 6f, 18f, 4f, 19f)
                curveTo(2f, 19f, 0.5f, 16f, 4.5f, 7.5f)
                horizontalLineTo(4.75f)
                lineTo(5.19f, 6.67f)
                curveTo(5.19f, 6.67f, 8f, 5f, 9.33f, 6.23f)
                horizontalLineTo(14.67f)
                curveTo(16f, 5f, 18.81f, 6.67f, 18.81f, 6.67f)
                lineTo(19.25f, 7.5f)
                horizontalLineTo(19.5f)
                curveTo(23.5f, 16f, 22f, 19f, 20f, 19f)
                curveTo(18f, 18f, 17.25f, 15.75f, 15.25f, 15.75f)
                horizontalLineTo(8.75f)
                moveTo(12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                close()
            }
        }.build()

        return _MicrosoftXboxController!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftXboxController: ImageVector? = null
