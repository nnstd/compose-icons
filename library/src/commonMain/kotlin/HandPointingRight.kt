package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPointingRight: ImageVector
    get() {
        if (_HandPointingRight != null) {
            return _HandPointingRight!!
        }
        _HandPointingRight = ImageVector.Builder(
            name = "HandPointingRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11f)
                horizontalLineTo(16.53f)
                lineTo(16.4f, 12.21f)
                lineTo(14.2f, 17.15f)
                curveTo(14f, 17.65f, 13.47f, 18f, 12.86f, 18f)
                horizontalLineTo(8.5f)
                curveTo(7.7f, 18f, 7f, 17.27f, 7f, 16.5f)
                verticalLineTo(10f)
                curveTo(7f, 9.61f, 7.16f, 9.26f, 7.43f, 9f)
                lineTo(11.63f, 4.1f)
                lineTo(12.4f, 4.84f)
                curveTo(12.6f, 5.03f, 12.72f, 5.29f, 12.72f, 5.58f)
                lineTo(12.69f, 5.8f)
                lineTo(11f, 9f)
                horizontalLineTo(21f)
                moveTo(2f, 18f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _HandPointingRight!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingRight: ImageVector? = null
