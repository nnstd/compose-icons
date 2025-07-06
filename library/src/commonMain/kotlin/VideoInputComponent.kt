package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoInputComponent: ImageVector
    get() {
        if (_VideoInputComponent != null) {
            return _VideoInputComponent!!
        }
        _VideoInputComponent = ImageVector.Builder(
            name = "VideoInputComponent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                moveTo(9f, 16f)
                curveTo(9f, 17.3f, 9.84f, 18.4f, 11f, 18.82f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(18.82f)
                curveTo(14.16f, 18.41f, 15f, 17.31f, 15f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                moveTo(1f, 16f)
                curveTo(1f, 17.3f, 1.84f, 18.4f, 3f, 18.82f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                verticalLineTo(18.82f)
                curveTo(6.16f, 18.4f, 7f, 17.3f, 7f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(1f)
                verticalLineTo(16f)
                moveTo(21f, 6f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(13f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                moveTo(17f, 16f)
                curveTo(17f, 17.3f, 17.84f, 18.4f, 19f, 18.82f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(18.82f)
                curveTo(22.16f, 18.41f, 23f, 17.31f, 23f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _VideoInputComponent!!
    }

@Suppress("ObjectPropertyName")
private var _VideoInputComponent: ImageVector? = null
