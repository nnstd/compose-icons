package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SiloOutline: ImageVector
    get() {
        if (_SiloOutline != null) {
            return _SiloOutline!!
        }
        _SiloOutline = ImageVector.Builder(
            name = "SiloOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2f)
                curveTo(11.85f, 2f, 14.6f, 4.53f, 14.96f, 7.78f)
                lineTo(22f, 12f)
                verticalLineTo(14f)
                lineTo(20f, 12.8f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(11.6f)
                lineTo(15f, 9.8f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(8.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 2f)
                moveTo(8.5f, 4f)
                curveTo(6.54f, 4f, 4.87f, 5.25f, 4.26f, 7f)
                horizontalLineTo(12.74f)
                curveTo(12.13f, 5.25f, 10.46f, 4f, 8.5f, 4f)
                moveTo(6f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(6f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(6f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _SiloOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SiloOutline: ImageVector? = null
