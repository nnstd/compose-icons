package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IronBoard: ImageVector
    get() {
        if (_IronBoard != null) {
            return _IronBoard!!
        }
        _IronBoard = ImageVector.Builder(
            name = "IronBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4.8f)
                curveTo(16f, 3.68f, 16.56f, 2.63f, 17.5f, 2f)
                curveTo(18.44f, 2.63f, 19f, 3.68f, 19f, 4.8f)
                verticalLineTo(6f)
                moveTo(15.28f, 13.63f)
                lineTo(19.59f, 19f)
                curveTo(20.38f, 19.06f, 21f, 19.7f, 21f, 20.5f)
                curveTo(21f, 21.33f, 20.33f, 22f, 19.5f, 22f)
                reflectiveCurveTo(18f, 21.33f, 18f, 20.5f)
                curveTo(18f, 20.42f, 18f, 20.34f, 18f, 20.26f)
                lineTo(14f, 15.23f)
                lineTo(10f, 20.26f)
                curveTo(10f, 20.34f, 10f, 20.42f, 10f, 20.5f)
                curveTo(10f, 21.33f, 9.33f, 22f, 8.5f, 22f)
                reflectiveCurveTo(7f, 21.33f, 7f, 20.5f)
                curveTo(7f, 19.7f, 7.63f, 19.06f, 8.41f, 19f)
                lineTo(12.72f, 13.63f)
                lineTo(9f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                lineTo(15.28f, 13.63f)
                moveTo(14f, 12f)
                lineTo(16.42f, 9f)
                horizontalLineTo(11.58f)
                lineTo(14f, 12f)
                close()
            }
        }.build()

        return _IronBoard!!
    }

@Suppress("ObjectPropertyName")
private var _IronBoard: ImageVector? = null
