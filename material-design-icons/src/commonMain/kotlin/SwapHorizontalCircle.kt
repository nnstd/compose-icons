package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontalCircle: ImageVector
    get() {
        if (_SwapHorizontalCircle != null) {
            return _SwapHorizontalCircle!!
        }
        _SwapHorizontalCircle = ImageVector.Builder(
            name = "SwapHorizontalCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                moveTo(15f, 6.5f)
                lineTo(18.5f, 10f)
                lineTo(15f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(6.5f)
                moveTo(9f, 17.5f)
                lineTo(5.5f, 14f)
                lineTo(9f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(17.5f)
                close()
            }
        }.build()

        return _SwapHorizontalCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalCircle: ImageVector? = null
