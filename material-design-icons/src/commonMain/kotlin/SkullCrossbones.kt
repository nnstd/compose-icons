package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkullCrossbones: ImageVector
    get() {
        if (_SkullCrossbones != null) {
            return _SkullCrossbones!!
        }
        _SkullCrossbones = ImageVector.Builder(
            name = "SkullCrossbones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.8f, 18.5f)
                lineTo(21.8f, 20.1f)
                lineTo(21.4f, 22f)
                lineTo(12f, 19.5f)
                lineTo(2.6f, 22f)
                lineTo(2.1f, 20.1f)
                lineTo(8.1f, 18.5f)
                lineTo(2f, 16.9f)
                lineTo(2.5f, 15f)
                lineTo(11.9f, 17.5f)
                lineTo(21.3f, 15f)
                lineTo(21.8f, 16.9f)
                lineTo(15.8f, 18.5f)
                moveTo(18f, 8f)
                curveTo(18f, 9.8f, 17.2f, 11.3f, 16f, 12.4f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(13.7f)
                lineTo(14f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(13.7f)
                lineTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(12.4f)
                curveTo(6.8f, 11.3f, 6f, 9.8f, 6f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                moveTo(11f, 7.5f)
                curveTo(11f, 6.7f, 10.3f, 6f, 9.5f, 6f)
                curveTo(8.7f, 6f, 8f, 6.7f, 8f, 7.5f)
                curveTo(8f, 8.3f, 8.7f, 9f, 9.5f, 9f)
                curveTo(10.3f, 9f, 11f, 8.3f, 11f, 7.5f)
                moveTo(13f, 11f)
                lineTo(12f, 9f)
                lineTo(11f, 11f)
                horizontalLineTo(13f)
                moveTo(16f, 7.5f)
                curveTo(16f, 6.7f, 15.3f, 6f, 14.5f, 6f)
                curveTo(13.7f, 6f, 13f, 6.7f, 13f, 7.5f)
                curveTo(13f, 8.3f, 13.7f, 9f, 14.5f, 9f)
                curveTo(15.3f, 9f, 16f, 8.3f, 16f, 7.5f)
                close()
            }
        }.build()

        return _SkullCrossbones!!
    }

@Suppress("ObjectPropertyName")
private var _SkullCrossbones: ImageVector? = null
