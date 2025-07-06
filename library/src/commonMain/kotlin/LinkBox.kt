package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkBox: ImageVector
    get() {
        if (_LinkBox != null) {
            return _LinkBox!!
        }
        _LinkBox = ImageVector.Builder(
            name = "LinkBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(11f, 16f)
                horizontalLineTo(10f)
                curveTo(8.39f, 16f, 6f, 14.94f, 6f, 12f)
                curveTo(6f, 9.07f, 8.39f, 8f, 10f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                curveTo(9.54f, 10f, 8f, 10.17f, 8f, 12f)
                curveTo(8f, 13.9f, 9.67f, 14f, 10f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(14f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                curveTo(14.46f, 14f, 16f, 13.83f, 16f, 12f)
                curveTo(16f, 10.1f, 14.33f, 10f, 14f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                curveTo(15.61f, 8f, 18f, 9.07f, 18f, 12f)
                curveTo(18f, 14.94f, 15.61f, 16f, 14f, 16f)
                close()
            }
        }.build()

        return _LinkBox!!
    }

@Suppress("ObjectPropertyName")
private var _LinkBox: ImageVector? = null
