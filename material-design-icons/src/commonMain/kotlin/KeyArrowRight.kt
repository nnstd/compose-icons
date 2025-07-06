package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyArrowRight: ImageVector
    get() {
        if (_KeyArrowRight != null) {
            return _KeyArrowRight!!
        }
        _KeyArrowRight = ImageVector.Builder(
            name = "KeyArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.7f, 6f)
                curveTo(11.1f, 4.2f, 9.4f, 3f, 7.5f, 3f)
                curveTo(5f, 3f, 3f, 5f, 3f, 7.5f)
                reflectiveCurveTo(5f, 12f, 7.5f, 12f)
                curveTo(9.5f, 12f, 11.1f, 10.8f, 11.7f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(11.7f)
                moveTo(7.5f, 9f)
                curveTo(6.7f, 9f, 6f, 8.3f, 6f, 7.5f)
                reflectiveCurveTo(6.7f, 6f, 7.5f, 6f)
                reflectiveCurveTo(9f, 6.7f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 9f, 7.5f, 9f)
                moveTo(13f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                lineTo(16f, 18f)
                lineTo(13f, 21f)
            }
        }.build()

        return _KeyArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _KeyArrowRight: ImageVector? = null
