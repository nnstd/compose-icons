package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanHandsup: ImageVector
    get() {
        if (_HumanHandsup != null) {
            return _HumanHandsup!!
        }
        _HumanHandsup = ImageVector.Builder(
            name = "HumanHandsup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 1f)
                curveTo(5f, 3.7f, 6.56f, 6.16f, 9f, 7.32f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(7.31f)
                curveTo(17.44f, 6.16f, 19f, 3.7f, 19f, 1f)
                horizontalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                moveTo(12f, 1f)
                curveTo(10.89f, 1f, 10f, 1.89f, 10f, 3f)
                curveTo(10f, 4.11f, 10.89f, 5f, 12f, 5f)
                curveTo(13.11f, 5f, 14f, 4.11f, 14f, 3f)
                curveTo(14f, 1.89f, 13.11f, 1f, 12f, 1f)
                close()
            }
        }.build()

        return _HumanHandsup!!
    }

@Suppress("ObjectPropertyName")
private var _HumanHandsup: ImageVector? = null
