package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldKey: ImageVector
    get() {
        if (_ShieldKey != null) {
            return _ShieldKey!!
        }
        _ShieldKey = ImageVector.Builder(
            name = "ShieldKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                curveTo(9f, 10.31f, 9.83f, 11.42f, 11f, 11.83f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(11.83f)
                curveTo(14.17f, 11.42f, 15f, 10.31f, 15f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
        }.build()

        return _ShieldKey!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldKey: ImageVector? = null
