package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagVariant: ImageVector
    get() {
        if (_FlagVariant != null) {
            return _FlagVariant!!
        }
        _FlagVariant = ImageVector.Builder(
            name = "FlagVariant",
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
                close()
            }
        }.build()

        return _FlagVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FlagVariant: ImageVector? = null
