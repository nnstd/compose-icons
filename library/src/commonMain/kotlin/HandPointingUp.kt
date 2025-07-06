package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPointingUp: ImageVector
    get() {
        if (_HandPointingUp != null) {
            return _HandPointingUp!!
        }
        _HandPointingUp = ImageVector.Builder(
            name = "HandPointingUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3f)
                verticalLineTo(13f)
                lineTo(17.2f, 11.31f)
                lineTo(17.42f, 11.28f)
                curveTo(17.71f, 11.28f, 17.97f, 11.4f, 18.16f, 11.6f)
                lineTo(18.9f, 12.37f)
                lineTo(14f, 16.57f)
                curveTo(13.74f, 16.84f, 13.39f, 17f, 13f, 17f)
                horizontalLineTo(6.5f)
                curveTo(5.73f, 17f, 5f, 16.3f, 5f, 15.5f)
                verticalLineTo(11.14f)
                curveTo(5f, 10.53f, 5.35f, 10f, 5.85f, 9.8f)
                lineTo(10.79f, 7.6f)
                lineTo(12f, 7.47f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3f)
                moveTo(5f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _HandPointingUp!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingUp: ImageVector? = null
