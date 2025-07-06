package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SawBlade: ImageVector
    get() {
        if (_SawBlade != null) {
            return _SawBlade!!
        }
        _SawBlade = ImageVector.Builder(
            name = "SawBlade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15f)
                curveTo(20f, 15f, 18.6f, 16.3f, 21.1f, 17f)
                lineTo(18.3f, 19.8f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 19.8f, 13.6f, 19.7f, 15f, 22f)
                horizontalLineTo(11f)
                lineTo(9f, 20f)
                curveTo(9f, 20f, 7.7f, 18.6f, 7f, 21.1f)
                lineTo(4.2f, 18.3f)
                verticalLineTo(15.5f)
                curveTo(4.2f, 15.5f, 4.3f, 13.6f, 2f, 15f)
                verticalLineTo(11f)
                lineTo(4f, 9f)
                curveTo(4f, 9f, 5.4f, 7.7f, 2.8f, 7.1f)
                lineTo(5.6f, 4.2f)
                horizontalLineTo(8.5f)
                curveTo(8.5f, 4.2f, 10.4f, 4.3f, 9f, 2f)
                horizontalLineTo(13f)
                lineTo(15f, 4f)
                curveTo(15f, 4f, 16.3f, 5.4f, 17f, 2.8f)
                lineTo(19.8f, 5.6f)
                verticalLineTo(8.5f)
                curveTo(19.8f, 8.5f, 19.7f, 10.4f, 22f, 9f)
                verticalLineTo(13f)
                lineTo(20f, 15f)
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                close()
            }
        }.build()

        return _SawBlade!!
    }

@Suppress("ObjectPropertyName")
private var _SawBlade: ImageVector? = null
