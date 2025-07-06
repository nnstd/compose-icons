package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) {
            return _Puzzle!!
        }
        _Puzzle = ImageVector.Builder(
            name = "Puzzle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                curveTo(19f, 5.89f, 18.1f, 5f, 17f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(10.8f)
                horizontalLineTo(3.5f)
                curveTo(5f, 10.8f, 6.2f, 12f, 6.2f, 13.5f)
                curveTo(6.2f, 15f, 5f, 16.2f, 3.5f, 16.2f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(7.8f)
                verticalLineTo(20.5f)
                curveTo(7.8f, 19f, 9f, 17.8f, 10.5f, 17.8f)
                curveTo(12f, 17.8f, 13.2f, 19f, 13.2f, 20.5f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 11f)
                close()
            }
        }.build()

        return _Puzzle!!
    }

@Suppress("ObjectPropertyName")
private var _Puzzle: ImageVector? = null
