package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sofa: ImageVector
    get() {
        if (_Sofa != null) {
            return _Sofa!!
        }
        _Sofa = ImageVector.Builder(
            name = "Sofa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 7f)
                curveTo(12.5f, 5.89f, 13.39f, 5f, 14.5f, 5f)
                horizontalLineTo(18f)
                curveTo(19.1f, 5f, 20f, 5.9f, 20f, 7f)
                verticalLineTo(9.16f)
                curveTo(18.84f, 9.57f, 18f, 10.67f, 18f, 11.97f)
                verticalLineTo(14f)
                horizontalLineTo(12.5f)
                verticalLineTo(7f)
                moveTo(6f, 11.96f)
                verticalLineTo(14f)
                horizontalLineTo(11.5f)
                verticalLineTo(7f)
                curveTo(11.5f, 5.89f, 10.61f, 5f, 9.5f, 5f)
                horizontalLineTo(6f)
                curveTo(4.9f, 5f, 4f, 5.9f, 4f, 7f)
                verticalLineTo(9.15f)
                curveTo(5.16f, 9.56f, 6f, 10.67f, 6f, 11.96f)
                moveTo(20.66f, 10.03f)
                curveTo(19.68f, 10.19f, 19f, 11.12f, 19f, 12.12f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                curveTo(5f, 10.9f, 4.11f, 10f, 3f, 10f)
                reflectiveCurveTo(1f, 10.9f, 1f, 12f)
                verticalLineTo(17f)
                curveTo(1f, 18.1f, 1.9f, 19f, 3f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                curveTo(22.1f, 19f, 23f, 18.1f, 23f, 17f)
                verticalLineTo(12f)
                curveTo(23f, 10.79f, 21.91f, 9.82f, 20.66f, 10.03f)
                close()
            }
        }.build()

        return _Sofa!!
    }

@Suppress("ObjectPropertyName")
private var _Sofa: ImageVector? = null
