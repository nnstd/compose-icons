package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nativescript: ImageVector
    get() {
        if (_Nativescript != null) {
            return _Nativescript!!
        }
        _Nativescript = ImageVector.Builder(
            name = "Nativescript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3f)
                horizontalLineTo(16.5f)
                curveTo(19f, 3f, 21f, 5f, 21f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21f, 19f, 19f, 21f, 16.5f, 21f)
                horizontalLineTo(7.5f)
                curveTo(5f, 21f, 3f, 19f, 3f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 5f, 5f, 3f, 7.5f, 3f)
                moveTo(6f, 13.5f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                lineTo(15f, 18f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10.5f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(13.5f)
                lineTo(9f, 6f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7.5f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13.5f)
                close()
            }
        }.build()

        return _Nativescript!!
    }

@Suppress("ObjectPropertyName")
private var _Nativescript: ImageVector? = null
