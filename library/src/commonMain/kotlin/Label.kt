package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Label: ImageVector
    get() {
        if (_Label != null) {
            return _Label!!
        }
        _Label = ImageVector.Builder(
            name = "Label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 19f)
                horizontalLineTo(16f)
                curveTo(16.67f, 19f, 17.27f, 18.66f, 17.63f, 18.15f)
                lineTo(22f, 12f)
                lineTo(17.63f, 5.84f)
                close()
            }
        }.build()

        return _Label!!
    }

@Suppress("ObjectPropertyName")
private var _Label: ImageVector? = null
