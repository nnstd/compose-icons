package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScaleBalance: ImageVector
    get() {
        if (_ScaleBalance != null) {
            return _ScaleBalance!!
        }
        _ScaleBalance = ImageVector.Builder(
            name = "ScaleBalance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(10.73f, 3f, 9.6f, 3.8f, 9.18f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(4.95f)
                lineTo(2f, 14f)
                curveTo(1.53f, 16f, 3f, 17f, 5.5f, 17f)
                curveTo(8f, 17f, 9.56f, 16f, 9f, 14f)
                lineTo(6.05f, 7f)
                horizontalLineTo(9.17f)
                curveTo(9.5f, 7.85f, 10.15f, 8.5f, 11f, 8.83f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(8.82f)
                curveTo(13.85f, 8.5f, 14.5f, 7.85f, 14.82f, 7f)
                horizontalLineTo(17.95f)
                lineTo(15f, 14f)
                curveTo(14.53f, 16f, 16f, 17f, 18.5f, 17f)
                curveTo(21f, 17f, 22.56f, 16f, 22f, 14f)
                lineTo(19.05f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(14.83f)
                curveTo(14.4f, 3.8f, 13.27f, 3f, 12f, 3f)
                moveTo(12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(5.5f, 10.25f)
                lineTo(7f, 14f)
                horizontalLineTo(4f)
                lineTo(5.5f, 10.25f)
                moveTo(18.5f, 10.25f)
                lineTo(20f, 14f)
                horizontalLineTo(17f)
                lineTo(18.5f, 10.25f)
                close()
            }
        }.build()

        return _ScaleBalance!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleBalance: ImageVector? = null
