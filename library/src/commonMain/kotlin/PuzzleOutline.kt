package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleOutline: ImageVector
    get() {
        if (_PuzzleOutline != null) {
            return _PuzzleOutline!!
        }
        _PuzzleOutline = ImageVector.Builder(
            name = "PuzzleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13.5f)
                curveTo(22f, 15.26f, 20.7f, 16.72f, 19f, 16.96f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                horizontalLineTo(13.2f)
                verticalLineTo(21.7f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 19f)
                curveTo(9f, 19f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5f, 15f, 5f, 13.5f)
                curveTo(5f, 12f, 3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2f, 10.5f, 2f)
                curveTo(12.26f, 2f, 13.72f, 3.3f, 13.96f, 5f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                verticalLineTo(10.04f)
                curveTo(20.7f, 10.28f, 22f, 11.74f, 22f, 13.5f)
                moveTo(17f, 15f)
                horizontalLineTo(18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5.5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9.12f)
                curveTo(5.76f, 9.8f, 7f, 11.5f, 7f, 13.5f)
                curveTo(7f, 15.5f, 5.75f, 17.2f, 4f, 17.88f)
                verticalLineTo(20f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17f, 10.5f, 17f)
                curveTo(12.5f, 17f, 14.2f, 18.25f, 14.88f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _PuzzleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleOutline: ImageVector? = null
