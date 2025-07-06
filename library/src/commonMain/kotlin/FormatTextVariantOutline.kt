package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextVariantOutline: ImageVector
    get() {
        if (_FormatTextVariantOutline != null) {
            return _FormatTextVariantOutline!!
        }
        _FormatTextVariantOutline = ImageVector.Builder(
            name = "FormatTextVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                curveTo(10.18f, 3f, 9.44f, 3.5f, 9.14f, 4.27f)
                lineTo(3.64f, 18.27f)
                curveTo(3.12f, 19.58f, 4.09f, 21f, 5.5f, 21f)
                horizontalLineTo(7.75f)
                curveTo(8.59f, 21f, 9.33f, 20.5f, 9.62f, 19.7f)
                lineTo(10.26f, 18f)
                horizontalLineTo(13.74f)
                lineTo(14.38f, 19.7f)
                curveTo(14.67f, 20.5f, 15.42f, 21f, 16.25f, 21f)
                horizontalLineTo(18.5f)
                curveTo(19.91f, 21f, 20.88f, 19.58f, 20.36f, 18.27f)
                lineTo(14.86f, 4.27f)
                curveTo(14.56f, 3.5f, 13.82f, 3f, 13f, 3f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                lineTo(18.5f, 19f)
                horizontalLineTo(16.25f)
                lineTo(15.12f, 16f)
                horizontalLineTo(8.87f)
                lineTo(7.75f, 19f)
                horizontalLineTo(5.5f)
                moveTo(12f, 7.67f)
                lineTo(9.62f, 14f)
                horizontalLineTo(14.37f)
                close()
            }
        }.build()

        return _FormatTextVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextVariantOutline: ImageVector? = null
