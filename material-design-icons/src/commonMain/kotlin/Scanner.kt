package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Scanner: ImageVector
    get() {
        if (_Scanner != null) {
            return _Scanner!!
        }
        _Scanner = ImageVector.Builder(
            name = "Scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.2f, 10.7f)
                lineTo(19.8f, 5f)
                lineTo(20.5f, 6.9f)
                lineTo(6.4f, 12f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                verticalLineTo(12.5f)
                curveTo(3f, 11.7f, 3.5f, 10.9f, 4.2f, 10.7f)
                moveTo(17f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                moveTo(5f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Scanner!!
    }

@Suppress("ObjectPropertyName")
private var _Scanner: ImageVector? = null
