package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spotlight: ImageVector
    get() {
        if (_Spotlight != null) {
            return _Spotlight!!
        }
        _Spotlight = ImageVector.Builder(
            name = "Spotlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                lineTo(7.09f, 8.55f)
                curveTo(6.4f, 9.5f, 6f, 10.71f, 6f, 12f)
                curveTo(6f, 13.29f, 6.4f, 14.5f, 7.09f, 15.45f)
                lineTo(2f, 18f)
                verticalLineTo(6f)
                moveTo(6f, 3f)
                horizontalLineTo(18f)
                lineTo(15.45f, 7.09f)
                curveTo(14.5f, 6.4f, 13.29f, 6f, 12f, 6f)
                curveTo(10.71f, 6f, 9.5f, 6.4f, 8.55f, 7.09f)
                lineTo(6f, 3f)
                moveTo(22f, 6f)
                verticalLineTo(18f)
                lineTo(16.91f, 15.45f)
                curveTo(17.6f, 14.5f, 18f, 13.29f, 18f, 12f)
                curveTo(18f, 10.71f, 17.6f, 9.5f, 16.91f, 8.55f)
                lineTo(22f, 6f)
                moveTo(18f, 21f)
                horizontalLineTo(6f)
                lineTo(8.55f, 16.91f)
                curveTo(9.5f, 17.6f, 10.71f, 18f, 12f, 18f)
                curveTo(13.29f, 18f, 14.5f, 17.6f, 15.45f, 16.91f)
                lineTo(18f, 21f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _Spotlight!!
    }

@Suppress("ObjectPropertyName")
private var _Spotlight: ImageVector? = null
