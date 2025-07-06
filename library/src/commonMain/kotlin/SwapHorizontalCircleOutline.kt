package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontalCircleOutline: ImageVector
    get() {
        if (_SwapHorizontalCircleOutline != null) {
            return _SwapHorizontalCircleOutline!!
        }
        _SwapHorizontalCircleOutline = ImageVector.Builder(
            name = "SwapHorizontalCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.59f, 20f, 12f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                moveTo(15f, 6.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13.5f)
                lineTo(18.5f, 10f)
                lineTo(15f, 6.5f)
                moveTo(9f, 10.5f)
                lineTo(5.5f, 14f)
                lineTo(9f, 17.5f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _SwapHorizontalCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalCircleOutline: ImageVector? = null
