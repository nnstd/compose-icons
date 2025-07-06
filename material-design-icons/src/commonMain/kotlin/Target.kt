package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Target: ImageVector
    get() {
        if (_Target != null) {
            return _Target!!
        }
        _Target = ImageVector.Builder(
            name = "Target",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                verticalLineTo(4.07f)
                curveTo(7.38f, 4.53f, 4.53f, 7.38f, 4.07f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(4.07f)
                curveTo(4.53f, 16.62f, 7.38f, 19.47f, 11f, 19.93f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(19.93f)
                curveTo(16.62f, 19.47f, 19.47f, 16.62f, 19.93f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(19.93f)
                curveTo(19.47f, 7.38f, 16.62f, 4.53f, 13f, 4.07f)
                verticalLineTo(2f)
                moveTo(11f, 6.08f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6.09f)
                curveTo(15.5f, 6.5f, 17.5f, 8.5f, 17.92f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(17.91f)
                curveTo(17.5f, 15.5f, 15.5f, 17.5f, 13f, 17.92f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(17.91f)
                curveTo(8.5f, 17.5f, 6.5f, 15.5f, 6.08f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6.09f)
                curveTo(6.5f, 8.5f, 8.5f, 6.5f, 11f, 6.08f)
                moveTo(12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.build()

        return _Target!!
    }

@Suppress("ObjectPropertyName")
private var _Target: ImageVector? = null
