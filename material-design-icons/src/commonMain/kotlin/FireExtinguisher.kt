package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireExtinguisher: ImageVector
    get() {
        if (_FireExtinguisher != null) {
            return _FireExtinguisher!!
        }
        _FireExtinguisher = ImageVector.Builder(
            name = "FireExtinguisher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 7f)
                horizontalLineTo(11.75f)
                lineTo(12f, 5f)
                horizontalLineTo(10.25f)
                lineTo(6f, 7.5f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(6.5f)
                lineTo(10f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                lineTo(17f, 2.5f)
                verticalLineTo(5.5f)
                lineTo(16f, 5f)
                horizontalLineTo(14f)
                lineTo(14.25f, 7f)
                horizontalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8.5f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 7f)
                close()
            }
        }.build()

        return _FireExtinguisher!!
    }

@Suppress("ObjectPropertyName")
private var _FireExtinguisher: ImageVector? = null
