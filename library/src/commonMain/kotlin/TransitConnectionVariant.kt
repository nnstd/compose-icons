package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitConnectionVariant: ImageVector
    get() {
        if (_TransitConnectionVariant != null) {
            return _TransitConnectionVariant!!
        }
        _TransitConnectionVariant = ImageVector.Builder(
            name = "TransitConnectionVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9f, 12f, 9f)
                curveTo(10.7f, 9f, 9.6f, 9.84f, 9.18f, 11f)
                horizontalLineTo(6f)
                curveTo(5.67f, 11f, 4f, 10.9f, 4f, 9f)
                verticalLineTo(8f)
                curveTo(4f, 6.17f, 5.54f, 6f, 6f, 6f)
                horizontalLineTo(16.18f)
                curveTo(16.6f, 7.16f, 17.7f, 8f, 19f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                curveTo(17.7f, 2f, 16.6f, 2.84f, 16.18f, 4f)
                horizontalLineTo(6f)
                curveTo(4.39f, 4f, 2f, 5.06f, 2f, 8f)
                verticalLineTo(9f)
                curveTo(2f, 11.94f, 4.39f, 13f, 6f, 13f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15f, 12f, 15f)
                curveTo(13.3f, 15f, 14.4f, 14.16f, 14.82f, 13f)
                horizontalLineTo(18f)
                curveTo(18.33f, 13f, 20f, 13.1f, 20f, 15f)
                verticalLineTo(16f)
                curveTo(20f, 17.83f, 18.46f, 18f, 18f, 18f)
                horizontalLineTo(7.82f)
                curveTo(7.4f, 16.84f, 6.3f, 16f, 5f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                curveTo(6.3f, 22f, 7.4f, 21.16f, 7.82f, 20f)
                horizontalLineTo(18f)
                curveTo(19.61f, 20f, 22f, 18.93f, 22f, 16f)
                verticalLineTo(15f)
                curveTo(22f, 12.07f, 19.61f, 11f, 18f, 11f)
                moveTo(19f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 4f)
                moveTo(5f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20f)
                close()
            }
        }.build()

        return _TransitConnectionVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TransitConnectionVariant: ImageVector? = null
