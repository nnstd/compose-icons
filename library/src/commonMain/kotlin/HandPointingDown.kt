package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPointingDown: ImageVector
    get() {
        if (_HandPointingDown != null) {
            return _HandPointingDown!!
        }
        _HandPointingDown = ImageVector.Builder(
            name = "HandPointingDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.9f, 21f)
                verticalLineTo(11f)
                lineTo(6.7f, 12.69f)
                lineTo(6.5f, 12.72f)
                curveTo(6.19f, 12.72f, 5.93f, 12.6f, 5.74f, 12.4f)
                lineTo(5f, 11.63f)
                lineTo(9.9f, 7.43f)
                curveTo(10.16f, 7.16f, 10.5f, 7f, 10.9f, 7f)
                horizontalLineTo(17.4f)
                curveTo(18.17f, 7f, 18.9f, 7.7f, 18.9f, 8.5f)
                verticalLineTo(12.86f)
                curveTo(18.9f, 13.47f, 18.55f, 14f, 18.05f, 14.2f)
                lineTo(13.11f, 16.4f)
                lineTo(11.9f, 16.53f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.9f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, 21f)
                moveTo(18.9f, 5f)
                horizontalLineTo(10.9f)
                verticalLineTo(2f)
                horizontalLineTo(18.9f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _HandPointingDown!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingDown: ImageVector? = null
