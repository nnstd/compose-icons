package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareCircle: ImageVector
    get() {
        if (_SquareCircle != null) {
            return _SquareCircle!!
        }
        _SquareCircle = ImageVector.Builder(
            name = "SquareCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                moveTo(12f, 6f)
                curveTo(8.69f, 6f, 6f, 8.69f, 6f, 12f)
                reflectiveCurveTo(8.69f, 18f, 12f, 18f)
                reflectiveCurveTo(18f, 15.31f, 18f, 12f)
                reflectiveCurveTo(15.31f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _SquareCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SquareCircle: ImageVector? = null
