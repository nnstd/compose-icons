package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoxingGlove: ImageVector
    get() {
        if (_BoxingGlove != null) {
            return _BoxingGlove!!
        }
        _BoxingGlove = ImageVector.Builder(
            name = "BoxingGlove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                moveTo(12f, 4f)
                curveTo(8f, 4f, 7f, 4f, 7f, 4f)
                curveTo(7f, 4f, 2f, 4f, 2f, 8f)
                verticalLineTo(14f)
                curveTo(2f, 15.77f, 3f, 16.76f, 4.07f, 17.31f)
                curveTo(4.4f, 15.43f, 6.03f, 14f, 8f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                curveTo(6f, 19.11f, 6.9f, 20f, 8f, 20f)
                horizontalLineTo(13f)
                curveTo(17f, 20f, 17f, 16f, 17f, 16f)
                verticalLineTo(6f)
                curveTo(17f, 6f, 16f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _BoxingGlove!!
    }

@Suppress("ObjectPropertyName")
private var _BoxingGlove: ImageVector? = null
