package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tractor: ImageVector
    get() {
        if (_Tractor != null) {
            return _Tractor!!
        }
        _Tractor = ImageVector.Builder(
            name = "Tractor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                verticalLineTo(11.26f)
                curveTo(3.2f, 11.9f, 2f, 13.6f, 2f, 15.5f)
                curveTo(2f, 18f, 4f, 20f, 6.5f, 20f)
                curveTo(8.79f, 20f, 10.71f, 18.28f, 10.97f, 16f)
                horizontalLineTo(15.17f)
                curveTo(15.06f, 16.32f, 15f, 16.66f, 15f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                curveTo(21f, 16.66f, 20.94f, 16.32f, 20.82f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                curveTo(22f, 11.89f, 21.11f, 11f, 20f, 11f)
                horizontalLineTo(15.04f)
                lineTo(13.65f, 4f)
                horizontalLineTo(5f)
                moveTo(7f, 6f)
                horizontalLineTo(12f)
                lineTo(13f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(10.74f)
                curveTo(10.16f, 12.38f, 8.71f, 11.23f, 7f, 11.03f)
                verticalLineTo(6f)
                moveTo(6.5f, 13.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.75f, 15.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 17.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.25f, 15.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 13.25f)
                moveTo(18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                close()
            }
        }.build()

        return _Tractor!!
    }

@Suppress("ObjectPropertyName")
private var _Tractor: ImageVector? = null
