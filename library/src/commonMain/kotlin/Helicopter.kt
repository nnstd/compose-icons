package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) {
            return _Helicopter!!
        }
        _Helicopter = ImageVector.Builder(
            name = "Helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(23f, 6f)
                verticalLineTo(10.5f)
                lineTo(14.75f, 12.2f)
                curveTo(14.91f, 12.6f, 15f, 13.04f, 15f, 13.5f)
                curveTo(15f, 14.9f, 14.18f, 16.1f, 13f, 16.66f)
                verticalLineTo(17f)
                lineTo(13f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(16.74f)
                curveTo(3.25f, 16.13f, 2f, 14.46f, 2f, 12.5f)
                curveTo(2f, 10f, 4f, 8f, 6.5f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(23f)
                moveTo(11f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                moveTo(7.5f, 10f)
                curveTo(6.12f, 10f, 5f, 10.9f, 5f, 12f)
                curveTo(5f, 13.1f, 6.12f, 14f, 7.5f, 14f)
                curveTo(8.88f, 14f, 10f, 13.1f, 10f, 12f)
                curveTo(10f, 10.9f, 8.88f, 10f, 7.5f, 10f)
                close()
            }
        }.build()

        return _Helicopter!!
    }

@Suppress("ObjectPropertyName")
private var _Helicopter: ImageVector? = null
