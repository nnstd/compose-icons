package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Violin: ImageVector
    get() {
        if (_Violin != null) {
            return _Violin!!
        }
        _Violin = ImageVector.Builder(
            name = "Violin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
                verticalLineTo(5f)
                lineTo(10f, 9f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 9.5f)
                horizontalLineTo(12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 10f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.5f)
                horizontalLineTo(10.5f)
                curveTo(9.73f, 10.5f, 9f, 9.77f, 9f, 9f)
                verticalLineTo(5.16f)
                curveTo(7.27f, 5.6f, 6f, 7.13f, 6f, 9f)
                verticalLineTo(10.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 13f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                verticalLineTo(17f)
                curveTo(6f, 19.77f, 8.23f, 22f, 11f, 22f)
                horizontalLineTo(13f)
                curveTo(15.77f, 22f, 18f, 19.77f, 18f, 17f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 13f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10.5f)
                verticalLineTo(9f)
                curveTo(18f, 6.78f, 16.22f, 5f, 14f, 5f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2f)
                horizontalLineTo(11f)
                moveTo(10.75f, 16.5f)
                horizontalLineTo(13.25f)
                lineTo(12.75f, 20f)
                horizontalLineTo(11.25f)
                lineTo(10.75f, 16.5f)
                close()
            }
        }.build()

        return _Violin!!
    }

@Suppress("ObjectPropertyName")
private var _Violin: ImageVector? = null
