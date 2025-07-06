package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Candycane: ImageVector
    get() {
        if (_Candycane != null) {
            return _Candycane!!
        }
        _Candycane = ImageVector.Builder(
            name = "Candycane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10f)
                verticalLineTo(8f)
                curveTo(6f, 7.37f, 6.1f, 6.77f, 6.27f, 6.2f)
                lineTo(10f, 9.93f)
                verticalLineTo(10f)
                moveTo(12f, 2f)
                curveTo(12.74f, 2f, 13.44f, 2.13f, 14.09f, 2.38f)
                lineTo(11.97f, 6f)
                curveTo(11.14f, 6f, 10.44f, 6.5f, 10.15f, 7.25f)
                lineTo(7.24f, 4.34f)
                curveTo(8.34f, 2.92f, 10.06f, 2f, 12f, 2f)
                moveTo(17.76f, 6.31f)
                lineTo(14f, 10.07f)
                verticalLineTo(8f)
                curveTo(14f, 7.62f, 13.9f, 7.27f, 13.72f, 6.97f)
                lineTo(15.83f, 3.38f)
                curveTo(16.74f, 4.13f, 17.42f, 5.15f, 17.76f, 6.31f)
                moveTo(18f, 13.09f)
                lineTo(14f, 17.09f)
                verticalLineTo(12.9f)
                lineTo(18f, 8.9f)
                verticalLineTo(13.09f)
                moveTo(18f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                verticalLineTo(19.91f)
                lineTo(18f, 15.91f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Candycane!!
    }

@Suppress("ObjectPropertyName")
private var _Candycane: ImageVector? = null
