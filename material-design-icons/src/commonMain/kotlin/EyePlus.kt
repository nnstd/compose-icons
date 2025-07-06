package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyePlus: ImageVector
    get() {
        if (_EyePlus != null) {
            return _EyePlus!!
        }
        _EyePlus = ImageVector.Builder(
            name = "EyePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                curveTo(7f, 4.5f, 2.73f, 7.61f, 1f, 12f)
                curveTo(2.73f, 16.39f, 7f, 19.5f, 12f, 19.5f)
                curveTo(12.36f, 19.5f, 12.72f, 19.5f, 13.08f, 19.45f)
                curveTo(13.03f, 19.13f, 13f, 18.82f, 13f, 18.5f)
                curveTo(13f, 17.94f, 13.08f, 17.38f, 13.24f, 16.84f)
                curveTo(12.83f, 16.94f, 12.42f, 17f, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                curveTo(17f, 12.29f, 16.97f, 12.59f, 16.92f, 12.88f)
                curveTo(17.58f, 12.63f, 18.29f, 12.5f, 19f, 12.5f)
                curveTo(20.17f, 12.5f, 21.31f, 12.84f, 22.29f, 13.5f)
                curveTo(22.56f, 13f, 22.8f, 12.5f, 23f, 12f)
                curveTo(21.27f, 7.61f, 17f, 4.5f, 12f, 4.5f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(18f, 14.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(15f)
                verticalLineTo(19.5f)
                horizontalLineTo(18f)
                verticalLineTo(22.5f)
                horizontalLineTo(20f)
                verticalLineTo(19.5f)
                horizontalLineTo(23f)
                verticalLineTo(17.5f)
                horizontalLineTo(20f)
                verticalLineTo(14.5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _EyePlus!!
    }

@Suppress("ObjectPropertyName")
private var _EyePlus: ImageVector? = null
