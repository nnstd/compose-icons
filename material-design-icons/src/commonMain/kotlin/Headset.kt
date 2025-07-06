package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Headset: ImageVector
    get() {
        if (_Headset != null) {
            return _Headset!!
        }
        _Headset = ImageVector.Builder(
            name = "Headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(7f, 1f, 3f, 5f, 3f, 10f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(10f)
                curveTo(21f, 5f, 16.97f, 1f, 12f, 1f)
                close()
            }
        }.build()

        return _Headset!!
    }

@Suppress("ObjectPropertyName")
private var _Headset: ImageVector? = null
