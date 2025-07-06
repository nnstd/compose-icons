package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagVariantOutline: ImageVector
    get() {
        if (_FlagVariantOutline != null) {
            return _FlagVariantOutline!!
        }
        _FlagVariantOutline = ImageVector.Builder(
            name = "FlagVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                verticalLineTo(4.88f)
                curveTo(8.06f, 4.44f, 9.5f, 4f, 11f, 4f)
                curveTo(14f, 4f, 14f, 6f, 16f, 6f)
                curveTo(19f, 6f, 20f, 4f, 20f, 4f)
                verticalLineTo(12f)
                curveTo(20f, 12f, 19f, 14f, 16f, 14f)
                curveTo(13f, 14f, 13f, 12f, 11f, 12f)
                curveTo(8f, 12f, 7f, 14f, 7f, 14f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                moveTo(7f, 7.25f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.5f, 9f, 10f, 11f, 10f)
                curveTo(13f, 10f, 14f, 12f, 16f, 12f)
                curveTo(18f, 12f, 18f, 11f, 18f, 11f)
                verticalLineTo(7.5f)
                curveTo(18f, 7.5f, 17f, 8f, 16f, 8f)
                curveTo(14f, 8f, 13f, 6f, 11f, 6f)
                curveTo(9f, 6f, 7f, 7.25f, 7f, 7.25f)
                close()
            }
        }.build()

        return _FlagVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagVariantOutline: ImageVector? = null
