package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vhs: ImageVector
    get() {
        if (_Vhs != null) {
            return _Vhs!!
        }
        _Vhs = ImageVector.Builder(
            name = "Vhs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                horizontalLineTo(4f)
                moveTo(4.54f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(4.54f)
                curveTo(4.19f, 13.39f, 4f, 12.7f, 4f, 12f)
                curveTo(4f, 11.3f, 4.19f, 10.61f, 4.54f, 10f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(17f, 10f)
                horizontalLineTo(19.46f)
                curveTo(19.81f, 10.61f, 20f, 11.3f, 20f, 12f)
                curveTo(20f, 12.7f, 19.81f, 13.39f, 19.46f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Vhs!!
    }

@Suppress("ObjectPropertyName")
private var _Vhs: ImageVector? = null
