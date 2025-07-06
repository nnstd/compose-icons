package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraMeteringMatrix: ImageVector
    get() {
        if (_CameraMeteringMatrix != null) {
            return _CameraMeteringMatrix!!
        }
        _CameraMeteringMatrix = ImageVector.Builder(
            name = "CameraMeteringMatrix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                moveTo(4f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(5.5f, 7.5f)
                horizontalLineTo(11f)
                verticalLineTo(9.17f)
                curveTo(10.15f, 9.47f, 9.47f, 10.15f, 9.17f, 11f)
                horizontalLineTo(5.5f)
                verticalLineTo(7.5f)
                moveTo(18.5f, 7.5f)
                verticalLineTo(11f)
                horizontalLineTo(14.83f)
                curveTo(14.53f, 10.15f, 13.85f, 9.47f, 13f, 9.17f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.5f)
                moveTo(18.5f, 16.5f)
                horizontalLineTo(13f)
                verticalLineTo(14.83f)
                curveTo(13.85f, 14.53f, 14.53f, 13.85f, 14.83f, 13f)
                horizontalLineTo(18.5f)
                verticalLineTo(16.5f)
                moveTo(5.5f, 16.5f)
                verticalLineTo(13f)
                horizontalLineTo(9.17f)
                curveTo(9.47f, 13.85f, 10.15f, 14.53f, 11f, 14.83f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.5f)
                moveTo(12f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.5f)
                close()
            }
        }.build()

        return _CameraMeteringMatrix!!
    }

@Suppress("ObjectPropertyName")
private var _CameraMeteringMatrix: ImageVector? = null
