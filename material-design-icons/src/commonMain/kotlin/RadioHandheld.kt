package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioHandheld: ImageVector
    get() {
        if (_RadioHandheld != null) {
            return _RadioHandheld!!
        }
        _RadioHandheld = ImageVector.Builder(
            name = "RadioHandheld",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                curveTo(8f, 8.67f, 8f, 14.33f, 8f, 20f)
                curveTo(8f, 21.11f, 8.89f, 22f, 10f, 22f)
                horizontalLineTo(15f)
                curveTo(16.11f, 22f, 17f, 21.11f, 17f, 20f)
                verticalLineTo(9f)
                curveTo(17f, 7.89f, 16.11f, 7f, 15f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                moveTo(10f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _RadioHandheld!!
    }

@Suppress("ObjectPropertyName")
private var _RadioHandheld: ImageVector? = null
