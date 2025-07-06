package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextWrappingWrap: ImageVector
    get() {
        if (_FormatTextWrappingWrap != null) {
            return _FormatTextWrappingWrap!!
        }
        _FormatTextWrappingWrap = ImageVector.Builder(
            name = "FormatTextWrappingWrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                moveTo(19f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(13f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(12.97f)
                curveTo(13.14f, 10f, 14f, 10.16f, 14f, 12f)
                curveTo(14f, 13.84f, 13.14f, 14f, 13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                lineTo(8f, 15f)
                lineTo(11f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                curveTo(14.04f, 16f, 16f, 15.16f, 16f, 12f)
                curveTo(16f, 8.84f, 14.04f, 8f, 13f, 8f)
                close()
            }
        }.build()

        return _FormatTextWrappingWrap!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextWrappingWrap: ImageVector? = null
