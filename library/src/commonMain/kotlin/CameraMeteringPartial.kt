package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraMeteringPartial: ImageVector
    get() {
        if (_CameraMeteringPartial != null) {
            return _CameraMeteringPartial!!
        }
        _CameraMeteringPartial = ImageVector.Builder(
            name = "CameraMeteringPartial",
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
                moveTo(12f, 7.5f)
                curveTo(14.14f, 7.5f, 15.93f, 9f, 16.39f, 11f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 9.83f, 13.31f, 9f, 12f, 9f)
                curveTo(10.69f, 9f, 9.58f, 9.83f, 9.17f, 11f)
                horizontalLineTo(7.61f)
                curveTo(8.07f, 9f, 9.86f, 7.5f, 12f, 7.5f)
                moveTo(12f, 16.5f)
                curveTo(9.86f, 16.5f, 8.07f, 15f, 7.61f, 13f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 14.17f, 10.69f, 15f, 12f, 15f)
                curveTo(13.31f, 15f, 14.42f, 14.17f, 14.83f, 13f)
                horizontalLineTo(16.39f)
                curveTo(15.93f, 15f, 14.14f, 16.5f, 12f, 16.5f)
                close()
            }
        }.build()

        return _CameraMeteringPartial!!
    }

@Suppress("ObjectPropertyName")
private var _CameraMeteringPartial: ImageVector? = null
