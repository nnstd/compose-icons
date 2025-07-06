package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Piston: ImageVector
    get() {
        if (_Piston != null) {
            return _Piston!!
        }
        _Piston = ImageVector.Builder(
            name = "Piston",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16.18f)
                curveTo(13.5f, 16.35f, 13.9f, 16.63f, 14.23f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(14.21f)
                curveTo(13.89f, 21.35f, 13.5f, 21.63f, 13f, 21.8f)
                curveTo(11.85f, 22.22f, 10.58f, 21.87f, 9.78f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(9.77f)
                curveTo(10.1f, 16.63f, 10.5f, 16.35f, 11f, 16.18f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(16.18f)
                moveTo(12f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                moveTo(17f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                moveTo(12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _Piston!!
    }

@Suppress("ObjectPropertyName")
private var _Piston: ImageVector? = null
