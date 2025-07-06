package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SofaSingle: ImageVector
    get() {
        if (_SofaSingle != null) {
            return _SofaSingle!!
        }
        _SofaSingle = ImageVector.Builder(
            name = "SofaSingle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9.15f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 5.9f, 5f, 7f, 5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(9.16f)
                curveTo(17.84f, 9.57f, 17f, 10.67f, 17f, 11.97f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(11.96f)
                curveTo(7f, 10.67f, 6.16f, 9.56f, 5f, 9.15f)
                moveTo(20f, 10f)
                curveTo(18.9f, 10f, 18f, 10.9f, 18f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                curveTo(6f, 10.9f, 5.11f, 10f, 4f, 10f)
                reflectiveCurveTo(2f, 10.9f, 2f, 12f)
                verticalLineTo(17f)
                curveTo(2f, 18.1f, 2.9f, 19f, 4f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                curveTo(21.1f, 19f, 22f, 18.1f, 22f, 17f)
                verticalLineTo(12f)
                curveTo(22f, 10.9f, 21.1f, 10f, 20f, 10f)
                close()
            }
        }.build()

        return _SofaSingle!!
    }

@Suppress("ObjectPropertyName")
private var _SofaSingle: ImageVector? = null
