package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanHandsdown: ImageVector
    get() {
        if (_HumanHandsdown != null) {
            return _HumanHandsdown!!
        }
        _HumanHandsdown = ImageVector.Builder(
            name = "HumanHandsdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(10.89f, 1f, 10f, 1.9f, 10f, 3f)
                curveTo(10f, 4.11f, 10.89f, 5f, 12f, 5f)
                curveTo(13.11f, 5f, 14f, 4.11f, 14f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                moveTo(10f, 6f)
                curveTo(9.73f, 6f, 9.5f, 6.11f, 9.31f, 6.28f)
                horizontalLineTo(9.3f)
                lineTo(4f, 11.59f)
                lineTo(5.42f, 13f)
                lineTo(9f, 9.41f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(9.41f)
                lineTo(18.58f, 13f)
                lineTo(20f, 11.59f)
                lineTo(14.7f, 6.28f)
                curveTo(14.5f, 6.11f, 14.27f, 6f, 14f, 6f)
            }
        }.build()

        return _HumanHandsdown!!
    }

@Suppress("ObjectPropertyName")
private var _HumanHandsdown: ImageVector? = null
