package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Crosshairs: ImageVector
    get() {
        if (_Crosshairs != null) {
            return _Crosshairs!!
        }
        _Crosshairs = ImageVector.Builder(
            name = "Crosshairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.05f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11f, 3.05f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13f, 20.95f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13f)
                moveTo(12f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
            }
        }.build()

        return _Crosshairs!!
    }

@Suppress("ObjectPropertyName")
private var _Crosshairs: ImageVector? = null
