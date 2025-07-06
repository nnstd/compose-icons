package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TshirtV: ImageVector
    get() {
        if (_TshirtV != null) {
            return _TshirtV!!
        }
        _TshirtV = ImageVector.Builder(
            name = "TshirtV",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                verticalLineTo(12.07f)
                lineTo(5.7f, 13.07f)
                curveTo(5.31f, 13.46f, 4.68f, 13.46f, 4.29f, 13.07f)
                lineTo(1.46f, 10.29f)
                curveTo(1.07f, 9.9f, 1.07f, 9.27f, 1.46f, 8.88f)
                lineTo(7.34f, 3f)
                horizontalLineTo(9f)
                curveTo(9.29f, 4.8f, 10.4f, 6.37f, 12f, 7.25f)
                curveTo(13.6f, 6.37f, 14.71f, 4.8f, 15f, 3f)
                horizontalLineTo(16.66f)
                lineTo(22.54f, 8.88f)
                curveTo(22.93f, 9.27f, 22.93f, 9.9f, 22.54f, 10.29f)
                lineTo(19.71f, 13.12f)
                curveTo(19.32f, 13.5f, 18.69f, 13.5f, 18.3f, 13.12f)
                lineTo(17f, 12.12f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
            }
        }.build()

        return _TshirtV!!
    }

@Suppress("ObjectPropertyName")
private var _TshirtV: ImageVector? = null
