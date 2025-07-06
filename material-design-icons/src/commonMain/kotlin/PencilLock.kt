package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilLock: ImageVector
    get() {
        if (_PencilLock != null) {
            return _PencilLock!!
        }
        _PencilLock = ImageVector.Builder(
            name = "PencilLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.5f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 2f)
                moveTo(5.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4.5f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
                moveTo(19.66f, 3f)
                curveTo(19.4f, 3f, 19.16f, 3.09f, 18.97f, 3.28f)
                lineTo(17.13f, 5.13f)
                lineTo(20.88f, 8.88f)
                lineTo(22.72f, 7.03f)
                curveTo(23.11f, 6.64f, 23.11f, 6f, 22.72f, 5.63f)
                lineTo(20.38f, 3.28f)
                curveTo(20.18f, 3.09f, 19.91f, 3f, 19.66f, 3f)
                moveTo(16.06f, 6.19f)
                lineTo(5f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(8.75f)
                lineTo(19.81f, 9.94f)
                lineTo(16.06f, 6.19f)
                close()
            }
        }.build()

        return _PencilLock!!
    }

@Suppress("ObjectPropertyName")
private var _PencilLock: ImageVector? = null
