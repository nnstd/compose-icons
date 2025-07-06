package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapVerticalCircle: ImageVector
    get() {
        if (_SwapVerticalCircle != null) {
            return _SwapVerticalCircle!!
        }
        _SwapVerticalCircle = ImageVector.Builder(
            name = "SwapVerticalCircle",
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
                moveTo(6.5f, 9f)
                lineTo(10f, 5.5f)
                lineTo(13.5f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                moveTo(17.5f, 15f)
                lineTo(14f, 18.5f)
                lineTo(10.5f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return _SwapVerticalCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SwapVerticalCircle: ImageVector? = null
