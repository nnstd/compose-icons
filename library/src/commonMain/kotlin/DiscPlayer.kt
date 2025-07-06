package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiscPlayer: ImageVector
    get() {
        if (_DiscPlayer != null) {
            return _DiscPlayer!!
        }
        _DiscPlayer = ImageVector.Builder(
            name = "DiscPlayer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 10.37f)
                curveTo(15.54f, 10.37f, 16.38f, 9.53f, 16.38f, 8.5f)
                curveTo(16.38f, 7.46f, 15.54f, 6.63f, 14.5f, 6.63f)
                curveTo(13.46f, 6.63f, 12.63f, 7.46f, 12.63f, 8.5f)
                arcTo(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 10.37f)
                moveTo(14.5f, 1f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8.5f)
                curveTo(22f, 10.67f, 21.08f, 12.63f, 19.6f, 14f)
                horizontalLineTo(9.4f)
                curveTo(7.93f, 12.63f, 7f, 10.67f, 7f, 8.5f)
                curveTo(7f, 4.35f, 10.36f, 1f, 14.5f, 1f)
                moveTo(6f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                moveTo(4f, 18f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                moveTo(15f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                moveTo(19f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                close()
            }
        }.build()

        return _DiscPlayer!!
    }

@Suppress("ObjectPropertyName")
private var _DiscPlayer: ImageVector? = null
