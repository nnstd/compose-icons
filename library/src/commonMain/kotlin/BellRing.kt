package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellRing: ImageVector
    get() {
        if (_BellRing != null) {
            return _BellRing!!
        }
        _BellRing = ImageVector.Builder(
            name = "BellRing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 7.9f, 7.03f, 5.17f, 10f, 4.29f)
                curveTo(10f, 4.19f, 10f, 4.1f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                curveTo(14f, 4.1f, 14f, 4.19f, 14f, 4.29f)
                curveTo(16.97f, 5.17f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(17f)
                lineTo(21f, 19f)
                moveTo(14f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                moveTo(19.75f, 3.19f)
                lineTo(18.33f, 4.61f)
                curveTo(20.04f, 6.3f, 21f, 8.6f, 21f, 11f)
                horizontalLineTo(23f)
                curveTo(23f, 8.07f, 21.84f, 5.25f, 19.75f, 3.19f)
                moveTo(1f, 11f)
                horizontalLineTo(3f)
                curveTo(3f, 8.6f, 3.96f, 6.3f, 5.67f, 4.61f)
                lineTo(4.25f, 3.19f)
                curveTo(2.16f, 5.25f, 1f, 8.07f, 1f, 11f)
                close()
            }
        }.build()

        return _BellRing!!
    }

@Suppress("ObjectPropertyName")
private var _BellRing: ImageVector? = null
