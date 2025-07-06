package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Noodles: ImageVector
    get() {
        if (_Noodles != null) {
            return _Noodles!!
        }
        _Noodles = ImageVector.Builder(
            name = "Noodles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                lineTo(10f, 4.41f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                curveTo(22f, 13.81f, 21.43f, 15.46f, 20.32f, 16.95f)
                reflectiveCurveTo(17.77f, 19.53f, 16f, 20.25f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20.25f)
                curveTo(6.24f, 19.53f, 4.79f, 18.43f, 3.68f, 16.95f)
                reflectiveCurveTo(2f, 13.81f, 2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                lineTo(22f, 2f)
                verticalLineTo(3f)
                moveTo(6f, 4.88f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(4.78f)
                lineTo(6f, 4.88f)
                moveTo(6f, 7f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                moveTo(9f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                moveTo(9f, 6f)
                verticalLineTo(4.55f)
                lineTo(8f, 4.64f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Noodles!!
    }

@Suppress("ObjectPropertyName")
private var _Noodles: ImageVector? = null
