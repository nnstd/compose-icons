package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rollerblade: ImageVector
    get() {
        if (_Rollerblade != null) {
            return _Rollerblade!!
        }
        _Rollerblade = ImageVector.Builder(
            name = "Rollerblade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 18f)
                curveTo(3.12f, 18f, 2f, 19.12f, 2f, 20.5f)
                reflectiveCurveTo(3.12f, 23f, 4.5f, 23f)
                reflectiveCurveTo(7f, 21.88f, 7f, 20.5f)
                reflectiveCurveTo(5.88f, 18f, 4.5f, 18f)
                moveTo(18.5f, 18f)
                curveTo(17.12f, 18f, 16f, 19.12f, 16f, 20.5f)
                reflectiveCurveTo(17.12f, 23f, 18.5f, 23f)
                reflectiveCurveTo(21f, 21.88f, 21f, 20.5f)
                reflectiveCurveTo(19.88f, 18f, 18.5f, 18f)
                moveTo(20f, 17f)
                curveTo(20f, 15.63f, 20.09f, 13.81f, 19.5f, 12.95f)
                curveTo(18.55f, 10.9f, 15.82f, 10.56f, 13.91f, 10.05f)
                curveTo(13f, 10f, 12f, 9f, 11.82f, 8f)
                horizontalLineTo(9f)
                curveTo(8.71f, 8f, 8.5f, 7.78f, 8.5f, 7.5f)
                curveTo(8.5f, 7.22f, 8.71f, 7f, 9f, 7f)
                horizontalLineTo(11.5f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                curveTo(8.71f, 6f, 8.5f, 5.78f, 8.5f, 5.5f)
                curveTo(8.5f, 5.22f, 8.71f, 5f, 9f, 5f)
                horizontalLineTo(11.5f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(11.5f, 18f)
                curveTo(10.12f, 18f, 9f, 19.12f, 9f, 20.5f)
                reflectiveCurveTo(10.12f, 23f, 11.5f, 23f)
                reflectiveCurveTo(14f, 21.88f, 14f, 20.5f)
                reflectiveCurveTo(12.88f, 18f, 11.5f, 18f)
                close()
            }
        }.build()

        return _Rollerblade!!
    }

@Suppress("ObjectPropertyName")
private var _Rollerblade: ImageVector? = null
