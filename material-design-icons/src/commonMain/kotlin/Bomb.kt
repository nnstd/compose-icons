package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bomb: ImageVector
    get() {
        if (_Bomb != null) {
            return _Bomb!!
        }
        _Bomb = ImageVector.Builder(
            name = "Bomb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 6f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 2.75f)
                arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 6f)
                curveTo(17.75f, 6.42f, 18.08f, 6.75f, 18.5f, 6.75f)
                curveTo(18.92f, 6.75f, 19.25f, 6.42f, 19.25f, 6f)
                verticalLineTo(5.25f)
                horizontalLineTo(20.75f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 8.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.25f, 6f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 4.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.75f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(7.29f)
                curveTo(16.89f, 8.15f, 19f, 10.83f, 19f, 14f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14f)
                curveTo(5f, 10.83f, 7.11f, 8.15f, 10f, 7.29f)
                verticalLineTo(6f)
                horizontalLineTo(11.25f)
                moveTo(22f, 6f)
                horizontalLineTo(24f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                moveTo(19f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                moveTo(20.91f, 4.38f)
                lineTo(22.33f, 2.96f)
                lineTo(23.04f, 3.67f)
                lineTo(21.62f, 5.09f)
                lineTo(20.91f, 4.38f)
                close()
            }
        }.build()

        return _Bomb!!
    }

@Suppress("ObjectPropertyName")
private var _Bomb: ImageVector? = null
